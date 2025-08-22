package co.jp.nakamichi.entity;

import org.hibernate.validator.constraints.Length;//@Length

import jakarta.persistence.Column;//@Column
import jakarta.persistence.Entity;//@Entity
import jakarta.persistence.GeneratedValue;//@GeneratedValue
import jakarta.persistence.GenerationType;//@GenerationType
import jakarta.persistence.Id;//@Id
import jakarta.persistence.Table;//@Table
import jakarta.validation.constraints.Max;//@Max
import jakarta.validation.constraints.Min;//@Min
import jakarta.validation.constraints.NotBlank;//@NotBlank
import jakarta.validation.constraints.NotEmpty;//@NotEmpty
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
    @NotEmpty //追加
    @Length(max=10)//追加
    private String dates;

    /**ドル貨。 */
    @Max(300000)//追加
    private double dollar;

    /**為替。 */
    @Max(200)//追加
    private double rate;

    /**円貨。null不許可 */
    @Column(length = 10, nullable = false)
    @NotEmpty //追加
    @Length(max=10)//追加
    private String yen;
}
