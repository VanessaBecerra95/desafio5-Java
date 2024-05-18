import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> steps = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            steps.add(Integer.parseInt(args[i]));
        }
        promedio(clearSteps(steps));

    }


    public static void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static ArrayList<Integer> clearSteps(ArrayList<Integer> filtrarLista) {
        ArrayList<Integer> steps = new ArrayList<Integer>();
        for (int i = 0; i < filtrarLista.size(); i++) {
            if (filtrarLista.get(i) > 200 && filtrarLista.get(i) < 100000) {
                steps.add(filtrarLista.get(i));
            }
        }
        return steps;
    }

    public static void promedio(ArrayList<Integer> steps) {
        int suma = 0;
        for (int i = 0; i < steps.size(); i++) {
            suma += steps.get(i);
        }
        try {
            int promedio = suma / steps.size();
            System.out.printf("Dado los pasos ingresados el promedio es de %d.", promedio);
        } catch (ArithmeticException e) {
            mensaje("No se puede calcular el promedio mientras las visitas está vacía.");
        }
    }
}
