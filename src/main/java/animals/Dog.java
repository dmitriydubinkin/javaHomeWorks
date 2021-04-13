package animals;

import helpers.MathHelper;

public class Dog extends Animal {
    // верхний предел для диапазона расстояния бега собак
    static final float RANGE_LIMIT_RUN_DISTANCE = 700;
    // верхний предел для диапазона длины прыжка
    static final float RANGE_LIMIT_JUMP_DISTANCE = 10;
    // верхний предел для диапазона высоты прыжка
    static final float RANGE_LIMIT_JUMP_HEIGHT = 8;
    // верхний предел для диапазона расстояния, которое проплывает собака
    static final float RANGE_LIMIT_SWIM_DISTANCE = 200;

    private float swimDistanceLimit = 0;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

        init();
    }

    private void init() {
        runDistanceLimit = MathHelper.randomFloatRange(1, RANGE_LIMIT_RUN_DISTANCE);
        jumpDistanceLimit = MathHelper.randomFloatRange(1, RANGE_LIMIT_JUMP_DISTANCE);
        jumpHeightLimit = MathHelper.randomFloatRange(1, RANGE_LIMIT_JUMP_HEIGHT);
        swimDistanceLimit = MathHelper.randomFloatRange(1, RANGE_LIMIT_SWIM_DISTANCE);
    }

    @Override
    public String getAnimalClassName() {
        return "собака";
    }

    // собаки по условию умеют плавать, добавляем метод
    public void swim(float distance) {
        if (distance <= swimDistanceLimit) {
            System.out.printf("%s проплыл(а) %.1f м\n", name, distance);
        } else {
            System.out.printf("%s не может плыть больше %.1f м\n", name, swimDistanceLimit);
        }
    }
}
