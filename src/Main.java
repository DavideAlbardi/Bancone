//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conto Genoveffo = new Conto("IBAN256", "Genoveffo", "Freebooter", "1972", "il CF di Genoveffo");
        Genoveffo.deposita(Genoveffo, 400);
        System.out.println("Il conto di Genoveffo adesso ammonta a: " + Genoveffo.getSaldo());
        Genoveffo.preleva(Genoveffo, 127);
        System.out.println("Genoveffo ha prelevato 127 dollaroni, il suo conto adesso ammonta a: " + Genoveffo.getSaldo());
        Genoveffo.preleva(Genoveffo, 900000);
        System.out.println("Genoveffo vuole esagerare, e prova a prelevare 900.000 dollaroni, il suo conto adesso ammonta a: " + Genoveffo.getSaldo());

        Banca SuperIntesa = new Banca("Intesa", 10);
        SuperIntesa.aggiungiConto("971222", "Paolo", "Giallognolo", "12/12/2024", "892h913ib3i21b3");
        Conto trovato = SuperIntesa.getConto("971222");
        System.out.println("Abbiamo appena aggiunto il conto di Paolo Giallognolo, speriamo di avercelo davvero: " + trovato.getIban());


        for (int i = 0; i < 9; i++) {

            SuperIntesa.aggiungiConto("971222", "Paolo", "Giallognolo", "12/12/2024", "892h913ib3i21b3");
        }

        SuperIntesa.operazione(trovato, 300);
        System.out.println("Paolo Giallognolo ha appena depositato 300 dobloni: " + trovato.getSaldo());

        SuperIntesa.operazione(trovato, -200);
        System.out.println("Paolo Giallognolo ha appena prelevato 200 dobloni: " + trovato.getSaldo());

        System.out.println("La banca super intesa ha come totale di saldi: " + SuperIntesa.totaleSaldi());
        System.out.println("La banca super intesa ha elenco di conti: ");
        SuperIntesa.elenco(SuperIntesa);

    }
}