package ifma.lista03;

public class TestSimpleList {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();
        
        lista.adicionarFim(3);
        lista.adicionarInicio(1);
        lista.adicionarFim(2);
        lista.adicionarInicio(4);
        lista.adicionarFim(7);
        lista.adicionarFim(0);
        System.out.println(lista);
        
        lista.removerComeco();
        lista.removerFinal();
        System.out.println(lista);
        
        System.out.println("Maior valor: "+lista.maior());
        System.out.println("Menor valor: "+lista.menor());
        System.out.println("Media: "+lista.media());
    }
}
