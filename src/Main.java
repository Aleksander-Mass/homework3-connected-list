public class Main {

    public static void main(String[] args) {
        // вывод списка на экран (список  пуст)
        ListNodeUtils.print();
        // добавление в список первого элемента
        ListNode firstListNode = ListNodeUtils.addFirst(1);
        // вывод списка на экран (один элемент)
        ListNodeUtils.print();
        // добавление в список второго элемента
        ListNode secondListNode = ListNodeUtils.addFirst(2);
        // вывод списка на экран (два элемента)
        ListNodeUtils.print();
        // добавление в список третьего элемента
        ListNode thirdListNode = ListNodeUtils.addFirst(3);
        // вывод списка на экран (три элемента)
        ListNodeUtils.print();
        // разворот списка
        ListNodeUtils.reverse();
        // вывод списка на экран (список  инвертирован)
        ListNodeUtils.print();
        // удаление из списка второго элемента
        ListNodeUtils.removeFirst(secondListNode);
        // вывод списка на экран (два элемента)
        ListNodeUtils.print();
        // удаление из списка третьего элемента
        ListNodeUtils.removeFirst(thirdListNode);
        // вывод списка на экран (один элемент)
        ListNodeUtils.print();
        // удаление из списка первого элемента
        ListNodeUtils.removeFirst(firstListNode);
        // вывод списка на экран (список  пуст)
        ListNodeUtils.print();
    }

}