package science.physics.em;

import science.physics.general.Unit;

import java.util.OptionalDouble;

public class Coulomb extends Unit {
    @Override
    public OptionalDouble conversionRate(Class<? extends Unit> other) {
        return OptionalDouble.empty();
    }
}
