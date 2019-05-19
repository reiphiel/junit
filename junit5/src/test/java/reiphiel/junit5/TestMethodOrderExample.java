package reiphiel.junit5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class TestMethodOrderExample {

    @Order(3)
    @Test
    void test1() {
        System.out.println("test");
    }

    @Order(1)
    @Test
    void test3() {
        System.out.println("test3");
    }

    @Nested
    @TestMethodOrder(OrderAnnotation.class)
    class NestedTest {

        @Order(4)
        @Test
        void test2() {
            System.out.println("test2");
        }

        @Order(2)
        @Test
        void test4() {
            System.out.println("test4");
        }
    }

}
