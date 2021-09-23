public class TesteCalculadora {
    public static void main(String[] args) {


        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println("ICMS =" + calculadoraDeImpostos.calcular("ICMS",100.0));
        System.out.println("IPI =" + calculadoraDeImpostos.calcular("IPI",100.0));
        System.out.println("NOVO_IMPOSTO = " + calculadoraDeImpostos.calcular("NOVO_IMPOSTO",100.0));
    }
}
