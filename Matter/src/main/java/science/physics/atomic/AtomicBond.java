package science.physics.atomic;

public interface AtomicBond {
    AtomicBondType type();
    Atom atom(int index);
}
