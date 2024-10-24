//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conto Genoveffo = new Conto("IBAN256", "Genoveffo", "Freebooter","1972","il CF di Genoveffo");
        Genoveffo.deposita(Genoveffo, 400);
        System.out.println("Il conto di Genoveffo adesso ammonta a: " + Genoveffo.getSaldo());
        Genoveffo.preleva(Genoveffo, 127);
        System.out.println("Genoveffo ha prelevato 127 dollaroni, il suo conto adesso ammonta a: " + Genoveffo.getSaldo());
        Genoveffo.preleva(Genoveffo, 900000);
        System.out.println("Genoveffo vuole esagerare, e prova a prelevare 900.000 dollaroni, il suo conto adesso ammonta a: " + Genoveffo.getSaldo());
    }
}
