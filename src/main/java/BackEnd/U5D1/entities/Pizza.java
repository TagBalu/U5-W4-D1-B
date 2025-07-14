package BackEnd.U5D1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Articolo{
      private  String toppingsDes;


    public Pizza (String nome, double prezzo, double prezzoBase, String infoNutrizionali){
        super(nome,prezzoBase,infoNutrizionali);
        this.toppingsDes = toppingsDes;
    }

    @Override
    public  String getDescrizione(){
        return nome+(toppingsDes==null || toppingsDes.isEmpty() ? "" : " con " + toppingsDes);
    }
}
