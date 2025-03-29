// Polymorphism

class Shapes {
    void area(){
        System.out.println("I am inside class: Shapes");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("Area of a Circle: pi*r*r");
    }
}

class Square extends Shapes {
    void area(){
        System.out.println("Area of the Square: side*side");
    }    
}

class Triangle extends Shapes {
    void area(){
        System.out.println("Area of the Triangle: 0.5*base*height");
    }   
}

public class Main2 {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Square square = new Square();
        Circle circle = new Circle();

        shapes.area();
        square.area();
        circle.area();

        Shapes sq = new Square();
        sq.area();
    }
}
