import banco.Cliente;
import banco.ContaBancaria;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Cliente cliente = new Cliente("vinicius", "8768768758");

    ContaBancaria contaBancaria = new ContaBancaria(cliente, 0.01, "654546");

    contaBancaria.deposito(500);

    contaBancaria.saque(300);
    System.out.println(contaBancaria.getSaldo());


}
}