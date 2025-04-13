package com.finance.Expense.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.annotation.PreDestroy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode
public abstract class BaseEntity<T extends Serializable> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    @SequenceGenerator(
        name = "sequence_generator",
        sequenceName = "default_sequence", 
        allocationSize = 1 
    )

    private T id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "created_at",nullable = false)
    private LocalDate createdAt;
    @Column(name = "update_at", nullable = false)
    private LocalDate updatedAt;
    @Column(name = "is_deleted",nullable = false)
    private Boolean isDeleted;
    @Column(name = "deleted_date", nullable = true)
    private LocalDate deletedDate;
    @Column(name="created_by_user_id")
    private Long createdBy;
    // Getters and setters
    @PrePersist
    protected void onCreate() {
        this.isDeleted = false;
        this.updatedAt = LocalDate.now();
        this.createdAt = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDate.now();
    }

    @PreDestroy
    protected void onDelete() {
        this.deletedDate = LocalDate.now();
        this.isDeleted = true;
    }





    
}
    

