package maratonajava.introducao.javacore.Kenumeracao.test;

import maratonajava.introducao.javacore.Kenumeracao.dominio.Cliente;
import maratonajava.introducao.javacore.Kenumeracao.dominio.ETipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", ETipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Oda",ETipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
