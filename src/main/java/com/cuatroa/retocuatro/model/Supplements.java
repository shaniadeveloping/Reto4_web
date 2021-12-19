package com.cuatroa.retocuatro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author shania vargas
 */
@Document(collection = "suplementos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplements {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String presentation;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography; 
}
