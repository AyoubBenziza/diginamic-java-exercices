package Entities;

public class Theater {
    public String name;
    public int capacity;
    public int clients;
    public double totalRevenue;

    public Theater(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.clients = 0;
        this.totalRevenue = 0;
    }

    public void signIn(int clients, double price) {
        if (this.clients + clients > capacity) {
            throw new IllegalArgumentException("Not enough space");
        }
        this.clients += clients;
        this.totalRevenue += clients * price;
    }


}
