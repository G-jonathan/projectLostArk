package com.projetperso.projectlostark.services;

import com.projetperso.projectlostark.models.SubClass;
import java.util.List;

public interface ISubClassService {

    List<SubClass> findAllSubClass();

    List<SubClass> findSpecificSubClass();
}