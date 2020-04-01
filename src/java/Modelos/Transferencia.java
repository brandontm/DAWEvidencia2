package Modelos;

/**
 *
 * @author Brandon
 */
public class Transferencia {
    private String numeroCuentaOrigen;
    private String numeroCuentaDestino;
    private double cantidad;
    
    public Transferencia(String origen, String destino, double cantidad) {
        this.numeroCuentaOrigen = origen;
        this.numeroCuentaDestino = destino;
        this.cantidad = cantidad;
    }

    /**
     * @return the numeroCuentaOrigen
     */
    public String getNumeroCuentaOrigen() {
        return numeroCuentaOrigen;
    }

    /**
     * @param numeroCuentaOrigen the numeroCuentaOrigen to set
     */
    public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
        this.numeroCuentaOrigen = numeroCuentaOrigen;
    }

    /**
     * @return the numeroCuentaDestino
     */
    public String getNumeroCuentaDestino() {
        return numeroCuentaDestino;
    }

    /**
     * @param numeroCuentaDestino the numeroCuentaDestino to set
     */
    public void setNumeroCuentaDestino(String numeroCuentaDestino) {
        this.numeroCuentaDestino = numeroCuentaDestino;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
