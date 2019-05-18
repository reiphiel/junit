package reiphiel.junit5.annotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;

@Test
@EnabledOnOs({MAC, LINUX})
public @interface LinuxAndMacOnlyTest {
}
