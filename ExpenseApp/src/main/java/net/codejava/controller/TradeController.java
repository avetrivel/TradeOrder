package net.codejava.controller;

import net.codejava.Trade;
import net.codejava.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class TradeController {
    @Autowired
    TradeRepository repository;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Trade> firstPageEmployee() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        LocalDate date1 = LocalDate.now();
        Iterable<Trade> iterator = repository.findAll();

        System.out.println("All trade items: ");
        iterator.forEach(item -> System.out.println(item));
        List<Trade> employees =repository.findByTradeId(13L).stream() .filter(e -> e.getCreateDate()> date1.)
                .findFirst()
                .orElse(null);
                .map(repository::findByCounterPartyId)
                .collect(Collectors.toList());

         return employees;
     }
}
