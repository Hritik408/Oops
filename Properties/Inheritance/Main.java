package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
     //   Box box = new Box(6, 5, 1);

    //  BoxWeight box1 = new BoxWeight();

    //     System.out.println(box1.l + " " + box1.h + " " + box1.weight);

    // BoxWeight box2 = new BoxWeight(1,2,3,4);

    // System.out.println(box2.l + " " + box2.h + " " + box2.w + " " + box2.weight);

    // Box box3 = new BoxWeight(2,3,4,5);  // u are refrencing a parent to child, BoxWeight knows what's Box contains
  
    // BoxWeight box4 = Box(1,2,3);   // u r refrecing a child to parent, here will be error, u can not have child ref variable and parent obj

    BoxPrice box = new BoxPrice(5,6,7);

    }
}
