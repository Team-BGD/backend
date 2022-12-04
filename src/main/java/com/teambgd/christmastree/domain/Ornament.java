package com.teambgd.christmastree.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Ornament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ornamentId; // 오너먼트 ID

    @Column(nullable=true)
    private Long ornamentNum; // 오너먼트 번호

    @Column(nullable=true)
    private Long treeId; // 트리 ID

    @Column(nullable=true)
    private String message; // 메시지

    @Column(nullable = true)
    private String anoNickname; // 다른 사람 닉네임

    //@ManyToOne(optional = false) @JoinColumn(name = "treeId") private Tree tree; // 트리 ID

    @Column(nullable = false)
    private LocalDateTime createDt; // 오너먼트 생성일자

}
