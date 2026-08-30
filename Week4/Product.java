public class Product
{
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;
    private static int productCount;

    public Product(String code,String name,double unitPrice)
    {
        this(code,name,unitPrice,0);
    }

    public Product(String code,String name,double unitPrice,int quantity)
    {
        this.code=code;
        this.name=name;
        if(unitPrice>0)
            this.unitPrice=unitPrice;
        if(quantity>=0)
            this.quantity=quantity;
        productCount++;
    }

    public boolean restock(int amount)
    {
        if(amount>0)
        {
            quantity+=amount;
            return true;
        }
        return false;
    }

    public boolean sell(int amount)
    {
        if(amount>0&&amount<=quantity)
        {
            quantity-=amount;
            return true;
        }
        return false;
    }

    public double getInventoryValue()
    {
        return unitPrice*quantity;
    }

    public static int getProductCount()
    {
        return productCount;
    }

    public String toString()
    {
        return "Product{code='"+code+"', name='"+name+"', unitPrice="+unitPrice+", quantity="+quantity+"}";
    }
}