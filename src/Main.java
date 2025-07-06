import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Имена людей (Здесь можно создать вместо массива, список и в него можно будет добавлять людей и выбирать)
        String[] names = {"Сергей", "Иван", "Илья", "Мария", "Катя"};
        // Выводим имена людей
        System.out.println("Имена людей, выбери кого нибудь, кому ты хочешь набрать:");
        // Выводим имена людей
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        // Сканнер для ввода имени fsfsff
        Scanner scanner = new Scanner(System.in);
        // Ввод имени
        String name = scanner.nextLine();
        // Проверка имени с помощью if else и метода equals(Он смотрит есть ли в строке ввода имена которые я ввел, в массиве имен)
        if (name.equals(names[0])) {
            System.out.println("Ты выбрал Сергея Она начальник, звони ему по номеру +7-777-777-777 " + names[0]);
        } else if (name.equals(names[1])) {
                System.out.println("Ты выбрал Ивана Он зам.начальника, звони ему по номеру +7-777-777-778 " + names[1]);
            } else {
            System.out.println("Отдыхай у тебя все хорошо, ты молодец!!!");
        }
    }
}



