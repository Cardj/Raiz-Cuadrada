public class Raices {
    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }

    public void obtenerRaiz() {
        double discriminante = getDiscriminante();
        if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Única raíz: " + raiz);
        } else {
            System.out.println("No tiene una única raíz.");
        }
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }

    public static void main(String[] args) {
        double coef_a = 4.0; // Ingresar el valor de a
        double coef_b = -3.0; // Ingresar el valor de b
        double coef_c = 6.0; // Ingresar el valor de c

        Raices ecuacion = new Raices(coef_a, coef_b, coef_c);
        ecuacion.calcular();
    }
}
