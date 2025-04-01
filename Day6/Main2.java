// package Day6;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("HelloWorld1.txt");
        }catch(FileNotFoundException e){
            System.out.println("File not found 1");
        }catch(IOException e){
            System.out.println("File not found - error");
        }
    }
}
