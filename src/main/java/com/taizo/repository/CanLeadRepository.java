package com.taizo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taizo.model.CanLeadModel;

public interface CanLeadRepository extends JpaRepository<CanLeadModel, Long> {

}
