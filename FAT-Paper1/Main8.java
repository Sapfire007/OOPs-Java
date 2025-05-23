import java.util.Scanner;

class InvalidUsernameException extends Exception{
    public InvalidUsernameException(){
        super("Username is too short");
    }
}

class Auth{
    public void verify(String s) throws Exception{
        if(s.length()<6){
            throw new InvalidUsernameException();
        }
        if(s.contains(" ")){
            throw new IllegalArgumentException("Username must not contain any spaces");
        }
    }
}

public class Main8 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Fill Username: ");
        String s = in.nextLine();

        Auth x = new Auth();
        try{
            x.verify(s);
        } catch (InvalidUsernameException e){
            System.out.println(e);
            return;
        } catch (IllegalArgumentException e){
            System.out.println(e);
            return;
        } catch (Exception e){
            System.out.println("Internal error...");
            return;
        }
        System.out.println("Login Successful.");
    }
}