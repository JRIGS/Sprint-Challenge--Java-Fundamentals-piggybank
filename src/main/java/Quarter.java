public class Quarter extends Coins
{

    public Quarter()
    {
        this.value = 0.25;
        this.count = 1;
    }

    @Override
    public String toString()
    {
        return count + " " + "Quarter";
    }
}