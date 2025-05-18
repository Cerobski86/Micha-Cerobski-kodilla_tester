package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("101"));
        warehouse.addOrder(new Order("103"));
        warehouse.addOrder(new Order("105"));

        try {
            Order foundOrder = warehouse.getOrder("101");
            System.out.println("Found order: " + foundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}