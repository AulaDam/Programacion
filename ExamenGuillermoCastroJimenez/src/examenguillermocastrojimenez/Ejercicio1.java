package examenguillermocastrojimenez;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] pedidos = new int[10];
        
        reiniciarPedidos(pedidos);
        
        int opcion;
        
        do {
            
            System.out.println("");
            System.out.println("====MENU====");
            System.out.println("[1] Insertar pedido"); 
            System.out.println("[2] Servir el siguiente pedido"); 
            System.out.println("[3] Mostrar el estado de la cola"); 
            System.out.println("[4] Buscar un pedido por su ID");
            System.out.println("[5] Salir");
            System.out.println("");
            
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:{
                    
                    //Insertar pedido
                    System.out.print("[*] Numero pedido: ");
                    int numeroPedido = scanner.nextInt();
                    insertarPedido(pedidos, numeroPedido);
                    break;
                }
                
                case 2:{
                    
                    //Sirve pedido
                    servirPedido(pedidos);
                    System.out.println("[*] Pedido servido");
                    break;
                }
                
                case 3: {
                    mostrarPedidos(pedidos);
                    break;
                }
                    
                case 4: {
                    int idPedido;
                    System.out.print("[*] ID pedido para mostrar del 1 al 10: ");
                    idPedido = scanner.nextInt();
                    buscarPedido(pedidos, idPedido);
                    break;
                }   
                    
                default: {
                    System.out.println("");
                    break;
                }
                    
            }
            
            
            
            
        } while (opcion != 5);
        
        
        
        
        
        
    }
    
    static void mostrarPedidos(int[] pedidos) {
        for (int i=0; i<pedidos.length; i++) {
            System.out.print(pedidos[i] + " ");
        }
        
    }
    
    static void reiniciarPedidos(int[] pedidos) {
        
        for (int i=0; i<pedidos.length; i++) {
            pedidos[i] = 0;
        }
        
    }
    
    static void insertarPedido(int[] pedidos, int numeroPedido) { //OPCION1
        
        boolean insertado = false; 
        int posicion = 0;
        
        while (insertado == false) {
            
            if (pedidos[posicion] == 0) {
                pedidos[posicion] = numeroPedido;
                insertado = true;
            }
            posicion++;
            
        }
        
    }
    
    static void servirPedido(int[] pedidos) { //OPCION2
        //Servir primer pedido no vacio
        
        boolean servido = false;
        int posicion = 0;
        
        while (servido == false) {
           
            if(pedidos[posicion] != 0) {
                pedidos[posicion] = 0;
                servido = true;
                
                for(int i=0; i<pedidos.length; i++) { //Desplaza pedidos

                    while ((1+i) < 10) {
                        pedidos[i] = pedidos[1+i];
                        
                    }
                    
                }
            }
            
            posicion++;
           
        }
        
    }
    
    static void buscarPedido(int[] pedidos, int id) {
        
        System.out.print("Pedido ID " + id + ": " + pedidos[id-1]);
        System.out.println("");
        
    }
    
}
