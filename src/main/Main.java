package main;




/**
 *
 * @author Mas Syahrul
 */
public class Main {
    public static void main(String args[]){
        Mobil sedan = new Mobil(); 
        Mobil jeep = new Mobil(); 
        Tank panter = new Tank();
        Mobil_Balap civic = new Mobil_Balap(); 
        
        sedan.set_bensin(100);
        sedan.set_merk("suzuki");
        
        jeep.set_bensin(300);
        jeep.set_merk("mobil jeep");
        
//        System.out.println(sedan.get_merk());
//        System.out.println(jeep.get_merk());

        panter.set_bensin(1000);
        panter.set_merk("black panter");
        panter.maju();
        
        panter.set_peluru(10);
        panter.tembak(5);
        
        civic.set_nitro(420);
        civic.mph(120);
    }
}
