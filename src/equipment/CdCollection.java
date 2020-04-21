package equipment;

public class CdCollection {
    private int cdAmount;

    public CdCollection(int cdAmount) {
        this.cdAmount = cdAmount;
    }

    public void loadCd() {
        --this.cdAmount;
    }

    public int getCdAmount() {
        return this.cdAmount;
    }
}
