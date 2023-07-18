import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StreamingPlatformTest {

    StreamingPlatform streamingPlatform;

    @BeforeEach
    void setUp() {
        streamingPlatform = new StreamingPlatform();
    }

    @Test
    void canCountFilms(){
        assertThat(streamingPlatform.countFilms()).isEqualTo(0);
    }

    @Test
    void canAddNewFilm() {
        Film film = new RomCom("Crazy, Stupid, Love", "My life is not PG-13.");
        streamingPlatform.addNewFilm(film);
        assertThat(streamingPlatform.countFilms()).isEqualTo(1);
    }

    @Test
    void canAddMultipleFilms(){
        RomCom romCom = new RomCom("Crazy, Stupid, Love", "My life is not PG-13.");
        Thriller thriller = new Thriller("Split", "not very");
        streamingPlatform.addNewFilm(romCom);
        streamingPlatform.addNewFilm(thriller);
        assertThat(streamingPlatform.countFilms()).isEqualTo(2);
    }


}



