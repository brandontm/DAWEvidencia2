package Modelos;

/**
 *
 * @author huert
 */
public class CuentaCliente {
    
    public String NumCuenta;
    public String NumCliente;    
    public String TipoCuenta;
    public String Monto;
 
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
     public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto= Monto;
    }
}
