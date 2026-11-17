import java.util.ArrayList;

public class QuickSort {

    private static int partitionner(ArrayList<Integer> liste, int deb, int fin) {
        int pivot = liste.get(fin);
        int i = (deb - 1);

        for (int j = deb; j < fin; j++) {
            if (liste.get(j) <= pivot) {
                i++;
                int temp = liste.get(i);
                liste.set(i, liste.get(j));
                liste.set(j, temp);
            }
        }

        int tmp = liste.get(i + 1);
        liste.set(i + 1, liste.get(fin));
        liste.set(fin, tmp);

        return i + 1;
    }
}