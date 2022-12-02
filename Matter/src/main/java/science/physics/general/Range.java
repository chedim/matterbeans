package science.physics.general;

public class Range<V extends Value<?>> {
    private final V min;
    private final V max;
    private final boolean includesMin;
    private final boolean includesMax;

    public Range(V min, V max) {
        this.min = min;
        this.max = max;
        this.includesMin = true;
        this.includesMax = true;
    }

    public Range(V min, V max, boolean includesMin, boolean includesMax) {
        this.min = min;
        this.max = max;
        this.includesMin = includesMin;
        this.includesMax = includesMax;
    }

    public V min() {
        return min;
    }

    public V max() {
        return max;
    }

    public boolean includesMin() {
        return includesMin;
    }

    public boolean includesMax() {
        return includesMax;
    }

    public boolean contains(V val) {
        if (val.get() > min.get() || includesMin && val.get() == min.get()) {
            return val.get() < max.get() || includesMax && val.get() == max.get();
        }
        return false;
    }
}
