package calculator;

import java.util.HashMap;
import java.util.Map;

public enum Operator {

    ADDITION {
        @Override
        public int calculate(int v1, int v2) {
            return v1 + v2;
        }
    },
    SUBTRACTION {
        @Override
        public int calculate(int v1, int v2) {
            return v1 - v2;
        }
    },
    MULTIPLICATION {
        @Override
        public int calculate(int v1, int v2) {
            return v1 * v2;
        }
    },
    DIVISION{
        @Override
        public int calculate(int v1, int v2) {
            return v1 / v2;
        }
    },
    MODULO {
        @Override
        public int calculate(int v1, int v2) {
            return v1 % v2;
        }
    };

    public abstract int calculate(int v1, int v2);

    public static final Map<String, Operator> map = new HashMap<>();

    static{
        map.put("+",Operator.ADDITION);
        map.put("-",Operator.SUBTRACTION);
        map.put("*",Operator.MULTIPLICATION);
        map.put("/",Operator.DIVISION);
        map.put("%",Operator.MODULO);
    }

    public static Operator getOperatorFromSign(String sign){
        return  map.get(sign);
    }
}