package common;

/**
 *
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class DivisionArray {
    private final int[] dividers;
    private int[] divided;
    private int rest;

    public DivisionArray(int[] dividers) {
        if(dividers != null) {
            this.dividers = dividers;
            this.divided = new int[dividers.length];
        }
        else {
            this.dividers = new int[0];
        }
    }

    public void divide(int value) {
        this.rest = value;
        int i = 0;
        while(this.rest > 0 && i < dividers.length) {
            divided[i] = this.rest / dividers[i];
            this.rest %= dividers[i];
            i++;
        }
    }

    public int[] getDivided() {
        return this.divided;
    }

    public int getRest() {
        return rest;
    }

}