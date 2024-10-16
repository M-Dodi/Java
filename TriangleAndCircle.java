public class TriangleAndCircle {

    public static void main(String[] args) {
        // Cateti del triangolo rettangolo
        double cateto1 = 45.3;
        double cateto2 = 67.2;

        // Calcolo dell'ipotenusa
        double ipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("Lunghezza dell'ipotenusa: " + ipotenusa + " metri");

        // Calcolo dell'area del triangolo
        double areaTriangolo = (cateto1 * cateto2) / 2;
        System.out.println("Area del triangolo: " + areaTriangolo + " metri quadrati");

        // Calcolo del perimetro del triangolo
        double perimetroTriangolo = cateto1 + cateto2 + ipotenusa;
        System.out.println("Perimetro del triangolo: " + perimetroTriangolo + " metri");

        // Raggio del cerchio
        double raggioCerchio = ipotenusa * 3 / 4;

        // Calcolo della circonferenza del cerchio
        double circonferenzaCerchio = 2 * Math.PI * raggioCerchio;
        System.out.println("Circonferenza del cerchio: " + circonferenzaCerchio + " metri");

        // Calcolo dell'area del cerchio
        double areaCerchio = Math.PI * Math.pow(raggioCerchio, 2);
        System.out.println("Area del cerchio: " + areaCerchio + " metri quadrati");
    }
}