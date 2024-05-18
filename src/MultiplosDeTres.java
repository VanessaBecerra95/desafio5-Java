import java.util.ArrayList;
public class MultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            numeros.add(Integer.parseInt(args[i]));
        }
        mensaje("La suma de los multiplos de 3 es " + suma(multiplosDeTres(numeros)));
        promedio(multiplosDeTres(numeros));
    }
    public static void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static ArrayList<Integer> multiplosDeTres(ArrayList<Integer> filtrarLista) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < filtrarLista.size(); i++) {
            if (filtrarLista.get(i) % 3 == 0) {
                numeros.add(filtrarLista.get(i));
            }
        }
        return numeros;
    }

    public static int suma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        return suma;
    }

    public static void promedio(ArrayList<Integer> numeros) {
        try {
            int promedio = suma(numeros) / numeros.size();
            System.out.printf("El promedio de los multiplos de 3 es %d.\n", promedio);
        } catch (ArithmeticException e) {
            mensaje("No se puede calcular el promedio mientras las visitas está vacía.");
        }
    }
}
