package task1;
import java.lang.*;

public class TestDOG
{
    public static void main(String[] args)
    {
        DOG d1 = new DOG("Mike", 2);
        DOG d2 = new DOG("Helen", 7);
        DOG d3 = new DOG("Bob");
        d3.set_age(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}