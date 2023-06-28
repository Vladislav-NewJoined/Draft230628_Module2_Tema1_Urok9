import java.util.ArrayList;
import java.util.Scanner;

public class Draft1_Task2_1_9 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП
    final static int pageSize = 5;

    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tУ вас есть список моделей смартфонов, 'iPhone 6 S', 'Lumia 950', " +
                "\n'Samsung Galaxy S 6', 'LG G 4', 'Nexus 7', Вам нужно вывести в консоль названия " +
                "\nдвух моделей пропустив при этом первый бренд при помощи метода skip и limit\n\nРешение: ");
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("iPhone 6 S");
        catalog.add("Lumia 950");
        catalog.add("Samsung Galaxy S 6");
        catalog.add("LG G 4");
        catalog.add("Nexus 7");

        System.out.println("Исходный массив: ");
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }

        System.out.println(); // Это перенос строки
        System.out.println("Полученный массив: ");
        catalog.stream().skip(1).limit(2).forEach(a -> System.out.println(a));
    }

}
//        Конец Примера _ КККККККККККККККК


////        Пример 2 ППППППППППППППППППППППППППППППППППП
//    final static int pageSize = 5;
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tУ вас есть список моделей смартфонов, 'iPhone 6 S', 'Lumia 950', " +
//                "\n'Samsung Galaxy S 6', 'LG G 4', 'Nexus 7', Вам нужно вывести в консоль названия " +
//                "\nдвух моделей пропустив при этом первый бренд при помощи метода skip и limit\n\nРешение: ");
//        /*IntStream.range(-10, 10).skip(5).limit(10).forEach(System.out::println);*/
//        /*ArrayList<Integer> catalog = new ArrayList<>();*/
//        /*ArrayList<String> catalog = new ArrayList <>("iPhone 6 S", "Lumia 950", "Galaxy S 6");*/
//        ArrayList<String> catalog = new ArrayList<>();
//            catalog.add("iPhone 6 S");
//            catalog.add("Lumia 950");
//            catalog.add("Samsung Galaxy S 6");
//            catalog.add("LG G 4");
//            catalog.add("Nexus 7");
//
//        System.out.println(catalog);
//
//    }
//}
////        Конец Примера 2 КККККККККККККККК


////        Пример 1 ППППППППППППППППППППППППППППППППППП
//    final static int pageSize = 5;
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tУ вас есть список моделей смартфонов, iPhone 6 S\", \"Lumia 950\", \"Samsung\n" +
//                "Galaxy S 6\", \"LG G 4\", \"Nexus 7\", вам нужно вывести в консоль названия двух моделей\n" +
//                "пропустив при этом первый бренд при помощи метода skip и limit\n\nРешение: ");
//        /*IntStream.range(-10, 10).skip(5).limit(10).forEach(System.out::println);*/
//        ArrayList<Integer> catalog = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            catalog.add(i);
//        }
//        /*final IntStream catalog = IntStream.range(0, 100);*/
//        Scanner in = new Scanner (System.in);
//        while (true) {
//            int page = in.nextInt();
//            /*catalog.skip((page - 1) * pageSize).limit(pageSize).forEach(System.out::println);*/
//            catalog.stream().skip((page - 1) * pageSize).limit(pageSize).forEach(System.out::println);
//        }
//
//    }
//}
////        Конец Примера 1 КККККККККККККККК






