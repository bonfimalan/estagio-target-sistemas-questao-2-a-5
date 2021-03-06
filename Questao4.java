import java.text.DecimalFormat;

public class Questao4 {
  public static void main(String[] args) {
    long[] faturamentos = {6783643, 3667866, 2922988, 2716548, 1984953};
    String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
    long total = calcularTotal(faturamentos);
    double temp;
    // objeto usado para formatar o percentual com quatro casas decimais
    DecimalFormat decimalFormat = new DecimalFormat("#.####");

    System.out.println("Percentuais por estado:");
    for(int i = 0; i < estados.length; i++) {
      temp = (double) faturamentos[i] / total;
      System.out.println(estados[i] + " - " + decimalFormat.format(temp) + "%");
    }
  }

  /**
   * Soma os valores de um vetor
   * 
   * @param faturamentos vetor com os faturamentos
   * @return soma de todos os valores do vetor
   */
  public static long calcularTotal(long[] faturamentos) {
    long total = 0;
    for(long faturamento : faturamentos) {
      total += faturamento;
    }
    return total;
  }
}
