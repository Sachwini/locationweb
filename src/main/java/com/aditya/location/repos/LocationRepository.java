package com.aditya.location.repos;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aditya.location.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
	
   
   public List<Object[]> findTypeAndTypeCount();
	 }
