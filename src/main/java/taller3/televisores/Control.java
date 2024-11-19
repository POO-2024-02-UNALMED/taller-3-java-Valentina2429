package taller3.televisores;

public class Control {
    TV tv;

    public void enlazar(TV tv){
        tv.control(this);
    }

    public void turnOn(){
        this.tv.turnOn();
    }

    public void turnOff(){
        this.tv.turnOff();
    }

    public void canalUp(){
        this.tv.canalUp();
    }

    public void canalDown(){
        this.tv.canalDown();
    }

    public void volumenUp(){
        this.tv.volumenUp();
    }

    public void volumenDown(){
        this.tv.volumenDown();
    }

    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }

    public void setVolumen(int volumen){
        this.tv.setVolumen(volumen);
    }



}