package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    public static int numTV;

    public TV(Marca marca,boolean estado){
        this.marca = marca;
        this.estado = estado;

    }
  
    public static void contar(){ //meter esto en el constructor
        numTV += 1;
    }
    public static void setNumTV( int num){
        numTV = num;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setControl(Control control){
        this.control = control;
    }

    public Control getControl(){
        return this.control;
    }
    
    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void canalUp(){
        if (this.estado = true){
            if (this.canal>=1 || this.canal<120 ){
                this.canal += 1;
            }
            
        }
        
    }

    public void canalDown(){
        if (this.estado = true){
            if(this.canal>1 || this.canal<=120){
                this.canal -= 1;
            }
            
        }

    }

    public void volumenUp(){
        if (this.estado = true){
            if (this.volumen>=0 || this.volumen<7){
                this.volumen += 1;
            }
        }

    }

    public void volumenDown(){
        if (this.estado = true){
            if (this.volumen>0 || this.volumen<=7){
                this.volumen -= 1;
            }
        }

    }




}
