package SeguimientoSillas;

public class VictorianChair extends Furniture implements Legs{
    private int cantidadPatas = 4;

    @Override
    public void sitOn() {
        System.out.println("Sentado en una silla victoriana con patas");
    }
    public int getCantidadPatas(){
        return cantidadPatas;
    }

    @Override
    public int hasLegs() {
        System.out.println("La silla victoriana tiene 4 patas");
        return cantidadPatas;
    }
}
