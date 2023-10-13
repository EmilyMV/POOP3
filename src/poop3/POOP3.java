
package poop3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author EIMV
 */
public class POOP3 {

    public static void main(String[] args) {
        System.out.println("************* arreglos **************");
        int []nums;
        int[] nums1;
        int [] nums2;
        int nums3[];

        int[] num4 = {1,2,3,4,5};

        System.out.println("************* for **************");
        for (int i = 0; i < num4.length; i+=2) {
            int o = num4[i];
            System.out.println(o);
        }

        System.out.println("************* for-each **************");
        for (int o : num4) {
            System.out.println(o);
        }

        System.out.println("************* concatenar **************");

        String s = new String("Hola Mundo");
        String s1 = "Hola mundo 2";
        System.out.println(s);
        System.out.println(s1);

        String nombre = "Antonio";
        String apellido = "Ayala";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        System.out.println("************* operador punto **************");

        System.out.println("arreglo con elementos: " + num4.length);
        System.out.println("elementos de nombre: " + nombre.length());
        System.out.println(nombreCompleto.toUpperCase());

        System.out.println("************* wrappers y autoboxing **************");
        Integer k = new Integer(50);
        Integer l = 22;
        int r = k;
        String s3 = k.toString();
        System.out.println(s3);
        String s4 = r + "";
        System.out.println(s4);

        System.out.println("************* Colecciones **************");
        System.out.println("************* arrayList **************");

        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(66);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(1));
        miArrayList.add(0, 20);
        System.out.println("***");
        for (Integer e : miArrayList) {
            System.out.println(e);
        }
        System.out.println("***");
        miArrayList.add(2, 77);
        for (Integer e : miArrayList) {
            System.out.println(e);
        }

        System.out.println("************* HashTable **************");
        Hashtable<String,Integer> miTabla = new Hashtable<String,Integer>();
        miTabla.put("uno", 1);
        miTabla.put("Antonio", 557966332);
        miTabla.put("Josefina", 552200569);
        System.out.println("Elementos de tabla: "+ miTabla.size());

        for (Integer valor : miTabla.values()) {
            System.out.println(valor);
        }
        for (String clave : miTabla.keySet()) {
            System.out.println(clave);
        }

        System.out.println("************* Enumeracion **************");
        String llave;
        Integer valor;
        Enumeration<String> llaves = miTabla.keys();
        while(llaves.hasMoreElements()){
            llave = llaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println("Llave: "+llave+" Valor: "+valor);
        }

        System.out.println("************* Math **************");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));

        System.out.println("************* Date **************");
        Date hoy = new Date();
        System.out.println(hoy);

        System.out.println("************* Calendario **************");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);

        System.out.println("************* Formato de date **************");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));

        System.out.println("************* Formato de calendar **************");

        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
            fechaActual += (calendarioHoy.get(Calendar.MONTH)+ 1 +" de ");
            fechaActual += calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
        
        /*----EJERCICIOS----*/
        System.out.println("************* Ejercicios **************");
        System.out.println("----- Primer ejercicio -----");
        Hashtable<Integer,String> miTabla2 = new Hashtable<>();
        miTabla2.put(1,"Luis" );
        miTabla2.put(2, "Emilio");
        miTabla2.put(3,"Jorge");
        miTabla2.put(4, "Alma");
        miTabla2.put(5,"Pedro");
        System.out.println("Elementos de tabla: "+ miTabla2.size());

        miTabla2.forEach((clave, valorTabla)->{
            System.out.println("Clave: " + clave + ", Valor: " + valorTabla);
        });
        
        System.out.println("----- Segundo ejercicio -----");
        Hashtable<String, Calendar> agenda2 = new Hashtable<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Agregar registros a la agenda
        agregarRegistro(agenda2, "Luis", 10, 5, 1990);
        agregarRegistro(agenda2, "Jorge", 15, 8, 1985);
        agregarRegistro(agenda2, "Alejandra", 25, 3, 2000);
        agregarRegistro(agenda2, "Karen", 5, 12, 1978);
        agregarRegistro(agenda2, "Lesly", 20, 9, 1995);

        // Imprimir todos los elementos en la agenda
        for (String letras : agenda2.keySet()) {
            Calendar cumpleaños = agenda2.get(letras);
            String fecha = dateFormat.format(cumpleaños.getTime());
            System.out.println(letras + ": " + fecha);
        }
        
    }
    
    public static void agregarRegistro(Hashtable<String, Calendar> agenda2, 
        String letras, int dia, int mes, int año) {
        Calendar fechaCumpleaños = Calendar.getInstance();
        fechaCumpleaños.set(Calendar.DAY_OF_MONTH, dia);
        fechaCumpleaños.set(Calendar.MONTH, mes - 1); // Meses en Calendar van de 0 a 11
        fechaCumpleaños.set(Calendar.YEAR, año);

        agenda2.put(letras, fechaCumpleaños);
    }
    
}
    
