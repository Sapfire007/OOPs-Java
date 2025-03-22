package Day2.Packages.Folder1;

import static Day2.Packages.Folder2.Message.message;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Hello! How are you?");
        message();
        Day2.Packages.Folder2.Greetings.main(new String[]{}); // Call using full package name
    }
}

//cant create another java file in here in this folder or package named as Greetings.java