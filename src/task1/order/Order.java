package task1.order;
/**
 the class contains the constructor of
 the "order" object and a method for outputting its
 parameters to the console
 */
public class Order {

    public String name;
    public int price;

    public Order(String name, int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
