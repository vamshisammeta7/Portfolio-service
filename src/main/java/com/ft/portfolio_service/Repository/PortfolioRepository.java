package com.ft.portfolio_service.Repository;

import com.ft.portfolio_service.entity.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<PortfolioEntity,String> {


}
