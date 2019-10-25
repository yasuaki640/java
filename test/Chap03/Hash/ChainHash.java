package Chap03.Hash;

public class ChainHash<K, V> {
    class Node<K, V> {
        private K key;
        private V data;
        private Node<K, V> next; // 後続ノードへの参照

        Node(K key, V data, Node<K, V> next) {
            this.key = key;
            this.data = data;
            this.next = next;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return data;
        }

        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;
    private Node<K, V>[] table;

    public ChainHash(int capacity) {
        try {
            table = new Node[capacity];
            this.size = capacity;
        } catch (OutOfMemoryError e) {
            this.size = 0;
        }
    }

    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    public V search(K key) {
        int hash = hashValue(key); // 探索するデータのハッシュ値
        Node<K, V> p = table[hash]; // 着目するノード

        while (p != null) {
            if (p.getKey().equals(key))
                return p.getValue(); // 探索成功
            p = p.next; // 後続ノードに着目
        }
        return null; // 探索失敗
    }

    public int add(K key, V data) {
        int hash = hashValue(key);
        Node<K, V> p = table[hash]; // 着目ノード

        while (p != null) {
            if (p.getKey().equals(key))
                return 1;
            p = p.next; // 後続ノードに着目
        }
        Node<K, V> temp = new Node<K, V>(key, data, table[hash]);
        table[hash] = temp;
        return 0;
    }

    public int remove(K key) {
        int hash = hashValue(key); // 削除するデータのハッシュ値
        Node<K, V> p = table[hash]; // 着目ノード
        Node<K, V> pp = null; // 前回の着目ノード

        while (p != null) {
            if (p.getKey().equals(key)) { // 見つけたら
                if (pp == null)
                    table[hash] = p.next;
                else
                    pp.next = p.next;
                return 0;
            }
            pp = p;
            p = p.next; // 後続ノードに着目
        }
        return 1; // そのキー値は存在しない
    }

    public void dump() {
        for (int i = 0; i < size; i++) {
            Node<K, V> p = table[i];
            System.out.printf("%02d ", i);
            while (p != null) {
                System.out.printf("→ %s (%s) ", p.getKey(), p.getValue());
                p = p.next;
            }
            System.out.println();
        }
    }
}