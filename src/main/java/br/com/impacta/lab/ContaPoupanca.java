package br.com.impacta.lab;

public class ContaPoupanca extends Conta{
  
public ContaPoupanca(int numero, int agencia, String tipo) {
  super(numero, agencia, tipo);
}

public void alteraAgencia(int agencia) {
    super.setAgencia(agencia);
}

}
