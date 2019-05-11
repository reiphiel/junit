package reiphiel.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

class ConditionalSystemPropertyExample {

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void only64bit() {
    }

    @Test
    @DisabledIfSystemProperty(named = "test", matches = "true")
    void onlyTestProperty() {
    }
}
