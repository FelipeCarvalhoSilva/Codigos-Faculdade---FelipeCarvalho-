import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    /*Andy de apenas 8 anos tem um sonho - ele deseja criar o seu próprio dicionário. 
    Isto não é uma tarefa fácil para ele, pois conhece poucas palavras. 
    Bem, ao invés de pensar nas palavras que sabe, ele teve uma idéia brilhante. 
    A partir do seu livro de histórias favorito, ele vai criar um dicionário com todas 
    as palavras distintas que existem nele. Ordenando estas palavras em ordem alfabética, 
    o trabalho estará feito. É claro, isso é uma tarefa que toma um certo tempo e portanto, a
    ajuda de um programador de computador como você é muito bemvinda.
    Você foi convidado a escrever um programa que liste todas as diferentes palavras que 
    existem em um texto. Neste caso, uma palavra é definida como uma sequência de letras, 
    maiúsculas ou minúsculas. Palavras com apenas uma letra também deverão ser consideradas. 
    Portanto, seu programa deverá ser "CaSe InSeNsItIvE". Por exemplo, palavras como "Apple", 
    "apple" ou "APPLE" deverão ser consideradas como a mesma palavra.

Entrada:
    A entrada contém no máximo 10000 linhas de texto, cada uma delas com no máximo 200 caracteres. O fim de entrada é determinado pelo EOF.

Saída:
    Você deve imprimir uma lista de diferentes palavras que aparecem no texto, uma palavra por linha. Todas as palavras devem ser impressas com 
    letras minúsculas, em ordem alfabética. Deverá haver no máximo 5000 palavras distintas.


 */


    public static void main(String[] args) throws Exception {
        String input;
        Scanner scanner=new Scanner(System.in);
        LinkedList<String> palavras=new LinkedList<String>();

     
        while(scanner.hasNext()){
            input=scanner.nextLine();
            input=input.toLowerCase();
            input= input.replaceAll("[^a-zA-Z]", " ");
                
            
            String[]partes=input.split(" ");
            for (String parte : partes) {
                if (!parte.isEmpty()&&!palavras.contains(parte)) { // Verifica se a parte não está vazia ou se é repetida
                    palavras.add(parte);
                }
            }
        }
        palavras.sort(null);
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    scanner.close();
}
}
