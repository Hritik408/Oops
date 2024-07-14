package Interfaces;

public class NiceCar {
  //  private Engine engine;   // internal engine its own, it's initilize 
    private Engine engine = new PowerEngine();   // internal engine its own, it's initilize 
    private Media player = new CdPlayer();  // 

    public NiceCar () {  // first this default constructor will run when we call from the main 
     //   engine = new powerEngine();
     //    engine = new ElectricEngine();
     // if we not write 9 and 10 line then the command of engine to the line 5 as PowerEngine
    }

    // public NiceCar(Engine engine) {
    //     this.engine = engine;
    // }

    public void start(){
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine(); // if u not use this line then powerEngine will work here u change the command from power to electric
        engine.stop();
    }
}
