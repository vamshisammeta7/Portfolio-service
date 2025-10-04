package com.ft.portfolio_service.Controller;


import com.ft.portfolio_service.Service.PortfolioService;
import com.ft.portfolio_service.entity.PortfolioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService pfservice;

    @GetMapping("/{clientId}")
    public PortfolioEntity getPortfolioById(@PathVariable String clientId){
        return pfservice.getPortfolio(clientId);

}
@PostMapping("")
public PortfolioEntity createPortfolio(@RequestBody PortfolioEntity portfolio){
        return pfservice.savePortfolio(portfolio);

}

@DeleteMapping("/{clientId}")
public void deletePortfolio(@PathVariable String clientId){
        pfservice.deletePortfolio(clientId);
}
}
