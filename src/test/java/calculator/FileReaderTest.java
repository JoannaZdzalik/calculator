package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.nio.file.Path;

import java.util.List;


public class FileReaderTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Path workingDir;

    @Before
    public void setUp() {
        this.workingDir = Path.of("", "src/test/java/resources");
    }

    @Test
    public void shouldCreateListOfThreeOperations() throws IOException{
        List<MathOperation> operations = FileReader.getOperationsFromFile(workingDir.resolve("testinput.txt"));
        Assert.assertEquals(3, operations.size());
    }

    @Test
    public void shouldCreateCorrectMathOperations() throws IOException{
        List<MathOperation> operations = FileReader.getOperationsFromFile(workingDir.resolve("testinput.txt"));
        Assert.assertEquals(operations.get(0).operator, Operator.ADDITION);
        Assert.assertEquals(2, operations.get(0).value1);
        Assert.assertEquals(2, operations.get(0).value2);

        Assert.assertEquals(operations.get(1).operator, Operator.MULTIPLICATION);
        Assert.assertEquals(9, operations.get(1).value1);
        Assert.assertEquals(9, operations.get(1).value2);

        Assert.assertEquals(operations.get(2).operator, Operator.SUBTRACTION);
        Assert.assertEquals(5, operations.get(2).value1);
        Assert.assertEquals(3, operations.get(2).value2);

    }


}
