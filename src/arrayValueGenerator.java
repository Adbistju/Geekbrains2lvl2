import java.util.Random;

public class arrayValueGenerator {

    public static Random random= new Random();
    public String[] prase;

    public static String val(){

        int bool=random.nextInt(3);
        switch (bool) {
            case 0:
            case 1:
                int p = random.nextInt(9);
                String g = "" + p;
                return g;
            case 2:
                int rand = random.nextInt(127) + 1;//127
                char s = (char) rand;
                String l = "" + s;
                return l;
        }
        return null;
    }
}
