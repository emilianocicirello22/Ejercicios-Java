/*36.	Una gran cadena de electrodoméstico recibe mensualmente un informe consolidado de todas sus sucursales  conteniendo la siguiente información:
•	Código de sucursal (alfabético 3 caracteres) 
•	Producto vendido (alfabético 5 caracteres)
•	Cantidad vendida (numérico entero)

El listado se encuentra ordenado por código de sucursal, producto y cantidad vendida.

Se pide informar:
	Cantidad total vendida por cada sucursal Respetando la siguiente leyenda “La sucursal XXX vendióyyyyyy productos”
	Sucursal con la mejor venta, se debe respetar la siguiente leyenda: “La sucursal con mejor venta fue XXX y vendióyyyyy  productos”
 */
package ejercicios.java;

import java.util.Scanner;

public class EjerciciosJava {

    public static void main(String[] args) {

        String codigoSucursal = "";
        String productoVendido = "";
        int cantidadVendida = 0;
        String codigoSucAux = "";
        int cantVsucursal = 0;
        String sucMasVentas = "";

        Scanner t1 = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);

        System.out.println("Ingrese codigo de sucursal");
        codigoSucursal = t1.nextLine();
        codigoSucAux = codigoSucursal;

        while (!codigoSucursal.equalsIgnoreCase("Y")) {
            while (codigoSucursal.equalsIgnoreCase(codigoSucAux)) {

                System.out.println("Ingrese Producto");
                productoVendido = t1.nextLine();

                System.out.println("Ingrese cantidad vendida");
                cantidadVendida += t2.nextInt();
               
                System.out.println("Ingrese codigo de sucursal Para finalizar ingrese Y");
                codigoSucursal = t1.nextLine();
            }

            System.out.println("La Sucursal: " + codigoSucAux + " Vendio " + cantidadVendida + " Productos");

            if (cantVsucursal == 0) {

                sucMasVentas = codigoSucAux;
                cantVsucursal = cantidadVendida;

            } else {
                if (cantVsucursal < cantidadVendida) {

                    sucMasVentas = codigoSucAux;
                    cantVsucursal = cantidadVendida;
                }
            }
            codigoSucAux = codigoSucursal;
            cantidadVendida = 0;

        }
        System.out.println("La sucursal con mejor venta fue " + sucMasVentas + " y vendió " + cantVsucursal + " productos");
    }

}
