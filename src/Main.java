public class Main {
    public static void main(String[] args) {

        CommitCamilo camilo = new CommitCamilo("Juan Camilo Silva Zabala", 20, "Estudiante MINTIC 2022");
        camilo.mensajeBienvenida();

        CommitOscar oscarAlvarez = new CommitOscar("",0,"",0);
        oscarAlvarez.setDireccion("avenida siempre viva 742");
        oscarAlvarez.setMetros(89);
        oscarAlvarez.setHabitaciones(4);
        oscarAlvarez.setPropietario("homero simpson");
    }
}