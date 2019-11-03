package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.io.PrintWriter;
import java.util.Map;
import java.io.IOException;

import java.io.File;

import java.io.PrintWriter;
    class DuplicateCounter
{
    private Map<  String, Integer> wordCounter;
         void count(String dataFile)throws IOException{

         wordCounter = new HashMap<>();
        Scanner Scan = new Scanner(new File(dataFile));
        while(Scan.hasNext()) {
               String xWord =Scan.next();
               Integer count = wordCounter.get(xWord);

            if( count == null)
                count = 1;
            else
                count++;
            wordCounter.put(xWord, count);
        }
        Scan.close();
    }   void write(String outputFile)throws FileNotFoundException{
         PrintWriter pWriter = new PrintWriter(new File(outputFile));
            for(String temp : wordCounter.keySet()) {
            pWriter.println("Word: " + temp + " Count: " + wordCounter.get(temp));
        }
         pWriter.close();
    }
}