package com.example.sbnz.repository;

import com.example.sbnz.model.ChampClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampClassRepository extends JpaRepository<ChampClass, Integer> {



}
