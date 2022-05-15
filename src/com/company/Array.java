package com.company;

public class Array {
    private int[] items; //only visible to the class
    private int count; //to keep track of the length

    //constructor
    public Array(int length){
        items=new int[length]; //initialization
    }

    //insert
    public void insert(int x){

        if (items.length==count) { //if the array is full,resize
            int[] newItems=new int[count*2];//create new array, 2x

            for (int i = 0; i < count; i++) //copy the elements into the new array
                newItems[i]=items[i];

            //set 'items' to the new array
            items=newItems;
        }

        //add the item to the last
        //items[count]=x; count++;//count value is 0 initially
        items[count++]=x;

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
