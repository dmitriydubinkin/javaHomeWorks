public abstract class Animal {
    public String name;
    public String color;
    public int age;

    public void printInfo() {
        String animalClass = getAnimalClassName();
        System.out.printf("%nМеня зовут %s, я %s, цвет %s, %d лет%n%n", name, animalClass, color, age);
    }

    // получить название класса, к которому относится животное
    public abstract String getAnimalClassName();
    // бежать дистанцию
    public abstract void run(float distance);
    // прыгнуть в длину
    public abstract void jump(float distance);
    // перепрыгнуть препятствие
    public abstract void jumpOver(float height);
}
