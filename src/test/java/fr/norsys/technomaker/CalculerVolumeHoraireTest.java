package fr.norsys.technomaker;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CalculerVolumeHoraireTest extends AEcoleTechnomakerServiceTest {

    @Test
    public void shouldCalculerVolumeHoraire() throws Exception {

        final int volumeHoraire = this.ecoleTechnomakerService.calculerVolumeHoraire(this.ecoleTechnomaker);

        assertThat(volumeHoraire).isEqualTo(48);
    }
}
