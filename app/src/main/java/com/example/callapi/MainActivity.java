package com.example.callapi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Data> arrayList;
    DataAdapter dataAdapter;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setHasFixedSize(true);

        intent = new Intent(this, DetailActivity.class);

        getData();

    }

    private void getClick() {

        dataAdapter.setItemClickListener(new DataAdapter.ItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Log.d("test", "onItemClick: index = " + position);
                String location = arrayList.get(position).getLocation();
                String subject = arrayList.get(position).getSubject();
                int intStatus = arrayList.get(position).getStatusChecked();
                String body = arrayList.get(position).getBody();
                String date = arrayList.get(position).getStart();
                String startTime = arrayList.get(position).getStart();
                String endTime = arrayList.get(position).getEnd();

                String status = Integer.toString(intStatus);

                intent.putExtra("Location", location);
                intent.putExtra("Subject", subject);
                intent.putExtra("Status", status);
                intent.putExtra("Body", body);
                intent.putExtra("Date", date);
                intent.putExtra("StartTime", startTime);
                intent.putExtra("EndTime", endTime);

                startActivity(intent);
            }
        });

    }

    private void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CallApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CallApi callApi = retrofit.create(CallApi.class);

        Call<List<Data>> call = callApi.getDatas();

        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                arrayList = new ArrayList<>(response.body());
                dataAdapter = new DataAdapter(MainActivity.this, arrayList);
                getClick();
                recyclerView.setAdapter(dataAdapter);
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}