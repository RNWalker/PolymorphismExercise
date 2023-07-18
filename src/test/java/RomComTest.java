import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RomComTest {

    RomCom romCom;

    @BeforeEach
    void setUp(){
        romCom = new RomCom("Crazy,Stupid,Love", "My life is not PG-13.");
    }

    @Test
    void canAddToFavourites(){
        assertThat(romCom.addToFavourites()).isEqualTo("this RomCom has been added to favourites!");
    }

    @Test
    void canMessageAddToFavourites(){
        assertThat(romCom.addToFavourites("Crazy, Stupid, Love")).isEqualTo("Crazy, Stupid, Love is a bad choice to add to favourites.");
    }

    @Test
    void canCastJenniferAniston() {
        assertThat(romCom.castJenniferAniston()).isEqualTo("oh good, another romcom with Jennifer Aniston...");
    }

    @Test
    void canWatch(){
        String result = romCom.watch(30);
        assertThat(result).isEqualTo("You watched Crazy,Stupid,Love for 30 minutes.");}

    }

