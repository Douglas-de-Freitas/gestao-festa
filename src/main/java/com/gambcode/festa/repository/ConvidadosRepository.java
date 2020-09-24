package com.gambcode.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gambcode.festa.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long>{

}
