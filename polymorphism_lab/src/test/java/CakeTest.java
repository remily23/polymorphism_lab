import org.junit.jupiter.api.BeforeEach;

public class CakeTest {

    Cake cake;

    @BeforeEach
    void setUp(){
        cake = new Cupcake("Strawberry");
    }
}
