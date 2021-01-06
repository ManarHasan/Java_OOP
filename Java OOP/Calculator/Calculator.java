public class Calculator{
    double operandOne = 0.0;
    double operandTwo = 0.0;
    String operation = "";
    public double getOperandOne(){
        return this.operandOne;
    }
    public void setOperandOne(double operand){
        this.operandOne = operand;
    }
    public double getOperandTwo(){
        return this.operandTwo;
    }
    public void setOperandTwo(double operand){
        this.operandTwo = operand;
    }
    public String getOperation(){
        return this.operation;
    }
    public void setOperation(String op){
        this.operation = op;
    }
    public double getResults(){
        if (getOperation() == "+"){
            return getOperandOne()+getOperandTwo();
        }
        else if (getOperation() == "-"){
            return getOperandOne()-getOperandTwo();
        }
        return 0;
    }
}