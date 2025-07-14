package BackEnd.U5D1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Articolo{
    private List<Topping> toppings;
    private  boolean isXL;


    public Pizza (String nome, double prezzo, double prezzoBase, String infoNutrizionali, boolean isXL){
        super(nome,prezzoBase,infoNutrizionali);
        this.toppings= new ArrayList<>();
        this.isXL=isXL;
    }
    public void aggiungiTopping ( Topping topping, int quantita){
        for( int i=0; i<quantita; i++){
            topping.add(topping);
        }
    }
}
