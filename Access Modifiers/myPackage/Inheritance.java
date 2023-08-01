package myPackage;


class Mobile{

    private int a = 6;

    public void setA(int ab){
        this.a = ab;
    }

    public int getA()
    {
        return a;
    }

    public void call()
    {
        System.out.println("I am calling");
    }
    void game()
    {
        System.out.println("Game Loading");
    }

    void clock()
    {
        System.out.println("Alarm Ringing");
    }
}

class Smartphone extends Mobile{
    void camera()
    {
        System.out.println("Camera is getting On!");
    }
    void filter()
    {
        System.out.println("Filtering Images");
    }
    
}



class Inheritance {
    public static void main(String[] args) {
        
        Smartphone s = new Smartphone();
        s.camera();
        s.filter();
        s.call();
        s.clock();
        s.game();

        s.setA(4);
        // System.out.println(s.a);

        // s.a line will show error 
        // because u cant directly use private members

        // you have to deal with setter and getter to print value of a
        
    }
}
