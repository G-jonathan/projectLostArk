package com.projetperso.projectlostark.services.impl;

import com.projetperso.projectlostark.models.SubClass;
import com.projetperso.projectlostark.repositories.SubClassRepository;
import com.projetperso.projectlostark.services.ISubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SubClassServiceImpl implements ISubClassService {

    @Autowired
    private SubClassRepository subClassRepository;

    public static String EMPTY = "Aucune";

    @Override
    public List<SubClass> findAllSubClass() {
        return subClassRepository.findAll();
    }

    @Override
    public List<SubClass> findSpecificSubClass(SubClass subClass) {
        if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
        }
        else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
        }

        SubClass test = new SubClass();
        test.setName("test");
        test.setCharacteristic1("test");
        List<SubClass> listTest = new ArrayList<>();
        listTest.add(test);
        return listTest;
    }
}