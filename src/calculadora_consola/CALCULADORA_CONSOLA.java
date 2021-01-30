/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_consola;
import java.util.Scanner;

public class CALCULADORA_CONSOLA {
    
    public static void main(String[] args) {
        //Entrada de datos
        Scanner entrada = new Scanner(System.in); 
        
        
        //MENU SWITCH + BUCLE WHILE
        
        boolean menu = true; //Ciclo infinito de menu
        
        while(menu == true){
            
            // Despliegue del menu
            
            System.out.println("\t\tMENU");
            
            System.out.println("\t1. SUMA.\n\t2. RESTA.\n\t3. MULTIPLICACION.\n\t4. DIVISION.");
            System.out.println("\t5. SENO.\n\t6. COSENO.\n\t7. TANGENTE.");
            System.out.println("\t8. RADICACION.\n\t9. POTENCIACION.\n\t10.IVA.\n\t11.SALIR.");
            
            //Ingreso de opcion
            
            System.out.println("Ingrese la opcion a realizar:");
            
            int opcion = entrada.nextInt();
            
            //OPCIONES
            
            switch(opcion){
                
                /////////////////////////////////////// SUMA /////////////////////////////////////////////////
                case 1:
                    System.out.println("\t-----SUMA-----");
                    
                    //SOLICITAR CANTIDAD PARA OPERACIONES MAS LARGAS
                    System.out.println("Ingrese la cantidad de NUMEROS que va a SUMAR:");
       
                    int cantidad = entrada.nextInt();

                    //ACUMULADO
                    
                     int total = 0; 

                    for(int x = 0; x < cantidad; x++){
                        
                        System.out.println("Ingrese #" + (x +1));
                        total += entrada.nextInt();
                        
                    }

                    //MOSTRAR RESULTADO
                    
                    System.out.println();
                    System.out.println("El resultado de la suma es: " + total);
                    
                         break;
                 /////////////////////////////////////// RESTA /////////////////////////////////////////////////
                case 2:
                    System.out.println("\t-----RESTA-----");
                    
                    //SOLICITAR CANTIDAD PARA OPERACIONES MAS LARGAS
                    System.out.println("Ingrese la cantidad de NUMEROS que va a RESTAR:");
       
                    cantidad = entrada.nextInt();

                    //ACUMULADO
                    
                    System.out.println("Ingrese #1");
                     total = entrada.nextInt(); 

                    for(int x = 0; x < (cantidad -1); x++){
                        
                        System.out.println("Ingrese #" + (x +2));
                        total = total - entrada.nextInt();
                        
                    }

                    //MOSTRAR RESULTADO
                    
                    System.out.println();
                    System.out.println("El resultado de la resta es: " + total);
                    
                    break;
                /////////////////////////////////////// MULTIPLICACION /////////////////////////////////////////////////
                case 3:
                    System.out.println("\t-----MULTIPLICACION-----");
                    
                    //SOLICITAR CANTIDAD PARA OPERACIONES MAS LARGAS
                    System.out.println("Ingrese la cantidad de NUMEROS que va a MULTIPLICAR:");
       
                    cantidad = entrada.nextInt();

                    //ACUMULADO
                    
                    System.out.println("Ingrese #1");
                     total = entrada.nextInt(); 

                    for(int x = 0; x < (cantidad -1); x++){
                        
                        System.out.println("Ingrese #" + (x +2));
                        total = total * entrada.nextInt();
                        
                    }

                    //MOSTRAR RESULTADO
                    
                    System.out.println();
                    System.out.println("El resultado de la multiplicacion es: " + total);
                    
                    break;
                 /////////////////////////////////////// DIVISION /////////////////////////////////////////////////
                case 4:
                    System.out.println("\t-----DIVISION-----");
                    
                    System.out.println("Ingrese los valores a dividir: a/b");
                    
                    System.out.println("Ingrese el DIVISOR/NUMERADOR:");
                     double divisor = entrada.nextDouble();
                     
                     System.out.println("Ingrese el DIVIDENDO/DENOMINADOR:");
                     double dividendo = entrada.nextDouble();
                     
                     //Validar division entre CERO
                     
                     if(dividendo == 0){
                         System.out.println("ERROR, division por CERO no definida");
                     }else{
                         System.out.println("El resultado de la operacion es:"+ (divisor/dividendo));
                     }
                     
                     break;
                /////////////////////////////////////// SENO /////////////////////////////////////////////////
                case 5:
                    System.out.println("\t-----SENO-----");
                    
                    System.out.println("Ingrese el valor al cual aplicar Sen(x) :");
                    double resultado = entrada.nextDouble();
                    
                    System.out.println("El resultado de Sen("+ resultado +") es: "+ (Math.sin(Math.toRadians(resultado)))); //Se debe convertir de grados a radianes para aplicar
                    
                    break;
                /////////////////////////////////////// COSENO /////////////////////////////////////////////////
                case 6:
                    System.out.println("\t-----COSENO-----");
                    
                    System.out.println("Ingrese el valor al cual aplicar Cos(x) :");
                    resultado = entrada.nextDouble();
                    
                    System.out.println("El resultado de Cos("+ resultado +") es: "+ (Math.cos(Math.toRadians(resultado)))); //Se debe convertir de grados a radianes para aplicar
                    
                    break;
                /////////////////////////////////////// TANGENTE /////////////////////////////////////////////////
                case 7:
                    System.out.println("\t-----TANGENTE-----");
                    
                    System.out.println("Ingrese el valor al cual aplicar Tan(x) :");
                    resultado = entrada.nextDouble();
                    
                    System.out.println("El resultado de Tan("+ resultado +") es: "+ (Math.tan(Math.toRadians(resultado)))); //Se debe convertir de grados a radianes para aplicar
                    
                    break;
                /////////////////////////////////////// RADICACION /////////////////////////////////////////////////
                case 8:
                    System.out.println("\t-----RADICACION-----");
                    
                    System.out.println("Ingrese el valor de la RAIZ:");
                    double valor = entrada.nextDouble();
                    
                    System.out.println("Ingrese valor al cual aplicar RAIZ "+ valor+ ":");
                    resultado = entrada.nextDouble();
                    
                    System.out.println("El resultado de RAIZ "+valor+" de "+resultado + " es: "+ (Math.pow(resultado, (1/valor)))); //Se puede aplicar la radicacion como una potenciacion
                    
                    break;
                 /////////////////////////////////////// POTENCIACION //////////////////////////////////////////////////
                case 9:
                    System.out.println("\t-----POTENCIACION-----");
                    
                     System.out.println("Ingrese el valor de la base X:  X^n");
                    valor = entrada.nextDouble();
                    
                    System.out.println("Ingrese valor del exponente n: X^n");
                    resultado = entrada.nextDouble();
                    
                    System.out.println("El resultado de "+ valor + "^"+resultado+" es: "+ (Math.pow(valor,resultado)));
                    
                    break;
                 ///////////////////////////////////// IVA //////////////////////////////////////////////////
                case 10:
                    System.out.println("\t-----IVA-----");
                    
                    System.out.println("Ingrese el valor al cual aplicarle IVA 19%");
                    valor = entrada.nextDouble();
                    
                    System.out.println("El IVA de $"+ valor+ " es: $"+(valor*0.19));
                    
                    
                    break;
                    
                 ///////////////////////////////////// SALIR //////////////////////////////////////////////////
                case 11:
                    System.out.println("\t-----ADIOS-----");
                    
                    menu = false;
                    
                    break;
                 //DEFAULT
                default:
                    break;
            }           
        }
    }
}