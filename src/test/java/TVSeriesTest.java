import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TVSeriesTest {

    TVSeries tvSeries;

    @BeforeEach
    public void setUp(){ tvSeries = new TVSeries("Dr Who");}

    @Test
    public void canWatch(){
        String result = tvSeries.watch(45);
        assertThat(result).isEqualTo("You watched Dr Who for 45 minutes.");
    }

}
