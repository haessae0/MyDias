//package com.mydias.mydias.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "TB_USER")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
//    private Long USER_NO;
//    @Column(nullable = false, length = 30)
//    private String userName;
//    @Column(nullable = false, length = 30)
//    private String passWd;
//    @Column(nullable = false, length = 30)
//    private String email;
//    private String nickName;
//    private String phoneNo;
//
//
//}
