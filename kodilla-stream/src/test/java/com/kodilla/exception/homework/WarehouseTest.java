package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {
    @Test
    public void shouldThrowExceptionWhenOrderNotFound() {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("101"));
        warehouse.addOrder(new Order("102"));

        //when & then
        assertThrows(OrderDoesntExistException.class, () -> {warehouse.getOrder("103");
        });
    }
}