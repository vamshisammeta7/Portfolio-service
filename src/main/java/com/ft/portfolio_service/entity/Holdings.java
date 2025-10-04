package com.ft.portfolio_service.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "holdings")
@Getter
@Setter
public class Holdings {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fundId;
    private double units;
    private double totalValue;




    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private PortfolioEntity portfolio;

    public static double getValue(String totalValue) {
        return getValue(totalValue);
    }


    public double getValue() {
        return totalValue;
    }
}

