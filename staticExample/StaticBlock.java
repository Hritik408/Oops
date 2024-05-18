package staticExample;

public class StaticBlock {
    static int a = 5;
    static int b;

    // will only run once, when the first obj is created i.e. when  the class is loaded for the first time
    static {
        System.out.println("hello, i'm in static block");
        b = a * 4;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
