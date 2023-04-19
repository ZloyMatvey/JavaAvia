public class Main {
    public static void main(String[] args) {
        int sum = 26480; //стоимость билета
        int bonus = 20; // сумма за которую начисляется 1 миля
        int mil = sum / bonus; // расчет бонусных миль
        System.out.println("Колличество бонусных миль = " + mil);
    }
}