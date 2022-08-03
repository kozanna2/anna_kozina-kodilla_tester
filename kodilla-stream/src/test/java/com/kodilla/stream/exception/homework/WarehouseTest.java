package com.kodilla.stream.exception.homework;

import com.kodilla.exception.homework.Order;
import com.kodilla.exception.homework.OrderDoesntExistException;
import com.kodilla.exception.homework.Warehouse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order10"));
        warehouse.addOrder(new Order("Order11"));
        warehouse.addOrder(new Order("Order12"));
        warehouse.addOrder(new Order("Order13"));
        //when
        String isOrderInUse = warehouse.isOrderInUse("Order12");
        //then
        assertEquals(isOrderInUse, "Order12");
    }

    @Test
    public void testIsOrderInUse_withException(){
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order10"));
        warehouse.addOrder(new Order("Order11"));
        warehouse.addOrder(new Order("Order12"));
        warehouse.addOrder(new Order("Order13"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, ()->warehouse.isOrderInUse("Order15"));
    }
}
