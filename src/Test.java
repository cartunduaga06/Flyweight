public class Test {

    private static final String colores[] = {"Rojo", "Azul","verde", "blanco"};

    public static void main(String[] args) {

        for (int i = 0; i < 100 ; i++) {
            Circulo circulo = FlyweightFactory.ObtenerCirculo(colorALeatorio());
            circulo.setRadio(i+5);
            circulo.getTamanio("tamaño: " + i*2);
            circulo.dibujar();
        }

    }
    private static String colorALeatorio(){
        return colores[(int)(Math.random()*colores.length)];
    }
}
