package com.newag.www.newag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TerminRepository extends JpaRepository<Termin, Long>{
	
}
