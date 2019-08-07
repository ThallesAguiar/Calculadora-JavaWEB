package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import model.Calc;

@Named(value = "calcBean")
@ManagedBean
@SessionScoped //controller
public class CalcBean implements Serializable {

    Calc calc = new Calc();

    public Calc getCalc() {
        return calc;
    }

    public void setCalc(Calc calc) {
        this.calc = calc;
    }

    public CalcBean() {
    }

    public void soma() {
        calc.setResultado(calc.getFator1() + calc.getFator2());
    }

    public void subtracao() {
        calc.setResultado(calc.getFator1() - calc.getFator2());
    }

    public void multiplicacao() {
        calc.setResultado(calc.getFator1() * calc.getFator2());
    }

    public void divisao() {
        calc.setResultado(calc.getFator1() / calc.getFator2());
    }

    public void raiz() {
        int valor;
        valor = calc.getFator1() + calc.getFator2();
        Math.sqrt(valor);
        calc.setResultado(valor);
    }

    public void calcula() {

        switch (calc.getOperacao()) {

            case "soma":
                soma();
                break;
            case "multiplicação":
                multiplicacao();
                break;
            case "subtração":
                subtracao();
                break;
            case "divisão":
                divisao();
                break;
            case "raiz":
                raiz();
                break;
            default:
                System.out.println("Operação inválida!");
        }

    }

}
