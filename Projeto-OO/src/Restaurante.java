
import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Funcionario> funcionarios;

    // Construtor do objeto
    public Restaurante() {
        this.usuarios = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    // Métodos do objeto
    public boolean cadastrarUsuario(String nome, String telefone, String email, String cpf) {
        if (this.validarCadastroUsuario(email, cpf)) {
            this.usuarios.add(new Usuario(nome, telefone, email, cpf));
            return true;
        }

        return false;
    }

    public boolean cadastrarFuncionario(String nome, String telefone, String email, String cpf, String cargo, String turno, float salario) {
        if (this.validarCadastroFuncionario(email, cpf)) {
            this.funcionarios.add(new Funcionario(nome, telefone, email, cpf, cargo, turno, salario));
            return true;
        }

        return false;
    }

    public String listarUsuarios() {
        String str = "";

        for (Usuario usuario : this.usuarios) {
            str += "\n" + usuario;
        }

        return str;
    }

    public String listarFuncionarios() {
        String str = "";

        for (Funcionario funcionario : this.funcionarios) {
            str += "\n" + funcionario;
        }

        return str;
    }

    public boolean depositar(String cpf, float valor) {
        Usuario usuario = consultarUsuario(cpf);

        if (usuario != null) {
            usuario.addCredito(valor);
            return true;
        }

        return false;
    }

    public boolean consumir(String cpf, float valor) {
        Usuario usuario = consultarUsuario(cpf);

        if (usuario != null && usuario.saldoAtual() >= valor) {
            usuario.consumir(valor);
            return true;
        }

        return false;
    }

    public String gerarExtrato(String cpf) {
        Usuario usuario = consultarUsuario(cpf);

        if (usuario != null) {
            return usuario.gerarExtrato();
        }

        return "";
    }

    // Métodos auxiliares
    private boolean validarCadastroUsuario(String email, String cpf) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getEmail().equals(email) || usuario.getCpf().equals(cpf)) {
                return false;
            }
        }

        return true;
    }

    private boolean validarCadastroFuncionario(String email, String cpf) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getEmail().equals(email) || funcionario.getCpf().equals(cpf)) {
                return false;
            }
        }

        return true;
    }

    public Usuario consultarUsuario(String cpf) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }

        return null;
    }

    public Funcionario consultarFuncionario(String cpf) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }

        return null;
    }
}
