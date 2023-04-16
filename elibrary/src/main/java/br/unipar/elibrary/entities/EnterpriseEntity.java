package br.unipar.elibrary.entities;

public class EnterpriseEntity extends UserEntity {
        
    private String cnpj;
    
    public EnterpriseEntity() { }

    public EnterpriseEntity(String cnpj, Long id, String name) {
        super(id, name);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
