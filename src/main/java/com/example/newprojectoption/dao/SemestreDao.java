package com.example.newprojectoption.dao;


import com.example.newprojectoption.bean.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreDao extends JpaRepository<Semestre,Long> {
    Semestre findByCode(int code);
    Semestre findByLibelle( String libelle);
    int deleteByCode( int code);
}
