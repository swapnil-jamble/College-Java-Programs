


    abstract class shape
    {
        int a=5,b=8;
        abstract public void printArea();
    }

    class rectangle extends shape
    {
        public int area_rectangle;
        public void printArea()
        {
            area_rectangle = a*b;
            System.out.println("The area of rectangle is:"+area_rectangle);
        }
    }

    class triangle extends shape
    {
        int area_triangle;

        public void printArea()
        {
            area_triangle = (int) (0.5*a*b);
            System.out.println("The area of triangle is:"+area_triangle);
        }
    }

    class circle extends shape
    {
        int area_circle;
        public void printArea()
        {
            area_circle=(int) (3.14*a*a);
            System.out.println("The area of circle is:"+area_circle);
        }
    }

    public class Abstract_Shape {

        public static void main(String[] args) {

            rectangle r = new rectangle();
            r.printArea();
            triangle t = new triangle();
            t.printArea();
            circle r1 = new circle();
            r1.printArea();
        }
    }

    /*
    The area of rectangle is:40
    The area of triangle is:20
    The area of circle is:78
     */