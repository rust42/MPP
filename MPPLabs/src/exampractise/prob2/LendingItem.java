package exampractise.prob2;

public class LendingItem {

    private int numCopiesInLib;

    public int getNumCopiesInLib() {
        return numCopiesInLib;
    }

    public void setNumCopiesInLib(int numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        LendingItem item = (LendingItem)obj;
        return item.numCopiesInLib == numCopiesInLib;
    }
}
