package com.lms.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
// Since we have these 4 fields common in every table we want to inherit from this class and not
// write code for the these 4 lines in every class.

@MappedSuperclass // It denotes that this is the superclass of other classes
@EntityListeners(AuditingEntityListener.class) // for accessing auditAwareImpl
@Getter @Setter @ToString
public class BaseEntity {
    @CreatedDate
    @Column(updatable = false)
    private LocalDate createdAt;

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false) // while creation these should be null values and not be inserted
    private LocalDate updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;
}
