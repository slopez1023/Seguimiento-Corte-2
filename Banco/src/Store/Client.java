package Store;

public class Client {
    private String numeroTelefono;
    private String direccion;

   public Client (String numeroTelefono, String direccion){
       this.numeroTelefono = numeroTelefono;
       this.direccion = direccion;
   }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
