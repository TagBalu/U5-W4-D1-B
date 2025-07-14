package BackEnd.U5D1.entities;

public class Bevanda extends  Articolo {
    public Bevanda(String nome, double prezzo, String infoNutrizionali){
        super ( nome,prezzo,infoNutrizionali);
    }

    @Override
    public String getDescrizione(){
        return nome+" (Bevanda)";
    }
}
