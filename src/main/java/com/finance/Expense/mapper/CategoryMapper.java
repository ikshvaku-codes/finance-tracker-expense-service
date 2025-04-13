package com.finance.Expense.mapper;


import org.springframework.stereotype.Component;

import com.finance.Expense.DTO.CategoryDTO;
import com.finance.Expense.entity.Category;
@Component

public class CategoryMapper implements BaseMapper<Category, CategoryDTO>{

    @Override
    public CategoryDTO toDto(Category entity) {
        return CategoryDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .patentCategory(entity.getParentCategory())
                // .subCategories(entity.getSubCategories())
                .build();
        
    }

    @Override
    public Category toEntity(CategoryDTO dto) {
        return Category.builder()
                .id(dto.id()<=0?
                    null:
                    dto.id()
                )
                .name(dto.name())
                .parentCategory(dto.patentCategory()<=0?
                    null:
                    dto.patentCategory()
                )
                // .subCategories(dto.subCategories())
                .build();
    }
    

}
