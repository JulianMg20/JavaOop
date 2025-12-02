import java.util.Objects;

public class UsuarioDto {
    private String nombre;
    private String email;

    public UsuarioDto(String nombre, String email){
        this.nombre = nombre;
        this.email= email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDto that = (UsuarioDto) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
