package com.accessbank.models;

import com.google.gson.Gson;


public final class TransferDetails {

    private String docName;
    private String note;
    private String docText;
    private int amount;

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDocText() {
        return docText;
    }

    public void setDocText(String docText) {
        this.docText = docText;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String toJson() {
        return new Gson().toJson(this);
    }
}
