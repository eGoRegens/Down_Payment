public class Appartment {
    public static void main(String[] args) {
        final int APARTMENT_PRICE = 8900000;
        final double DOWN_PAYMENT = 15.5;
        final double DOWN_PAYMENT_AMOUNT = (APARTMENT_PRICE * DOWN_PAYMENT) / 100;  // сумма первоначального взноса
        final int DOWN_PAYMENT_INTEGER = (int) DOWN_PAYMENT_AMOUNT;  //округление до целочисленного

        System.out.println("Стоимость квартиры составляет " + APARTMENT_PRICE + " у.е.");
        System.out.println("Требуемый процент первоначального взноса " + DOWN_PAYMENT + "% от стоимости квартиры.");
        System.out.println("Сумма первоначального взноса составит = " + DOWN_PAYMENT_INTEGER + " у.е.");
    }
}