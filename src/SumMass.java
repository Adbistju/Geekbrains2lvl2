public class SumMass {
    public  int k=0;
    public int c=0;
    public int sum(String a, int b){
        try {
            k= Integer.valueOf(a);
        }catch (NumberFormatException nfe){
            k=0;
            throw new ErrorsProgramException();
        }
        c=b+k;
        System.out.println(c);
        return c;
    }
}