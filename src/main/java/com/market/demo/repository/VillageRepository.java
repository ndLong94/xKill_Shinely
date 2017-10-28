package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.Village;
import org.springframework.data.repository.CrudRepository;

public interface VillageRepository extends CrudRepository<Village, Long> {
}
