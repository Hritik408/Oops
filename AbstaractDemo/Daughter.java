package AbstaractDemo;

public class Daughter extends Parent {

    // public Daughter(int age){
    //     this.age = age;
    // }

    public Daughter() {
        System.out.println("I'm the daughter");
    }

    @Override
    void career() {
        System.out.println("Hello daughter");
    }

    @Override
    void partner() {
       System.out.println("I want that person in my Life");
    }
    
}
