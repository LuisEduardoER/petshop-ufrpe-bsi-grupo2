package petshop.classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author arthur
 */
public class Venda {

    private int codigo;
    private TipoPagamento tipoPagamento;
    private boolean parcelado;
    private Calendar data;
    private Cliente cliente;
    private CarrinhoProdutos carrinhoProdutos;
    private CarrinhoServicos carrinhoServicos;

    public Venda(TipoPagamento tipoPagamento, boolean parcelado, Calendar data,
            Cliente cliente, CarrinhoProdutos produtos, CarrinhoServicos servicos) {
        this.tipoPagamento = tipoPagamento;
        this.parcelado = parcelado;
        this.data = data;
        this.cliente = cliente;
        this.carrinhoProdutos = produtos;
        this.carrinhoServicos = servicos;
    }

    public Venda() {
        this.tipoPagamento = TipoPagamento.DINHEIRO;
        this.data = new GregorianCalendar();
        this.cliente = new Cliente();
        this.carrinhoProdutos = new CarrinhoProdutos();
        this.carrinhoServicos = new CarrinhoServicos();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public boolean isParcelado() {
        return parcelado;
    }

    public void setParcelado(boolean parcelado) {
        this.parcelado = parcelado;
    }

    public CarrinhoProdutos getProdutos() {
        return carrinhoProdutos;
    }

    public void setProdutos(CarrinhoProdutos produtos) {
        this.carrinhoProdutos = produtos;
    }

    public CarrinhoServicos getServicos() {
        return carrinhoServicos;
    }

    public void setServicos(CarrinhoServicos servicos) {
        this.carrinhoServicos = servicos;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double total(){
        double total = 0;

        Produto[] produtos = (Produto[]) carrinhoProdutos.getProdutos().toArray();
        Servico[] servicos = (Servico[]) carrinhoServicos.getServicos().toArray();

        for(int i = 0; i < produtos.length; i++){
            total += produtos[i].getPrecoVenda();
        }

        for(int i = 0; i < servicos.length; i++){
            total += servicos[i].getPrecoVenda();
        }

        return total;
    }
}