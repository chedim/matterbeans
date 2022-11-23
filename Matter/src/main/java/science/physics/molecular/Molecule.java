package science.physics.molecular;

import science.physics.atomic.Atom;

public interface Molecule {
    int atomsTotal();
    Atom atom(int atomIndex);
}
