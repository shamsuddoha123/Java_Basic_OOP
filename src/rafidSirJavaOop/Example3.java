package rafidSirJavaOop;

class Example3
{
    private int var;
    Example3(int num)
    {
        var=num;
    }
    public int getValue()
    {
        return var;
    }
    public static void main(String args[])
    {
        Example3 myobj = new Example3(78);
        System.out.println("value of var is: "+myobj.getValue());
    }
}