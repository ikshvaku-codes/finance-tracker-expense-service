package com.finance.Expense.DTO;

import lombok.*;



@Builder
public record CategoryDTO(
    String name,
    long patentCategory,
    long id
    // List<Long> subCategories

) implements BaseDTO {
    @Override
    public Long getId() {
        return id;
    }

}
