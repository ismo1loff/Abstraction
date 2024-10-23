import java.util.Scanner;

public abstract class Triangle extends GeometricFigura
{
    @Override
    void area()
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int P = (a + b + c)/2;
        System.out.println("3. Uchburchak yuzi = " + Math.sqrt((P) * (P-a)*(P-b)*(P-c)));
    }

    @Override
    void perimetr()
    {
        int a = 5;
        int b = 4;
        int c = 3;
        System.out.println("Perimetri = " + (a + b + c));
    }
}
