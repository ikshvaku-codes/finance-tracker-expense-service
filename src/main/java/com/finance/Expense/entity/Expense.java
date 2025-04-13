package com.finance.Expense.entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import com.finance.Expense.enums.ClassificationEnum;


@Entity
@Table(name = "expenses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)

public class Expense extends BaseEntity<Long>  implements Serializable{


    
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "is_recurring", nullable = false)
    private Boolean isRecurring;
    @Column(name = "classification", nullable = false)
    @Enumerated(EnumType.STRING)
    private ClassificationEnum classification;
}
