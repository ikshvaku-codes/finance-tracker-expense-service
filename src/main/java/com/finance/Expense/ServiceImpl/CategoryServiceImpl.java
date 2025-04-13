package com.finance.Expense.ServiceImpl;

import org.springframework.stereotype.Service;

import com.finance.Expense.DTO.CategoryDTO;
import com.finance.Expense.Repository.CategoryRepository;
import com.finance.Expense.Service.CategoryService;
import com.finance.Expense.entity.Category;
import com.finance.Expense.mapper.CategoryMapper;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category, CategoryDTO, Long> implements CategoryService {
    public CategoryServiceImpl(CategoryRepository repository, CategoryMapper mapper) {
        super(repository, mapper);        
    }
}
