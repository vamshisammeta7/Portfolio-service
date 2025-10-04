package com.ft.portfolio_service.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "portfolios")
@Getter
@Setter
public class PortfolioEntity {

    @Id
    private String clientId;
    @OneToMany(mappedBy = "portfolio",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Holdings> Holdings;

    private double totalValue;



}


