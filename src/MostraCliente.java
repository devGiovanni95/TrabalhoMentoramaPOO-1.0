import java.util.function.Consumer;

public class MostraCliente implements Consumer {

    public void accept(Object o) {
        System.out.println(o);//faz mostrar todos os clientes no testa conta
    }
}
