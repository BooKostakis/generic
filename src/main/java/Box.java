public class Box<K, V, F> {
    private K key;
    private V value;
    private F flo;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public F getFlo() {
        return flo;
    }

    public void setFlo(F flo) {
        this.flo = flo;
    }


    public Box(K key, V value, F flo) {
        this.key = key;
        this.value = value;
        this.flo = flo;
    }
}
