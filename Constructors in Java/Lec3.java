class car {
    int price;
    int milage;
    String name;

    car()
    {
        System.out.println("Car finally created");
    }

    car(int price, int m, String name)
    {
        this.price = price;
        this.milage = m;
        this.name = name;

        System.out.println(this.price + " " + this.milage + " " + this.name);
    }
}


public class Lec3 {
    
   public static void main(String[] args) {
    
    car verna = new car(1200000,27,"Verna");
    car nexa = new car(500000,23,"Nexa");
   }
}
