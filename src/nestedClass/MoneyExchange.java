package nestedClass;

public class MoneyExchange {
    static class UsdHelper {
        double convertFromKhrToUsd(double Khr){

            return Khr/4100;
        }
    }
    static class KhrHelper {
        double convertFromUsdToKhr(double Usd){
            return Usd * 4100;
        }
    }

    public static void main(String[] args) {
        MoneyExchange.UsdHelper usdHelper = new MoneyExchange.UsdHelper();
        System.out.println(usdHelper.convertFromKhrToUsd(2_000_000));

        MoneyExchange.KhrHelper KhrHelper = new MoneyExchange.KhrHelper();
        System.out.println(KhrHelper.convertFromUsdToKhr(500));
    }
}
