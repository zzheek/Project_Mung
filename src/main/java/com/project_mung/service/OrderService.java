package com.project_mung.service;

import com.project_mung.domain.Cart;
import com.project_mung.domain.Delivery;
import com.project_mung.domain.Order;

import java.util.List;

public interface OrderService {

    List<Cart> getOrderItems(List<Integer> cartid);

    boolean placeOrder(List<Cart> selectedItems);

    List<Delivery> getDelivery(String userid);

    boolean insertDelivery(Delivery delivery);

    Boolean deleteDelivery(int deliveryid);

    Boolean saveOrder(Order order);

    Boolean updateCart(List<Integer> cartid);

    Boolean modifyDelivery(Delivery delivery);
}
