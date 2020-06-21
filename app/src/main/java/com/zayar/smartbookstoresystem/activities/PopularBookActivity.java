package com.zayar.smartbookstoresystem.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.zayar.smartbookstoresystem.R;
import com.zayar.smartbookstoresystem.adapters.PopularBookAdapter;
import com.zayar.smartbookstoresystem.data.PopularBookData;

import java.util.ArrayList;
import java.util.List;

public class PopularBookActivity extends AppCompatActivity {

    private List<PopularBookData> popularBookDataList = new ArrayList<>();
    private RecyclerView recyclerView;
    private PopularBookAdapter popularBookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_book);

        recyclerView = findViewById(R.id.rvPopularBookLists);

        popularBookAdapter = new PopularBookAdapter(popularBookDataList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(popularBookAdapter);

        preparePopularBookData();
    }

    private void preparePopularBookData() {
        PopularBookData popularBookData = new PopularBookData(R.drawable.book_image, "Grand Canyon National Park", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "A", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "Grand Canyon National Park", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "A", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "Grand Canyon National Park", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "A", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "Grand Canyon National Park", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);
        popularBookData = new PopularBookData(R.drawable.book_image, "Grand Canyon National Park", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "A", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookData = new PopularBookData(R.drawable.book_image, "Grand Canyon National Park", "Lonely Planet", "2020", "Nature");
        popularBookDataList.add(popularBookData);

        popularBookAdapter.notifyDataSetChanged();





    }
}
