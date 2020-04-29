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
            name = "NAME"+rnd.nextInt(10);
        }




    @Override
    public String toString() {
        return "Person " + " age=" + age + " sex=" + sex + " name='" + name;
    }
}
