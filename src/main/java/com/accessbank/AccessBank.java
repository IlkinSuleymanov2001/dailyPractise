package com.accessbank;

public class AccessBank {

    private final Departament[] departaments;

    public AccessBank(Departament... departaments) {
        this.departaments = departaments;
    }

    public Departament[] getDepartaments() {
        return departaments;
    }
}
