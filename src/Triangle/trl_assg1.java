package Triangle;

import java.util.Scanner;

public class trl_assg1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindingArea fa = new FindingArea();
        fa.area(4.0);
        fa.area(5);
        fa.area(5,6);
        fa.area(5.0,12.0);
    }
}
class FindingArea
{
    void area(double x)
    {
        double z = x*x*3.14;
        System.out.println("Area of circle:"+z);
    }
    void area(float x)
    {
        System.out.println("Area of square:"+x*x);
    }
    void area(float x, float y)
    {
        System.out.println("Area of rectangle:"+x*y);
    }
    void area(double b, double h)
    {
        double m = (b*h/2);
        System.out.println("Area of triangle:"+m);
    }
}