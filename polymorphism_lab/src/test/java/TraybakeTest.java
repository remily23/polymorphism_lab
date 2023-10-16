import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest {

    @BeforeEach
    void setUp(){
        Traybake traybake = new Traybake("Carrot");
    }

    @Test
    void isHealthier(){
        assertThat(traybake.isHealthier()).isEqualTo("Yes");
    }

    @Test
    void canAddDecoration(){
        assertThat(traybake.canAddDecoration()).isEqualTo("Nuts);
    }


}
