package uebungen.uebung7_nochmal;

public class MyInteger 
{
    private int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int intValue()
    {
        return this.value;
    }

    public static MyInteger valueOf(int value)
    {
        return new MyInteger(value);
    }
}
