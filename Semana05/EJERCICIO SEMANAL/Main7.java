public class Main7 {

    public static void main(String[] args) {
        UsuarioDto usuarioDto = new UsuarioDto("Juan", "ejemplo@email.com");
        System.out.println(usuarioDto.hashCode());
        UsuarioDto usuarioDto1 = new UsuarioDto("Maria", "Prueba@email.com");
        System.out.println(usuarioDto1.hashCode());
        if (usuarioDto.equals(usuarioDto1)) {
            System.out.println("los objectos son iguales");


        }
    }
}
