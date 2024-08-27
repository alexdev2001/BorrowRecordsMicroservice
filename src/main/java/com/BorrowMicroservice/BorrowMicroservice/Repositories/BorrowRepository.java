package com.BorrowMicroservice.BorrowMicroservice.Repositories;

import com.BorrowMicroservice.BorrowMicroservice.Models.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BorrowRepository extends JpaRepository<BorrowRecord, Long> {
    @Override
    Optional<BorrowRecord> findById(Long aLong);
}
