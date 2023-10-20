package com.example.careplushospital;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(
                1,
                "Dr. Anthony Fauci ",
                " Immunologist, Physician, and Allergy",
                R.drawable.doctor1));

        productList.add(new Product(
                1,
                "Dr. Sajjad Hussain",
                "Orthopeadic Surgeon, Orthopedic Doctor",
                R.drawable.doctor2));

        productList.add(new Product(
                1,
                "Dr. Fazeela Abbasi ",
                " Dermatologist and Cosmetic Surgeon",
                R.drawable.doctor3));

        productList.add(new Product(
                1,
                "Dr. Baseer Achakzai ",
                "Prominent cardiologist and interventional cardiology",
                R.drawable.doctor4));

        productList.add(new Product(
                1,
                "Dr. Sara Mahmood ",
                "Gastrointestinal disorders and Hepatitis specialist ",
                R.drawable.doctor5));
        productList.add(new Product(
                1,
                "Dr. Shahid Amin",
                "Orthopedic surgeon  ",
                R.drawable.doctor6));




        ProductAdapter adapter = new ProductAdapter(this, productList);


        recyclerView.setAdapter(adapter);
    }
}
