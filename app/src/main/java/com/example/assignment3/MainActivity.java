package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBook;
    private ArrayList<BookModel> listBook = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBook = findViewById(R.id.RecyclerView);
        rvBook.setHasFixedSize(true);
        listBook.addAll(BookData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvBook.setLayoutManager(new LinearLayoutManager(this));
        BookAdapter bookAdapter = new BookAdapter(this);
        bookAdapter.setBookModels(listBook);
        rvBook.setAdapter(bookAdapter);
    }
}