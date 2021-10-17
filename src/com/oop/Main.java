package com.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <Itenger> void main(String[] args) {

        // creating list and initialising the elements
        List<Integer> numbers = Arrays.asList(1,3,5,6,9,79,34,67);

        // creating query parameter
        final int QUERY_NUMBER = 3;

        // using if statement
        if (numbers.contains(QUERY_NUMBER)){
            System.out.println(QUERY_NUMBER + " is present");
        }
        else{
            System.out.println(QUERY_NUMBER + " is absent");
        }

        // using for loop to search for an even number
        for(int i = 0; i < numbers.size(); i++){
            if (numbers.get(i)  % 2 == 0){
                System.out.println(numbers.get(i) + " is even");
            }
        }

        // using while to search for an even number in the list
        int i=0;
        while(i < numbers.size()){
            int y = numbers.get(i) % 2;

            switch(y){
                case 1:
                    System.out.println(numbers.get(i) + " is odd");
                    break;
                case 0:
                    System.out.println(numbers.get(i) + " is even");
                    break;
            }
        }

        // find all even numbers in the list
        int [] evenNumbers = new int[];
        int position = 0;
        for(int x = 0; i < numbers.size(); x++){
            if (numbers.get(x)  % 2 == 0){
                evenNumbers[position] = numbers.get(x);
                position++;
                continue;

                System.out.println("this is not going to be printed because of the continue statement");
            }
        }

    }
}
