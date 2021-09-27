package org.jparelations.jparelations;

import org.jparelations.jparelations.entity.ComStk;
import org.jparelations.jparelations.entity.DebtSec;
import org.jparelations.jparelations.entity.HistPrice;
import org.jparelations.jparelations.repository.ComStkRepo;
import org.jparelations.jparelations.repository.DebtSecRepo;
import org.jparelations.jparelations.repository.HistPriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
public class ConsoleRunner implements CommandLineRunner {

    private final DebtSecRepo debtSecRepo;
    private final ComStkRepo comStkRepo;
    private final HistPriceRepo histPriceRepo;

    @Autowired
    public ConsoleRunner(DebtSecRepo debtSecRepo, ComStkRepo comStkRepo, HistPriceRepo histPriceRepo) {
        this.debtSecRepo = debtSecRepo;
        this.comStkRepo = comStkRepo;
        this.histPriceRepo = histPriceRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        String symbol = "bac-p";
        DebtSec debtSec = new DebtSec(symbol);


        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusDays(1);

        HistPrice histPrice1 = new HistPrice(symbol, date1, BigDecimal.valueOf(25.34));
        HistPrice histPrice2 = new HistPrice(symbol, date2, BigDecimal.valueOf(25.28));

        debtSec.setHistPrices(List.of(histPrice1, histPrice2));

        this.debtSecRepo.save(debtSec);
        this.debtSecRepo.delete(debtSec);

        var stop = 's';
    }
}
