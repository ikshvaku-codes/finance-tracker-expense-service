package com.finance.Expense.Service;


import org.springframework.stereotype.Service;

import com.finance.Expense.DTO.ExpenseDTO;


@Service
public interface ExpenseService extends BaseService<ExpenseDTO, Long> {
    
}
