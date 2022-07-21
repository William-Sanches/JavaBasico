package aula8;

public class servico {
    public static void main(String[] args) {
        
        Pessoa pFisca = new Pessoa();

        pFisca.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pFisca.setNumeroDocumento(pFisca.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pFisca);

        Pessoa pJuridica = new Pessoa();
        pJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pJuridica.setNumeroDocumento(pJuridica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pJuridica);
    }
}
