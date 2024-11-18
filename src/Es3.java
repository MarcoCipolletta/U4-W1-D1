public class Es3 {

    double perimetroRettangolo(double a, double b) {
        return (a * 2) + (b * 2);
    }

    byte pariDispari(int number) {
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    double perimetroTriangolo(double latoA, double latoB, double latoC) {
        double semiperimetro = (latoA + latoB * latoC) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - latoA) * (semiperimetro - latoB) * (semiperimetro - latoC));
    }
}
