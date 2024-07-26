package projeto1.projeto1;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString(exclude = "password")
public class SysUser {
    @Id
    @Column(name = "id", nullable = false, unique = true, length = 14)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = false, length = 50)
    private String name;

    @Column(name = "password", nullable = false, unique = false, length = 50)
    private String password;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    public SysUser(String password, String email) {
        this.password = password;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysUser)) return false;
        SysUser tmp = (SysUser) o;
        return Objects.equals(password, tmp.password) && Objects.equals(email, tmp.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, email);
    }
}
