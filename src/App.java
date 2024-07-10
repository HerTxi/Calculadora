import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float Numero1 = 0;
        float Numero2 = 0;
        int ope = 0;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer número:");
        Numero1 = sc.nextFloat();
        System.out.println("Escribe el segundo número:");
        Numero2 = sc.nextFloat();

        System.out.println("Escribe el signo de la operación a realizar (1 para suma, 2 para resta, 3 para multi, 4 para dividir):");
        ope = sc.nextInt();
        
        operacion oper = new operacion(Numero1, Numero2);
        float resul = 0;

        switch (ope) {
            case 1:
                resul = oper.suma();
                break;
            case 2:
                resul = oper.resta();
                break;
            case 3:
                resul = oper.multiplicacion();
                break;
                
            case 4:
                resul = oper.dividir();
                break;
        }
        // pruebas
        System.out.println("El resultado de la operación es: " + resul);
    }
}
