import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MusicalTest {

    Musical musical;

    @BeforeEach
    void setUp(){
        musical = new Musical("Phantom of the Opera", 12, false);
    }

    @Test
    void canAddToFavourites(){
        assertThat(musical.addToFavourites()).isEqualTo("this Musical has been added to favourites!");
    }

    @Test
    void canCharacterSings(){
        assertThat(musical.characterSings()).isEqualTo("this person could just have said this normally");
    }


}
