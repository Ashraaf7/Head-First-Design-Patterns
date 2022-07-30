package Client;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Mute;
import QuackBehavior.Squeak;

public class RubberDuck extends Duck  {
    public RubberDuck()
    {
        fLyBehavior= new FlyNoWay();
        quackBehavior = new Mute();
    }
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
