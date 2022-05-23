public class Circulo {

    public String color;
    public double radio;
    public  String tamanio;

    public Circulo(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTamanio(String s) {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void dibujar(){
        System.out.println("dibujamos objeto color :" + color + " radio: " + radio);
    }
}
