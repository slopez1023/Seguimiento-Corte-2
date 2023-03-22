package SeguimientoSillas;

public class ModernChair extends Furniture implements hasWheels {
    private int cantidadRuedas = 5;

    @Override
    public void sitOn() {
        System.out.println("Sentado en una silla moderna con ruedas");
    }

    @Override
    public int Ruedas() {
        System.out.println("La silla moderna tiene 5 ruedas");
        return cantidadRuedas;
    }
}
