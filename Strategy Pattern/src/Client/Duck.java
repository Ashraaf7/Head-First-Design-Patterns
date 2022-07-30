package Client;

import FlyBehavior.FLyBehavior;
import QuackBehavior.QuackBehavior;

public abstract class Duck {
    FLyBehavior fLyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}
    public abstract void display();
    public void PerformQuack()
    {
        quackBehavior.quack();
    }
    public void PerformFly()
    {
        fLyBehavior.fly();
    }
    public void SetFlyBehavior (FLyBehavior f)
    {
        fLyBehavior = f;
    }
    public void SetQuackBehavior (QuackBehavior q)
    {
        quackBehavior = q;
    }
}


