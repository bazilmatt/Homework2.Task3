public class FirstSortMethod implements Sorting <Person> {

    public void sortArray(Person[] array) throws Exception {
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

    public int compare(Person o1, Person o2) throws Exception{

        //if ((o1.sex.compareTo(o2.sex)==0)&&(o1.age==o2.age)&&(o1.name.compareTo(o2.name)==0)){
        //    return 0; //нужно возвращать exception так как не может быть двух одинаковых person
        //} else if (o1.sex.compareTo(o2.sex)>0){

        if (o1.sex.compareTo(o2.sex)<0){
            return 1;
        } else if ((o1.sex.compareTo(o2.sex)>0)) {
            return -1;
        } else if (o1.age>o2.age){
            return 1;
        } else if (o1.age<o2.age){
            return -1;
        } else if (o1.name.compareTo(o2.name)>0){
            return 1;
        } else if (o1.name.compareTo(o2.name)<0){
            return -1;
        } else throw new Exception(); //не должно происходить, так как одинаковые person недопустимы
    }

    public void hasA(Person[] p, Person o2) throws Exception{
        int i=0;
        for (Person pp: p){
            if (compare(p[i], o2) == 0){
                throw  new Exception();
            }
            i++;
        }
    }


    public void sortAndPrint(Person[] p) throws Exception {
        long st = System.nanoTime();
        sortArray(p);
        int i = 0;
        for (Person pp:p) {
            System.out.println(p[i].toString());
            i++;
        }
        st = System.nanoTime()-st;
        System.out.println("Время выполнения первого метода сортировки - " + st);

    }

}
