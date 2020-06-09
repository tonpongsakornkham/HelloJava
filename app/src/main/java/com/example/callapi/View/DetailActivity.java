package com.example.callapi.View;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.callapi.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    TextView tvRoom;
    TextView tvMeetRoom;
    TextView tvDate;
    TextView tvGetTimeStart;
    TextView tvNumber;
    TextView tvSetDes;
    TextView tvGetTimeEnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        String room = bundle.getString("Location");
        String subject = bundle.getString("Subject");
        String status = bundle.getString("Status");
        String body = bundle.getString("Body");
        String date = bundle.getString("Date");
        String startTime = bundle.getString("StartTime");
        String endTime = bundle.getString("EndTime");

        String originalStringFormat = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        String desiredStringFormatTime = "HH:mm";
        String desiredStringFormatDate = "dd/MM/yyyy";

        SimpleDateFormat readingFormat = new SimpleDateFormat(originalStringFormat);
        SimpleDateFormat outputFormatTime = new SimpleDateFormat(desiredStringFormatTime);
        SimpleDateFormat outputFormatDate = new SimpleDateFormat(desiredStringFormatDate);

        tvRoom = findViewById(R.id.tvRoom);
        tvMeetRoom = findViewById(R.id.tvMeetRoom);
        tvDate = findViewById(R.id.tvDate);
        tvGetTimeStart = findViewById(R.id.tvGetTimeStart);
        tvNumber = findViewById(R.id.tvNumber);
        tvSetDes = findViewById(R.id.tvSetDes);
        tvGetTimeEnd = findViewById(R.id.tvGetTimeEnd);

        try {
            Date dateStart = readingFormat.parse(date);
            Date timeStart = readingFormat.parse(startTime);
            Date timeEnd = readingFormat.parse(endTime);
            tvDate.setText(outputFormatDate.format(dateStart));
            tvGetTimeStart.setText(outputFormatTime.format(timeStart));
            tvGetTimeEnd.setText(outputFormatTime.format(timeEnd));

        } catch (ParseException e) {
            e.printStackTrace();
        }


        tvRoom.setText(room);
        tvMeetRoom.setText(subject);
        tvNumber.setText(status);
        tvSetDes.setText(body);
        //tvRoom.setText(room);
        //tvRoom.setText(room);

    }
}