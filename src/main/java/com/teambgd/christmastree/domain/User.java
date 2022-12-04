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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // 사용자 번호

    @Column(nullable=false)
    private String nickname; // 사용자 닉네임

    @Column(nullable = false)
    private LocalDateTime createDt; // 사용자 생성일자

}
