package com.example.careplushospital;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class doctor2 extends AppCompatActivity {
    private TextView text;
    private ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor2);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String shortDesc = intent.getStringExtra("shortdesc");
        int imageResource = intent.getIntExtra("image", R.drawable.doctor1);

        ImageView doctorImage = findViewById(R.id.doctorImage);
        TextView doctorTitle = findViewById(R.id.doctorTitle);
        TextView doctorDescription = findViewById(R.id.doctorDescription);

        doctorImage.setImageResource(imageResource);
        doctorTitle.setText(title);
        doctorDescription.setText(shortDesc);

        text = findViewById(R.id.showText);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();

            }
        });

    }
    private void openDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                text.setText(String.valueOf(year) + "/" + String.valueOf(month + 1) + "/" + String.valueOf(day));
                Toast.makeText(doctor2.this, "Appointment Done", Toast.LENGTH_SHORT).show();
            }
        }, 2023, 9, 16);

        // Show the DatePickerDialog
        datePickerDialog.show();

    }
}
