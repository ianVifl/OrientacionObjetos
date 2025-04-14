public class cliente {
    int saldo;
    int deposito;
    int retiro;

    public cliente() {
    }

    public cliente(int saldo) {
        this.saldo = saldo;
    }

    public int depositar(){
        saldo = saldo + deposito ;
        return saldo;
    }
    public int retirar(){
        saldo = saldo - retiro;
        return saldo;
    }









    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }
}
