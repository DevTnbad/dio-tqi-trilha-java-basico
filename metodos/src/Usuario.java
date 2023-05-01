

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("######### Menu Status da TV #########");
        System.out.println("Status Ligada: " + smartTv.ligada);
        System.out.println("Status Canal: " + smartTv.canal);
        System.out.println("Status Volume: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Status Ligada: " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Status Volume: " + smartTv.volume);
        
        smartTv.aumentarCanal();
        System.out.println("Status Canal: " + smartTv.canal);
        smartTv.mudarCanal(57);
        System.out.println("Status Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("######### Menu Status da TV #########");
        System.out.println("Status Ligada: " + smartTv.ligada);
        System.out.println("Status Canal: " + smartTv.canal);
        System.out.println("Status Volume: " + smartTv.volume);
        
    }
}
