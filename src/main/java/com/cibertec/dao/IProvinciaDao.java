package com.cibertec.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Provincia;

public interface IProvinciaDao extends JpaRepository<Provincia, Integer> {

}
