package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.V_annonceStatus;
import java.util.List;

@Repository
public interface V_annonceRepository extends JpaRepository<V_annonceStatus, Integer> {
  
    @Query("SELECT v FROM V_annonceStatus v WHERE v.states = :statu")
    List<V_annonceStatus> findByStatu(@Param("statu") int statu);
}

