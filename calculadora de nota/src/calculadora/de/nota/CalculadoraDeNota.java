/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.nota;

/**
 *
 * @author shing
 */
public class CalculadoraDeNota {
    public void calcular (double practicas, double parcial1, double parcial2, double parcial3, double asignaciones, double proyectoF){
        double totalParciales = parcial1 + parcial2 + parcial3;
        double calcular = practicas + totalParciales + asignaciones + proyectoF;
        if (totalParciales > 30) {
            System.out.println("***error de informacion***");
            System.out.println("los datos que colocarte en uno de los parcial");
            System.out.println("no puden ser mayor a 10pts.");
            return;
        }
        if (practicas > 20){
            System.out.println("***error de informacion***");
            System.out.println("los datos que colocarte en practicas");
            System.out.println("no puden ser mayor a 20pts.");
            
            return;
        }
        if (asignaciones > 15) {
            System.out.println("***error de informacion***");
            System.out.println("los datos que colocarte en asignaciones");
            System.out.println("no puden ser mayor a 15pts.");  
            return;
        }
        if (proyectoF > 35 ){
        System.out.println("***error de informacion***");
            System.out.println("los datos que colocarte en el proyecto final");
            System.out.println("no puden ser mayor a 35 pts.");
            return;
        }
        else{ 
            if (calcular >= 60 && calcular <= 100) {
             System.out.println("Tu calificaion final: " + calcular + "pts");
             System.out.println("APROBADO"); 
             return;
            }
        
            else if (calcular < 60 && calcular >= 0){
            System.out.println("Tu calificaion final: " + calcular + "pts");
             System.out.println("Reprobado");
             return;
            } else{
             System.out.println("***Error en Datos***");
             System.out.println("Tu calificacion es mas alta que 100 pts o menor que 0 pts");
            return;
            }
        }
    }
    
         
    
    
}
       
    
    

