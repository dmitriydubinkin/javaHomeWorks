public class Main {
    public static void main(String[] args) {
        // создадим сотрудника Джона
        Employee jon = new Employee("Джон Польский", "разработчик", "jon@mail.ru", "88005553535", 2500.57f, 45);
        // создадим сотрудника Тома
        Employee tom = new Employee("Том Браун", "сетевой инженер");

        // добавим информацию для Тома
        tom.email = "tom@gmail.com";
        tom.phone = "88007376868";
        tom.salary = 3400f;
        tom.age = 37;

        // посмотрим, что получилось
        System.out.println("\nИнформация о сотрудниках:");
        jon.printInfo();
        tom.printInfo();

        // ок, создадим еще несколько сотрудников
        Employee paul = new Employee("Пауль Стоков", "тестировщик", "paul@mail.ru", "89209995675", 900f, 24);
        Employee dasha = new Employee("Даша Иванова", "SMM", "dasha@yandex.ru", null, 1500f, 31);
        Employee anna = new Employee("Анна Каренина", "призрак", null, null, 100500, 28);
        Employee kesha = new Employee("Кеша Сидоров", "электрик", null, "89101234343", 350, 52);

        // создадим массив из всех сотрудников
        Employee[] employees = {jon, tom, paul, dasha, anna, kesha};

        // выводим информацию о сотрудниках старше 40 лет
        System.out.println("\nИнформация о сотрудниках старше 40 лет:");

        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }
    }
}
