package fr.norsys.technomaker;

import fr.norsys.technomaker.model.Enseignant;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;

public class GetEnseignantFromFormation extends AEcoleTechnomakerServiceTest {

    @Test
    public void getEnseignantFromFormationPresent() {
        Enseignant enseignant = this.ecoleTechnomakerService.getEnseignantFromFormation(java9);
        assertThat(enseignant).isNotNull();
        assertThat(enseignant.getNom()).isEqualTo("AKOUZ");
    }

    @Test(expected = NoSuchElementException.class)
    public void getEnseignantFromFormationEmpty() {
        this.ecoleTechnomakerService.getEnseignantFromFormation(null);
    }

    @Test
    public void getEnseignantFromFormationBisPresent() {
        Enseignant enseignant = this.ecoleTechnomakerService.getEnseignantFromFormation(java9, null);
        assertThat(enseignant).isNotNull();
        assertThat(enseignant.getNom()).isEqualTo("AKOUZ");
    }

    @Test
    public void getEnseignantFromFormation2BisPresent() {
        Enseignant enseignant = this.ecoleTechnomakerService.getEnseignantFromFormation(null, thymeleaf);
        assertThat(enseignant).isNotNull();
        assertThat(enseignant.getNom()).isEqualTo("TELOUATI");
    }

    @Test(expected = NoSuchElementException.class)
    public void getEnseignantFromFormationBisEmpty() {
        this.ecoleTechnomakerService.getEnseignantFromFormation(null, null);
    }
}
