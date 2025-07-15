package BackEnd.U5D1.entities;

public class Tavolo {
    private int numero;
    private int numeroCopertiMassimo;
    private StatoTavolo statoTavolo;
    
    public Tavolo(){}

    public Tavolo(int numero, int numeroCopertiMassimo, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.numeroCopertiMassimo = numeroCopertiMassimo;
        this.statoTavolo = statoTavolo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumeroCopertiMassimo(){
        return numeroCopertiMassimo;
    }
    
    public void setNumeroCopertiMassimo(int numeroCopertiMassimo){
        this.numeroCopertiMassimo = numeroCopertiMassimo;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", numeroCopertiMassimo=" + numeroCopertiMassimo +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}