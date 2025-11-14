/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import db.conectar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class erroresExcepciones {

    public static void ejemploIOException() {
        String rutaArchivo = "D:\\datos.txt"; // Archivo que se intentará leer

        try {
            // Intentar abrir y leer el archivo
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            System.out.println("Contenido del archivo:");

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close(); // Cerrar el lector después de usarlo
        } catch (IOException e) {
            // Se captura la excepción si ocurre un error de E/S
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }

    public static void ejemploFileNotFoundException() {
        String rutaArchivo = "archivo_inexistente.txt"; // Archivo que no existe
        //String rutaArchivo = "D:\\datos.txt"; // Archivo que no existe

        try {
            // Intentar abrir el archivo
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();
        } catch (FileNotFoundException e) {
            // Se captura la excepción si el archivo no se encuentra
            System.err.println("Error: No se encontró el archivo especificado.");
            System.err.println("Detalles técnicos: " + e.getMessage());
        }

        System.out.println("Ejecución finalizada.");
    }

    public static void ejemploParseException() {
        // Formato esperado: día/mes/año
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaTexto = "2025-10-21"; // formato incorrecto (usa '-' en vez de '/')
        //String fechaTexto = "2025/10/21";

        try {
            // Intentar convertir el texto a una fecha
            Date fecha = formatoFecha.parse(fechaTexto);
            System.out.println("Fecha convertida correctamente: " + fecha);
        } catch (ParseException e) {
            // Se captura la excepción si el formato no coincide
            System.err.println("Error: la fecha no tiene el formato esperado (dd/MM/yyyy).");
            System.err.println("Detalles técnicos: " + e.getMessage());
        }
        System.out.println("Ejecución finalizada.");
    }

    public static void ejemploSQLException() {
        // Datos de conexión (estos valores son de ejemplo)
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultados = null;

        try {
            // Intentar conectar a la base de datos
            conexion = conectar.getConexion();
            System.out.println("Conexión establecida correctamente.");

            // Crear una sentencia SQL incorrecta (provocará SQLException)
            String sql = "SELECT * FROM empleados"; // Error: SELEC en lugar de SELECT
            sentencia = conexion.createStatement();
            resultados = sentencia.executeQuery(sql);

            while (resultados.next()) {
                System.out.println("Empleado: " + resultados.getString("empnombre"));
            }
        } catch (SQLException e) {
            // Se captura cualquier error SQL
            System.err.println("Ocurrió un error al realizar la operación en la base de datos.");
            System.err.println("Mensaje: " + e.getMessage());
            System.err.println("Código de error SQL: " + e.getErrorCode());
            System.err.println("Estado SQL: " + e.getSQLState());
        } finally {
            // Cerrar recursos
            try {
                if (resultados != null) {
                    resultados.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
                System.out.println("Recursos cerrados correctamente.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        System.out.println("Ejecución finalizada.");
    }

    public static void ejemploRuntimeException() {
        try {
            int numerador = 10;
            int denominador = 0; // Causa del error

            // Esto lanzará una ArithmeticException, que es una subclase de RuntimeException
            int resultado = dividir(numerador, denominador);

            System.out.println("Resultado: " + resultado);
        } catch (RuntimeException e) {
            // Captura de cualquier excepción en tiempo de ejecución
            System.err.println("Error: Se produjo una excepción en tiempo de ejecución.");
            System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
            System.err.println("Detalles: " + e.getMessage());
        }

        System.out.println("Ejecución finalizada.");
    }

    public static int dividir(int numerador, int denominador) {
        // Si el denominador es cero, lanzamos una RuntimeException personalizada
        if (denominador == 0) {
            throw new RuntimeException("No se puede dividir entre cero.");
        }
        return numerador / denominador;

    }

    public static void ejemploNullPointerException() {
        try {
            // Declaramos una cadena sin inicializar
            //String texto = null;
            String texto = null;

            // Intentamos acceder a un método del objeto nulo
            int longitud = texto.length(); // Provoca NullPointerException

            System.out.println("Longitud del texto: " + longitud);
        } catch (NullPointerException e) {
            // Captura del error cuando se accede a un objeto nulo
            System.err.println("Error: Se intentó acceder a un objeto nulo.");
            System.err.println("Detalles: " + e.getMessage());
        }

        System.out.println("Ejecución finalizada.");
    }

    public static void ejemploArrayIndexOutOfBoundsException() {
        try {
            // Declaramos un arreglo con 3 elementos
            int[] numeros = {7, 2, 9, 10, 15};

            System.out.println("Accediendo al cuarto elemento...");

            // Intentamos acceder a una posición inexistente (índice 3)
            int valor = numeros[3]; // Índices válidos: 0, 1, 2

            System.out.println("Valor obtenido: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura de la excepción cuando el índice está fuera de rango
            System.err.println("Error: Se intentó acceder a una posición fuera del rango del arreglo.");
            System.err.println("Detalles: " + e.getMessage());
        }

        System.out.println("Ejecución finalizada.");
    }

    public static void ejemploArithmeticException() throws MiExcepcionPersonalizada{
        try {
            int numerador = 10;
            int denominador = 0; // Provocará el error

            System.out.println("Intentando dividir " + numerador + " entre " + denominador + "...");

            if (denominador == 0) {
                throw new MiExcepcionPersonalizada("No se puede dividir entre cero.%%%%%%%%%%%%%5");
            }
            int resultado = numerador / denominador; // Lanza ArithmeticException

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Captura la excepción aritmética
            System.err.println("Error: No se puede dividir entre cero.");
            System.err.println("Detalles: " + e.getMessage());
        }

        System.out.println("Ejecución finalizada.");
    }
}
