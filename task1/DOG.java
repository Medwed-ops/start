package task1;
import java.lang.*;

public class DOG
{
    private String name;
    private int age;

    public DOG(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public DOG(String name)
    {
        this.name = name;
        age = 0;

    }
    public DOG()
    {
        name = "REX";
        age = 0;
    }
    public void set_age(int age)
    {
        this.age = age;
    }
    public void set_name(String name)
    {
        this.name = name;
    }
    public int get_age()
    {
        return age;
    }
    public String toString()
    {
        return this.name+", age "+this.age;
    }
    public void intoHumanAge()
    {
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
