package com.finance.Expense.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.Expense.entity.BaseEntity;

@Repository
public interface BaseRepository<T extends BaseEntity, Id extends Serializable> extends JpaRepository<T, Id> {

}
