import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {

    Cake cake;

    @BeforeEach
    void setUp(){
        cake = new Cake("Cupcake", "Strawberry");
    }

    @Test
    void getCake(){
        assertThat(cake.getName()).isEqualTo("Strawberry Cupcake");
    }

}
