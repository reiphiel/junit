package reiphiel.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import reiphiel.junit5.extension.AfterAllCallbackExample;
import reiphiel.junit5.extension.AfterEachCallbackExample;
import reiphiel.junit5.extension.AfterTestExecutionCallbackExample;
import reiphiel.junit5.extension.BeforeAllCallbackExample;
import reiphiel.junit5.extension.BeforeEachCallbackExample;
import reiphiel.junit5.extension.BeforeTestExecutionCallbackExample;
import reiphiel.junit5.extension.ExecutionConditionExample;
import reiphiel.junit5.extension.TestExecutionExceptionHandlerExample;
import reiphiel.junit5.extension.TestInstancePostProcessorExample;

@ExtendWith(ExecutionConditionExample.class)
@ExtendWith(BeforeAllCallbackExample.class)
@ExtendWith(BeforeEachCallbackExample.class)
@ExtendWith(BeforeTestExecutionCallbackExample.class)
@ExtendWith(AfterTestExecutionCallbackExample.class)
@ExtendWith(AfterEachCallbackExample.class)
@ExtendWith(AfterAllCallbackExample.class)
@ExtendWith(TestInstancePostProcessorExample.class)
@ExtendWith(TestExecutionExceptionHandlerExample.class)
class AllExtensionExample {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @Test
    void test1() {
        System.out.println("test1");
        throw new IllegalStateException();
    }

    @Test
    void test2() {
        System.out.println("test2");
    }
}
