package cn.edu.buaa.jsi.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 14-8-14.
 */
public class FirstAction extends ActionSupport {
    private int operand1;
    private int operand2;

    public String execute() throws Exception {
        if (getSum() >= 0) {
            return "positive";
        }
        else {
            return "negative";
        }
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        System.out.println(operand1);
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        System.out.println(operand2);
        this.operand2 = operand2;
    }

    public int getSum() {
        return operand1 + operand2;
    }
}
