public class Principal {
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();

        circulo.setRaio(10);
        System.out.println(circulo.calcularArea());


        Triangulo triangulo = new Triangulo();

        triangulo.setAltura(4);
        triangulo.setBase(5);
        System.out.println(triangulo.calcularArea());


        Quadrado quadrado = new Quadrado();

        quadrado.setLado(5);
        System.out.println(quadrado.calcularArea());
    }
}
