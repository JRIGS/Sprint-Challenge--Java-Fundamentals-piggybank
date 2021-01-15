
public class Penny extends Coins
{

    public Penny(int count)
    {
        this.value = 0.01;
        this.count = count;
    }

    @Override
    public String toString()
    {
        return count + " " + "Pennies";
    }
}