public class operacion {
    float Numero1;
    float Numero2;

    public operacion(){
        Numero1 = 0;
        Numero2 = 0;
    }

    public operacion(float numero1, float numero2){
        Numero1 = numero1;
        Numero2 = numero2;
    }

    public float suma(){
        return Numero1 + Numero2;
    }

    public float resta(){
        return Numero1 - Numero2;
    }

    public float multiplicacion(){
        return Numero1 * Numero2;
    }

    public float dividir(){
        return Numero1 / Numero2;
    }
    
}
