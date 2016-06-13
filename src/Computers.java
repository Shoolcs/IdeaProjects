/**
 * Created by Lenovo on 26.04.2016.
 */
public class Computers {
    int idq;
    String Motherboardd;
    String videoq;
    String Processorr;
    String nnetwork;
    int HDD1GB;
    double RAMa;
    int Power1;
    boolean cda;
    String problemsa;

    Computers(int idv, String Motherboard, String video, String Processor, String network, int HDDGB, double RAM, int Power, boolean cd,String problems){
    idq = idv;
        videoq = video;
        Processorr = Processor;
        Motherboardd = Motherboard;
        nnetwork = network;
        HDD1GB = HDDGB;
        RAMa = RAM;
        Power1 = Power;
        cda = cd;
        problemsa = problems;








    }
    public String toString(){
        return "id : " + idq + "\n " + "Motherboard : " + Motherboardd + "\n" + "Video : " + videoq + "\n" + "Processor : "+Processorr + "\n" +"Network : "+ nnetwork +"\n" + "HDD : "+ HDD1GB + "\n"+"RAM : "+RAMa +"\n" +"Power: " +Power1 + "\n" + "DVD : "+ cda+"\n" +"problems : "+ problemsa +"\n" ;


    }
}
