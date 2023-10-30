public class Appartment {
    public static void main(String[] args) {
        final int Apartment_Price = 8900000;
        final double Down_Payment_Percentage = 15.5;
        double downPaymentAmount = (Apartment_Price * Down_Payment_Percentage) / 100;  // сумма первоначального взноса
        int downPaymentInteger = (int) downPaymentAmount;  //округление до целочисленного

        System.out.println("Стоимость квартиры составляет " + Apartment_Price + " у.е.");
        System.out.println("Требуемый процент первоначального взноса " + Down_Payment_Percentage + "% от стоимости квартиры.");
        System.out.println("Сумма первоначального взноса составит = " + downPaymentInteger + " у.е.");
    }
}