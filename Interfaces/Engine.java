package Interfaces;

public interface Engine {
    static final int price = 78000;

    void start();  // interface abstract method can not have a body
    void stop();
    void acc(); // before void we can write abstract
}
