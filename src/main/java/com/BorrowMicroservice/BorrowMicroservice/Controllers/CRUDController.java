package com.BorrowMicroservice.BorrowMicroservice.Controllers;

import com.BorrowMicroservice.BorrowMicroservice.Models.BorrowRecord;
import com.BorrowMicroservice.BorrowMicroservice.Repositories.BorrowRepository;
import com.BorrowMicroservice.BorrowMicroservice.Services.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api/borrowrecord/")
public class CRUDController {
    @Autowired
    CRUDService crudService;

    @Autowired
    BorrowRepository borrowRepository;

    // create borrow record
    @PostMapping("/create")
    public ResponseEntity<BorrowRecord> createBorrowRecord(@RequestBody BorrowRecord borrowRecord) {
        crudService.createBorrowRecord(borrowRecord);
        return ResponseEntity.ok(borrowRecord);
    }

    // retrieve record by id
    @GetMapping("/{id}")
    public ResponseEntity<BorrowRecord> readBorrowRecord(@PathVariable Long id) {
        Optional<BorrowRecord> borrowRecord = crudService.retriveBorrowRecord(id);
        return borrowRecord.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());

    }

    // update record by id
    @PutMapping("/update/{id}")
    public ResponseEntity<BorrowRecord> updateBorrowRecord(@PathVariable Long id, @RequestBody BorrowRecord recordDetails) {
        BorrowRecord updatedRecord = crudService.updateBorrowRecord(id, recordDetails);
        return ResponseEntity.ok(updatedRecord);
    }

    // delete  record by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<BorrowRecord> deleteBorrowRecord(@PathVariable Long id) {
        crudService.deleteBprrowRecord(id);
        return ResponseEntity.noContent().build();
    }
}
