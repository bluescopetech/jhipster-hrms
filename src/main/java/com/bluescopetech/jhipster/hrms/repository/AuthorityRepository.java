package com.bluescopetech.jhipster.hrms.repository;

import com.bluescopetech.jhipster.hrms.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
