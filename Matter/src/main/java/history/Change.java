package history;

public interface Change<V> {
    long offset();
    V change();
}
