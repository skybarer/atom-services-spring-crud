package com.inkollu.atom.cassandra.model;

import java.util.UUID;

import com.akash.atom.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Tutorial extends BaseModel {
    @PrimaryKey
    private UUID id;
    private String title;
    private String description;
    private boolean published;
}