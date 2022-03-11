package com.projetperso.projectlostark.utils;

public enum Engravings {
    ADRENALINE("Adrénaline"),//Adrenaline
    ARME_AFFUTEE("Arme affûtée"),
    ATTAQUE_TOTALE("Attaque totale"),//All-Out Attack
    AUGMENTATION_D_EFFICACITE_DES_PM("Augmentation d'éfficacité des pm"),
    AUGMENTATION_DE_MASSE("Augmentation de masse"),
    AUGMENTATION_DES_PM_MAX("Augmentation des PM max"),
    BAGAREUR_EXPERT("Bagarreur expert"),
    BARRICADE("Barricade"),//Barricade
    BOUCLIER_AMELIORE("Bouclier amélioré"),
    BRISE_BOUCLIER("Brise-bouclier"),
    CAPITAINE_DE_RAID("Capitaine de raid"),//Raid Captain
    CAPTURE_D_AME("Capture d'âme"),
    CHARGE_LOURDE("Charge lourde"),//Super Charge
    CONCURRENT("Concurrent"),
    DAGUE_PRECISE("Dague précise"),//Precise Dagger
    DETERMINATION("Détermination"),
    EXPERT("Expert"),
    EXPERT_EN_EXPLOSIFS("Expert en explosifs"),
    EQUILIBRE("Equilibre"),
    EQUIPEMENT_D_ARMURE_LOURDE("Equipement d'armure lourde"),
    EVASION_CRITIQUE("Evasion critique"),
    EVEIL("Eveil"), //Awakening
    FLUX_DE_MAGIE("Flux de magie"),
    FOCALISATION_VISUELLE("Focalisation visuelle"),
    FORCE_D_AME("Force d'âme"),
    FRACTURE("Fracture"),
    FRAPPE_DES_POINTS_VITAUX("Frappe des points vitaux"),
    FRAPPE_PREVENTIVE("Frappe préventive"),
    FURIE_FOUDROYANTE("Furie foudroyante"),
    GOUTTES_D_ETHER("Gouttes d'éther"),
    IRREVERENCE("Irrévérence"),
    MAITRE_DE_L_EMBUSCADE("Maître de l'embuscade"), //Master of Ambush
    MAITRE_DE_L_EVASION("Maître de l'évasion"),
    MAITRE_DE_LA_FRAPPE("Maître de la frappe"),//Hit Master
    NECROMANCIE("Nécromancie"),
    POING_ECRASANT("Poing écrasant"),
    POUPEE_MAUDITE("Poupée maudite"),
    PROPULSION("propulsion"),
    PROTECTION_DIVINE("Protection divine"),
    PREDATEUR_D_ETHER("Prédateur d'éther"),
    RETOUR_DE_FLAMME("Retour de flamme"),
    SAUVETAGE_D_URGENCE("Sauvetage d'urgence"),
    TENACITE_INVAINCUE("Ténacité invaincue"), //Master's Tenacity

    //PISTOLANCIER
    APTITUDE_AU_COMBAT("[Pistolancier]Aptitude au combat"),//Combat Readiness
    CHEVALIER_SOLITAIRE("[Pistolancier]Chevalier solitaire"),//Lone Knight

    //BERSERKER
    TECHNIQUE_DU_BERSERKER("[Berserker]Technique du berserker"), //Berserker's Technique
    CHAOS("[Berserker]Chaos"),

    //PALADIN
    AURA_DE_BENEDICTION("[Paladin]Aura de bénédiction"), //Blessed Aura
    JUGEMENT("[Paladin]Jugement"),

    //ELEMENTISTE
    AMELIORATION_DES_CONPETENCES_ESOTERIQUES("[Elementiste]Amélioration des compétences ésotériques"),//Esoteric Skill Enhancement
    PREMIERE_INTENTION("[Elementiste]Première intention"),//First Intention

    //ESSENTIALISTE
    DECHAINEMENT_ESOTERIQUE("[Essentialiste]Déchaînement ésotérique"),//Esoteric Flurry
    COUP_FATAL("[Essentialiste]Coup fatal"),//Deathblow

    //SPIRITE
    ESPRIT_ROBUSTE("[Spirite]Esprit robuste"),//Robust Spirit
    ENERGIE_DEBORDANTE("[Spirite]Énergie débordante"),//Energy Overflow

    //PUGILISTE
    ULTIME_TAIJUTSU("[Pugiliste]Ultime : Taijutsu"),//Ultimate Skill: Taijutsu
    ENTRAINEMENT_DE_CHOC("[Pugiliste]Entraînement de choc"),

    //FRANC-TIREUR
    ARME_AMELIOREE("[Franc-tireur]Arme améliorée"),
    PISTOLIER("[Franc-tireur]Pistolier"),//Pistoleer

    //FUSILIERE
    HEURE_DE_LA_CHASSE("[Fusiliere]Heure de la chasse"),//Time to Hunt
    PACIFICATEUR("[Fusiliere]Pacificateur"),//Peacemaker

    //SAGITAIRE
    FIDELE_COMPAGNON("[Sagitaire]Fidèle compagnon"),
    FRAPPE_MORTELLE("[Sagitaire]Frappe mortelle"),//Death Strike

    //ARTILLEUR
    PUISSANCE_DE_FEU_AMELIORE("[Artilleur]Puissance de feu améliorée"),//Firepower Enhancement
    BARRAGE_AMELIORE("[Artilleur]Barrage amélioré"),

    //SORCIERE
    IGNITEUR("[Sorcière]Igniteur"),//Igniter
    REFLUX("[Sorcière]Reflux"),//Reflux

    //BARDE
    DERNIER_RECOURS("[Barde]Dernier recours"),//Desperate Salvation
    COEUR_VAILLANT("[Barde]Cœur vaillant"),

    //SANGUELAME
    ENERGIE_RESIDUELLE("[Sanguelame]Énergie résiduelle"),//Remaining Energy
    FUREUR("[Sanguelame]Fureur"), //Surge

    //DEMONISTE
    SUPPRESSION_PARFAITE("[Démoniste]Suppression parfaite"),//Perfect Suppression
    PULSION_DEMONIAQUE("[Démoniste]Pulsion démoniaque");//Demonic Impulse

    final String engravingName;

    Engravings(String engravingName) {
        this.engravingName = engravingName;
    }
}