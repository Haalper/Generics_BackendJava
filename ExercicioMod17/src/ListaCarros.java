import java.util.ArrayList;
import java.util.List;

class ListaCarros<T extends Carro> {
    private List<T> carros;

    public ListaCarros() {

        carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void dirigirTodos() {
        for (T carro : carros) {
            carro.dirigir();
        }
    }
}
