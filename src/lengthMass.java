public class lengthMass {

    public boolean check(String [][] str) {
        if (str.length > ClassArray.limitationMas) {
            throw new lengthMAssException("Размер массива больше 4x4: " + str.length+" x "+str.length);
        }
        return true;
    }
}