package Day4.SetStudentData;

import Day4.StudentData.StudentData;

public class Main extends StudentData{
    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.setReg("24BCEXXXX");
        obj1.getReg();


        // Will show error because only subclass can access it
        // StudentData objx = new StudentData();
        // objx.setReg("Test123");
        // objx.getReg();
    }
}