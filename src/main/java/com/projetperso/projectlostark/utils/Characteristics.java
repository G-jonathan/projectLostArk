package com.projetperso.projectlostark.utils;

public enum Characteristics {
    DEGATS_CRITIQUES("Dégats critiques"),
    SPECIALISATION("Spécialisation"),
    DOMINATION("Domination"),
    RAPIDITE("Rapidité"),
    ENDURANCE("Endurance"),
    EXPERTISE("Expertise");

    final String characteristics;

    Characteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}