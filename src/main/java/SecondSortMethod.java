public class SecondSortMethod implements Sorting <Person> {


    public void sortArray(Person[] array, int left, int right) {
            if (right <= left) return;
            int mid = (left+right)/2;
            sortArray(array, left, mid);
            sortArray(array, mid+1, right);
            merge(array, left, mid, right);
        }
    }

    @Override

    public int compare(Person t1, Person t2) {
        return 0;
    }

    @Override
    public void sortAndPrint(Person[] t) {

    }

}
