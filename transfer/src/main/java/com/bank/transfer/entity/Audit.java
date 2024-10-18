package com.bank.transfer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "audit", schema = "transfer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "entity_type")
    @Size(max = 40)
    private String entityType;

    @Column(name = "operation_type")
    @Size(max = 255)
    private String operationType;

    @Column(name = "created_by")
    @Size(max = 255)
    private String createdBy;

    @Column(name = "modified_by", nullable = false)
    @Size(max = 255)
    private String modifiedBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modified_at", nullable = false)
    private LocalDateTime modifiedAt;

    @Column(name = "new_entity_json", nullable = false)
    private String newEntityJson;

    @Column(name = "entity_json")
    private String entityJson;
}
