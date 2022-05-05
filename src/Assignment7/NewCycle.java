package Assignment7;

public interface NewCycle {
    void Unicycle();
    void Bicycle();
    void Tricycle();
}
abstract class factory1 implements NewCycle{

    @Override
    public void Unicycle() {

    }
}
abstract class factory2 implements NewCycle{

    @Override
    public void Bicycle() {

    }
}
abstract class factory3 implements NewCycle{

    @Override
    public void Tricycle() {

    }
}