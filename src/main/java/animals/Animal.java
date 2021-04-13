package animals;

public abstract class Animal {
    public String name;
    public String color;
    public int age;

    // определяем изначальные ограничения животного
    protected float runDistanceLimit = 0;
    protected float jumpDistanceLimit = 0;
    protected float jumpHeightLimit = 0;

    // вывод информации о животном
    public void printInfo() {
        String animalClass = getAnimalClassName();
        System.out.printf("%nМеня зовут %s, я %s, цвет %s, %d лет%n%n", name, animalClass, color, age);
    }

    // получить название класса, к которому относится животное
    // например: птица, кот, собака и т.д.
    public abstract String getAnimalClassName();

    // все могут бежать дистанцию
    public void run(float distance) {
        if (distance <= runDistanceLimit) {
            System.out.printf("%s пробежал(а) %.1f м\n", name, distance);
        } else {
            System.out.printf("%s не может бежать больше %.1f м\n", name, runDistanceLimit);
        }
    }

    // все могут прыгнуть в длину
    public void jump(float distance) {
        if (distance <= jumpDistanceLimit) {
            System.out.printf("%s прыгнул(а) на %.1f м\n", name, distance);
        } else {
            System.out.printf("%s не может прыгнуть дальше %.1f м\n", name, jumpDistanceLimit);
        }
    }

    // все могут перепрыгнуть препятствие
    public void jumpOver(float height) {
        if (height <= jumpHeightLimit) {
            System.out.printf("%s перепрыгнул(а) препятствие высотой %.1f м\n", name, height);
        } else {
            System.out.printf("%s не может перепрыгнуть препятствие выше %.1f м\n", name, jumpHeightLimit);
        }
    }
}
