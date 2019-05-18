package reiphiel.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.*;

class ConditionalOsExecutionExample {

    @Test
    @EnabledOnOs(MAC)
    void 맥전용() {
        System.out.println("맥에서만 실행");
    }

    @Test
    @EnabledOnOs({MAC, LINUX})
    void 리눅스_맥_전용() {
        System.out.println("리눅스나 맥에서만 실행");
    }

    @Test
    @DisabledOnOs({WINDOWS, MAC})
    void 윈도우_맥_제외() {
        System.out.println("윈도우나 맥에서 미실행");
    }

}

