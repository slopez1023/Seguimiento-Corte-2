package SeguimientoSillas;

public class DecoArt extends Furniture implements Color{
    private String figuraGeometrica;

    @Override
    public void sitOn() {
        System.out.println("Sentado en una silla arte deco con figuras geométricas");
    }

    public String getFiguraGeometrica() {
        return figuraGeometrica;
    }

    @Override
    public void color() {
        System.out.println("La silla arte deco es de color negro");
    }
}
