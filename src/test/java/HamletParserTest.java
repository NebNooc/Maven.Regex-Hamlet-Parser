import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String actual = hamletParser.getHamletData();
        hamletText = hamletParser.replaceHamlet(hamletText);

        Assert.assertNotEquals(hamletText, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        String actual = hamletParser.getHamletData();
        hamletText = hamletParser.replaceHoratio(hamletText);
        
        Assert.assertNotEquals(hamletText, actual);
    }

    @Test
    public void testFindHoratio() {
        hamletText = hamletParser.replaceHoratio(hamletText);
        Boolean check = hamletText.contains("HORATIO");

        Assert.assertFalse(check);
    }

    @Test
    public void testFindHamlet() {
        hamletText = hamletParser.replaceHamlet(hamletText);
        Boolean check = hamletText.contains("HAMLET");

        Assert.assertFalse(check);
    }
}