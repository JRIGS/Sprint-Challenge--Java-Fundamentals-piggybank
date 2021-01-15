
public class Dime extends Coins
{

    public Dime(int count)
    {
        this.value = 0.10;
        this.count = count;
    }

    public Dime()
    {
        this.value = 0.10;
        this.count = 1;
    }

    @Override
    public String toString()
    {
        if (count == 1)
        {
            return count + " " + "Dime";
        } else
        {
            return count + " " + "Dimes";
        }
    }
}