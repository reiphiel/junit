package reiphiel.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledExample {

    @Test
    @Disabled("문제가 해결될때까지 테스트 중단")
    void test() {
        System.out.println("테스트");
    }

    @Test
    void test2() {
        System.out.println("테스트2");
    }

}
