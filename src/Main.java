import java.util.Random;

public class Main {

    public Random random= new Random();
    public int x=random.nextInt(7)+1;

    public static void main(String[] args) {
        Main d =new Main();
        d.mainStart();
    }
    public void mainStart(){
        ClassArray mas1= new ClassArray(x);
        mas1.initMass();
        try {
            mas1.checkLengthMassCh();
        }catch (lengthMAssException w){
            System.out.println("Размер массива больше "+ ClassArray.limitationMas+"х");
        }
        try {
            mas1.printSummas();
        }catch (lengthMAssException q){
            System.out.println("ошибка символа");
        }
    }
}