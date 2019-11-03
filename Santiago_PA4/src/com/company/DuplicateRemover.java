package com.company;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Set;
import java.io.File;
import java.util.Iterator;
class DuplicateRemover {

        private Set<String> uniqueWords;
        void remove(String dataFile) throws FileNotFoundException
        {
            String nextWord;//temp string
            Scanner Scan = new Scanner(new File(dataFile));
            uniqueWords = new HashSet<String>();
            while(Scan.hasNext())
            {
            nextWord = Scan.next();
            uniqueWords.add(nextWord);
        }
        Scan.close();
    }

    void write(String outputFile) throws IOException
    {
            File file = new File(outputFile);
            FileWriter fileWrite = new FileWriter(file);
            Iterator iterator = uniqueWords.iterator();
            if(file.exists()) {

            while(iterator.hasNext())
            {
                    String string = (String)iterator.next();
                    fileWrite.write(string + "\n");

            }

        }
     else

        {
            boolean success = file.createNewFile();
            if(!success){
                    System.out.println("Failure to create new file!");
                    return;

            }
            while(iterator.hasNext())

            {

                    String string = (String)iterator.next();
                    fileWrite.write(string + "\n");
            }

        }
        fileWrite.close();
        System.out.println("Congrats! Everything was SUCCESSFUL!!");

    }}