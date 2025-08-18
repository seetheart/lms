package com.lms.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDate;
// Since we have these 4 fields common in every table we want to inherit from this class and not
// write code for the these 4 lines in every class.

@MappedSuperclass // It denotes that this is the superclass of other classes
@Getter @Setter @ToString
public class BaseEntity {
    @Column(updatable = false)
    private LocalDate createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false) // while creation these should be null values and not be inserted
    private LocalDate updatedAt;

    @Column(insertable = false)
    private String updatedBy;
}
