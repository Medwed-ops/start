package task2;
import java.lang.*;

public class Ball
{
    private String color;
    private String view;

    public Ball(String color, String view)
    {
        this.color = color;
        this.view = view;
    }

    public Ball(String color) {
        this.color = color;
        view = "I do not know";
    }

    public Ball()
    {
        color = "I do not know";
        view = "I do not know";
    }
    public void set_color(String color)
    {
        this.color = color;
    }
    public void set_view(String view)
    {
        this.view = view;
    }
    public void get_Ball()
    {
        System.out.println("this is a " + color + " " + view + " ball");
    }
}