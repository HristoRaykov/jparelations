package org.jparelations.jparelations.entity;


import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity(name = "DebtSec")
@Table(name = "debt_secs")
public class DebtSec {


    @Id
    @Column(name = "symbol", nullable = false, updatable = false, unique = true, insertable = false)
    private String symbol;

    @Column(name = "div_freq")
    private Integer divFreq;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    @JoinColumn()
//    private ComStk comStkIssuer;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true)
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "symbol")
    private List<HistPrice> histPrices;

    public DebtSec() {
    }

    public DebtSec(String symbol) {
        this.symbol = symbol;

    }

    public String getSymbol() {
        return symbol;
    }

//    public ComStk getComStkIssuer() {
//        return comStkIssuer;
//    }
//
//    public void setComStkIssuer(ComStk comStkIssuer) {
//        this.comStkIssuer = comStkIssuer;
//    }

    public List<HistPrice> getHistPrices() {
        return histPrices;
    }

    public void setHistPrices(List<HistPrice> histPrices) {
        this.histPrices = histPrices;
    }
}

