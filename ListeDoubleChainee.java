public class ListeDoubleChainee {

    private Node header, trailer;
    private long size;

    public ListeDoubleChainee() {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
        size = 0;
    }

    public void addLast(Integer element) {
        Node predecessor = trailer.getPrev();
        Node newNode = new Node(element, predecessor, trailer);
        predecessor.setNext(newNode);
        trailer.setPrev(newNode);
        size++;
    }

    public long size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer first() {
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement();
    }

    public Integer last() {
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement();
    }

    public void bubbleSort() {
        if (size <= 1) {
            return;
        }
        for (int i = 0; i < size; i++) {
            Node c = header.getNext();
            for (int j = 0; j < size - 1; j++) {
                Node cplus1 = c.getNext();
                if (c.getElement() > cplus1.getElement()) {
                    Integer tmp = c.getElement();
                    c.setElement(cplus1.getElement());
                    cplus1.setElement(tmp);
                }
                c = c.getNext();
            }
        }
    }

    private static class Node {
        private Integer element;
        private Node prev;
        private Node next;

        public Node(Integer element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public Integer getElement() {
            return element;
        }

        public void setElement(Integer element) {
            this.element = element;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(element);
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = header.getNext();
        while (current != trailer) {
            sb.append(current.getElement());
            if (current.getNext() != trailer) {
                sb.append(" ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
    System.out.println("Test");
    }
}