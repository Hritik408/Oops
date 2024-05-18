package Intro;

import java.util.Arrays;

public class mane {
    public static void main(String[] args) {
    // Student[] students = new Student[5];   // here Student is own make data type
    // System.out.println(students); 
    // Student kunal;  // declaring refrence variable to a class

    // System.out.println(Arrays.toString(students));

     Student kunal = new Student(21, "jitender", 77.3f);
  //  Student kunal = new Student();

    //  kunal.rno = 11;
    // kunal.name = "hritik";
    // kunal.marks = 22.2f;  // if here marks is not present then class Student marks will print
    // kunal.salary = 55;    // u can't write salary here bcz salary is not present in Student class

    System.out.println(kunal.rno);   // 11
    System.out.println(kunal.name); 
    System.out.println(kunal.marks); 
    // System.out.println(kunal.salary); 

     kunal.changeName("karan ji");

    //  System.out.println(kunal.rno);   // 11
     System.out.println(kunal.name); 
    //  System.out.println(kunal.marks); 

    kunal.greeting();

    Student random = new Student(kunal);
     System.out.println(random.name);
     System.out.println(random.marks);

    Student random2 = new Student();
    System.out.println(random2.name);

    Student one = new Student();
    Student two = one;
    one.name = "something something";
    // System.out.println( two.name);


    // }
}
}



    // create a class
    // for every single student
    class Student{
        int rno;
        String name;   // here String is also a class bcz it starts from capital letter
        float marks = 90;
  //      int salary;

        Student(){   // it is a constructor  , when the call the constructor without value then it will call
            this.rno = 101;  // this is replace with object as kunal at line 13
            this.name = "Rahul";
            this.marks = 89.2f;

        }

        Student(Student other){  // here other will replace with kunal and this will replace with random
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }

        // Student(){
        //     // this is how u can a contructor from another contructor
        //     // internally new Student(24, "default peson", 99.9f)
        //     this (24, "default peson", 99.9f);
        // }

        // Student arpit = new Student(6, "arpit", 11.36) here this will replace with arpit 
        Student(int rollno, String name, float marks){  // there are allote to the rhs  , when u call the constructor with three value then this will call
            this.rno = rollno; 
            this.name = name;
            this.marks = marks;
        }

        void greeting(){
             System.out.println("hello " + this.name);
        }

        void changeName(String newName){
            name = newName;   // or this.name = newName
        }

    }


