package com.finance.Expense.ServiceImpl;


import org.springframework.stereotype.Service;

import com.finance.Expense.DTO.ExpenseDTO;
import com.finance.Expense.Repository.ExpenseRepository;
import com.finance.Expense.Service.ExpenseService;
import com.finance.Expense.entity.Expense;
import com.finance.Expense.mapper.ExpenseMapper;

@Service
public class ExpenseServiceImpl extends BaseServiceImpl<Expense, ExpenseDTO, Long> implements ExpenseService {
    public ExpenseServiceImpl(ExpenseRepository repository, ExpenseMapper mapper) {
        super(repository, mapper);        
    }
}
