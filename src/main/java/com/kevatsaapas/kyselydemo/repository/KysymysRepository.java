package com.kevatsaapas.kyselydemo.repository;

import com.kevatsaapas.kyselydemo.model.Kysymys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KysymysRepository extends CrudRepository <Kysymys, Long>{
    Optional<Kysymys> findById(Long id);
    List<Kysymys> findByKyselyId(Long kyselyId);
}
