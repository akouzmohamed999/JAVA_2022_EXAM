package fr.norsys.technomaker.service;

import fr.norsys.technomaker.model.EcoleTechnomaker;
import fr.norsys.technomaker.model.Enseignant;
import fr.norsys.technomaker.model.Etudiant;
import fr.norsys.technomaker.model.Formation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EcoleTechnomakerService {

    /**
     * créer une fonction qui retourne l'enseignant d'une formation si elle n'est pas null
     * sinon throw NoSuchElementException
     */
    public Enseignant getEnseignantFromFormation(Formation formation){
        return null;
    }

    /**
     * créer une fonction qui retourne l'enseignant de la première formation si elle n'est pas null
     * sinon l'enseignant de la deuxième formation si elle n'est pas null
     * sinon throw NoSuchElementException
     */
    public Enseignant getEnseignantFromFormation(Formation formation1, Formation formation2){
        return null;
    }

    /**
     * créer une fonction qui retourne une map des enseignants avec leurs formations correspondantes
     */
    public Map<Enseignant, List<Formation>> getFormationsParEnseignant(EcoleTechnomaker ecoleTechnomaker) {
        return null;
    }

    /**
     * créer une fonction qui retourne la somme des volumes horaires
     */
    public int calculerVolumeHoraire(EcoleTechnomaker ecoleTechnomaker) {
        return 0;
    }

    /**
     * créer une fonction qui retourne une map des écoles nom avec le nombre de leurs étudiants
     */
    public Map<String, Long> getRepresentationEcole(EcoleTechnomaker ecoleTechnomaker) {
        return null;
    }


    /**
     * créer une fonction qui retourne une map des enseignants avec leur partition s'il anime plus d'une seule formation
     * et la somme des volumes horaires de ces formations
     */
    public Map<Enseignant, Map<Boolean, Integer>> getFormationSommeVHPartitionParEnseignant(EcoleTechnomaker ecoleTechnomaker) {
        return null;
    }

}
