class Lec1{

    public void sum()
    {
        System.out.println("Sum is zero");
    }

    public void sum(int a)
    {
        System.out.println("Sum is "+a);
    }

    public void sum(int a, int b)
    {
        System.out.println("Sum is "+ (a+b));
    }


    public static void main(String[] args) {
        Lec1 l = new Lec1();
        l.sum();
        l.sum(23);
        l.sum(11, 12);
    }
}