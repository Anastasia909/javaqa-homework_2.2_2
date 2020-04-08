public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65;
        double height = 1.63;
        double index = service.calculate(weight,height);
        System.out.println(index);
    }
}
