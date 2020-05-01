/**
 * Главный класс программы описывающий логику работы
 */
public class Main {

    static class DoublePersonException extends Exception{}

    public static void generate(Person[] people, int j) throws DoublePersonException {
        Person bufferPerson = new Person();
        for (int i = 0; i < j; i++) {
            if (people[i].compare(bufferPerson,people[i])==0){
                //generate(people, j);  //использовался для гарантированного заполнения массива
                throw new DoublePersonException();
            } else {
                people[j] = bufferPerson;
            }
        }
    }

    public static void main(String[] args) throws DoublePersonException, NullPointerException {


        Person[] people = new Person[1000];

        for (int i=0; i<people.length; i++) {
            if (i>0){
                try {
                    generate(people, i);
                } catch (DoublePersonException e) {
                    System.out.println("Дубль замечен. Уничтожить");
                } catch (NullPointerException e) {
                    System.out.println("NullPointException");
                }
            } else {
                people[i]=new Person();
            }
        }

        FirstSortMethod fs = new FirstSortMethod();

        fs.sortArray(people);
        fs.print(people);



    }
}
