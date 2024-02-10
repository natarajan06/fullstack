package com.recharge.yogesh.model;

import static jakarta.persistence.GenerationType.UUID;

// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mobile_recharge_plan")
public class Plan {

    @Id
    @GeneratedValue(strategy = UUID)
    private String plan_id;

    // @Column(nullable = false)
    private String plan_name;

    // @Column(nullable = false)
    private Double price;

    // @Column(nullable = false)
    private Integer validity_days;

    // @Column(nullable = false)
    private Integer data_limit_gb;

    // @Column(nullable = false)
    private Integer talktime_minutes;

}
