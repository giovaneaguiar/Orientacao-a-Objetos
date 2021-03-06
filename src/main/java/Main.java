
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author giova
 */
public class Main {

    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[2];
        String nome, sexo, email, cpf;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Digite o nome do cliente " + (i + 1) + ":");
            nome = teclado.nextLine();
            System.out.println("Digite o sexo do cliente " + (i + 1) + ":");
            sexo = teclado.nextLine();
            System.out.println("Digite o e-mail do cliente " + (i + 1) + ":");
            email = teclado.nextLine();
            System.out.println("Digite o cpf do cliente " + (i + 1) + ":");
            cpf = teclado.nextLine();

            cliente[i] = new Cliente(nome, sexo, email, cpf);

        }

        System.out.println("Impressão: ");

        for (Cliente cliente1 : cliente) {
            System.out.println(cliente1);
        }
    }
}
