package fr.norsys.technomaker;

import org.junit.Before;

import fr.norsys.technomaker.model.EcoleTechnomaker;
import fr.norsys.technomaker.model.Enseignant;
import fr.norsys.technomaker.model.Etudiant;
import fr.norsys.technomaker.model.Formation;
import fr.norsys.technomaker.service.EcoleTechnomakerService;

public abstract class AEcoleTechnomakerServiceTest {

    protected EcoleTechnomakerService ecoleTechnomakerService;

    protected EcoleTechnomaker ecoleTechnomaker = new EcoleTechnomaker();

    protected final Enseignant mohamed = new Enseignant("AKOUZ", "Mohamed", 9);
    protected final Enseignant karim = new Enseignant("TELOUATI", "Karim", 1);
    protected final Enseignant marouan = new Enseignant("ELMEROUNI", "marouan", 6);
    protected final Enseignant noureddine = new Enseignant("LAKOUIT", "noureddine", 4);
    protected final Enseignant fouad = new Enseignant("EDDAHMANY", "fouad", 2);

    protected final Formation cleanCode = new Formation("Clean Code", 10, this.marouan);
    protected final Formation java8 = new Formation("Java 8", 4, this.karim);
    protected final Formation java9 = new Formation("Java 9", 4, this.mohamed);
    protected final Formation sql = new Formation("SQL", 6, this.noureddine);
    protected final Formation javaBdd = new Formation("Java BDD", 4, this.noureddine);
    protected final Formation frameworks = new Formation("Frameworks", 10, this.mohamed);
    protected final Formation thymeleaf = new Formation("Thymeleaf", 2, this.karim);
    protected final Formation apacheTiles = new Formation("Apache Tiles", 2, this.fouad);
    protected final Formation frontEnd = new Formation("Front End", 6, this.marouan);

    @Before
    public void setUp() throws Exception {
        this.ecoleTechnomakerService = new EcoleTechnomakerService();

        this.addEtudiants();
        this.addFormations();
    }

    private void addFormations() {
        this.ecoleTechnomaker.addFormation(this.cleanCode);
        this.ecoleTechnomaker.addFormation(this.java8);
        this.ecoleTechnomaker.addFormation(this.java9);
        this.ecoleTechnomaker.addFormation(this.sql);
        this.ecoleTechnomaker.addFormation(this.javaBdd);
        this.ecoleTechnomaker.addFormation(this.frameworks);
        this.ecoleTechnomaker.addFormation(this.thymeleaf);
        this.ecoleTechnomaker.addFormation(this.apacheTiles);
        this.ecoleTechnomaker.addFormation(this.frontEnd);
    }

    private void addEtudiants() {
        this.ecoleTechnomaker.addEtudiant(new Etudiant("ABBASSI", "Abdelkebir", "FSSM Marrakech"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("HAMZA", "Mariama", "ENSIAS Rabat"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("KARIMOULLAH", "Fatima Ezahra", "FST Marrakech"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("AIT LAASRI", "Khalid", "FST Marrakech"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("DRISSI EL BOUZAIDI", "Mohamed", "FP Beni Mellal"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("EL AASRI", "Rabiaa", "EMSI Marrakech"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("HIDANE", "Sanaa", "ENSA Al Hoceima"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("LABSSIR", "Siham", "FSSM Marrakech"));
        this.ecoleTechnomaker.addEtudiant(new Etudiant("EL BHIH", "Youness", "FST Marrakech"));
    }
}
