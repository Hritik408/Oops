package Interfaces;

public class Car implements Brake, Engine, Media {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
        System.out.println("I start engine like a  normal car");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'acc'");
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'brake'");
        System.out.println("I brake like a normal car");
    }
    
}
