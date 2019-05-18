package reiphiel.junit5;

import reiphiel.junit5.annotation.LinuxAndMacOnlyTest;

public class CustomAnnotationExample {

    @LinuxAndMacOnlyTest
    void 리눅스_맥_전용() {
        System.out.println("리눅스나 맥에서만 실행");
    }
}
