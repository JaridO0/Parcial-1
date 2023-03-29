import java.util.Scanner; 

public class Parcial { 
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        
        double cantidad_boletas, total, precioBase=0, aumentoHoraPico=0, descuentoHora=0, recargo=0;        
        String tipo_sala; 
        boolean hora_pico, pago_tarjeta_cine, reserva ; 
        
        System.out.println("Tarifa Basica: "); 
        System.out.println("Dinamix - 18.800 Pesos"); 
        System.out.println("3D - 15.500 Pesos"); 
        System.out.println("2D - 11.300 Pesos"); 
        
        System.out.print("Cantidad de boletas: "); 
        cantidad_boletas = sc.nextInt(); 
        
        System.out.print("Tipo de sala: "); 
        tipo_sala = sc.next().toUpperCase(); 
        
        System.out.println("Viene en hora Pico?: True/False "); 
        hora_pico = sc.nextBoolean(); 
        
        System.out.println("Paga con tarjeta Cinema?: True/False "); 
        pago_tarjeta_cine = sc.nextBoolean(); 
        
        System.out.println("Tiene reserva?: True/False "); 
        reserva = sc.nextBoolean(); 
        
        switch(tipo_sala) { 
            
            case "DINAMIX": precioBase = 18800; aumentoHoraPico = 0.50; break;
                
            case "3D": precioBase = 15500; aumentoHoraPico = 0.25; break;
                
            case "2D": precioBase = 11300; aumentoHoraPico = 0.25; break;
                
        } 
        
        if(hora_pico==false){             
            recargo = precioBase * aumentoHoraPico;
        } 
        else{ 
            descuentoHora += 0.10; 
            if(cantidad_boletas >= 3) { 
            precioBase = precioBase - (cantidad_boletas * 500);
            }    
        }
        
        if (pago_tarjeta_cine==true) {
            precioBase = precioBase - (precioBase * 0.05);   
        } 
        
        if(reserva==true){ 
            precioBase = precioBase + (2000 * cantidad_boletas); 
        } 
        
        total = (precioBase + recargo) * cantidad_boletas;
        
        
        System.out.print("total: "); 
        System.out.print(total); 
        sc.close();
    }
}