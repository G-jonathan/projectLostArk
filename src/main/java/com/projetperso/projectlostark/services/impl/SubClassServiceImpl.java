package com.projetperso.projectlostark.services.impl;

import com.projetperso.projectlostark.models.SubClass;
import com.projetperso.projectlostark.repositories.SubClassRepository;
import com.projetperso.projectlostark.services.ISubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            List<SubClass> engraving1List = subClassRepository.findByEngraving1(subClass.getEngraving1());
            List<SubClass> engraving2List = subClassRepository.findByEngraving2(subClass.getEngraving1());
            return Stream.concat(engraving1List.stream(), engraving2List.stream()).collect(Collectors.toList());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> engraving1List = subClassRepository.findByEngraving1(subClass.getEngraving2());
            List<SubClass> engraving2List = subClassRepository.findByEngraving2(subClass.getEngraving2());
            return Stream.concat(engraving1List.stream(), engraving2List.stream()).collect(Collectors.toList());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> characteristic1List = subClassRepository.findByCharacteristic1(subClass.getCharacteristic1());
            List<SubClass> characteristic2List = subClassRepository.findByCharacteristic2(subClass.getCharacteristic1());
            return Stream.concat(characteristic1List.stream(), characteristic2List.stream()).collect(Collectors.toList());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> characteristic1List = subClassRepository.findByCharacteristic1(subClass.getCharacteristic2());
            List<SubClass> characteristic2List = subClassRepository.findByCharacteristic2(subClass.getCharacteristic2());
            return Stream.concat(characteristic1List.stream(), characteristic2List.stream()).collect(Collectors.toList());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> engravingNormalOrderList = subClassRepository.findByEngraving1AndEngraving2(subClass.getEngraving1(), subClass.getEngraving2());
            List<SubClass> engravingReverseOrderList = subClassRepository.findByEngraving1AndEngraving2(subClass.getEngraving2(), subClass.getEngraving1());
            return Stream.concat(engravingNormalOrderList.stream(), engravingReverseOrderList.stream()).collect(Collectors.toList());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1list = subClassRepository.findByEngraving2AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic1());
            List<SubClass> order2list = subClassRepository.findByEngraving2AndCharacteristic1(subClass.getEngraving1(), subClass.getCharacteristic1());
            List<SubClass> order3list = subClassRepository.findByEngraving1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic1());
            List<SubClass> order4list = subClassRepository.findByEngraving1AndCharacteristic1(subClass.getEngraving1(), subClass.getCharacteristic1());
            List<SubClass> concatList1 = Stream.concat(order1list.stream(), order2list.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3list.stream(), order4list.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1list = subClassRepository.findByEngraving2AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic2());
            List<SubClass> order2list = subClassRepository.findByEngraving2AndCharacteristic1(subClass.getEngraving1(), subClass.getCharacteristic2());
            List<SubClass> order3list = subClassRepository.findByEngraving1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic2());
            List<SubClass> order4list = subClassRepository.findByEngraving1AndCharacteristic1(subClass.getEngraving1(), subClass.getCharacteristic2());
            List<SubClass> concatList1 = Stream.concat(order1list.stream(), order2list.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3list.stream(), order4list.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1list = subClassRepository.findByEngraving2AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic1());
            List<SubClass> order2list = subClassRepository.findByEngraving2AndCharacteristic1(subClass.getEngraving2(), subClass.getCharacteristic1());
            List<SubClass> order3list = subClassRepository.findByEngraving1AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic1());
            List<SubClass> order4list = subClassRepository.findByEngraving1AndCharacteristic1(subClass.getEngraving2(), subClass.getCharacteristic1());
            List<SubClass> concatList1 = Stream.concat(order1list.stream(), order2list.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3list.stream(), order4list.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1list = subClassRepository.findByEngraving2AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic2());
            List<SubClass> order2list = subClassRepository.findByEngraving2AndCharacteristic1(subClass.getEngraving2(), subClass.getCharacteristic2());
            List<SubClass> order3list = subClassRepository.findByEngraving1AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic2());
            List<SubClass> order4list = subClassRepository.findByEngraving1AndCharacteristic1(subClass.getEngraving2(), subClass.getCharacteristic2());
            List<SubClass> concatList1 = Stream.concat(order1list.stream(), order2list.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3list.stream(), order4list.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> characteristicsNormalOrderList = subClassRepository.findByCharacteristic1AndCharacteristic2(subClass.getCharacteristic1(), subClass.getCharacteristic2());
            List<SubClass> characteristicsReversedOrder2List = subClassRepository.findByCharacteristic1AndCharacteristic2(subClass.getCharacteristic2(), subClass.getCharacteristic1());
            return Stream.concat(characteristicsNormalOrderList.stream(), characteristicsReversedOrder2List.stream()).collect(Collectors.toList());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic2(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic1());
            List<SubClass> order2List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic2(subClass.getEngraving2(), subClass.getEngraving1(), subClass.getCharacteristic1());
            List<SubClass> order3List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic1());
            List<SubClass> order4List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1(subClass.getEngraving2(), subClass.getEngraving1(), subClass.getCharacteristic1());
            List<SubClass> concatList1 = Stream.concat(order1List.stream(), order2List.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3List.stream(), order4List.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1list = subClassRepository.findByEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
            List<SubClass> order2list = subClassRepository.findByEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic2(), subClass.getCharacteristic1());
            List<SubClass> order3list = subClassRepository.findByEngraving1AndCharacteristic1AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
            List<SubClass> order4list = subClassRepository.findByEngraving1AndCharacteristic1AndCharacteristic2(subClass.getEngraving2(), subClass.getCharacteristic2(), subClass.getCharacteristic1());
            List<SubClass> concatList1 = Stream.concat(order1list.stream(), order2list.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3list.stream(), order4list.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1list = subClassRepository.findByEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
            List<SubClass> order2list = subClassRepository.findByEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic2(), subClass.getCharacteristic1());
            List<SubClass> order3list = subClassRepository.findByEngraving1AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
            List<SubClass> order4list = subClassRepository.findByEngraving1AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getCharacteristic2(), subClass.getCharacteristic1());
            List<SubClass> concatList1 = Stream.concat(order1list.stream(), order2list.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3list.stream(), order4list.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic2(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic2());
            List<SubClass> order2List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic2(subClass.getEngraving2(), subClass.getEngraving1(), subClass.getCharacteristic2());
            List<SubClass> order3List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic2());
            List<SubClass> order4List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1(subClass.getEngraving2(), subClass.getEngraving1(), subClass.getCharacteristic2());
            List<SubClass> concatList1 = Stream.concat(order1List.stream(), order2List.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3List.stream(), order4List.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        } else if (!subClass.getEngraving1().equals(EMPTY)
                & !subClass.getEngraving2().equals(EMPTY)
                & !subClass.getCharacteristic1().equals(EMPTY)
                & !subClass.getCharacteristic2().equals(EMPTY)) {
            List<SubClass> order1List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
            List<SubClass> order2List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving1(), subClass.getEngraving2(), subClass.getCharacteristic2(), subClass.getCharacteristic1());
            List<SubClass> order3List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving2(), subClass.getEngraving1(), subClass.getCharacteristic1(), subClass.getCharacteristic2());
            List<SubClass> order4List = subClassRepository.findByEngraving1AndEngraving2AndCharacteristic1AndCharacteristic2(subClass.getEngraving2(), subClass.getEngraving1(), subClass.getCharacteristic2(), subClass.getCharacteristic1());
            List<SubClass> concatList1 = Stream.concat(order1List.stream(), order2List.stream()).toList();
            List<SubClass> concatList2 = Stream.concat(order3List.stream(), order4List.stream()).toList();
            return Stream.concat(concatList1.stream(), concatList2.stream()).collect(Collectors.toList());
        }
        return subClassRepository.findAll();
    }
}