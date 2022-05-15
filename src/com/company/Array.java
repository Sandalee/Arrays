package com.company;

public class Array {
    private int[] items; //only visible to the class
    private int count;

    //constructor
    public Array(int length){
        items=new int[length]; //initialization
    }

    //insert
    public void insert(int x){
        //if the array is full,resize
        //add the item to the last

    }
    //removeAt
    public void removeAt(int x){

    }
    //print
    public void print(){
        //System.out.println(Arrays.toString(arr));
        for (int i=0; i< count;i++)
            System.out.println(items[i]);
    }
    //indexOf

}
