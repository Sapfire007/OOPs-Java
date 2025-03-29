class Box{
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box other){
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

    public void info(){
        System.out.println("Running the box");
    }

    static void greeting(){
        System.out.println("Hey! I'm inside Box class. Greetings!");
    }
}

class BoxWeight extends Box{
    double weight;
    
    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    // @Override             <- Can't override
    static void greeting(){
        System.out.println("Hey! I'm inside BoxWeight class. Greetings!");
    }

}

class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(){
        super();
        this.cost = -1;
    }

    public BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost){
        super(l,w,h,weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }
    
}

class BoxColor extends BoxWeight{}

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l+"   "+box1.w+"   "+box1.h);

        Box box2 = new Box(2.75);
        System.out.println(box2.l+"   "+box2.w+"   "+box2.h);

        Box box3 = new Box(7.5, 14.64, 50.25);
        System.out.println(box3.l+"   "+box3.w+"   "+box3.h);

        Box box4 = new Box(box3);
        System.out.println(box4.l+"   "+box4.w+"   "+box4.h);


        BoxWeight box5 = new BoxWeight();
        System.out.println(box5.l+"   "+box5.w+"   "+box5.h+"  "+box5.weight);

        BoxWeight box6 = new BoxWeight(1,2,3,4);
        System.out.println(box6.l+"   "+box6.w+"   "+box6.h+"  "+box6.weight);

        BoxPrice box7 = new BoxPrice(5,10,50);
        System.out.println(box7.l+"   "+box7.w+"   "+box7.h+"  "+box7.weight+"  "+box7.cost);

        // Box.greeting();
        // BoxWeight.greeting();

        BoxWeight box8 = new BoxWeight();
        BoxWeight.greeting();   // You can inherit but you cannot override
    }
}