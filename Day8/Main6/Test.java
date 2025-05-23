package Main6;

interface Printable {
    void print();    
}

class MyNumber extends Number implements Printable{
    private final int value;

    public MyNumber(int value){
        this.value = value;
    }

    @Override
    public void print(){
        System.out.println("My Number: "+value);
    }

    @Override 
    public int intValue(){
        return value;
    }

    @Override
    public float floatValue(){
        return value;
    }

    @Override
    public long longValue(){
        return value;
    }

    @Override
    public double doubleValue(){
        return value;
    }

}

class BoxX<T extends Number & Printable>{
    private T item;

    public BoxX(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }
}

public class Test {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(75);
        BoxX<MyNumber> b1 = new BoxX<MyNumber>(myNumber);
        b1.display();
    }
}
