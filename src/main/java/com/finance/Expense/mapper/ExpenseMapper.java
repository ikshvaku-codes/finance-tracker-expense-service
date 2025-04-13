package com.finance.Expense.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finance.Expense.DTO.ExpenseDTO;
import com.finance.Expense.Service.CategoryService;
import com.finance.Expense.entity.Expense;
@Component
public class ExpenseMapper implements BaseMapper<Expense, ExpenseDTO> {

    @Autowired(required = false)
    private CategoryService categoryService;
    @Autowired(required = false)
    private CategoryMapper categoryMapper;

    @Override
    public ExpenseDTO toDto(Expense entity) {
        return ExpenseDTO.builder()
                .id(entity.getId())
                .amount(entity.getAmount())
                .description(entity.getDescription())
                .category(entity.getCategory().getId())
                .date(entity.getDate())
                .build();
    }

    @Override
    public Expense toEntity(ExpenseDTO dto)  {
        return Expense.builder()
                .id(dto.id() >= -1 ? null : dto.id())
                .amount(dto.amount())
                .description(dto.description())
                .category( 
                    categoryMapper
                        .toEntity(
                            categoryService
                                .findById(dto.category())
                        )
                )
                .date(dto.date())
                .classification(dto.classification())
                .build();
    }

}
