public class PayrollManagementApp
{
}

interface Payable
{
    double getPay();
}

class FullTimeEmployee implements Payable
{
    double salary;

    FullTimeEmployee(double salary)
    {
        this.salary=salary;
    }

    public double getPay()
    {
        return salary;
    }
}

class Contractor implements Payable
{
    double rate;
    int hours;

    Contractor(double rate,int hours)
    {
        this.rate=rate;
        this.hours=hours;
    }

    public double getPay()
    {
        return rate*hours;
    }
}

class PayrollProcessor
{
    private Payable[] items=new Payable[5];
    private int count=0;

    void add(Payable p)
    {
        if(count<items.length)
            items[count++]=p;
    }

    double getTotal()
    {
        double total=0;
        for(int i=0;i<count;i++)
            total+=items[i].getPay();
        return total;
    }
}