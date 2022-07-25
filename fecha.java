import java.time.LocalDateTime; // Importando la fecha
import java.time.format.DateTimeFormatter; // Importando el formato de dia y hora

public class fecha {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Antes del formato: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Despues del formato: " + formattedDate);   
    }
}
