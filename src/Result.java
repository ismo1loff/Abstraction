public class Result
{
    public static void main(String[] args)
    {
        GeometricFigura restangle = new Restangle() {};
        GeometricFigura triangle = new Triangle() {};
        GeometricFigura trapetsiya = new Trapetsiya() {};
        restangle.area();
        restangle.perimetr();
        trapetsiya.area();
        trapetsiya.perimetr();
        triangle.area();
        triangle.perimetr();
    }
}
