public class Employee {
    // ФИО сотрудника, в реальных проектах лучше хранить раздельно :)
    public String fio;
    // должность
    public String position;
    // электронная почта
    public String email;

    // мобильный телефон, зарплата и возраст
    // какие типы данных предпочитаете для таких вещей и почему?
    // я для телефона часто использую целочисленный тип
    public String phone;
    public float salary;
    public int age;

    public Employee(String fio, String position, String email, String phone, float salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String fio, String position) {
        this(fio, position, null, null, -1, -1);
    }

    public void printInfo() {
        // выводим информация об объекте использую метод toString()
        System.out.println(this);
    }

    @Override
    public String toString() {
        // пусть все будет коротко в одну строчку
        return fio + ", " + position + ", " + email + ", " + phone + ", " + salary + "$, " + age + "yo";
    }
}
