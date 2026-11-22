import java.util.LinkedList;
import java.util.List;

public class ProgramaBanco {
    public static void main(String[] args) {
        SistemaBanco meuBanco = new BancoList("Ayla's Bank", "123/321",
                new LinkedList<Conta>());
        Conta contaAyla = new ContaSimples("233.333.345-44", "111-1",
                "222-2", 200.00);
        System.out.println(meuBanco.consultarSaldoDisponivelDeConta(
                "111-1", "222-2"));
        meuBanco.sacarDeConta(
                "111-1", "222-2", 200);
        System.out.println(meuBanco.consultarSaldoDisponivelDeConta(
                "111-1", "222-2"));

        meuBanco.abrirConta(contaAyla);

        //Cadastre  uma  conta especial de  número “333-9” numa agência
        // “44-3” e  para  uma pessoa de CPF “434454-74” e de crédito inicial de R$ 300.
        Conta contaNova = new ContaEspecial("434.454-74", "333-9", "44-3", 00, 300);

        meuBanco.abrirConta(contaNova);

        // Verifique  se  o  saldo  disponível dessa  conta
        // cadastrada  é  300. Use  o  método  “getSaldoDisponível”.

        System.out.println(contaNova.getSaldoDisponivel());

        //Cadastre  uma  conta  especial  de  número  “444-5” na  mesma  agência  para  a
        //mesma pessoa de CPF “434454-74” e cujo crédito inicial é de R$ 1000.
        Conta contaEspecial = new ContaEspecial("434.454-74", "444-5", "44-3", 00, 1000);
        meuBanco.abrirConta(contaEspecial);

        // IV. Saque R$ 10 dessa conta 444-5 e imprima o saldo disponível.
        meuBanco.sacarDeConta("444-5", "44-3", 10);
        System.out.println(contaEspecial.getSaldoDisponivel());

        // Pesquise as contas do cliente de CPF “434454-74” e imprima a quantidade de  elementos da lista retornada.
        List<Conta> contas = meuBanco.pesquisarContasDoCliente("434.454-74");
        System.out.println(contas.size());
    }
}