import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    void setUp(){
        cupcake = new Cupcake("Strawberry");
    }

    @Test
    void canAddIcing(){
        assertThat(cupcake.AddIcing()).isEqualTo("Pink icing");
    }

}
