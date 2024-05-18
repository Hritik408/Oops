package Properties.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice () {
        super();  // it will call BoxWeight
        this.cost = -1;
    }

    BoxPrice (BoxPrice other) {
        // super(other);
        this.cost = other.cost;
    }

    public BoxPrice (double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice (double side ,double weight, double cost){  // side and weight are just above as BoxWeight
        super(side, weight);
        this.cost = cost;
    }
}
