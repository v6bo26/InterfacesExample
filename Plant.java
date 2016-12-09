package com.so.interfacesexample;

/**
 *
 * @author stan
 */
public abstract class Plant implements Peelable, Cuttable {

    protected double weight;
    protected boolean cutted;
    protected boolean peeled;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCutted() {
        return cutted;
    }

    public void setCutted(boolean cutted) {
        this.cutted = cutted;
    }

    public boolean isPeeled() {
        return peeled;
    }

    public void setPeeled(boolean peeled) {
        this.peeled = peeled;
    }

    @Override
    public  void peel(){
        this.weight *= 0.95;
        this.peeled = true;
    }

    @Override
    public void cut(){
        this.weight*=0.95;
        this.cutted = true;
    }
}
