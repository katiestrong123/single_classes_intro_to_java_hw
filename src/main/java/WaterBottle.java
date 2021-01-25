public class WaterBottle {

    private int volume;
    private int sip;

    public WaterBottle(int volume, int sip){
        this.volume = volume;
        this.sip = sip;
    }

    public int getVolume(){
        return this.volume;
    }
//
    public int drink(){
        return volume - sip;
    }

    public int thurssty(){
        volume = 0;
        return volume;
    }

    public int refill(){
        volume = 100;
        return volume;
    }
}