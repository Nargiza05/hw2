import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkWeather(25, 10)); // Можно идти гулять
        System.out.println(checkWeather(18, 30)); // Можно идти гулять
        System.out.println(checkWeather(50, 20)); // Можно идти гулять
        System.out.println(checkWeather(30, 40)); // Оставайтесь дома
        System.out.println(checkWeather(50, -5)); // Оставайтесь дома


        test(23, 10);
        int randomAge = generateRandomAge();
        test(randomAge, 10);
    }

    public static String checkWeather(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int randomAge = random.nextInt(100) + 1;
        return randomAge;
    }

    public static void test(int age, int minAge) {
        if (age >= minAge) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Лучше остаться дома");
        }
    }
}