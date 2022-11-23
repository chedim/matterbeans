package science.physics.general;

public class Value<U extends Unit> {
    private final float value;
    private final Class<U> unit;

    public Value(float value, Class<U> unit) {
        this.value = value;
        this.unit = unit;
    }

    public float value() {
        return value;
    }

    public Class<U> unit() {
        return unit;
    }
}
