package com;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
		
		
		try {
			File f=new File("MyFile.txt");
			FileWriter writer = new FileWriter("MyFile.txt");//this is for writing to a file
            BufferedWriter  ab= new BufferedWriter(writer);
            ab.write("helllo ");
            ab.newLine();
            ab.write("simplylearn ");
            ab.close();
            BufferedWriter ap = new BufferedWriter(new FileWriter("MyFile.txt",true));//this is for appending to a file
            ap.write(" Now i am going to attend class ");
            ap.newLine();
            ap.write(" please let me know session timming ");
            ap.close();
            
            BufferedReader dr=new BufferedReader(new FileReader(f));
            String character;
 
            while ((character = dr.readLine()) != null) {
                System.out.print(character);
            }
            dr.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}


