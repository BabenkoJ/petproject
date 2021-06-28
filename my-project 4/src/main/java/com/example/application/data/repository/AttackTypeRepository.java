package com.example.application.data.repository;

import com.example.application.data.model.AttackType;
import com.example.application.data.model.UnitType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sergey Golitsyn
 * created on 03.12.2020
 */
public interface AttackTypeRepository extends JpaRepository<AttackType, Long> {
}
