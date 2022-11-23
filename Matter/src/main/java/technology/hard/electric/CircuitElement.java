package technology.hard.electric;

import science.physics.em.Current;
import science.physics.em.Potential;
import science.physics.em.Resistance;
import science.physics.general.Range;

public interface CircuitElement {
    Resistance resistance();
    Range<Current> allowedCurrents();
   Range<Potential> allowedPotentials();
}
