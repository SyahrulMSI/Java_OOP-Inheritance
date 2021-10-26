
package main;

/**
 *
 * @author Mas Syahrul
 */
public class Tank extends Mobil{
    private int peluru;
    
    public void set_peluru(int peluru){
        this.peluru = peluru;
    }
    
    public int get_peluru(){
        return peluru;
    }
    
    public void tembak(int jumlah_tembakan){
        for(int tembakan=0; tembakan<=jumlah_tembakan; tembakan++){
            peluru = peluru-1;
            System.out.println("Dor! Sisa: " + String.valueOf(peluru));
        }
    }
}
