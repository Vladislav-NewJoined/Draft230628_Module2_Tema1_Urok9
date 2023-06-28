import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Draft0_Whole_Video_2_1_9 {

    final static int pageSize = 5;
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tУ вас есть список моделей смартфонов, iPhone 6 S\", \"Lumia 950\", \"Samsung\n" +
                "Galaxy S 6\", \"LG G 4\", \"Nexus 7\", вам нужно вывести в консоль названия двух моделей\n" +
                "пропустив при этом первый бренд при помощи метода skip и limit\n\nРешение: ");
            /*IntStream.range(-10, 10).skip(5).limit(10).forEach(System.out::println);*/
        ArrayList <Integer> catalog = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            catalog.add(i);
        }
        /*final IntStream catalog = IntStream.range(0, 100);*/
        Scanner in = new Scanner (System.in);
        while (true) {
            int page = in.nextInt();
            /*catalog.skip((page - 1) * pageSize).limit(pageSize).forEach(System.out::println);*/
            catalog.stream().skip((page - 1) * pageSize).limit(pageSize).forEach(System.out::println);
        }

    }
}