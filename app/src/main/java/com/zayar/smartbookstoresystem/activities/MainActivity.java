package com.zayar.smartbookstoresystem.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zayar.smartbookstoresystem.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNearest, btnSearchBook, btnPopularBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNearest = findViewById(R.id.btnNearestBook);
        btnSearchBook = findViewById(R.id.btnSearchBook);
        btnPopularBook = findViewById(R.id.btnPopularBook);

        btnNearest.setOnClickListener(this);
        btnSearchBook.setOnClickListener(this);
        btnPopularBook.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == btnNearest.getId()){
            startActivity(new Intent(this, NearestBookStoreActivity.class));
        }else if (view.getId() == btnSearchBook.getId()){
            startActivity(new Intent(this, SearchBookActivity.class));
        }else {
            startActivity(new Intent(this, PopularBookActivity.class));
        }
    }
}
