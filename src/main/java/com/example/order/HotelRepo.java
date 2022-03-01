package com.example.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {

}
