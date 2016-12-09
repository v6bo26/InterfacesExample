/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.interfacesexample;

/**
 *
 * @author User
 */
public class PotatoPeelingMachine implements Peeler{

    @Override
    public void peel(Peelable p) {
        Plant p_ = (Plant)p;
        if(p_.isPeeled()) {
            throw new RuntimeException("plant is already peeled");
        }
        p_.peel();
    }
}
