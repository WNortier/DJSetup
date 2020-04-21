package equipment;

public class Mixer {
    private int decks;
    private String brand;
    private boolean fxUnit;
    CdCollection cdCollection;

    public Mixer(int decks, String brand, boolean fxUnit, CdCollection cdCollection) {
        this.decks = decks;
        this.brand = brand;
        this.fxUnit = fxUnit;
        this.cdCollection = cdCollection;
    }

    public int getDecks() {
        return decks;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isFxUnit() {
        return fxUnit;
    }

    public int getCdCollection() {
        return cdCollection.getCdAmount();
    }

    public void pressPlay(){
        cdCollection.loadCd();
        System.out.println("Loaded a cd - the current remaining CD's to choose from is " + cdCollection.getCdAmount());
    }

}
