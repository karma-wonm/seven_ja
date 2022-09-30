import ru.netology.javaqa.javaqamvn.services.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonus = (int) service.calculate(15000, true);
        System.out.println(bonus);
    }
}