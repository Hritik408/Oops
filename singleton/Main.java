package singleton;

public class Main {
    Singleton obj1 = Singleton.getInstance();  // here it give the command 
    Singleton obj2 = Singleton.getInstance();  // follow obj1 command
    Singleton obj3 = Singleton.getInstance();  // follow obj1 command

    // all the 3 ref variables are pointing to just one object
}
