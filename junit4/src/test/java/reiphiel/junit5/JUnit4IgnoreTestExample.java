package reiphiel.junit5;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.EnableJUnit4MigrationSupport;

@EnableJUnit4MigrationSupport
class JUnit4IgnoreTestExample {

    @Test
    @Ignore
    void test() {
        System.out.println("이테스트는 JUnit4의 @Ignore에 의해서 무시됩니다.");
    }
}
