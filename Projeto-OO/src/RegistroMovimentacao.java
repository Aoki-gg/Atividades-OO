
import java.util.ArrayList;

public class RegistroMovimentacao {

    private ArrayList<Movimentacao> movimentacoes;

    // Construtor do objeto
    public RegistroMovimentacao() {
        this.movimentacoes = new ArrayList<>();
    }

    // Registro de nova movimentação
    public void registrar(String tipoOperação, float valor) {
        this.movimentacoes.add(new Movimentacao(tipoOperação, valor));

    }

    // Criar lista de movimentações
    public String listar() {
        String str = "";
        for (Movimentacao movimentacao : this.movimentacoes) {
            str += "\n" + movimentacao;
        }

        return str;
    }

}
