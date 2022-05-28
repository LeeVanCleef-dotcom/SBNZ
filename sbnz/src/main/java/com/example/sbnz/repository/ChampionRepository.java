package com.example.sbnz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sbnz.model.Champion;

@Repository
public interface ChampionRepository extends JpaRepository<Champion, Integer> {

}
