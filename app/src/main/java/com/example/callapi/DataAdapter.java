package com.example.callapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    Context context;
    ArrayList<Data> arrayList;
    //Click
    ItemClickListener mListener;

    public DataAdapter(Context context, ArrayList<Data> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DataAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_file, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.DataViewHolder holder, int position) {

        final Data model = arrayList.get(position);

        String sTime = model.getStart();
        String eTime = model.getEnd();

        String originalStringFormat = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        String desiredStringFormat = "HH:mm";

        SimpleDateFormat readingFormat = new SimpleDateFormat(originalStringFormat);
        SimpleDateFormat outputFormat = new SimpleDateFormat(desiredStringFormat);

        try {
            Date dateStart = readingFormat.parse(sTime);
            Date dateEnd = readingFormat.parse(eTime);
            holder.tvTimeStart.setText(outputFormat.format(dateStart));
            holder.tvTimeEnd.setText(outputFormat.format(dateEnd));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        holder.tvId.setText(model.getSubject());
        holder.tvName.setText(model.getName());
        holder.textView.setText(model.getLocation());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //Create SetClick
    public void setItemClickListener(ItemClickListener listener) {
        mListener = listener;
    }

    //Create Interface
    public interface ItemClickListener {
        void onItemClick(int position);
    }

    public class DataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvId;
        TextView tvName;
        TextView tvTimeStart;
        TextView tvTimeTo;
        TextView tvTimeEnd;
        TextView textView;


        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tvID);
            tvName = itemView.findViewById(R.id.tvName);
            tvTimeStart = itemView.findViewById(R.id.tvTimeStart);
            tvTimeTo = itemView.findViewById(R.id.tvTimeTo);
            tvTimeEnd = itemView.findViewById(R.id.tvTimeEnd);
            textView = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mListener != null)
                mListener.onItemClick(getAdapterPosition());
        }
    }

}
