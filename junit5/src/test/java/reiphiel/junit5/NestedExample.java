package reiphiel.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedExample {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Parent beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Parent afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Parent beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Parent afterEach");
    }

    @Test
    void test() {
        System.out.println("Parent test");
    }

    @Nested
    class Child1 {

        @BeforeEach
        void beforeEach() {
            System.out.println("Child beforeEach");
        }

        @AfterEach
        void afterEach() {
            System.out.println("Child afterEach");
        }

        @Test
        void test() {
            System.out.println("Child Test");
        }

    }
}
