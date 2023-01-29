package linkedin_learning.java;

import java.util.List;

public class InvestingChange {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        return purchases.stream()
               .mapToDouble(x -> Math.ceil(x) - x)
               .average().orElse(0);
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}

