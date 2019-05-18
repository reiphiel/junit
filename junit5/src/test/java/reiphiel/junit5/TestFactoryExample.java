package reiphiel.junit5;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class TestFactoryExample {

    @TestFactory
    Stream<DynamicTest> test() {
        class TestTemplate {
            String name;
            int age;
            String nationality;

            TestTemplate(String name, int age, String nationality) {
                this.name = name;
                this.age = age;
                this.nationality = nationality;
            }
        }

        return Stream.of(
                new TestTemplate("홍길동", 19, "Korean"),
                new TestTemplate("John", 17, "U.S.A")
        ).map(t -> dynamicTest("test " + t.name, () -> {
            assertTrue(t.age > 18, t.name + "'s age");
            assertEquals("Korean", t.nationality, t.name + "'s nationality");
        }));
    }
}
