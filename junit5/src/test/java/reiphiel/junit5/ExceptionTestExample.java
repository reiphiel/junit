package reiphiel.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionTestExample {
    @Test
    @DisplayName("예외의 상태 테스트")
    void exception() {
        Throwable e = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Argument Required");
        });
        assertEquals("Argument Required", e.getMessage());
    }

    @Test
    @DisplayName("예외 미발생")
    void exceptionNotThrow() {
        assertDoesNotThrow(() -> System.out.println("Do Something"));
    }
}
