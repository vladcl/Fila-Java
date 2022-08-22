public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.adicionar("Beatriz");
        fila.adicionar("Margarida");
        fila.adicionar("Vlad");
        fila.adicionar("Marcelo");
        fila.adicionar("Hosana");

        System.out.println("A primeira da fila e: " + fila.get());
        fila.remover();
        System.out.println("Agora a primeira da fila e: " + fila.get());
        fila.remover();
        System.out.println("Agora o primeiro da fila e: " + fila.get());
    }
}
