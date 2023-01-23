import java.util.Iterator;

// класс "элемент списка"
public class ListNode implements Iterable<Integer> {
    // данные элемента
    private int val;

    // следующий элемент
    private ListNode next;

    // конструктор класса
    ListNode(int val) {
        this.val = val;
    }

    // конструктор класса
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    // итератор класса
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return this.hasNext();
            }

            @Override
            public Integer next() {
                return this.next();
            }
        };
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}