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
        arr.insert(100);
        arr.insert(90);
        arr.insert(60);
        arr.insert(80);
        //System.out.println(arr.indexOf(20));
        //arr.removeAt(3);
        System.out.println("max: "+ arr.max());
        //arr.print();
    }
}
