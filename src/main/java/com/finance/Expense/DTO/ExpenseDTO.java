package com.finance.Expense.DTO;

import java.time.LocalDate;

import com.finance.Expense.enums.ClassificationEnum;

import lombok.Builder;

@Builder
public record ExpenseDTO(
    String description,
    Double amount,
    LocalDate date,
    long category,
    long id,
    Boolean isRecurring,
    ClassificationEnum classification
) implements BaseDTO {
    @Override
    public Long getId() {
        return id;
    }

}
