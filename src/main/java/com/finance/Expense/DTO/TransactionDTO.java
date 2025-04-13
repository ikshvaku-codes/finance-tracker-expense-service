package com.finance.Expense.DTO;

import java.time.LocalDate;

import lombok.Builder;


@Builder
public record TransactionDTO(
    String description,
    double amount,
    LocalDate date,
    long id
) {

}
