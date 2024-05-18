import java.util.ArrayList;

public class Visitas {
    public static void main(String[] args) {
        ArrayList<Integer> visitas = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            visitas.add(Integer.parseInt(args[i]));
        }
        promedio(visitas);

    }

    public static void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void promedio(ArrayList<Integer> visitas) {
        int suma = 0;
        for (int i = 0; i < visitas.size(); i++) {
            suma += visitas.get(i);
        }
        try {
            int promedio = suma / visitas.size();
            System.out.printf("Para la entrada anterior, el resultado es %d.", promedio);
        } catch (ArithmeticException e) {
            mensaje("No se puede calcular el promedio mientras las visitas está vacía.");
        }
    }
}
