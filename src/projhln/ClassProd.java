
package projhln;

import java.util.Objects;

public class ClassProd {
    private String Produto;
    private float preco,PrecoVenda;
    private int Quantidade,Posicao,estq;

   /* public ClassProd(String Produto, float preco,float precoVenda, int Quantidade, int Posicao, ClasseUsuario ur){
        this.Produto = Produto;
        this.preco = preco;
        this.PrecoVenda = precoVenda;
        this.Quantidade = Quantidade;
        this.Posicao = Posicao;
        this.ur = ur;
    }
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Produto);
        hash = 53 * hash + Float.floatToIntBits(this.preco);
        hash = 53 * hash + Float.floatToIntBits(this.PrecoVenda);
        hash = 53 * hash + this.Quantidade;
        hash = 53 * hash + this.Posicao;
        hash = 53 * hash + this.estq;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClassProd other = (ClassProd) obj;
        if (Float.floatToIntBits(this.preco) != Float.floatToIntBits(other.preco)) {
            return false;
        }
        if (Float.floatToIntBits(this.PrecoVenda) != Float.floatToIntBits(other.PrecoVenda)) {
            return false;
        }
        if (this.Quantidade != other.Quantidade) {
            return false;
        }
        if (this.Posicao != other.Posicao) {
            return false;
        }
        if (this.estq != other.estq) {
            return false;
        }
        if (!Objects.equals(this.Produto, other.Produto)) {
            return false;
        }
        return true;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(float PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getPosicao() {
        return Posicao;
    }

    public void setPosicao(int Posicao) {
        this.Posicao = Posicao;
    }

    public int getEstq() {
        return estq;
    }

    public void setEstq(int estq) {
        this.estq = estq;
    }

   
}
