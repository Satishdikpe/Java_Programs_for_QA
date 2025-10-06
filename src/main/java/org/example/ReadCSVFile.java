package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadCSVFile {

    public static void readingCSV(String pathoftheFile){
        String line;
        try {
            FileReader fis = new FileReader(pathoftheFile);
            BufferedReader readpointer = new BufferedReader(fis);
            while ((line = readpointer.readLine())!= null)
            {
                System.out.println("Line "+ line);
            }
        }
        catch (Exception e)
        {
            System.out.println(" File not available to read ");
            e.printStackTrace();
        }
    }

    public static void SpecificLine(String pathofthefile, int linenumber)
    {
        String line;
        int currentline=0;
        try {
            FileReader fis = new FileReader(pathofthefile);
            BufferedReader readpointer = new BufferedReader(fis);
            while ((line = readpointer.readLine())!= null)
            {
               if(currentline == linenumber)
               {
                   String[] words = line.split(",");
                   String Username = words[0];
                   String Password = words[1];
                   System.out.println("Username is : - "+ Username+ " :: Password is :- "+Password);
               }
            currentline++;
            }
        }
        catch (Exception e)
        {
            System.out.println(" File not available to read ");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String pathofFile = "C:/Users/Admin/IdeaProjects/Sample/src/main/resources/Files/CSVExampleSheet.csv";
        readingCSV(pathofFile);
        int lineNumber = 3;
        SpecificLine(pathofFile,lineNumber);
    }
}
