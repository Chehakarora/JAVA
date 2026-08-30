public class Profile
{
    private String name;
    private int age;
    private double heightMetres;

    public Profile(String name,int age,double heightMetres)
    {
        if(name!=null&&!name.isBlank())
            this.name=name;
        if(age>=0)
            this.age=age;
        if(heightMetres>0)
            this.heightMetres=heightMetres;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getHeightMetres()
    {
        return heightMetres;
    }

    public String toString()
    {
        return "Profile{name='"+name+"', age="+age+", heightMetres="+heightMetres+"}";
    }
}