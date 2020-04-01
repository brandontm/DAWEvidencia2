package Modelos;

/**
 *
 * @author huert
 */
public class CuentaCliente {
    
    public String NumCuenta;
    public String NumCliente;    
    public String TipoCuenta;
    public double Monto;
 
    public CuentaCliente() {
      
    }
        
    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }
    
     public String getNumCliente() {
        return NumCliente;
    }
    public void setNumCliente(String NumCliente) {
        this.NumCliente = NumCliente;
    }
    
    public String getTipoCuenta() {
        return TipoCuenta;
    }
    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
     public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto= Monto;
    }
    
    public void addToMonto(double valor) {
        this.Monto = this.Monto + valor;
    }
}
