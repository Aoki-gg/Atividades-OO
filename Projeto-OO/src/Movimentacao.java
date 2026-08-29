
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Movimentacao {

    private String data;
    private String hora;
    private String tipo_operacao;
    private float valor;
    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

    // Construtor do objeto
    public Movimentacao(String tipo_operacao, float valor) {
        this.data = LocalDate.now().format(formatoData);
        this.hora = LocalTime.now().format(formatoHora);
        this.tipo_operacao = tipo_operacao;
        this.valor = valor;
    }

    public String toString() {
        String str = "";

        str += this.tipo_operacao;
        str += "  " + this.valor;
        str += "  " + this.data;
        str += "  " + this.hora;

        return str;
    }
}
