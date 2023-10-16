import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TieredCakeTest {

    @BeforeEach
    void setUp(){
        tieredcake = new TieredCake("Coconut");
    }

    @Test
    void canAddDecoration(){
        assertThat(tieredcake.AddDecoration()).isEqualTo("Orange sparkles");
    }



}
