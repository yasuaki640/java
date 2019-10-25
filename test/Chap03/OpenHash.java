public class OpenHash<K, V> {
    // バケットの状態
    enum Status {
        OCCUPIED, EMPTY, DELETED
    };

    // バケット
    static class Bucket<K, V> {
        private K key;
        private V data;
        private Status stat;

        // コンストラクタ
        Bucket() {
            stat = Status.EMPTY;
        }

        // 全フィールドに値を設定
        void set(K key, V data, Status stat) {
            this.key = key; // キー値
            this.data = data; // 状態
            this.stat = stat; // データ
        }

        // 状態を設定
        void setStat(Status stat) {
            this.stat = stat;
        }

        // キー値を返す
        K getKey() {
            return key;
        }

        // データを返す
        V getValue() {
            return data;
        }

        // キーのハッシュ値を返す
        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;
    private Bucket<K, V>[] table;

    // コンストラクタ
    public OpenHash(int size) {
        try {
            table = new Bucket[size];
            for (int i = 0; i < size; i++) {
                table[i] = new Bucket<K, V>();
            }
            this.size = size;
        } catch (OutOfMemoryError e) {
            this.size = 0;
        }
    }
    
    //ハッシュを求める
    public int hashValue(Object key) {
        return key.hashCode() % size;
    }
    
    //歳ハッシュ値を求める
    public int rehashValue(int hash) {
        return (hash + 1) % size;
    }
    
    //キー値keyを持つバケットの探索
    private Bucket<K, V> searchNode(K key) {
        int hash = hashValue(key);
        Bucket<K, V> p = table[hash];
    }
}