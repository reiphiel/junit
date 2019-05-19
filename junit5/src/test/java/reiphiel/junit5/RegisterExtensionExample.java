package reiphiel.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import reiphiel.junit5.extension.BeforeAllCallbackExample;
import reiphiel.junit5.extension.BeforeEachCallbackExample;

class RegisterExtensionExample {

    @RegisterExtension
    static BeforeAllCallbackExample beforeAllCallbackExample = new BeforeAllCallbackExample();

    @RegisterExtension
    BeforeEachCallbackExample beforeEachCallbackExample = new BeforeEachCallbackExample();

    @Test
    void test() {
        System.out.println("test execution");
    }
}
