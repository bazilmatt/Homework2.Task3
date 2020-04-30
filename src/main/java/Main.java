import java.util.Arrays;

/**
 * Главный класс программы описывающий логику работы
 */
public class Main {



    public static void main(String[] args) throws Exception {
        Person[] people = new Person[10000];
        FirstSortMethod fs = new FirstSortMethod();
        try {
            int i =0;
            for (Person p:people) {
                Person p1 =  new Person();
                fs.hasA(people,p1);
                people[i] = p1;
                i++;
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Povtor elementa");
        }


        fs.sortAndPrint(people);



    }
}
