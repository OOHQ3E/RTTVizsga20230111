package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class OsztalyozoTest {

    Osztalyozo hevesOsztalyozo;
    @BeforeEach
    void setup(){
        hevesOsztalyozo = new Osztalyozo(1.2,1.5,2,3);
    }

    @ParameterizedTest
    @MethodSource("Parameterek")
    void testOsztalyzo(double suly, int hibakSzama, Osztaly osztaly){
        Alma a = new Alma(suly, hibakSzama);
        Osztaly expected = osztaly;
        Osztaly actual = hevesOsztalyozo.Osztalyzo(a);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> Parameterek() {
        //suly, hibakszama
        return Stream.of(
                Arguments.of(2.1, 3,Osztaly.HARMAD),
                Arguments.of(2,   3, Osztaly.HARMAD),
                Arguments.of(1.5, 3, Osztaly.MASOD),
                Arguments.of(1.6, 3, Osztaly.MASOD),
                Arguments.of(1.9, 3, Osztaly.MASOD),
                Arguments.of(1.4, 3, Osztaly.ELSO),
                Arguments.of(1.2, 3, Osztaly.ELSO),
                Arguments.of(1.3, 3, Osztaly.ELSO),
                Arguments.of(1.1, 3, Osztaly.SZUPER),
                Arguments.of(1.1, 4, Osztaly.HIBAS)
        );
    }
    /*
              >= 2     HARMAD OSZTALY
        2   < >= 1.5   MASOD  OSZTALY
        1.5 < >= 1.2   ELSO OSZTALY
        1.2 > HIBA < 3 SZUPER

        boundary value teszthez esetek
        2.1, 3 - HARMAD - hibaszám ebben az esetben irreleváns
        2,   3 - HARMAD - hibaszám ebben az esetben irreleváns
        1.5, 3 - MASOD  - hibaszám ebben az esetben irreleváns
        1.6, 3 - MASOD  - hibaszám ebben az esetben irreleváns
        1.9, 3 - MASOD  - hibaszám ebben az esetben irreleváns
        1.4, 3 - ELSO   - hibaszám ebben az esetben irreleváns
        1.2, 3 - ELSO   - hibaszám ebben az esetben irreleváns
        1.3, 3 - ELSO   - hibaszám ebben az esetben irreleváns
        1.1, 3 - SZUPER
        1.1, 4 - HIBAS
     */
}