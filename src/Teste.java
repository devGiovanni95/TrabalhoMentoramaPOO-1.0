import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teste {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Giovanni", true, "2507", 10);
        Cliente cli2 = new Cliente("Mentorama", true, "2547", 30);
        Cliente cli3 = new Cliente("Fabiano", false, "2fr8", 50);
        Cliente cli4 = new Cliente("Brasil", false, "2567", 48);
        Cliente cli5 = new Cliente("Miguel", false, "7458", 124);
        Cliente cli6 = new Cliente("Arthur", true, "3247", 5);
        Cliente cli7 = new Cliente("Bernardo", false, "8542", 19);
        Cliente cli8 = new Cliente("Helena", true, "tsgh", 80);
        Cliente cli9 = new Cliente("Alice", true, "fhbv", 43);
        Cliente cli10 = new Cliente("Sophia", true, "5321", 25);
        Cliente cli11= new Cliente("Laura", false, "gnvx", 75);
        Cliente cli12= new Cliente("Davi", true, "8524", 89);
        Cliente cli13= new Cliente("Lorenzo", false, "vbcf", 63);
        Cliente cli14= new Cliente("Théo", true, "257h", 47);
        Cliente cli15= new Cliente("Benjamin", false, "fgd1", 15);
        Cliente cli16= new Cliente("Heloísa", true, "gtr5", 10);


        List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10, cli11, cli12, cli13, cli14, cli15, cli16);

//        Stream<Object> stream = clientes.stream().map(cli -> cli.getCompras() > 0).forEach(aBoolean -> );


        Comparator<Cliente> MaiorNumeroCompras = (cliente1, cliente2) -> {
            if (cliente1.getCompras() > cliente2.getCompras()) return 1;
            if (cliente1.getCompras() < cliente2.getCompras()) return -1;
            return 0;
        };

        Comparator<Cliente> MenorNumeroCompras = (cliente1, cliente2) -> {
            if (cliente1.getCompras() > cliente2.getCompras()) return 1;
            if (cliente1.getCompras() < cliente2.getCompras()) return -1;
            return 0;
        };

        Object ClienteMaiorCompra = clientes.stream().max(MaiorNumeroCompras);
        Object ClienteMenorCompra = clientes.stream().max(MaiorNumeroCompras);

        System.out.println( "Cliente com maior numero de notas foi " + ClienteMaiorCompra);
        System.out.println( "Cliente com menor numero de notas foi " + ClienteMenorCompra);

/*

        System.out.println(clientes.stream().max(MaiorNumeroCompras));
        System.out.println(clientes.stream().min(MenorNumeroCompras));


        // Nao necessitou implementar

         BinaryOperator<Integer> soma = ( ac, n) -> ac + n;
        Function<Cliente, Integer> somatorio = cli -> cli.getCompras();
        */

        //somatorio de todas as compras
        Integer total = clientes.stream().mapToInt(n -> n.getCompras()).sum();

        //calcular media
        double media = clientes.stream().mapToInt( n -> n.getCompras()).average().getAsDouble();
        System.out.println("A média total das compras é de: " + media);

        System.out.println("O numero de vendas efetuadas foi de " + " compras");
    }
}
