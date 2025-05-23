public class Main8 {
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        String[] strArr = {"Hello", "World"};
        printArray(intArr);
        printArray(strArr);
        display(75);
        display("Sap");
    }

    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    //Method Overloading:

    public static <T> void display(T element){
        System.out.println("Generic display: "+element);
    }

    public static void display(Integer element){
        System.out.println("Integer display: "+element);
    }
}