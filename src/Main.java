public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(65,160);
        System.out.println(bmi);
        System.out.printf("%.2f\n",bmi);// выводим индекс с двумя знаками после запятой
    }
}
