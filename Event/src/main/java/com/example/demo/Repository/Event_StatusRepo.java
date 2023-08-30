package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Event_Status;

@Repository
public interface Event_StatusRepo extends JpaRepository<Event_Status,Integer> {

}


