package com.cdbm.portfolio.repository;

import com.cdbm.portfolio.model.Experiencia_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Experiencia_laboralRepository extends JpaRepository<Experiencia_laboral, Long>{

}
