package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.Event_Details;

@Repository
public interface Event_DetailsRepo extends JpaRepository<Event_Details,Integer> {

}


