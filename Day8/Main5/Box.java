package Main5;

public class Box <T extends Number> {
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(){
        this.value = value;
    }
}
