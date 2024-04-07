package com.apirest.apirestSmadia.schedule.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Appointment_tracking", schema = "common_schedule")
public class AppointmentTracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appoint_track_id")
    private Long appointTrackId;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_program")
    private String updateProgram;

    @Column(name = "optimist_lock")
    private Long optimistLock;



    @Column(name = "tracking_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trackingDate;

    @Column(name = "status")
    private String status;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;


    @ManyToOne
    @JoinColumn(name = "id_appointment", referencedColumnName = "appointment_id", insertable = true, updatable = true)
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = true, updatable = true)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;
}

