package science.physics.em;

import science.physics.general.Value;

public class Current extends Value<Ampere> {
    private final float frequency;
    public Current(float value) {
        super(value, Ampere.class);
        frequency = 0f;
    }

    public Current(float value, float frequency) {
        super(value, Ampere.class);
        this.frequency = frequency;
    }

    public float frequency() {
        return frequency;
    }
}
