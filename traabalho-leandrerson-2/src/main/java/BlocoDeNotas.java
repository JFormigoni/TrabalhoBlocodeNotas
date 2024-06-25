import java.util.ArrayList;
import java.util.List;

public class BlocoDeNotas {
    private List<Nota> notas;

    public BlocoDeNotas() {
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }

    public void removerNotaPorTitulo(String titulo) {
        notas.removeIf(nota -> nota.getTitulo().equals(titulo));
    }

    public Nota procurarNotaPorTitulo(String titulo) {
        for (Nota nota : notas) {
            if (nota.getTitulo().equals(titulo)) {
                return nota;
            }
        }
        return null;
    }

    public List<Nota> obterTodasNotas() {
        return notas;
    }

    public void exibirTodasNotas() {
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota disponível.");
        } else {
            for (Nota nota : notas) {
                System.out.println(nota);
                System.out.println("--------------");
            }
        }
    }
}