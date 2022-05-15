package com.company;

public class Array {
    private int[] items; //only visible to the class
    private int count; //to keep track of the length

    //constructor
    public Array(int length){
        items=new int[length]; //initialization
    }

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

    public void removeAt(int index){

        if (index < 0 || index >= count )
            throw new IllegalArgumentException();
        //shift items to the left
        for (int i = index; i < count; i++)
            items[i]=items[i+1];

        count--;

    }
    //print
    public void print(){
        //System.out.println(Arrays.toString(arr));
        for (int i=0; i< count;i++)
            System.out.println(items[i]);
    }
    //indexOf

}
