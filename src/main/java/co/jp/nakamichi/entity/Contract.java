package co.jp.nakamichi.entity;

import jakarta.persistence.Column;//@Column
import jakarta.persistence.Entity;//@Entity
import jakarta.persistence.GeneratedValue;//@GeneratedValue
import jakarta.persistence.GenerationType;//@GenerationType
import jakarta.persistence.Id;//@Id
import jakarta.persistence.Table;//@Table
import lombok.Data;//@Data

@Data
@Entity
@Table(name = "contract")
public class Contract {

    /** 主キー。自動再生*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**日付。null不許可 */
    @Column(length = 10, nullable = false)
    private String dates;

    /**ドル貨。 */
    private double dollar;

    /**為替。 */
    private double rate;

    /**円貨。null不許可 */
    @Column(length = 10, nullable = false)
    private String yen;
}
