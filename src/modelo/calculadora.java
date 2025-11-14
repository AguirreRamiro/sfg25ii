package modelo;
public class calculadora {
    //Atributos de clase
    private Double numeroUno;
    private Double numeroDos;
    private Double resultado;
    //Connstructores

    public calculadora(Double numeroUno, Double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public calculadora(Double numeroUno) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroUno;
    }
    
    public calculadora() {
    }
    
    //Setters y Getters

    public Double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(Double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public Double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(Double numeroDos) {
        this.numeroDos = numeroDos;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double respuesta) {
        this.resultado = respuesta;
    }
    
    //metodos tipo

    @Override
    public String toString() {
        return "calculadora{" + "numeroUno=" + numeroUno + ", numeroDos=" + numeroDos + ", Resultado=" + resultado + '}';
    }
    
    public Double sumar(){
        resultado =  numeroUno + numeroDos;
        return resultado;
    }
    
    public Double sumar(Double numeroUno, Double numeroDos){
        resultado =  numeroUno + numeroDos;
        return resultado;
    }
    public Double sumar(Double numeroUno, Double numeroDos, Double numeroTres){
        resultado =  numeroUno + numeroDos + numeroTres;
        return resultado;
    }
    
    public Double calcularSueldo(){
        Double st = 475.00;
        return st;
    }
    
    public Double calcularSueldo(Double comision){
        Double st = 475.00 + comision;
        return st;
    }
    
    public Double calcularSueldo(Double comision, Integer numeroHijos){
        Double st = 475.00 + comision + (numeroHijos*100);
        return st;
    }
    
    public static Integer fibonacci(Integer n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }

        // Casos base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Llamada recursiva
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static long factorial(Integer n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }

//         Caso base: 0! = 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
//             Llamada recursiva 5 - 4 - 3 - 2 - 1
            return n * factorial(n - 1);
        }
    }
}
