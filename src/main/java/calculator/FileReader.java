package calculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<MathOperation> getOperationsFromFile(Path inputPath) throws IOException {
        List<String> linesFromFile = Files.readAllLines(inputPath);
        List<MathOperation> listOfOperations = new ArrayList<>();
        for (String operation : linesFromFile
        ) {
            String[] holder = operation.split("\\s+");
            Operator operator = Operator.getOperatorFromSign(holder[0]);
            int firstValue = Integer.parseInt(holder[1]);
            int secondValue = Integer.parseInt(holder[2]);
            MathOperation singleOperation = new MathOperation(operator, firstValue, secondValue);
            listOfOperations.add(singleOperation);
        }
        return listOfOperations;
    }

}
