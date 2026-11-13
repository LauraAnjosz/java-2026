package estatico;

public class Utils {
    // atributo estático / de classe
    public static final double PI = 3.1415; // com static não precisa criar um objeto; se for final é tudo maiúsculo

    // método estático / de classe
    public static int max(int x, int y) {
        return x > y ? x : y; // mesma coisa que: if ( x > y ) { return x } else { return y }; ? = if || : = else
    }

    public static int min(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}
