package reiphiel.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;

import static org.junit.jupiter.api.condition.JRE.*;

class ConditionalEnvironmentExample {

    @Test
    @EnabledOnJre(JAVA_8)
    void java8() {
        System.out.println("JAVA8에서만 실행");
    }

    @Test
    @EnabledOnJre({JAVA_9, JAVA_10})
    void java9or10() {
        System.out.println("JAVA9, 10에서 실행");
    }

    @Test
    @DisabledOnJre(JAVA_9)
    void not_java9() {
        System.out.println("JAVA8에서 미실행");
    }

}
