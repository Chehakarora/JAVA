public class ShapeManagementApp
{
    private String color;

    public ShapeManagementApp(String color)
    {
        this.color=color;
    }

    String GetColor()
    {
        return color;
    }

    double CalcArea(double side)
    {
        return side*side;
    }

    double CalcArea(double length,double breadth)
    {
        return length*breadth;
    }

    double calcPerimeter(double side)
    {
        return 4*side;
    }

    double calcPerimeter(double length,double breadth)
    {
        return 2*(length+breadth);
    }
}

class Circle extends ShapeManagementApp
{
    private double radius;

    Circle(String color,double radius)
    {
        super(color);
        if(radius>0)
        {
            this.radius=radius;
        }
        else
        {
            this.radius=1;
        }
    }

    double calcArea(double radius)
    {
        return 3.14*radius*radius;
    }

    double calcPerimeter(double radius)
    {
        return 2*3.14*radius;
    }

    void GetDetails()
    {
        System.out.println("CIRCLE");
        System.out.println("Color:"+GetColor());
        System.out.println("Radius:"+radius);
        System.out.println("Area:"+calcArea(radius));
        System.out.println("Perimeter:"+calcPerimeter(radius));
    }
}

class Rectangle extends ShapeManagementApp
{
    private double length;
    private double breadth;

    Rectangle(String color,double length,double breadth)
    {
        super(color);
        if(length>0)
        {
            this.length=length;
        }
        else
        {
            this.length=1.0;
        }

        if(breadth>0)
        {
            this.breadth=breadth;
        }
        else
        {
            this.breadth=1.0;
        }
    }

    double calculateArea(double length,double breadth)
    {
        return length*breadth;
    }

    double calculatePerimeter(double length,double breadth)
    {
        return 2*(length+breadth);
    }

    void GetDetails()
    {
        System.out.println("RECTANGLE");
        System.out.println("Color:"+GetColor());
        System.out.println("Length:"+length);
        System.out.println("Breadth:"+breadth);
        System.out.println("Area:"+calculateArea(length,breadth));
        System.out.println("Perimeter:"+calculatePerimeter(length,breadth));
    }
}

class Square extends ShapeManagementApp
{
    private double side;

    Square(String color,double side)
    {
        super(color);
        if(side>0)
        {
            this.side=side;
        }
        else
        {
            this.side=1.0;
        }
    }

    double calcArea(double side)
    {
        return side*side;
    }

    double calcPerimeter(double side)
    {
        return 4*side;
    }

    void GetDetails()
    {
        System.out.println("SQUARE");
        System.out.println("Color:"+GetColor());
        System.out.println("Side:"+side);
        System.out.println("Area:"+calcArea(side));
        System.out.println("Perimeter:"+calcPerimeter(side));
    }
}