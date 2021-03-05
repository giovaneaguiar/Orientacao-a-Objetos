
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
public class Cliente {

    private String nome;
    private String sexo;
    private String email;
    private String cpf;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String nome, String sexo, String email, String cpf) {
        //construtor
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.sexo + " - " + this.email + " - " + this.cpf;  //To change body of generated methods, choose Tools | Templates.
    }

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
