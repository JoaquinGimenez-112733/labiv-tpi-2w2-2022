package com.frc.utn.labiv.tpi.Repository;

import com.frc.utn.labiv.tpi.Model.Empleado;
import com.frc.utn.labiv.tpi.Model.EmpleadoDTOSimple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    @Query(name = "empleados_simple", nativeQuery = true)
    List<EmpleadoDTOSimple> findEmpleadoDTOSimple();
}
