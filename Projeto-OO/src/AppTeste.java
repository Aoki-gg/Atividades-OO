
public class AppTeste {

    public static void main(String[] Args) {

        CadastrarFuncionario();

        CadastrarFuncionarioMesmoCpf();

        cadastrarFuncionarioMesmoEmail();

        testListarFuncionario();

        // CadastrarUsuario();
        // testeGerarExtrato();
        // CadastrarUsuarioMesmoCpf();
        // cadastrarUsuarioMesmoEmail();
        // permiteDeposito();
        // testListarUsuarios();
    }

    // Teste de metodos do restaurante.cliente
    private static void CadastrarUsuario() {
        Restaurante restaurante = new Restaurante();

        boolean ret = restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "9999999");

        if (ret == true) {
            System.out.println("Usuario cadastrado com sucesso");
        }
    }

    private static void CadastrarUsuarioMesmoCpf() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "9999999");
        boolean ret = restaurante.cadastrarUsuario("Maria", "41854875977", "Mariaaaa@gmail.com", "9999999");

        if (ret == false) {
            System.out.println("Mesmo CPF nao permitido");
        }
    }

    private static void cadastrarUsuarioMesmoEmail() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "8888888");
        boolean ret = restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "9999999");

        if (ret == false) {
            System.out.println("Mesmo Email nao permitido");
        }
    }

    private static void permiteDeposito() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "9999999");

        boolean ret = restaurante.depositar("9999999", 50);

        if (ret == true) {
            System.out.println("Deposito feito com sucesso");
        }
    }

    private static void consumirRefeicao() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "9999999");

        boolean ret = restaurante.consumir("9999999", 50);

        if (ret == true) {
            System.out.println("Consume feito com sucesso");
        }
    }

    private static void testListarUsuarios() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "9999999");

        String ret = restaurante.listarUsuarios();

        if (ret != "") {
            System.out.println("Lista de usuarios gerado com sucesso");
        }
    }

    private static void testeGerarExtrato() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarUsuario("Maria", "41854875977", "Maria@gmail.com", "9999999");

        restaurante.depositar("9999999", 500);

        String ret = restaurante.gerarExtrato("9999999");

        if (ret != "") {
            System.out.println("Extrato gerado com sucesso");
        }
    }

    // Teste dos metodos restaurante.funcionario
    private static void CadastrarFuncionario() {
        Restaurante restaurante = new Restaurante();

        boolean ret = restaurante.cadastrarFuncionario("Maria", "41854875977", "Maria@gmail.com", "9999999", "Cozinheira", "Noturno", 1650);

        if (ret == true) {
            System.out.println("Funcionario cadastrado com sucesso");
        }
    }

    private static void testListarFuncionario() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarFuncionario("Maria", "41854875977", "Maria@gmail.com", "9999999", "Cozinheira", "Noturno", 1650);

        String ret = restaurante.listarFuncionarios();

        if (ret != "") {
            System.out.println("Lista de usuarios gerado com sucesso");
            System.out.println(ret);

        }
    }

    private static void CadastrarFuncionarioMesmoCpf() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarFuncionario("Maria", "41854875977", "Maria@gmail.com", "9999999", "Cozinheira", "Noturno", 1650);
        boolean ret = restaurante.cadastrarFuncionario("Maria", "41854875977", "Maria2222@gmail.com", "9999999", "Cozinheira", "Noturno", 1650);

        if (ret == false) {
            System.out.println("Mesmo CPF nao permitido");
        }
    }

    private static void cadastrarFuncionarioMesmoEmail() {
        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarFuncionario("Maria", "41854875977", "Maria@gmail.com", "9999999", "Cozinheira", "Noturno", 1650);

        boolean ret = restaurante.cadastrarFuncionario("Maria", "41854875977", "Maria@gmail.com", "8888888", "Cozinheira", "Noturno", 1650);

        if (ret == false) {
            System.out.println("Mesmo Email nao permitido");
        }
    }
}
