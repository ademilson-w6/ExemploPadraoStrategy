public class TesteCalculadora {
    public static void main(String[] args) {

        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        ICMS icms = new ICMS(100.0);
        IPI ipi = new IPI(100.0);
        System.out.println(calculadoraDeImposto.calcular(icms));
        System.out.println(calculadoraDeImposto.calcular(ipi));


    }
}
