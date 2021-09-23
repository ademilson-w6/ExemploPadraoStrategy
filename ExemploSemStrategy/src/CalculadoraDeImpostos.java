public class CalculadoraDeImpostos {

    public double calcular(String imposto, double valor) {
        return switch (imposto) {
            case "ICMS" -> valor * 0.10;
            case "IPI" -> valor * 0.20;
            case "NOVO_IMPOSTO" -> valor * 0.50;
            default -> valor;
        };
    }

       /*    if (imposto.equals("ICMS"))
                   return valor * 0.10;
        else if (imposto.equals("IPI"))
                return valor * 0.20;
        else if (imposto.equals("NOVO_IMPOSTO"))
                return valor * 0.50;
        return valor;*/

}