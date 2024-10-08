package com.projectwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectwork.model.Asset;
@Repository

public interface AssetRepositoryService  extends JpaRepository<Asset, Long>{

}
