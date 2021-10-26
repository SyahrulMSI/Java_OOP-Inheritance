package main;


/**
 *
 * @author Mas Syahrul
 */
public class Mobil {
    private String merk;
    private int bensin;
    
    public void set_merk(String merk){ // Method setter
        this.merk = merk;
    }
    
    public String get_merk(){ // Method getter
        return merk;
    }
    
    public void set_bensin(int bensin){
        this.bensin = bensin;
    }
    
    public int get_bensin(){
        return bensin;
    }
    
    public void maju(){
        bensin = bensin - 1;
        System.out.println("Bensin " + merk + ": " + bensin);
    }
}
