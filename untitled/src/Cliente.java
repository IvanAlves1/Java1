public class Cliente{
    String nome;
    String endereco;
    float renda;
    Cliente(String nome, String endereco, float renda){
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
