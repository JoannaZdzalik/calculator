package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class MainTest {

    private Path workingDir;

    @Before
    public void setUp() {
        this.workingDir = Path.of("", "src/test/java/resources");
    }

    @Test
    public void test_solve() throws IOException {
        List<MathOperation> operations = FileReader.getOperationsFromFile(workingDir.resolve("testinput.txt"));
           int output1 = operations.get(0).operator.calculate(operations.get(0).value1, operations.get(0).value2);
           int output2 = operations.get(1).operator.calculate(operations.get(1).value1, operations.get(1).value2);
           int output3 = operations.get(2).operator.calculate(operations.get(2).value1, operations.get(2).value2);

        Assert.assertEquals(4, output1);
        Assert.assertEquals(81, output2);
        Assert.assertEquals(2, output3);
    }
}
