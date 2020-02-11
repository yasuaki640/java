import java.util.Comparator;

public class DblLinkedList<E> {

    class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        Node() {
            data = null;
            prev = next = this;
        }

        Node(E obj, Node<E> prev, Node<E> next) {
            data = obj;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> crnt;

    public DblLinkedList() {
        head = crnt = new Node<E>(); // ダミーノードを生成
    }

    public boolean isEmpty() {
        return head.next == head;
    }

    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head.next; // 現在走査中のノード

        while (ptr != head) {
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data; // 探索成功
            }
            ptr = ptr.next; // 後続ノードに着目
        }
        return null; // 探索失敗
    }

    public void printCurrentNode() {
        if (isEmpty())
            System.out.println("着目ノードはありません。");
        else
            System.out.println(crnt.data);
    }
    
    public void removeCurrentNode() {
        if (!isEmpty()) {
            crnt.prev.next = crnt.next;
            crnt.next.prev = crnt.prev;
            crnt = crnt.prev;
            if (crnt == head)
                crnt = head.next;
        }
    }
    
    public void remove(Node p) {
        Node<E> ptr = head.next;

        while (ptr != head) {
            if (ptr == p) {
                crnt = p;
                removeCurrentNode();
                break;
            }
            ptr = ptr.next;
        }
    }
    
    public void removeFirst() {
        crnt = head.next;
        removeCurrentNode();
    }
    
    public void removeLast() {
        crnt = head.prev;
        removeCurrentNode();
    }
    
    public void clear() {
        while (!isEmpty()) {
            removeFirst();
        }
    }
}