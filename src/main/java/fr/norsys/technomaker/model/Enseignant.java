package fr.norsys.technomaker.model;

public class Enseignant {

    private String nom;

    private String prenom;

    private int anciennete;

    public Enseignant(String nom, String prenom, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnciennete() {
        return this.anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }


}
