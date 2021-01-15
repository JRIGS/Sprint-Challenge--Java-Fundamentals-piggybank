
public class Nickel extends Coins
{

    public Nickel(int count)
    {
        this.value = 0.05;
        this.count = count;
    }

    @Override
    public String toString()
    {
        return count + " " + "Nickels";
    }
}