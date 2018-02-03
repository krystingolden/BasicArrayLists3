package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /*
https://programmingbydoing.com/
Basic arraylists 3 - Assignment #180
*/
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        int index;
        Random r = new Random();

        for (index = 0; index < 1000; index++){
            int number = r.nextInt(100);
            if (number < 10){
                number += 10;
            }
            integers.add(number);
        }

        for (index = 0; index < integers.size(); index++){
            System.out.print(integers.get(index) + "  ");
        }

    }
}
