package reiphiel.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class AssumptionsExample {

    @Test
    @DisplayName("개발환경에서만 수행")
    void dev_env_only() {
        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "개발 환경이 아닙니다.");

        assertEquals("A", "A");
    }

    @Test
    @DisplayName("일부만 개발환경에서 수행")
    void some_test() {
        assumingThat("DEV".equals(System.getenv("ENV")),
                () -> {
                    assertEquals("A", "B");
                });

        assertEquals("A", "A");
    }
}
