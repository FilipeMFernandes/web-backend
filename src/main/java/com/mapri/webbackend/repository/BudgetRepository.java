package com.mapri.webbackend.repository;

import com.mapri.webbackend.domain.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget,Long> {
}
