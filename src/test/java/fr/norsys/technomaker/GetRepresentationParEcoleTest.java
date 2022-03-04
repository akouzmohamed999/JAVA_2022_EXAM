package fr.norsys.technomaker;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.Test;

public class GetRepresentationParEcoleTest extends AEcoleTechnomakerServiceTest {

    @Test
    public void shouldGetRepresentationParEcole() throws Exception {

        final Map<String, Long> representationEcole = this.ecoleTechnomakerService.getRepresentationEcole(this.ecoleTechnomaker);

        assertThat(representationEcole).isNotNull();
        assertThat(representationEcole).containsEntry("FST Marrakech", 3L);
        assertThat(representationEcole).containsEntry("FSSM Marrakech", 2L);
        assertThat(representationEcole).containsEntry("ENSIAS Rabat", 1L);
        assertThat(representationEcole).containsEntry("ENSA Al Hoceima", 1L);
        assertThat(representationEcole).containsEntry("FP Beni Mellal", 1L);
        assertThat(representationEcole).containsEntry("EMSI Marrakech", 1L);
    }
}
