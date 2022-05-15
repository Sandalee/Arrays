package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] numbers = new int[3]; //array declaration
       // numbers[0] = 10;
       // numbers[1] = 20;
       // numbers[2] = 30;
       // int[] numbers = {10, 20, 30} ;
       // System.out.println(Arrays.toString(numbers));

        Array arr= new Array(3);
        arr.insert(40);
        arr.insert(20);
        arr.insert(60);
        arr.insert(80);
        arr.removeAt(3);
        arr.print();
    }
}
