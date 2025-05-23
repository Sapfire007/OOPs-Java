public class Main7 {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(num); // Boxing
        System.out.println(num1);

        int n1 = 75;
        Integer num2 = n1; // Autoboxing
        System.out.println(num2);

        int num3 = num2.intValue(); //Unboxing
        System.out.println(num3);

        int num4 = num2; //Auto-unboxing
        System.out.println(num4);
        
        String str = "42";
        System.out.println(Integer.parseInt(str));
        System.out.println(((Object) Integer.parseInt(str)).getClass().getName());
    }
}