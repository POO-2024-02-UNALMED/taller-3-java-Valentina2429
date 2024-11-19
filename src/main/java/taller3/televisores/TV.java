package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca,boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		
		TV.numTV++;

    }
  
    public static void setNumTV(int num){
        TV.numTV = num;
    }
    public static int getNumTV(){
        return numTV;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public void setCanal(int canal){
        if (this.estado == true){
            if (canal>=1 && canal<=120){
                this.canal = canal;

            }
        }
        
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
        if (this.estado == true){
            if (volumen>=0 && volumen<=7){
                this.volumen = volumen;
            }
        }
        
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

	public void canalUp() {
		this.setCanal(this.canal + 1);
	}
	
	public void canalDown() {
		this.setCanal(this.canal - 1);
	}

	public void volumenUp() {
		this.setVolumen(this.volumen + 1);
	}
	
	public void volumenDown() {
		this.setVolumen(this.volumen - 1);
	}




}
