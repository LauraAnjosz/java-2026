package privado;

public class TestaCelular {
    public static void main(String[] args){
        Celular meuCelular = new Celular("Iphone", "Iphone 12", 2019);

        System.out.println("Marca: "+ meuCelular.getMarca());
        System.out.println("Modelo: "+ meuCelular.getModelo());
        System.out.println("Ano: "+ meuCelular.getAno());
    }
}
