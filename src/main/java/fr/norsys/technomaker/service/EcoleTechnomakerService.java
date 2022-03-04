package fr.norsys.technomaker.service;

import fr.norsys.technomaker.model.EcoleTechnomaker;
import fr.norsys.technomaker.model.Enseignant;
import fr.norsys.technomaker.model.Etudiant;
import fr.norsys.technomaker.model.Formation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class EcoleTechnomakerService {

    /**
     * créer une fonction qui retourne l'enseignant d'une formation si elle n'est pas null
     * sinon throw NoSuchElementException
     */
    public Enseignant getEnseignantFromFormation(Formation formation){
        return Optional.ofNullable(formation).map(ens->ens.getEnseignant()).orElseThrow(NoSuchElementException::new);
    }

    /**
     * créer une fonction qui retourne l'enseignant de la première formation si elle n'est pas null
     * sinon l'enseignant de la deuxième formation si elle n'est pas null
     * sinon throw NoSuchElementException
     */
    public Enseignant getEnseignantFromFormation(Formation formation1, Formation formation2){
        return Optional.ofNullable(formation1).or(()->Optional.ofNullable(formation2)).map(ens->ens.getEnseignant()).orElseThrow(NoSuchElementException::new);
    }

    /**
     * créer une fonction qui retourne une map des enseignants avec leurs formations correspondantes
     */
    public Map<Enseignant, List<Formation>> getFormationsParEnseignant(EcoleTechnomaker ecoleTechnomaker) {
        return ecoleTechnomaker.getFormations().stream().collect(Collectors.groupingBy(ens->ens.getEnseignant(),Collectors.mapping(format->format, Collectors.toList())));
    }

    /**
     * créer une fonction qui retourne la somme des volumes horaires
     */
    public int calculerVolumeHoraire(EcoleTechnomaker ecoleTechnomaker) {
        return ecoleTechnomaker.getFormations().stream().mapToInt(volumhor->volumhor.getVolumeHoraire()).sum();
    }

    /**
     * créer une fonction qui retourne une map des écoles nom avec le nombre de leurs étudiants
     */
    public Map<String, Long> getRepresentationEcole(EcoleTechnomaker ecoleTechnomaker) {
        return ecoleTechnomaker.getEtudiants().stream().collect(Collectors.groupingBy(ecole->ecole.getEcole(),Collectors.counting()));
    }


    /**
     * créer une fonction qui retourne une map des enseignants avec leur partition s'il anime plus d'une seule formation
     * et la somme des volumes horaires de ces formations
     */
    public Map<Enseignant, Map<Boolean, Integer>> getFormationSommeVHPartitionParEnseignant(EcoleTechnomaker ecoleTechnomaker) {
    	
    	return ecoleTechnomaker.getFormations().stream().collect(Collectors.groupingBy(ens->ens.getEnseignant(),Collectors.groupingBy
    			(
    				Collectors.partitioningBy(Collectors.counting()>1)
    			    ,
    			Collectors.reducing(0, Formation::getVolumeHoraire,(x,y)-> x+y )
    			)));
    			
    }

}
