public class Estacion {
    public static void main(String args[]) {
        var estacion = "AÑO NUEVO" ;
    
    switch(estacion) {
        case "VERANO":
            System.out.println("es verano");
            
        case "INVIERNO":
                System.out.println("es invierno");
                
        case "OTOÑO":
                    System.out.println("es otoño");
                    break;

        case "PRIMAVERA": 
            System.out.println("es primevera");
            
                    
                default:
                System.out.println(estacion);
     }
           
       }

}