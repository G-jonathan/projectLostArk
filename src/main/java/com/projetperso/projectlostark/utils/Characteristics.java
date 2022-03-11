package com.projetperso.projectlostark.utils;

public enum Characteristics {
    DEGATS_CRITIQUES("Dégats critiques"),
    SPECIALISATION("Spécialisation"), //Specialization
    DOMINATION("Domination"),
    RAPIDITE("Rapidité"), //Swiftness
    ENDURANCE("Endurance"),
    EXPERTISE("Expertise");

    final String characteristics;

    Characteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}