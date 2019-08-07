package model;

public class Calc {

    private int fator1, fator2;
    private int resultado = 0;
    private String operacao;

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public int getFator1() {
        return fator1;
    }

    public void setFator1(int fator1) {
        this.fator1 = fator1;
    }

    public int getFator2() {
        return fator2;
    }

    public void setFator2(int fator2) {
        this.fator2 = fator2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
