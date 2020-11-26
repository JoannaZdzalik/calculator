package calculator;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<MathOperation> operations = FileReader.getOperationsFromFile(Paths.get("input.txt"));
        for (MathOperation operation : operations) {
            System.out.println(operation.operator.calculate(operation.value1, operation.value2));
        }
    }
}
