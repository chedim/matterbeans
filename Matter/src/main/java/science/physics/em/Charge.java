package science.physics.em;

import science.physics.general.Value;

public class Charge extends Value<Coulomb> {
    public Charge(float value) {
        super(value, Coulomb.class);
    }
}
