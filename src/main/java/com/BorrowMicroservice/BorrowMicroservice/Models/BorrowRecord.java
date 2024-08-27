package com.BorrowMicroservice.BorrowMicroservice.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(
        name = "borrow_record"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowID;
    private Long userID;
    private Long bookID;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

}
