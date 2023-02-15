package com.mydias.mydias.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TN_BOARD")
public class Board {
    @Id
    private Long ATC_NO;
    private String TITLE;
    private String EMAIL;
    private Long ATC_CNT;
    private String USE_YN;
    @CreationTimestamp
    private Timestamp INST_DTM;
    private String INST_ID;
    @UpdateTimestamp
    private Timestamp UPDT_DTM;
    private String UPDT_ID;
}
