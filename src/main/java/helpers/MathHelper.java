package helpers;

public class MathHelper {
    public static float randomFloatRange(float min, float max) {
        return min + ((float) Math.random()) * (max - min);
    }
}
