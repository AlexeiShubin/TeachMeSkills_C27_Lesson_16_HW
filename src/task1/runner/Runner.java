package task1.runner;

import task1.client.Client;
import task1.createMap.CreateMap;
import task1.order.Order;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Order order1=new Order("кроссовки", 150);
        Order order2=new Order("телефон", 2000);
        Order order3=new Order("игрушка", 25);
        Order order4=new Order("утюг", 350);
        Order order5=new Order("лампа", 50);

        ArrayList<Order> orders1=new ArrayList<>();
        orders1.add(order1);
        orders1.add(order4);
        orders1.add(order3);

        Client client1=new Client("Ivan", (byte) 23, orders1);

        ArrayList<Order> orders2=new ArrayList<>();
        orders2.add(order2);
        orders2.add(order3);

        Client client2=new Client("Alex", (byte) 34, orders2);
        ArrayList<Order> orders3=new ArrayList<>();

        orders3.add(order5);
        orders3.add(order4);

        Client client3=new Client("Artem", (byte)32, orders3);

        CreateMap.FirstWay(CreateMap.createMap(client1, client2, client3));
        System.out.println("_________________");
        CreateMap.SecondWay(CreateMap.createMap(client1, client2, client3));
        System.out.println("_________________");
        CreateMap.Key(CreateMap.createMap(client1, client2, client3));
        System.out.println("_________________");
        CreateMap.Value(CreateMap.createMap(client1, client2, client3));

    }
}
