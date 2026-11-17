void main() {
    ListeDoubleChainee liste = new ListeDoubleChainee();


    liste.addLast(17);
    liste.addLast(13);
    liste.addLast(12);
    liste.addLast(11);
    liste.addLast(15);
    liste.addLast(12);
    liste.addLast(19);
    System.out.println(liste);
    liste.bubbleSort();
    System.out.println(liste);


}
