package com.example.merel.todo3;

import android.graphics.Paint;
import android.widget.TextView;

/**
 * Created by Merel on 07/03/2016.
 */
public class ToDoItem {
    // fields
    String name;
    int duration;
    boolean strikedThrough;

    // constructor
    public ToDoItem(String nameArg, int durationArg) {
        name = nameArg;
        duration = durationArg;
        strikedThrough = false;
    }

    // methods
    public void setStrikeThrough(TextView item) {
        if (!strikedThrough) {
            item.setPaintFlags(item.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            strikedThrough = true;
        }else{
            item.setPaintFlags(0);
            strikedThrough = false;
        }
    }
}
