package com.rucreativedeveloper.rusty.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")
@Builder
public class ApplicationUser {
@Id
@Column(name="user_id",nullable = false,length = 40)
private String user_id;
@Column(name="user_name",nullable = false,length = 100)
private String user_name;
@Column(name="password",nullable = false,length=750)
private String password;
@Column(name="address",nullable = false,length = 150)
private String address;
@Embedded
private FileResource resource;

@OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
private List<CustomerOrder> customerOrders=new ArrayList<>();




}
