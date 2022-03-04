package fr.norsys.technomaker.model;

import java.util.ArrayList;
import java.util.List;

public class EcoleTechnomaker {

    private List<Etudiant> etudiants = new ArrayList<>();

    private List<Formation> formations = new ArrayList<>();

    public void addEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }

    public void addFormation(Formation formation) {
        this.formations.add(formation);
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }
}
