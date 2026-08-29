
public class Usuario {

    private String nome;
    private String telefone;
    private String email;
    private float creditos;
    private String cpf;
    private RegistroMovimentacao movimentacoes = new RegistroMovimentacao();

    // Construtor do objeto
    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getCpf() {
        return this.cpf;
    }

    // Métodos que pertence ao objeto
    public void addCredito(float creditos) {
        this.creditos += creditos;
        this.movimentacoes.registrar("Deposito", creditos);
    }

    public float saldoAtual() {
        return this.creditos;
    }

    public void consumir(float creditos) {
        this.creditos -= creditos;
        this.movimentacoes.registrar("Compra", creditos);
    }

    public String gerarExtrato() {
        return this.movimentacoes.listar();
    }

    // Método para retornar o estado do objeto
    public String toString() {
        String str = "";
        str += "Nome: " + this.nome;
        str += " Telefone: " + this.telefone;
        str += " Email: " + this.email;
        str += " cpf: " + this.cpf;

        return str;
    }
}
