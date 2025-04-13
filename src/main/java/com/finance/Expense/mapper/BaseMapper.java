package com.finance.Expense.mapper;

import org.springframework.stereotype.Component;

@Component
public interface BaseMapper<E, DTO> {
    DTO toDto(E entity);
    E toEntity(DTO dto);
}
