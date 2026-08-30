public class Rectangle
{
    private double width;
    private double height;

    public Rectangle()
    {
        this(1,1);
    }

    public Rectangle(double side)
    {
        this(side,side);
    }

    public Rectangle(double width,double height)
    {
        if(width>0&&height>0)
        {
            this.width=width;
            this.height=height;
        }
    }

    public double getArea()
    {
        return width*height;
    }

    public double getPerimeter()
    {
        return 2*(width+height);
    }

    public boolean isSquare()
    {
        return width==height;
    }

    public void scale(double factor)
    {
        if(factor>0)
        {
            width*=factor;
            height*=factor;
        }
    }

    public String toString()
    {
        return "Rectangle{width="+width+", height="+height+"}";
    }
}