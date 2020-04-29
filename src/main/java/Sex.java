import java.util.Comparator;
import java.util.Random;

public class Sex implements Comparable<Sex>{
    public final String MAN="Man";
    public final String WOMAN = "Woman";

    Random r = new Random();
    String sex;

    public Sex(){
        sex = (r.nextInt(10)<5)?MAN:WOMAN;
    }

    @Override
    public int compareTo(Sex o) {
        return (o.sex.compareTo(this.sex));
    }

    @Override
    public String toString() {
        return "-"+sex;
    }
}
