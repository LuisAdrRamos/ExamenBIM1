package BusesBuho;

public class s_vip extends t_vip{
    cliente pasajero1;

    public s_vip(cliente pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public s_vip() {
    }

    public void serviciosVIP() {
        System.out.println("Servicios VIP");
        System.out.println("Usted dispone de Television e internet incluido con su ticket");
        System.out.println("Usted dispone de 2 espacios para 2 maletas");
        System.out.println("Puede añadir un espacio extra para otra maleta por un cargo adicional");
        
    }
}