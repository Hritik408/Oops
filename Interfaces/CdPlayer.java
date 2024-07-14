package Interfaces;

public class CdPlayer  implements Media{

    @Override
    public void start() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'start'");
       System.out.println("Music start");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
        System.out.println("Music stop");
    }
    
}
