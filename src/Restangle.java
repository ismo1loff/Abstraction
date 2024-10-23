import java.util.Scanner;

public abstract class Restangle extends GeometricFigura
{

    @Override
    void area()
    {
        int a = 5;
        int b = 10;
        System.out.println("1. To'rtburchak yuzi = " + (a*b));
    }

    @Override
    void perimetr()
    {
       int a = 5;
       int b = 10;
        System.out.println("Perimetr = " + 2*(a + b));
    }
}
