package com.projetperso.projectlostark.repositories;

import com.projetperso.projectlostark.models.SubClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubClassRepository extends JpaRepository<SubClass, Integer> {
}