package com.finance.Expense.Repository;

import org.springframework.stereotype.Repository;

import com.finance.Expense.entity.Expense;

@Repository
public interface ExpenseRepository extends BaseRepository<Expense, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find expenses by category or date range


}
