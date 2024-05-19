package AbstaractDemo;

public class Main {
    public static void main(String[] args) {
     //    Son son = new Son("doctor");
        Son son = new Son(56);
        // son.career("Air-man");
          son.career();
          son.partner();
          son.normal();

     //   Daughter daughter = new Daughter(56);
     Parent daughter = new Daughter(12);
        daughter.career();
    //    daughter.partner();

    Parent.hello();
        
        
    }
}
