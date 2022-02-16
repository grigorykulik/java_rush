package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        List<Integer> l=new ArrayList<>();
        List<Integer> counters=new ArrayList<>();

        for (int i=0; i<10; i++) {
            int iN=Integer.parseInt(br.readLine());
            l.add(iN);
        }

        int counter=1;
        int startValue=l.get(0);

        for (int i=0; i<9; i++) {
            if (startValue==l.get(i+1)) {
                counter++;
            }

            else {
                startValue=l.get(i+1);
                counters.add(counter);
                counter=1;
            }
        }

        counters.add(counter);

        int max=counters.stream().mapToInt(v->v).max().orElseThrow(NoSuchElementException::new);

        System.out.println(max);
    }
}
