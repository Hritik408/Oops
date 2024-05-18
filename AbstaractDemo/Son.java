package AbstaractDemo;

public class Son extends Parent{

    public Son() {
      System.out.println("I'm don");
    }

    // @Override
    // void career(String name) {
    //     // System.out.println("I'm going to be a " + name);
    //     System.out.println("I'm going to be a ");
    // }

    @Override
    void career() {
        System.out.println("I'm going to be a Hero");
    }

    // @Override
    // void partner(String name, int age) {
    //     System.out.println("I love " + name + "She is " + age + " years old");
    // }
    @Override
    void partner() {
        System.out.println("I love India");
    }
    
}
