import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ThrillerTest {

    Thriller thriller   ;

    @BeforeEach
    void setUp(){
        thriller = new Thriller("Split", "not very scary");
    }

    @Test
    void canAddToFavourites(){
        assertThat(thriller.addToFavourites()).isEqualTo("this Thriller has been added to favourites!");
    }

    @Test
    void canAddScaryChild(){
        assertThat(thriller.addScaryChild()).isEqualTo("this movie is scarier with an evil 5 year old");

    }

}
