package com.recharge.yogesh.model;

import static jakarta.persistence.GenerationType.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mobile_recharge_service")
public class Service {

    @Id
    @GeneratedValue(strategy = UUID)
    private String recharge_id;

    @ManyToOne
    private User user;

    @OneToOne
    private Plan rechargePlan;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private LocalDateTime rechargeTime;

    @Column(nullable = false)
    private String status;
}
