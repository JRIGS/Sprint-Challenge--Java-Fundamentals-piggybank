
import java.text.DecimalFormat;

public abstract class Coins
{
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    protected int count = 0;
    protected double value = 0;

    public Coins(int count)
    {
        this.count = this.count + count;
        // this.value = value;
    }

    public Coins()
    {
        this.count = count + 1;
    }


    public double getTotal()
    {
        return this.count * this.value;
    }

    public void setCount(int count)
    {
        this.count = this.count + count;
    }


    public Double getValue()
    {
        return this.value;
    }

}