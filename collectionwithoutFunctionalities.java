package TechnicalTest;

import java.math.*;
import java.util.*;

public class collectionwithoutFunctionalities {

	public static List<BigDecimal> convertToBigDecimalOld(double[] array) {
        List<BigDecimal> result = new ArrayList<>(array.length);
        for (double value : array) {
            result.add(new BigDecimal(Double.toString(value)));
        }
        return result;
    }

    public static void main(String[] args) {
        double[] doubleArray = {10.05, 12.27, 32.98};
        List<BigDecimal> result = convertToBigDecimalOld(doubleArray);
        System.out.println(result);
    }
}