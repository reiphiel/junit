package reiphiel.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(ints = {10, 20})
    void test1(int i) {
        System.out.println("test1 - " + i);
    }

    @ParameterizedTest
    @NullSource
    void test2(Integer i) {
        System.out.println("test2 - " + i);
    }

    @ParameterizedTest
    @EmptySource
    void test3(String i) {
        System.out.println("test3 - " + "[" + i + "]");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void test4(String i) {
        System.out.println("test4 - " + "[" + i + "]");
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(ints = {10, 20})
    void test5(Integer i) {
        System.out.println("test5 - " + "[" + i + "]");
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20",
            "30, 40"
    })
    void test6(int i, long j) {
        System.out.println("test6 - " + "[" + i + "],[" + j + "]");
    }

}
