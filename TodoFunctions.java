package com.company;

import java.util.ArrayList;

public class TodoFunctions {
    private ArrayList<String> todoList = new ArrayList<>();
    //Add List Item

    public void addItem(String item)
    {
        todoList.add(item);
    }
    public void removeItem(int index){
        String myItem = todoList.get(index);
        todoList.remove(index);
        System.out.println(myItem);
    }

    public void sizeOfArrayList(){
        System.out.println(todoList.size());
        for(int i =0;i<todoList.size();i++)
            System.out.println("Item on "+(i+1)+" "+todoList.get(i));
    }

    public void updateData(int index, String data){
        todoList.set(index,data);
        System.out.println("Updation compleated st position "+index);
    }

    public String findItem(String searchItem){
        int index = todoList.indexOf(searchItem);
        if(index==-1){
            return null;
        }else{
            return todoList.get(index);
        }
    }
}
