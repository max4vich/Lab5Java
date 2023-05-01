import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealisedFunctionInMainTest {
    @Test
    public void testSumOfNumbers() {
        String text = "When be 44 draw drew ye. Defective in do recomm55end suffering." +
                "\nHouse it se-2ven 4 in spoil tiled court." +
                "\nSister oth+3ers marked 3 fat missed did out use." +
                "\nAlte4ration possession dispatched collecting instrument travelling he or on." +
                "\nSnug give made at spot or late that mr.";
        RealisedFunctionInMain main = new RealisedFunctionInMain();
        assertEquals(113, main.positiveIntSum(text));
    }
}
