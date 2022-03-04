package fr.norsys.technomaker;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import fr.norsys.technomaker.model.Enseignant;
import fr.norsys.technomaker.model.Formation;

public class GetFormationsParEnseignantTest extends AEcoleTechnomakerServiceTest {

    @Test
    public void shouldGetFormationsParEnseignant() throws Exception {

        final Map<Enseignant, List<Formation>> formationsParEnseignant = this.ecoleTechnomakerService
                        .getFormationsParEnseignant(this.ecoleTechnomaker);

        assertThat(formationsParEnseignant).isNotNull();
        assertThat(formationsParEnseignant).containsEntry(this.mohamed, Arrays.asList( this.java9, this.frameworks));
        assertThat(formationsParEnseignant).containsEntry(this.karim, Arrays.asList(this.java8, this.thymeleaf));
        assertThat(formationsParEnseignant).containsEntry(this.marouan, Arrays.asList(this.cleanCode, this.frontEnd));
        assertThat(formationsParEnseignant).containsEntry(this.noureddine, Arrays.asList(this.sql, this.javaBdd));
        assertThat(formationsParEnseignant).containsEntry(this.fouad, Arrays.asList(this.apacheTiles));
    }
}
