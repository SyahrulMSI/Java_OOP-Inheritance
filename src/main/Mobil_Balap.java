package main;


/**
 *
 * @author Mas Syahrul
 */
public class Mobil_Balap extends Mobil{
    private int nitro;
    
    public void set_nitro(int nitro){
        this.nitro = nitro;
    }
    
    public int get_nitro(){
        return nitro;
    }
    
    public void mph(int jumlah_tuning){
        for(int tuning=0; tuning<=jumlah_tuning; tuning++){
            nitro = nitro-1;
            System.out.println("mph : " + Integer.valueOf(nitro));
        }
    }
}
