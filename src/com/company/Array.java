package com.company;

import java.util.Arrays;

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
    public int indexOf(int item){
        for (int i = 0; i < count; i++)
            if (items[i]==item)
                return i;

        return -1;

    }

    public int max(){
        int max=0;
        for (int i=0; i<count; i++)
            if (items[i]> max){
                max=items[i];
            }
        return max;
    }

    public void reverse(){
        for (int i=0; i <count/2; i++) {
            int temp = items[i];
            items[i]=items[count-1-i];
            items[count-1-i]=temp;
        }
        System.out.println(Arrays.toString(items));


    }

    public void insertAt(int index, int num){
        //int number = num;
        //int ind=index;

        items[index]=num;
        System.out.println(Arrays.toString(items));
    }

}
