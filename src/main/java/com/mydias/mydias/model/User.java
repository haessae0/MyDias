package com.mydias.mydias.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    private Long USER_NO;
    private String USER_NM;
    private String EMAIL;
    private String NICKNAME;
    private String PHONE_NO;
    private String PASSWD_ENC;
    @UpdateTimestamp
    private Timestamp PASSWD_CHG_DTM;
    @CreationTimestamp
    private Timestamp INST_DTM;
    @UpdateTimestamp
    private Timestamp UPDT_DTM;
    @Column(length = 1)
    private String USER_YN;


}
