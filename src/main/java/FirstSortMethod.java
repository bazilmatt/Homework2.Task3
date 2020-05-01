import java.util.Comparator;

public class FirstSortMethod implements Sorting <Person> {

    public void sortArray(Person[] array){

        for (int i = 1; i < array.length; i++) {
            Person current = array[i];
            int j = i - 1;
            while(j >= 0 && (current.compare(current,array[j]))>=0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }


    public void print(Person[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }

    }

}
