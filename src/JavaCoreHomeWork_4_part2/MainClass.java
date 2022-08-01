package JavaCoreHomeWork_4_part2;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Создаем список контактов");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Добавляем в справочник");
        phonebook.add("Ольга", "8 775 777 88 99");
        phonebook.add("Ольга", "8 701 888 77 99");
        phonebook.add("Мария", "8 702 555 66 44");
        phonebook.add("Наталья", "8 700 111 33 22");
        phonebook.add("Ольга", "8 705 555 77 44");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Ольга");
        System.out.println(phonebook.get("Ольга"));
        System.out.println("Мария");
        System.out.println(phonebook.get("Мария"));
        System.out.println("Наталья");
        System.out.println(phonebook.get("Наталья"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия контакта");
        System.out.println("Анна");
        System.out.println(phonebook.get("Анна"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Ольга", "8 775 777 88 99");
        System.out.println("Ольга");
        System.out.println(phonebook.get("Ольга"));
    }
}
