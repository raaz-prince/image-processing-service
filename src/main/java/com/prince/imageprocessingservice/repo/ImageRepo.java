package com.prince.imageprocessingservice.repo;

import com.prince.imageprocessingservice.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<ImageEntity, Long>  {
}
