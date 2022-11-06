package com.frc.utn.labiv.tpi.Repository;


import com.frc.utn.labiv.tpi.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface ReciboRepository extends JpaRepository<Recibo, Integer> {

    @Query("SELECT r FROM Recibo r WHERE r.legajoEmpleado.legajo = ?1")
    List<Recibo> findRecibos(int legajo);


    @Query(name = "recibos_por_area", nativeQuery = true)
    List<ReciboNQ> findRecibs(@Param(value = "ano") int año, @Param(value = "mes") int mes);


}
