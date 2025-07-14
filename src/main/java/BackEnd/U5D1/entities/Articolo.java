package BackEnd.U5D1.entities;

public abstract class  Articolo {
    protected String nome;
    protected double prezzo;
    protected String infoNutrizionali;

    public Articolo(String nome, double prezzo, String infoNutrizionali) {
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

    public abstract String getDescrizione();

    @Override
    public String toString(){
        return getDescrizione()+ " - €" + prezzo;
    }

}
