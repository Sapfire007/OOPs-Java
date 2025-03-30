package Day4.StudentData;

public class StudentData {
    protected String regID;

    protected void setReg(String regID){
        this.regID = regID;
    }

    protected void getReg(){
        System.out.println(regID);
    }
}