package com.example.ecommerceDemo.repositories;

import com.example.ecommerceDemo.entities.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository <ReviewEntity, Long> {

}
