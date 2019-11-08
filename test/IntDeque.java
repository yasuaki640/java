public class IntDeque {
    private int max; // キューの容量
    private int front; // 先頭要素カーソル
    private int rear; // 末尾要素カーソル
    private int num; // 現在のデータ数
    private int[] que; // キューの本体

    // 実行時例外：キューが空
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() {
        }
    }

    // 実行時例外：キューが満杯
    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() {
        }
    }

    // コンストラクタ
    public IntDeque(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max]; // キュー本体用の配列を作成
        } catch (OutOfMemoryError e) { // 生成できなかった
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntDequeException {
        if (num >= max)
            throw new OverflowIntDequeException();
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }

    public int enqueFront(int x) throws OverflowIntDequeException {
        if (num >= max)
            throw new OverflowIntDequeException();
        num++;
        if (--front < 0)
            front = max - 1;
        return x;
    }

    public int deque() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException(); // キューは空
        int x = que[front++];
        num--;
        if (front == max)
            front = 0;
        return x;
    }

    public int dequeRear() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException(); // キューは空
        num--;
        if (--rear < 0)
            rear = max - 1;
        return que[rear];
    }

    public int peek() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException(); // キューは空
        return que[front];
    }

    // キューからxを探してインデックス(見つからなければ-1)を返す
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x)
                return idx;
        }
        return -1;
    }

    public int search(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x)
                return i + 1;
        }

        return 0;
    }

    // キューを空にする
    public void clear() {
        num = front = rear = 0;
    }

    // キューの容量を返す
    public int capacity() {
        return max;
    }

    // キューに蓄えられているデータ数を返す
    public int size() {
        return num;
    }

    // キューは空であるか？
    public boolean isEmpty() {
        return num <= 0;
    }

    // キューは満杯であるか？
    public boolean isFull() {
        return num >= max;
    }

    // キュー内の全データを先頭→末尾の順に表示
    public void dump() {
        if (num <= 0)
            System.out.println("キューは空です。");
        else {
            for (int i = 0; i < num; i++)
                System.out.println(que[(i + front) % max] + " ");
            System.out.println();
        }
    }

}