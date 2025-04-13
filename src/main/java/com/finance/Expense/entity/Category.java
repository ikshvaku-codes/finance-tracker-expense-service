package com.finance.Expense.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

// @GenericGenerator(
//     name = "sequence-generator",
//     strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//     parameters = {
//         @Parameter(name = "sequence_name", value = "category_sequence"),
//         @Parameter(name = "initial_value", value = "1"),
//         @Parameter(name = "increment_size", value = "1")
//     }
// )

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Table(name = "categories")
public class Category extends BaseEntity<Long> implements Serializable {

    @Column(name = "parent_category_id", nullable = true)
    private Long parentCategory;
    
}
