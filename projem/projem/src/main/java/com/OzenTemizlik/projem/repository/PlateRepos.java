package com.OzenTemizlik.projem.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OzenTemizlik.projem.model.Plate;

@Repository
public interface PlateRepos extends JpaRepository<Plate, Long>{



}
