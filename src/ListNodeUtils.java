public class ListNodeUtils {

    // первый элемент списка
    private static ListNode headListNode;

    // метод вывода элементов списка на экран
    public static void print() {
        // начинаем с первого элемента
        ListNode listNode = headListNode;
        // проходим по списку до последнего элемента
        while (listNode != null) {
            // вывод на экран значения элемента
            System.out.print(listNode.getVal());
            // если элемент не последний в списке
            if (listNode.getNext() != null) {
                // вывод на экран символов ->
                System.out.print(" -> ");
            }
            // переход к следующему элементу
            listNode = listNode.getNext();
        }
        System.out.println();
    }

    // метод добавления элемента в список
    public static ListNode addFirst(int value) {
        // если список пуст
        if (headListNode == null) {
            // новый элемент становится первым
            headListNode = new ListNode(value);
            // возвращаем ссылку на новый элемент
            return headListNode;
        // иначе
        } else {
            // начиная с первого элемента списка
            ListNode listNode = headListNode;
            // проходим по списку до последнего элемента
            while (listNode.getNext() != null) {
                // переходим к следующему элементу
                listNode = listNode.getNext();
            }
            // новый элемент становится последним
            listNode.setNext(new ListNode(value));
            // возвращаем ссылку на новый элемент
            return listNode.getNext();
        }
    }

    // метод удаления элемента из списка
    public static ListNode removeFirst(ListNode node) {
        // если список пуст
        if (headListNode == null) {
            // возвращаем null
            return null;
        }
        // временная переменная
        ListNode resultListNode;
        // если найденный элемент - первый
        if (headListNode.equals(node)) {
            // исключаем его из списка
            resultListNode = headListNode;
            headListNode = headListNode.getNext();
            // возвращаем первый элемент
            return resultListNode;
        }
        // выполняем поиск элемента
        ListNode listNode = headListNode;
        // проходим по списку до последнего элемента
        while (listNode.getNext() != null) {
            // если элемент найден
            if (listNode.getNext().equals(node)) {
                // исключаем его из списка
                resultListNode = listNode.getNext();
                listNode.setNext(resultListNode.getNext());
                // возвращаем найденный элемент
                return resultListNode;
            }
            // переходим к следующему элементу
            listNode = listNode.getNext();
        }
        // возвращаем null
        return null;
    }

    // метод разворота списка
    public static void reverse() {
        // начинаем с первого элемента
        ListNode listNode = headListNode;
        // предыдущий элемент
        ListNode previousListNode = null;
        // следующий элемент
        ListNode nextListNode;
        // проходим по списку до последнего элемента
        while (listNode != null) {
            // сохраняем следующий элемент
            nextListNode = listNode.getNext();
            // предыдущий элемент становится следующим
            listNode.setNext(previousListNode);
            // сохраняем предыдущий элемент
            previousListNode = listNode;
            // текущий элемент становится первым
            headListNode = listNode;
            // переходим к следующему элементу
            listNode = nextListNode;
        }
    }
}