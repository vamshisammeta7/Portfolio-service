package com.ft.portfolio_service.Repository;

import com.ft.portfolio_service.entity.Holdings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoldingsRepository extends JpaRepository<Holdings,String> {
}
