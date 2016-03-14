package com.example.merel.todo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Items extends AppCompatActivity {

    ListView itemList;
    ArrayAdapter<?> arrayAdapter;
    ArrayList<?> listArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        // delete item on long click
        itemList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Object item = arrayAdapter.getItem(position);
                listArray.remove(item);
                arrayAdapter.notifyDataSetChanged();
                return false;
            }
        });

        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object item = arrayAdapter.getItem(position);
                // TODO how do I get a ToDoItem to strike through?
            }
        })
    }
}
