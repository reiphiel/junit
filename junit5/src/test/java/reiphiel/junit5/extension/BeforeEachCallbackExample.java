package reiphiel.junit5.extension;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class BeforeEachCallbackExample implements BeforeEachCallback {
    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("BeforeEachCallback");
    }
}
