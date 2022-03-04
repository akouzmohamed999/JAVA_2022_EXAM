package fr.norsys.technomaker.model;

public class Etudiant {

    private final String nom;

    private final String prenom;

    private final String ecole;

    public Etudiant(String nom, String prenom, String ecole) {
        this.nom = nom;
        this.prenom = prenom;
        this.ecole = ecole;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getEcole() {
        return this.ecole;
    }
}
