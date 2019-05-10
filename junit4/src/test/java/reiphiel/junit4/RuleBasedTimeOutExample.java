package reiphiel.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RuleBasedTimeOutExample {

    @Rule
    public Timeout timeout = Timeout.seconds(5);

    @Test
    public void exceed_timeout() throws Exception {
        Thread.sleep(6000);
    }

    @Test
    public void not_exceed() throws Exception {
        Thread.sleep(1000);
    }

}
