package Chap09;

import java.util.Comparator;
import java.util.Scanner;

public class LinkedList<E> {
    // ノード
    // EはElementの頭文字
    class Node<E> {
        private E data;
        private Node<E> next; // 後続ポインタ(後続ノードへの参照)

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head; // 先頭ノード
    private Node<E> crnt; // 着目ノード

    public LinkedList() {
        head = crnt = null;
    }

    public E search(E obj, Comparator<? super E> c) {
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

    public void addFirtst(E obj) {
        Node<E> ptr = head;
        head = crnt = new Node<E>(obj, ptr);
    }

    public void addLast(E obj) {
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
    
    public void remove(Node p) {
        if (head != null) {
            if(p == head) //pが先頭ノードであれば
                removeFirst();
        }
    }
}