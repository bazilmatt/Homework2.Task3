import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.Random;

public class Person{
        Integer age;
        Sex sex;
        String name;
        Random rnd = new Random();



        public Person(){
            age= rnd.nextInt(100);
            sex = new Sex();
            //name = getString(rnd.nextInt(10)+1);
            name = getString(rnd.nextInt(1)+1);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age.equals(person.age) &&
                sex.equals(person.sex) &&
                name.equals(person.name);
    }


    public int compare(Person o1, Person o2) {
        //if ((o1.sex.compareTo(o2.sex)==0)&&(o1.age==o2.age)&&(o1.name.compareTo(o2.name)==0)){
        //    return 0; //нужно возвращать exception так как не может быть двух одинаковых person
        //} else if (o1.sex.compareTo(o2.sex)>0){

        {
            if (o1.sex.compareTo(o2.sex) > 0) {
                return 1;
            } else if ((o1.sex.compareTo(o2.sex) < 0)) {
                return -1;
            } else if (o1.age > o2.age) {
                return 1;
            } else if (o1.age < o2.age) {
                return -1;
            } else if (o1.name.compareTo(o2.name) < 0) {
                return 1;
            } else if (o1.name.compareTo(o2.name) > 0) {
                return -1;
            } else return 0; //не должно происходить, так как одинаковые person недопустимы
        }
    }




    @Override
    public String toString() {
        return "Person " + " age=" + age + " sex=" + sex + " name=" + name;
    }

    static String getString(int n)
    {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int)(s.length() * Math.random());
            sb.append(s.charAt(index));
        }
        return sb.toString();
    }
}