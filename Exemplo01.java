// Tipos de variáveis em Java
/*
 * String -> Armazena texto
 * char-> Armazena uma única letra
 * int -> números inteiros
 * float -> números decimais
 * double -> números decimais. Maior precisão
 * 
 */

 /* 
  * Toda váriavel DEVE começar com letra minúscula
  * Não pode haver espaço no nome da variável
  * nomeAluno, enderecoCliente,produtoAdiquirido
  */


    public class Exemplo01 {

    public static void main(String[] args) {
    
        String nome = "Vinícius Alves";
        int idade = 15;
        boolean chuva = true; // Em variáveis booleanas eu uso true ou false
        char letra = 'V'; // Todo char DEVE estar com aspas simples ''
        double salario = 10000.01;
        float altura = (float) 1.61; // Estou convertendo um double para float 
        
        System.out.println("Meu nome é: " +nome);
        System.out.println("Minha idade é: " +idade);
        System.out.println("Está chovendo? " +chuva);
        System.out.println("A inicial do meu nome é: " +letra);
        System.out.println("Meu salário é: " +salario);
        System.out.println("Eu tenho: " +altura+"m");
        


     }
     
    
     }