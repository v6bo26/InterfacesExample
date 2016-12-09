package com.so.interfacesexample;

/**
 *
 * @author stan
 */
public class ApplePeelingMachine implements Peeler{

    @Override
    public void peel(Peelable p) {
        Plant p_ = (Plant)p;
        if(p_.isPeeled()) {
            throw new RuntimeException("plant is already peeled");
        }
        p_.peel();
    }
    
}
