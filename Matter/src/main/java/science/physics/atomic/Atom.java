package science.physics.atomic;

public class Atom {
    private Element element;
    private AtomicBond[] bonds;

    private int massNumber;

    public Atom(Element element, int massNumber, AtomicBond[] bonds) {
        this.element = element;
        this.bonds = bonds;
    }

    public Element element() {
        return element;
    }

    public AtomicBond bond(int index) {
        return bonds[index];
    }

    public int massNumber() {
        return massNumber;
    }
}
