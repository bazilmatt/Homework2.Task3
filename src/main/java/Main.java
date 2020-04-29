/**
 * Главный класс программы описывающий логику работы
 */
public class Main {



    public static void main(String[] args) {
        Person[] people = new Person[100];

        for (int i = 0; i < people.length; i++) {
            people[i]=new Person();
        }
        FirstSortMethod fs = new FirstSortMethod();
        fs.sortAndPrint(people);



    }
}
