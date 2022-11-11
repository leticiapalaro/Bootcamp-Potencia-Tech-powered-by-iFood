package subsistema1.crm;

import static java.lang.System.out;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        out.println("Cliente salvo no sistema de CRM:");
        out.println(nome);
        out.println(cep);
        out.println(cidade);
        out.println(estado);
    }
}