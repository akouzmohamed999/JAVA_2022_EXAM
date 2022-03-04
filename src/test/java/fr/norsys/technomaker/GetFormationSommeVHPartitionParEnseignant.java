package fr.norsys.technomaker;

import fr.norsys.technomaker.model.Enseignant;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GetFormationSommeVHPartitionParEnseignant extends AEcoleTechnomakerServiceTest{

    @Test
    public void shouldReturnFormationSommeVolumeHorairePartitionParEnseignant(){

        Map<Enseignant, Map<Boolean, Integer>> result = this.ecoleTechnomakerService.getFormationSommeVHPartitionParEnseignant(this.ecoleTechnomaker);

        assertThat(result).hasSize(5);
        assertThat(result.get(this.noureddine)).containsEntry(true, 10);
        assertThat(result.get(this.mohamed)).containsEntry(true, 14);
        assertThat(result.get(this.marouan)).containsEntry(true, 16);
        assertThat(result.get(this.fouad)).containsEntry(false, 2);
        assertThat(result.get(this.karim)).containsEntry(true, 6);
    }
}
