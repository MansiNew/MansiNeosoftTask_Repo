package com.neo.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
@Data
@Document("Student")
public class Student {
@Id
private Long rollNum;
private String name;
private double marks;
private String address;
private String department;
}