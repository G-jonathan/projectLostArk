package com.projetperso.projectlostark.services.impl;

import com.projetperso.projectlostark.models.SubClass;
import com.projetperso.projectlostark.repositories.SubClassRepository;
import com.projetperso.projectlostark.services.ISubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
            return subClassRepository.findByEngraving1(subClass.getEngraving1());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving2(subClass.getEngraving2());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByCharacteristic1(subClass.getCharacteristic1());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByCharacteristic2(subClass.getCharacteristic2());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving1AndEngraving2(subClass.getEngraving1(), subClass.getEngraving2());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving1AndCharacteristic1(subClass.getEngraving1(), subClass.getCharacteristic1());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic2());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving2AndCharacteristic1(subClass.getEngraving2(), subClass.getCharacteristic1());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving2AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic2());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByCharacteristic1AndCharacteristic2(subClass.getCharacteristic1(), subClass.getCharacteristic2());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic1());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving1AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving1AndEngraving2AndCharacteristic2(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic2());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            return subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
        }
        return subClassRepository.findAll();
    }
}