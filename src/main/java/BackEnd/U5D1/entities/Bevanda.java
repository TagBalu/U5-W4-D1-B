package BackEnd.U5D1.entities;

public class Bevanda extends  Articolo {
    private Bevanda(String nome , double prezzo , String infoNutrizionali){
        super ( nome,prezzo,infoNutrizionali);
    }

    @Override
    public String getDescrizione(){
        return nome+" (Bevanda)";
    }
}
