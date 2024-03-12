package task1.client;
/*
 * the class contains the constructor of the "client" object and a method
 * for outputting its parameters to the console
 */

import task1.order.Order;

import java.util.ArrayList;

public class Client {
    public String name;
    public byte age;
    public ArrayList<Order> orders;

    public Client(String name, byte age, ArrayList<Order> orders){
        this.name=name;
        this.age=age;
        this.orders= orders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                '}';
    }
}
