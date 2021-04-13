package animals;

import helpers.MathHelper;

public class Cat extends Animal {
    // верхний предел для диапазона расстояния бега котов
    static final float RANGE_LIMIT_RUN_DISTANCE = 200;
    // верхний предел для диапазона длины прыжка
    static final float RANGE_LIMIT_JUMP_DISTANCE = 5;
    // верхний предел для диапазона высоты прыжка
    static final float RANGE_LIMIT_JUMP_HEIGHT = 10;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

        init();
    }

    private void init() {
        runDistanceLimit = MathHelper.randomFloatRange(1, RANGE_LIMIT_RUN_DISTANCE);
        jumpDistanceLimit = MathHelper.randomFloatRange(1, RANGE_LIMIT_JUMP_DISTANCE);
        jumpHeightLimit = MathHelper.randomFloatRange(1, RANGE_LIMIT_JUMP_HEIGHT);
    }

    @Override
    public String getAnimalClassName() {
        return "кот";
    }
}
