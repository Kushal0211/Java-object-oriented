package myPackage;


class Application {
   
    public String name;
    public int people;
    private int users;

    void run(){
        System.out.println("I am in default Mode");
    }

    public void run1()
    {
        System.out.println("In Public Mode");
    }
    private void run2()
    {
        System.out.println("I am in Private Mode");
    }
}
class Lec3 {
    public static void main(String[] args) {
        Application a = new Application();
        
    }
}