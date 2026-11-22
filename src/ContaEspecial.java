public class ContaEspecial extends Conta {

    private double credito;

    public ContaEspecial(String cpf, String numC, String numAg, double saldo, double credito) {
        super(cpf, numC, numAg, saldo);
        this.credito = credito;
    }

    public ContaEspecial() {
        super();
        this.credito = 0.0;
    }

    @Override
    public double getSaldoDisponivel() {
        return super.getSaldo() + this.credito;
    }

    public double getCredito() {
        return this.credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}