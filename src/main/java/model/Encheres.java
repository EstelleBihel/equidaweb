package model;

public class Encheres {
    private int numero;
    private int montant;
    private Lot lot;
    private Client client;

    public Encheres() {

    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public Lot getLot() {
        return lot;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getMontant() {
        return montant;
    }
}
