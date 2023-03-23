package Store;

public class BillView {
    public void printBill(String name,String id, String product, int precio, String numeroTelefono, String direccion){
        System.out.println("Detalles de la compra: ");
        System.out.println("-----------------------");
        System.out.println("Nombre del cliente: " + name);
        System.out.println("-----------------------");
        System.out.println("Id del cliente: " + id);
        System.out.println("-----------------------");
        System.out.println("Nombre del producto: " + product);
        System.out.println("-----------------------");
        System.out.println("Precio del producto: " + precio);
        System.out.println("-----------------------");
        System.out.println("Teléfono del cliente: " + numeroTelefono);
        System.out.println("-----------------------");
        System.out.println("Dirección del cliente: " + direccion);
    }
}
