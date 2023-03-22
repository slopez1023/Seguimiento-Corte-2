package SeguimientoSillas;

public class Main {
    public static void main(String[] args) {
        VictorianChair victorianChair = new VictorianChair();
        System.out.println(victorianChair.getClass().getSimpleName());
        victorianChair.hasLegs();
        victorianChair.sitOn();

        System.out.println("----------------");

        ModernChair modernChair = new ModernChair();
        System.out.println(modernChair.getClass().getSimpleName());
        modernChair.Ruedas();
        modernChair.sitOn();

        System.out.println("----------------");

        DecoArt decoArt = new DecoArt();
        System.out.println(decoArt.getClass().getSimpleName());
        decoArt.color();
        decoArt.sitOn();
    }
}
