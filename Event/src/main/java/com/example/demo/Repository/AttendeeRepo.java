package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Attendee;

@Repository
public interface AttendeeRepo extends JpaRepository<Attendee,Integer> {

}

