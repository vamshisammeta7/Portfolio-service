package com.ft.portfolio_service.Service;


import com.ft.portfolio_service.Repository.PortfolioRepository;
import com.ft.portfolio_service.entity.Holdings;
import com.ft.portfolio_service.entity.PortfolioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository pfrepo;

    public PortfolioEntity getPortfolio(String clientId){
        Optional<PortfolioEntity> portfolio = pfrepo.findById(clientId);
        return portfolio.orElseThrow(() -> new RuntimeException("portfolio not found for "+clientId));
    }
    public PortfolioEntity savePortfolio(PortfolioEntity portfolio){

        double total;
        total = portfolio.getHoldings().stream().mapToDouble(Holdings::getValue).sum();
        portfolio.setTotalValue(total);
        return pfrepo.save(portfolio);

    }

    public void deletePortfolio(String clientId){

        if (!pfrepo.existsById(clientId)){
            throw new RuntimeException("cannot delete "+ clientId);
        }
        pfrepo.deleteById(clientId);
    }
}
