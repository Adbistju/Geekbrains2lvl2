import java.util.Random;

public class ClassArray {
    public static int limitationMas=4;

    public  static String[][] str;
    public int summass=0;
    int x;
    public int length;

    public ClassArray(int x) {
        this.x=x;
        str = new String[x][x];
        length=str.length;
        initMass();
        printMass();
        System.out.println();
        summArr();
    }

    protected void initMass(){
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                str[i][j]=arrayValueGenerator.val();
            }
        }
        System.out.println();
    }
    protected void checkLengthMassCh(){
        try {
            checkLengthMass(str);
        } catch (ErrorsProgramException e) {
            System.out.println();
            System.out.println("Превышен размер "+limitationMas+"x"+limitationMas);
            throw new lengthMAssException("Превышен размер"+limitationMas +e  );
        } finally {
            System.out.println("Массив размером " + str.length+"x"+str.length);
        }
    }
    protected void summArr(){
        SumMass s=new SumMass();
        try{
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str.length; j++) {
                    try {
                        summass=+s.sum(str[i][j],summass);
                    } catch (ErrorsProgramException e){
                        System.out.println("В ячейке вашего массива нет числа (индексы:["+i+"]["+j+"])");
                    }
                }
            }
        }catch (MyArrayDataException q){
            System.out.println("Ошибка суммирования файлов.");
        }

    }
    void checkLengthMass(String[][]str) {
        try {
            new lengthMass().check(str);
        } catch (lengthMAssException ex) {
            throw new ErrorsProgramException("размер массива превышен на " +(str.length-limitationMas), ex);
        }
    }
    void printMass(){
        for (int i = 0; i < str.length; i++) {
            System.out.println();
            for (int j = 0; j < str.length; j++) {
                System.out.print (str[i][j]+ " ");
            }
        }
    }
    void printSummas(){
        System.out.println(summass);
    }
}
