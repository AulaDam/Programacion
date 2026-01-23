package Empresa;
import java.util.Scanner;
import java.util.ArrayList;

public class Gestor {
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Factura> facturas = new ArrayList<>();
    
    
    public void mostrarMenu() {
        
        int opcion = 0;
        
        do {
            System.out.println("[1] Insertar factura");
            System.out.println("[2] Obtener importe total de las facturas almacenadas");
            System.out.println("[3] Listado de facturas ordenado por codigos");
            System.out.println("[4] Dado un determinado codigo de facturam visualizar los datos de la factura en pantalla");
            System.out.println("[5] Listado de todos los articulos de un determinado proovedor");
            System.out.println("[6] Borrar una determinada faactura");
            System.out.println("[7] Listado de facturas ordenando decrecientemente por importe");
            System.out.println("[8] Listado de todas las facturas que contienen un determinado articulo");
            System.out.println("[9] Listado de facturas ordenhado por el numero de articulos que contienen");
            System.out.println("[10] Salir");
            System.out.print("Opcion: ");
            
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    insertarFactura();
                    break;
                case 2:
                    obtenerImporteTotalDeFacturas();
                    break;
                case 3:    
            }
            
            
            
            
        } while (opcion != 10);
        
    }
    
    //Insertar factura
    public void insertarFactura() {
        
        //Datos factura
        System.out.println("DATOS FACTURA: ");
        
        System.out.print("\n[*] Codigo: ");
        int codigo = scanner.nextInt();
        
        System.out.print("[*] Proovedor: ");
        String proovedor = scanner.nextLine();
        
        Factura f = new Factura(codigo, proovedor);
        facturas.add(f);
        
        System.out.print("[*] Numero de articulos: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        for (int i=0; i<cantidad; i++) {
            //Datos articulo
            System.out.println("\nDATOS ARTICULO " + (i+1));
            
            int codigoArticulo;
            do {
                
                System.out.print("[*] Codigo: ");
                codigoArticulo = scanner.nextInt();
                scanner.nextLine();
                
                if (codigoArticulo<1 || codigoArticulo>999) {
                    System.out.println("[-] El codigo debe estar ente 1 y 999");
                }
            
            } while (codigoArticulo < 1 || codigoArticulo > 999);
            
            System.out.print("[*] Nombre: ");
            String nombreArticulo = scanner.nextLine();
            
            double precioArticulo;
            do {
                
                System.out.print("[*] Precio: ");
                precioArticulo = scanner.nextDouble();
                
                if (precioArticulo < 0) {
                    System.out.println("[-] El precio no puede ser menor a 0");
                }
                
            } while (precioArticulo<0);
            
            //Agrega el articulo al arraylist de factura con su metodo
            f.agregarArticulo(codigoArticulo, nombreArticulo, precioArticulo);
        
        }
        
        System.out.println("[-] Factura de codigo " + codigo + " creada");
        
    }
    
    //Obtener importe total de las facturas almacenadas
    public void obtenerImporteTotalDeFacturas() {
        
        for (Factura f : facturas) {
            System.out.print("[-] Importe factura [" + f.getCodigo() + "] : ");
            System.out.println(f.obtenerImporteTotal());
        }
         
        
    }
    
    //Listado de facturas ordenado por codigos
    public void listarFacturasPorCodigo() {

    if (facturas.isEmpty()) {
        System.out.println("No hay facturas almacenadas.");
        return;
    }

    // ---- ORDENAR MANUALMENTE (BURBUJA) ----
    for (int i = 0; i < facturas.size() - 1; i++) {
        for (int j = 0; j < facturas.size() - 1 - i; j++) {

            // Si el código de la factura j es mayor que el de j+1, se intercambian
            if (facturas.get(j).getCodigo() > facturas.get(j + 1).getCodigo()) {
                Factura temp = facturas.get(j);
                facturas.set(j, facturas.get(j + 1));
                facturas.set(j + 1, temp);
            }
        }
    }

    // ---- MOSTRAR LISTADO ----
    System.out.println("\n--- LISTADO DE FACTURAS POR CÓDIGO ---");
    for (Factura f : facturas) {
        System.out.println("Código: " + f.getCodigo() +
                           " | Proveedor: " + f.getProovedor() +
                           " | Importe: " + f.getImporteTotal());
    }
}

    //Dado un determinado codigo de facturam visualizar los datos de la factura en pantalla
    public void visualizarDatosCodigo() {
        
        System.out.println("[*] Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        
        for (Factura f : facturas) {
            if (codigo == f.getCodigo()) {
                System.out.println("");
            }
        }
        
    }
    
    public void listarFacturasPorImporteDesc() {

    if (facturas.isEmpty()) {
        System.out.println("No hay facturas almacenadas.");
        return;
    }

    // ---- ORDENAR MANUALMENTE (BURBUJA) ----
    for (int i = 0; i < facturas.size() - 1; i++) {
        for (int j = 0; j < facturas.size() - 1 - i; j++) {

            // Si el importe de la factura j es MENOR que el de j+1 → intercambiar
            if (facturas.get(j).getImporteTotal() < facturas.get(j + 1).getImporteTotal()) {

                Factura temp = facturas.get(j);
                facturas.set(j, facturas.get(j + 1));
                facturas.set(j + 1, temp);
            }
        }
    }

    // ---- MOSTRAR LISTADO ----
    System.out.println("\n--- LISTADO DE FACTURAS POR IMPORTE (DESC) ---");
    for (Factura f : facturas) {
        System.out.println("Código: " + f.getCodigo() +
                           " | Proveedor: " + f.getProovedor() +
                           " | Importe: " + f.getImporteTotal());
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
