package com.example.Crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Crud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}
