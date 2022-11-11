package subsistema1.crm;

import static java.lang.System.out;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        out.println("Cliente salvo no sistema de CRM:");
        out.println("Nome: "+ nome);
        out.println("CEP: "+ cep);
        out.println("Cidade: "+ cidade);
        out.println("Estado: "+estado);
    }
}