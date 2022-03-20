/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */

public class Vivienda 
{
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    private double descuento;
    /**
    * Crear la clase public para añadir el constructor
    */
    
    /* 
    {
        setPrecio("120.000€");
        String mumHabitantes = "200.000";
        setSuperficie("200 m2");
        setParking("Si");
        setEstado("Bueno");
        setPropietario("Antonio Pérez");
        setDescuento("20%");
    }
    */        
            
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /** 
     * Añadimos la fórmula para aplicar el descuento a el precio de la vivienda
     */
    public void actualizarPrecio()
    {
        setPrecio(getPrecio() - getPrecio() * 0.05);
        setDescuento(getPrecio() * 0.20); 
    }

    /**
     * @return the precio
     */
    public double getPrecio() 
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() 
    {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) 
    {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() 
    {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) 
    {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    public boolean isParking() 
    {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    public void setParking(boolean parking) 
    {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    public String getEstado() 
    {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) 
    
    {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    public String getPropietario()
    {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) 
    {
        this.propietario = propietario;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() 
    {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) 
    {
        this.descuento = descuento;
    }

  
    }

    
