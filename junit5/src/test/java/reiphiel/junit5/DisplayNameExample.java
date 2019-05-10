package reiphiel.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("특수 테스트\uD83D\uDE00")
class DisplayNameExample {

    @Test
    @DisplayName("굉장한 테스트입니다.")
    void test() {

    }

}
