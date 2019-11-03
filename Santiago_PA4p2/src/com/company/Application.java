package com.company;

import java.io.IOException;

public class Application {
    public static void main(String[] args)throws IOException{
            DuplicateCounter duplicateC = new DuplicateCounter();
            duplicateC.count("problem2.txt");
            duplicateC.write("unique_word_counts.txt");
    }

}
