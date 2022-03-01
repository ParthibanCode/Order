package com.example.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.HotelRepo;
import com.example.order.entity.Hotel;

@Service
public class HotelService {
	@Autowired
	HotelRepo orderRepository;
	public Iterable<Hotel> getOrders() {

		return orderRepository.findAll();
	}

	public void saveOrder(Hotel order) {

		orderRepository.save(order);

	}

}
