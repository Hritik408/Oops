package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(21, "kunal ", 10000, false);
        Human rahul = new Human(19, "rahul ", 11000, true);
     //   System.out.println(kunal.name);

        // System.out.println(kunal.population);
  
  //    System.out.println(Human.population);  // here population is not depends upon objects and not wait for making a object to execute, this will execute without making an object and the are not dependend upon objects
  
    //    greeting();  // it will only be valid when greeting will be static, because inside static u can not using non static stuff 
    // fun2();
    }

      static void fun(){
      //    greeting();   // u can not use it because it requires an instances, but the function u r using it in does not depend on instances
    
        // u can not access non static stuff without refrencing their instances in a static context
        // hence, here i'm refrencing
        System.out.println("hello ramu");
          Main obj = new Main();   // here obj is object
          obj.greeting();
    }
     
    void  greeting(){  // it is non static stuff, so it belongs to an object
        fun();   // here static member inside the non static one, but the reverse it not possible
        System.out.println("hello greeetings");
    }

    void fun2() {   // non static stuff, in the end the object of fun2 is create 100% because everything goes inside main only
        greeting();  // here it is fine
    }
}

// static ke ander non static nahi aa skta but non static ke ander static aa skta hai
