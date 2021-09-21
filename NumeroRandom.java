public class NumeroRandom {

    private static NumeroRandom nr=null;

    public static NumeroRandom getInstance(){
        if (nr==null){
            nr=new NumeroRandom();
        }
        return nr;
    }

    public int generarRandom(int maximo){
        return (int)(Math.random()*maximo+1);
    }
}
