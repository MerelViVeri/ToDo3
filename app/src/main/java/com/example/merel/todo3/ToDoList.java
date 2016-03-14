package com.example.merel.todo3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class represents a separate to do list with a title and array of items
 */
public class ToDoList {
    // fields
    String title;
    ArrayList<ToDoItem> itemsArray;
    int size;

    // constructor
    public ToDoList(String titleArg) {
        title = titleArg;
        itemsArray = new ArrayList<>();
        size = 0;
    }

    // methods
    public void addItemToList(String name, int duration) {
        ToDoItem item = new ToDoItem(name, duration);
        itemsArray.add(item);
    }

    public void removeItemFromList(ToDoItem item) {
        itemsArray.remove(item);
    }

    public int getArraySize() {
        return itemsArray.size();
    }
}
