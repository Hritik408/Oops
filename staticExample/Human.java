package staticExample;

public class Human {
     int age;   // age, name, salary, married, population are the properties of Human class
     String name;
     int salary;
     boolean married;
    static long population;  // such properties that are not related to an object but are common to all the object of an class that are declare as static

     public Human(int age, String name, int salary, boolean married){   // here we make constructor of class human
        this.age = age;   // this represents the object
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;  // here we not use 'this' keyword because this represent the object but population is not object as static is present before it at above class properties
     }
}
