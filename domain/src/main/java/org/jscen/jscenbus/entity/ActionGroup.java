package org.jscen.jscenbus.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "action")
@NoArgsConstructor
@AllArgsConstructor
public class ActionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    @Column(name = "action_id")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Action.class)
    private List<Action> action;
}
