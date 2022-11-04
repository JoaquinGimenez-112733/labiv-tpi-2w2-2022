package com.frc.utn.labiv.tpi.Repository;

import com.frc.utn.labiv.tpi.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
