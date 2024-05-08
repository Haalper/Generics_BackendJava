
public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Corolla");
        SUV suv = new SUV("Tracker");
        Hatch hatch = new Hatch("Golf");

        ListaCarros<Carro> lista = new ListaCarros<>();
        lista.adicionarCarro(sedan);
        lista.adicionarCarro(suv);
        lista.adicionarCarro(hatch);

        lista.dirigirTodos();
    }
}
