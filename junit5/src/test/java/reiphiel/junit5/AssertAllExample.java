package reiphiel.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AssertAllExample {

    @Test
    //전체 단정문이 실행된다.
    void test() {
        String name = "Name";
        assertAll("Heading",
                () -> assertEquals("John", name),
                () -> assertEquals("Doe", name),
                () -> {
                    assertAll("Heading",
                            () -> assertEquals("John", name),
                            () -> assertEquals("Doe", name)
                    );
                }
        );
    }

    @Test
    //단정문이 한개만 실행된다
    void test1() {
        String name = "Name";
        assertAll("Heading", () -> {
                    assertEquals("John", name);
                    assertEquals("Doe", name);
                }
        );
    }
}
