package com.example.managersangoushaheroes.Resposity;

import com.example.managersangoushaheroes.Entity.HeroesInfoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroesInfoResposity extends JpaRepository<HeroesInfoEntity,Integer> {
@Query(value = "SELECT * FROM heroinfo",nativeQuery = true)
    Page<HeroesInfoEntity>paging(Pageable pageable);
@Query(value = "SELECT * FROM heroinfo", nativeQuery = true)
    List<HeroesInfoEntity>getAllHeroes();
}
