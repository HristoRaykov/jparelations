package org.jparelations.jparelations.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;



@Entity(name = "HistQuote")
@Table(name = "hist_prices")
@IdClass(SymbolDateId.class)
public class HistPrice {

    @Id
    @Column(name = "symbol")
    private String symbol;
    @Id
    @Column(name = "date")
    private LocalDate date;

    @Column(precision = 10, scale = 4)
    private BigDecimal close;


    public HistPrice() {
    }

    public HistPrice(String symbol, LocalDate date, BigDecimal close) {
        this.symbol = symbol;
        this.date = date;
        this.close = close;
    }

    public String getSymbol() {
        return symbol;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getClose() {
        return close;
    }


}
