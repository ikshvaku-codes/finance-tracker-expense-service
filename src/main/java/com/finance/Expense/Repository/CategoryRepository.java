package com.finance.Expense.Repository;

import org.springframework.stereotype.Repository;
import com.finance.Expense.entity.Category;

@Repository
public interface CategoryRepository extends BaseRepository<Category, Long> {
    
}
