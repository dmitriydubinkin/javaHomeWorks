public class Cat extends Animal {
    // максимальное расстояние, которое кот пробегает за один раз
    static final float MAX_RUN_DISTANCE = 200;
    // максимальная длина прыжка
    static final float MAX_JUMP_DISTANCE = 2;
    // максимальная высота прыжка
    static final float MAX_JUMP_HEIGHT = 3;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public  String getAnimalClassName() {
        return "кот";
    }

    @Override
    public void run(float distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.printf("%s пробежал(а) %.1f м\n", name, distance);
        } else {
            System.out.printf("%s не может бежать больше %.1f м\n", name, MAX_RUN_DISTANCE);
        }
    }

    @Override
    public void jump(float distance) {
        if (distance <= MAX_JUMP_DISTANCE) {
            System.out.printf("%s прыгнул(а) на %.1f м\n", name, distance);
        } else {
            System.out.printf("%s не может прыгнуть дальше %.1f м\n", name, MAX_JUMP_DISTANCE);
        }
    }

    @Override
    public void jumpOver(float height) {
        if (height <= MAX_JUMP_HEIGHT) {
            System.out.printf("%s перепрыгнул(а) препятствие высотой %.1f м\n", name, height);
        } else {
            System.out.printf("%s не может перепрыгнуть препятствие выше %.1f м\n", name, MAX_JUMP_HEIGHT);
        }
    }
}
