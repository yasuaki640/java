package Chap09;

import java.util.Comparator;

public class LinkedList<E> {
    // ノード
    // EはElementの頭文字
    class Node<E> {
        private final E data;
        private Node<E> next; // 後続ポインタ(後続ノードへの参照)

        Node(final E data, final Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head; // 先頭ノード
    private Node<E> crnt; // 着目ノード

    public LinkedList() {
        head = crnt = null;
    }

    public E search(final E obj, final Comparator<? super E> c) {
        Node<E> ptr = head; // 現在走査中のノード

        while (ptr != null) {
            // 探索成功したら
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data;
            }
            // 後続ノードに着目
            ptr = ptr.next;
        }
        // 探索失敗
        return null;
    }

    public void addFirtst(final E obj) {
        final Node<E> ptr = head;
        head = crnt = new Node<E>(obj, ptr);
    }

    public void addLast(final E obj) {
        if (head == null) // リストが空であれば
            addFirtst(obj); // 先頭に挿入
        else {
            Node<E> ptr = head;
            // リストの終端まで走査
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }

    public void removeFirst() {
        if (head != null) // ヘッドが空でなければ
            head = crnt = head.next;
    }

    public void removeLast() {
        if (head != null) {
            if (head.next == null) // ノードが一つだけであれば
                removeFirst(); // 先頭ノードを削除
            else {
                Node<E> ptr = head; // 走査中のノード
                Node<E> pre = head;// 走査中の先行ノード

                while (ptr.next != null) {
                    pre = ptr;
                    ptr = ptr.next;
                }
                pre.next = null; // preは削除後の末尾ノード
                crnt = pre;
            }
        }
    }

    public void remove(final Node p) {
        if (head != null) {
            if (p == head) // pが先頭ノードであれば
                removeFirst();
            else {
                Node<E> ptr = head;
                // ノードpの先行ノードを見つける処理
                while (ptr.next != p) {
                    ptr = ptr.next;
                    if (ptr == null)
                        return; // pはリスト上に存在しない
                }
                ptr.next = p.next;
                crnt = ptr;
            }
        }
    }

    // 着目ノードを削除
    public void removeCurrentNode() {
        remove(crnt);
    }

    // 全ノードを削除
    public void clear() {
        while (head != null) // 空になるまで
            removeFirst(); // 先頭ノードを削除
        crnt = null;
    }

    // 着目ノードを一つ後方に進める
    public boolean next() {
        if (crnt == null || crnt.next == null)
            return false;
        crnt = crnt.next;
        return true;
    }

    // 着目ノードを表示
    public void printCurrentNode() {
        if (crnt == null)
            System.out.println("着目ノードはありません");
        else
            System.out.println(crnt.data);
    }

    public void dump() {
        Node<E> ptr = head;

        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public void purge(Comparator<? super E> c) {
        Node<E> ptr = head;

        while (ptr != null) {
            int count = 0;
            Node<E> ptr2 = ptr;
            Node<E> pre = ptr;

            while (pre.next != null) {
                ptr2 = pre.next;
                if (c.compare(ptr.data, ptr2.data) == 0) {
                    pre.next = ptr2.next;
                    count++;
                } else
                    pre = ptr2;
            }
            if (count == 0)
                ptr = ptr.next;
            else {
                Node<E> temp = ptr;
                remove(ptr);
                ptr = temp.next;
            }
        }
        crnt = head;
    }
}