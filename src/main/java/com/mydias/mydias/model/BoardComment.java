package com.mydias.mydias.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TN_BOARD_COMMENT")
public class BoardComment implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATC_NO")
    private Board ATC_NO;
    private Long SEQ_NO;
    private String CONTENTS;
    private int DEPTH;
    private String USE_YN;
    @CreationTimestamp
    private Timestamp INST_DTM;
    private String INST_ID;
    @UpdateTimestamp
    private Timestamp UPDT_DTM;
    private String UPDT_ID;
}
