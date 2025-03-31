package Day5.ExtendInterfaces;

public interface C {
    default void random(){
        System.out.println("This is in random block within interface C ");
    }
}