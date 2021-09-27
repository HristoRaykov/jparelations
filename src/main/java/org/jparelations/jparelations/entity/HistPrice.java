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

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="symbol", insertable=false, updatable=false)
    private DebtSec debtSec;


    public HistPrice() {
    }

    public HistPrice(String symbol, LocalDate date, BigDecimal close) {
        this.symbol = symbol;
        this.date = date;
        this.close = close;
//        this.debtSec = debtSec;
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

    public DebtSec getDebtSec() {
        return debtSec;
    }

    public void setDebtSec(DebtSec debtSec) {
        this.debtSec = debtSec;
    }
}
