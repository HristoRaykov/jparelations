package org.jparelations.jparelations.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class SymbolDateId implements Serializable {

    private String symbol;
    private LocalDate date;


    public SymbolDateId() {
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SymbolDateId)) return false;
        SymbolDateId that = (SymbolDateId) o;
        return getSymbol().equals(that.getSymbol()) &&
                getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSymbol(), getDate());
    }

}
