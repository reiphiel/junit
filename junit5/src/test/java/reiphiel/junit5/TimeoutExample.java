package reiphiel.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class TimeoutExample {

    @Test
    @DisplayName("타임아웃 준수")
    void timeoutNotExceeded() {
        assertTimeout(ofMinutes(2), () -> Thread.sleep(10));
    }

    @Test
    @DisplayName("타임아웃 초과")
    void timeoutExceeded() {
        assertTimeout(ofMillis(10), () -> Thread.sleep(100));
    }

}
