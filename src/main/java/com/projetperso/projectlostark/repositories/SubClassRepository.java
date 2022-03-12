package com.projetperso.projectlostark.repositories;

import com.projetperso.projectlostark.models.SubClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SubClassRepository extends JpaRepository<SubClass, Integer> {

    public List<SubClass> findByEngraving1(String engraving1);

    public List<SubClass> findByEngraving2(String engraving2);

    public List<SubClass> findByCharacteristic1(String characteristic1);

    public List<SubClass> findByCharacteristic2(String characteristic2);

    public List<SubClass> findByEngraving1AndEngraving2(String engraving1, String engraving2);

    public List<SubClass> findByEngraving1AndCharacteristic1(String engraving1, String characteristic1);

    public List<SubClass> findByEngraving1AndCharacteristic2(String engraving1, String characteristic2);

    public List<SubClass> findByEngraving2AndCharacteristic1(String engraving2, String characteristic1);

    public List<SubClass> findByEngraving2AndCharacteristic2(String engraving2, String characteristic2);

    public List<SubClass> findByCharacteristic1AndCharacteristic2(String characteristic1, String characteristic2);

    public List<SubClass> findByEngraving1AndEngraving2AndCharacteristic1(String engraving1, String engraving2, String characteristic2);

    public List<SubClass> findByEngraving2AndCharacteristic1AndCharacteristic2(String engraving2, String characteristic1, String characteristic2);

    public List<SubClass> findByEngraving1AndCharacteristic1AndCharacteristic2(String engraving1, String characteristic1, String characteristic2);

    public List<SubClass> findByEngraving1AndEngraving2AndCharacteristic2(String engraving1, String engraving2, String characteristic2);

    public List<SubClass> findByEngraving1AndEngraving2AndCharacteristic1AndCharacteristic2(String engraving1, String engraving2, String characteristic1, String characteristic2);
}