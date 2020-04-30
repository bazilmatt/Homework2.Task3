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
            name = RandomString.getAlphaNumericString(rnd.nextInt(1)+1);
        }

    @Override
    public String toString() {
        return "Person " + " age=" + age + " sex=" + sex + " name=" + name;
    }
}
