package com.apirest.apirestSmadia.inventory.infrastructure.entity;
import com.apirest.apirestSmadia.shopping.infrastructure.entity.PurchaseOrderDetail;
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
@Table(name = "product_receipt_detail", schema = "common_inventory")
public class ProductReceiptDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prd_id")
    private Long id;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_program")
    private String updateProgram;

    @Column(name = "optimist_lock")
    private Long optimistLock;

    @Column(name = "prd_received_qty")
    private Long receivedQuantity;

    @Column(name = "prd_observation")
    private String observation;

    @ManyToOne
    @JoinColumn(name = "prd_pr_id", referencedColumnName = "pr_id", insertable = true, updatable = true)
    private ProductReceipt productReceipt;

    @ManyToOne
    @JoinColumn(name = "prd_pord_id", referencedColumnName = "pordd_id", insertable = true, updatable = true)
    private PurchaseOrderDetail purchaseOrderDetail;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
