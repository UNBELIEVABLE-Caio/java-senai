/*Programa que calcula */

// importação necessária para utilizar o Scanner


//SEMPRE PRECISO COLOCAR ESSA LINHA
import java.util.Scanner; // Para que eu possa trabalhar com entrada de dados via teclado

public class Media {

    public static void main(String[] args) {

  Scanner sc = new Scanner (System.in); //Sempre escrever assim
double nota1,nota2,nota3,media;//Declaração das variáveis

String Nome,RM;
System.out.println("Nome do Aluno");
Nome= sc.next();
System.out.println("Digite a RM");
RM= sc.next();
System.out.println("Digite a 1° nota");
nota1= sc.nextDouble();
System.out.println("Digite a 2° nota");
nota2= sc.nextDouble();
System.out.println("Digite a 3° nota");
nota3= sc.nextDouble();
media = (nota1+nota2+nota3)/3;
System.out.println("Média: "+ media+" do aluno" +Nome +"Numero de Identificação"+RM);
sc.close();


}
}