import ru.netology.service.ServiceClass;

public class Main {
    public static void main(String[] args) {
        ServiceClass service = new ServiceClass();
        int count = service.calculate(10000, 3000, 20000);
        System.out.println(count);
    }
}
