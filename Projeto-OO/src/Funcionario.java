
public class Funcionario {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String cargo;
    private float salario;
    private String turno;

    //Construtor do objeto
    public Funcionario(String nome, String telefone, String email, String cpf, String cargo, String turno, float salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.cargo = cargo;
        this.turno = turno;
        this.salario = salario;

    }

    // Getters e Setters
    public String getNome() {
        return this.nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getTelefone() {
        return this.telefone;

    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }

    public String getEmail() {
        return this.email;

    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getCargo() {
        return this.cargo;

    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public String getTurno() {
        return this.turno;

    }

    public void setTurno(String turno) {
        this.turno = turno;

    }

    public float getSalario() {
        return this.salario;

    }

    public void setSalario(float salario) {
        this.salario = salario;

    }

    public String getCpf() {
        return this.cpf;

    }

    public String toString() {
        String str = "";
        str += "Nome: " + this.nome;
        str += " Telefone: " + this.telefone;
        str += " Email: " + this.email;
        str += " CPF: " + this.cpf;
        str += " Cargo: " + this.cargo;
        str += " Turno: " + this.turno;
        str += " Salario: " + this.salario;

        return str;
    }
}
