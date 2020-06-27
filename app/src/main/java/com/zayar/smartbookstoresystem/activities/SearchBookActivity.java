package com.zayar.smartbookstoresystem.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.zayar.smartbookstoresystem.R;

import java.util.ArrayList;

public class SearchBookActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book);

        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<>();
        list.add("တာရာမင်း‌ေ)");
        list.add("ခင်ခင်ထူး");
        list.add("မြသန်းတင့်");
        list.add("အကြည်တော်");
        list.add("ပီမိုးနင်း");
        list.add("ဆရာတံခွန်");
        list.add("ခွန်နွ,်");
        list.add("သော်တာဆွေ");
        list.add("အောင်သင်း");
        list.add("သိုးဆောင်း");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        MenuItem searchViewItem = menu.findItem(R.id.app_bar_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
            /*   if(list.contains(query)){
                    adapter.getFilter().filter(query);
               }else{
                   Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
               }*/
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
