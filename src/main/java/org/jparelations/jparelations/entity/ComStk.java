package org.jparelations.jparelations.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ComStk")
@Table(name = "com_stks")
public class ComStk {

    @Id
    @Column(name = "symbol", nullable = false, updatable = false, unique = true, insertable = false)
    private String symbol;

    @Column(name = "prices")
    private BigDecimal price;

    @OneToMany(mappedBy = "comStkIssuer", fetch = FetchType.EAGER)
    private List<DebtSec> debtSecs;

    public ComStk() {
    }

    public ComStk(String symbol, BigDecimal price) {
        this.symbol = symbol;
        this.price = price;
        this.debtSecs = new ArrayList<DebtSec>();
    }

    public String getSymbol() {
        return symbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void addDebtSec(DebtSec debtSec){

    }
}
