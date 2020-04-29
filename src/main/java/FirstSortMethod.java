import java.util.Comparator;

public class FirstSortMethod implements Sorting <Person> {

    public void sortArray(Person[] array) {
        for (int i = 1; i < array.length; i++) {
            Person current = array[i];
            int j = i - 1;
            while(j >= 0 && (compare(current,array[j]))>=0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

    }

    public int compare(Person o1, Person o2) {

        //if ((o1.sex.compareTo(o2.sex)==0)&&(o1.age==o2.age)&&(o1.name.compareTo(o2.name)==0)){
        //    return 0; //нужно возвращать exception так как не может быть двух одинаковых person
        //} else if (o1.sex.compareTo(o2.sex)>0){
        if (o1.sex.compareTo(o2.sex)>0){
            return 1;
        } else if ((o1.sex.compareTo(o2.sex)<0)) {
            return -1;
        } else if (o1.age<o2.age){
            return 1;
        } else if (o1.age>o2.age){
            return -1;
        } else if (o1.name.compareTo(o2.name)<0){
            return 1;
        } else if (o1.name.compareTo(o2.name)>0){
            return -1;
        } else return 0; //не должно происходить, так как одинаковые person недопустимы

    }
    public void sortAndPrint(Person[] p){
        sortArray(p);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }

    }

}
