package com.cg.oneToone;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Dl {
    @Generatedvalue(strategy = GenerationType.AUTO)
    private int Dlno;
    private LocalDate expDate;
    private LocalDate issueDate;
    private String type;

    // Constructor
    public Dl() {
    }
    public Dl(int dlno, LocalDate expDate, LocalDate issueDate, String type) {
        this.Dlno = dlno;
        this.expDate = expDate;
        this.issueDate = issueDate;
        this.type = type;
    }

    // Getter and Setter for Dlno
    public int getDlno() {
        return Dlno;
    }

    public void setDlno(int dlno) {
        this.Dlno = dlno;
    }

    // Getter and Setter for expDate
    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    // Getter and Setter for issueDate
    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
