package com.mydias.mydias.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TN_BOARD_LIKE")
public class BoardLike implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATC_NO")
    private Board ATC_NO;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_NO")
    private User USER_NO;
    private Long SEQ_NO;
    @CreationTimestamp
    private Timestamp INST_DTM;
    private String INST_ID;

}
