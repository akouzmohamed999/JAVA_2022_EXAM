package fr.norsys.technomaker.model;

public class Formation {

    private final String label;

    private final int volumeHoraire;

    private final Enseignant enseignant;

    public Formation(String label, int volumeHoraire, Enseignant enseignant) {
        this.label = label;
        this.volumeHoraire = volumeHoraire;
        this.enseignant = enseignant;
    }

    public String getLabel() {
        return this.label;
    }

    public int getVolumeHoraire() {
        return this.volumeHoraire;
    }

    public Enseignant getEnseignant() {
        return this.enseignant;
    }

}
