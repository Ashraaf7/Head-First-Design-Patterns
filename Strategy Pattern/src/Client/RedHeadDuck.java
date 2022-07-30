package Client;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Quack;
import QuackBehavior.Squeak;

public class RedHeadDuck extends Duck  {


    public RedHeadDuck()
    {
        fLyBehavior= new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("RedHeadDuck");
    }
}
