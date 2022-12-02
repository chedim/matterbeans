package science.physics.general;

public class Value<U extends Unit> {
    private float value;
    private final Class<U> unit;

    public Value(float value, Class<U> unit) {
        this.value = value;
        this.unit = unit;
    }

    public Value<U> set(float value) {
        this.value = value;
        return this;
    }

    public float get() {
        return value;
    }

    public Class<U> unit() {
        return unit;
    }
}
