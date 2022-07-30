package Client;

import FlyBehavior.FLyBehavior;
import FlyBehavior.FlyNoWay;
import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;
import QuackBehavior.QuackBehavior;

public class MallardDuck  extends Duck {

    public MallardDuck()
    {
        fLyBehavior= new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("MallardDuck");
    }

}
