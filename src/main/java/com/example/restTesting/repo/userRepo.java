package com.example.restTesting.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.restTesting.domain.users;

@Repository
public interface userRepo extends JpaRepository<users, String> {
	
@Query(value = "delete from user1 where id=:id",nativeQuery=true )
public int deletetheId(@Param("id") int id);

public Optional<users> findById(int id);
 
	
}
