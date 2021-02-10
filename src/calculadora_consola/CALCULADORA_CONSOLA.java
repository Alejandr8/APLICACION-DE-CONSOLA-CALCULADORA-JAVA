//APLICACION DE CONSOLA: CALCULADORA

package calculadora_consola;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class CALCULADORA_CONSOLA {
    
    public static void main(String[] args) {
        //Entrada de datos
        Scanner entrada = new Scanner(System.in); 
        
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName("JavaScript");
        
        
        //MENU SWITCH + BUCLE WHILE
        
        boolean menu = true; //Ciclo infinito de menu
        String operacion1;
                
        
        try{
        
            while(menu == true){

            // Despliegue del menu
            
            System.out.println("\t\tMATH CALCULATOR");
            
            System.out.println("\t1. SUMA.\n\t2. RESTA.\n\t3. MULTIPLICACION.\n\t4. DIVISION.");
            System.out.println("\t5. SENO.\n\t6. COSENO.\n\t7. TANGENTE.");
            System.out.println("\t8. RADICACION.\n\t9. POTENCIACION.\n\t10.IVA.\n\t11.OPERACION COMPUESTA\n\t12.SALIR.");
            
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


                           total+= entrada.nextInt();;
                          

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

                    ////////////////////////////////////OPERACION COMPUESTA//////////////////    
                    case 11:
                        System.out.println("\t-----OPERACION COMPUESTA-----");
                        
                        System.out.println("OPERADORES:\n\t+   -   *   /   puede utilizar ( ) y PUNTO . para los valores continuos ");
                        System.out.println("Ingrese la operacion a realizar:");

                        operacion1 = entrada.nextLine( );

                        if((operacion1.compareTo("")==0)){
                            operacion1 = entrada.nextLine();
                        }else if((operacion1.compareTo("")!= 0)){
                            System.out.println("La entrada es: " + operacion1);
                        }

                        
                        
                        
                        
                         try{
                            String resultado2 = se.eval(operacion1).toString();
                            System.out.println("El resultado de la operacion es: "+resultado2);

                      }catch(Exception e){
                             System.out.println("ERROR");
                      }   


                        break;
                     ///////////////////////////////////// SALIR //////////////////////////////////////////////////
                    case 12:
                        System.out.println("\t-----ADIOS-----");

                        menu = false;

                        break;
                     //DEFAULT
                    default:
                        break;
                }           
            }
            
        }catch(Exception e){
         
              System.out.println("OPERACION NO VALIDA");  //En caso de obtener algun error
                            
             CORRECCIONCALCULADORACONSOLA.main(null);
       }
    }
}
