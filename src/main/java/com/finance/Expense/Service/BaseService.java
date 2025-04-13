package com.finance.Expense.Service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BaseService<DTO, Id> {
    DTO save(DTO dto);
    DTO findById(Id id);  
    boolean deleteById(Id id);
    List<DTO> findAll();
    DTO update(DTO entity, Id id);

}
