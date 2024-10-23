import java.util.Scanner;

public abstract class Trapetsiya extends GeometricFigura
{
    @Override
    void area()
    {
        int a = 6;
        int b = 8;
        int c = 5;
        System.out.println("2. Trapetsiya yuzi = " + (a + b)/2 * c);
    }

    @Override
    void perimetr()
    {
        int a = 6;
        int b = 8;
        int c = 5;
        System.out.println("Perimetri = " + (a + b + 2*c));
    }
}
