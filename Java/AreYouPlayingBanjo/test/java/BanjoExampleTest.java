import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by locle on 3/27/16.
 */
public class BanjoExampleTest {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
        assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
    }
}
