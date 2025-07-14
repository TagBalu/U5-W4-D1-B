package BackEnd.U5D1.entities;

public class Topping {
    private String nome;
    private double prezzo;
    private String infoNutrizionali;

    public Topping(String nome, double prezzo, String infoNutrizionali) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.infoNutrizionali = infoNutrizionali;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getInfoNutrizionali() {
        return infoNutrizionali;
    }
}
