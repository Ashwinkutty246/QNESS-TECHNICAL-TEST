package TechnicalTest;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

public class collectionwithFuntionalities 
{
	public static List<BigDecimal> convertToBigDecimalNew(double[] array) 
	{
        return Arrays.stream(array)
                .mapToObj(BigDecimal::valueOf)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) 
    {
        double[] doubleArray = {1.5, 2.7, 3.8};
        List<BigDecimal> result = convertToBigDecimalNew(doubleArray);
        System.out.println(result);
    }
}