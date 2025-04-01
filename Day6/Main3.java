// package Day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main3 {

    public static void main(String[] args) throws FileNotFoundException{
        Method2();
        System.out.println("Hello");
    }

    public static void Method3() throws FileNotFoundException{
        Method2();
    }
    public static void Method2() throws FileNotFoundException{
        Method1();
    }
    public static void Method1() throws FileNotFoundException{
        try{
            FileReader fileReader = new FileReader("Abc.txt");
        }catch(FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            throw new FileNotFoundException("OOPS error encountered");
        }
    }
}