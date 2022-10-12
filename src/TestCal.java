import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.StreamSupport;

public class TestCal extends JFrame{

    private double total1 = 0.0;
    private double total2 = 0.0;
    private ArrayList<String> expre = new ArrayList<String>();

    private JLabel txtEqu;
    private JButton btn1;
    private JButton btn4;
    private JButton btn2;
    private JButton btn0;
    private JButton btn3;
    private JButton btn5;
    private JButton btn6;
    private JButton btn8;
    private JButton btn9;
    private JButton btn7;
    private JButton btnDot;
    private JButton btnEqu;
    private JButton btnMinus;
    private JButton btnTimes;
    private JPanel panelMain;
    private JButton btnPlus;
    private JButton btnClear;
    private JLabel txtRes;
    private JLabel labExp;
    private JLabel labRes;
    private JLabel labInput;
    private JLabel txtInput;
    private JLabel txtAnswer;
    private JButton btnDiv;
    private JButton btnExpo;
    private JButton btnRiPar;
    private JButton btnLeftPar;
    private JButton btnLeCu;
    private JButton btnRiCu;
    private JButton btnLn;
    private JButton btnCos;
    private JButton btnSin;
    private JButton btnLog;
    private JButton btnCot;
    private JButton btnTan;
    private JButton btnExit;

    public TestCal() {
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(0));
                String equ = txtEqu.getText() + btn0.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn0.getText();
                txtInput.setText(input);
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(1));
                String equ = txtEqu.getText() + btn1.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn1.getText();
                txtInput.setText(input);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(2));
                String equ = txtEqu.getText() + btn2.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn2.getText();
                txtInput.setText(input);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(3));
                String equ = txtEqu.getText() + btn3.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn3.getText();
                txtInput.setText(input);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(4));
                String equ = txtEqu.getText() + btn4.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn4.getText();
                txtInput.setText(input);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(5));
                String equ = txtEqu.getText() + btn5.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn5.getText();
                txtInput.setText(input);
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(6));
                String equ = txtEqu.getText() + btn6.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn6.getText();
                txtInput.setText(input);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(7));
                String equ = txtEqu.getText() + btn7.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn7.getText();
                txtInput.setText(input);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(8));
                String equ = txtEqu.getText() + btn8.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn8.getText();
                txtInput.setText(input);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //show the number
                //expre.add(String.valueOf(9));
                String equ = txtEqu.getText() + btn9.getText() + " ";
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn9.getText();
                txtInput.setText(input);

                //lock the button
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtInput.getText().equals("")){
                    expre.add(txtInput.getText());
                }

                if (expre.isEmpty() || expre.get(expre.size() - 1).equals("( ") || expre.get(expre.size() - 1).equals("{ ")) {

                    expre.add("0 ");
                    expre.add("+ ");
                    String tem = txtEqu.getText() + "0 + ";
                    txtEqu.setText(tem);

                }else if (expre.get(expre.size() - 1).equals("+ ") || expre.get(expre.size() - 1).equals("- ")) {

                    expre.add("( ");
                    expre.add("0 ");
                    expre.add("- ");
                    expre.add("1 ");
                    expre.add(") ");
                    expre.add("* ");
                    expre.add("( ");

                    String temp = txtEqu.getText() + "( 0 + 1 ) * ( ";
                    txtEqu.setText(temp);

                } else {
                    expre.add(("+ "));

                    //clear the number input
                    txtInput.setText("");
                    String equ = txtEqu.getText() + btnPlus.getText() + " ";
                    txtEqu.setText(equ);
                }

            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtInput.getText().equals("")){
                    expre.add(txtInput.getText());
                }

                if (expre.isEmpty() || expre.get(expre.size() - 1).equals("( ") || expre.get(expre.size() - 1).equals("{ ")) {

                    expre.add("0 ");
                    expre.add("- ");
                    String tem = txtEqu.getText() + "0 - ";
                    txtEqu.setText(tem);

                }else if (expre.get(expre.size() - 1).equals("+ ") || expre.get(expre.size() - 1).equals("- ")) {

                    expre.add("( ");
                    expre.add("0 ");
                    expre.add("- ");
                    expre.add("1 ");
                    expre.add(") ");
                    expre.add("* ");
                    expre.add("( ");

                    String temp = txtEqu.getText() + "( 0 - 1 ) * ( ";
                    txtEqu.setText(temp);

                } else {
                    expre.add(("- "));

                    //clear the number input
                    txtInput.setText("");
                    String equ = txtEqu.getText() + btnMinus.getText() + " ";
                    txtEqu.setText(equ);
                }
            }
        });

        btnTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(("* "));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnTimes.getText()  + " ";
                txtEqu.setText(equ);
            }
        });

        btnEqu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEqu.setEnabled(false);
                btnEqu.setEnabled(false);
                btnTimes.setEnabled(false);
                btnMinus.setEnabled(false);
                btnPlus.setEnabled(false);
                btnDiv.setEnabled(false);
                btnDot.setEnabled(false);
                btnRiPar.setEnabled(false);
                btnLeftPar.setEnabled(false);
                btn0.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btnExpo.setEnabled(false);
                btnLeCu.setEnabled(false);
                btnRiCu.setEnabled(false);
                btnLn.setEnabled(false);
                btnCos.setEnabled(false);
                btnSin.setEnabled(false);
                btnLog.setEnabled(false);
                btnCot.setEnabled(false);
                btnTan.setEnabled(false);

                expre.add(txtInput.getText());

                txtInput.setText("");
                //String btnEq_txt = btnEqu.getText();
                String txt = txtEqu.getText();

                String expres = "";
                for (int i = 0; i < expre.size(); i++) {
                    expres = expres + expre.get(i) + " ";
                }
                //expre.add(String.valueOf("= "));
                String postfix = infixToPostfix(expres, txtInput);
                if (postfix.equals("N/A")) {
                    txtInput.setText("Try again, your mathematical expression is incorrect! ");
                    btnEqu.setEnabled(false);
                    btnTimes.setEnabled(false);
                    btnMinus.setEnabled(false);
                    btnPlus.setEnabled(false);
                    btnDiv.setEnabled(false);
                    btnDot.setEnabled(false);
                    btnRiPar.setEnabled(false);
                    btnLeftPar.setEnabled(false);
                    btn0.setEnabled(false);
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                    btnExpo.setEnabled(false);
                    btnLeCu.setEnabled(false);
                    btnRiCu.setEnabled(false);
                    btnLn.setEnabled(false);
                    btnCos.setEnabled(false);
                    btnSin.setEnabled(false);
                    btnLog.setEnabled(false);
                    btnCot.setEnabled(false);
                    btnTan.setEnabled(false);
                } else {
                    String ans = evalRPN(postfix);
                    if (ans.equals("N/A")) {
                        txtInput.setText("Try again! Your mathematical expression is incorrect! ");
                        btnEqu.setEnabled(false);
                        btnTimes.setEnabled(false);
                        btnMinus.setEnabled(false);
                        btnPlus.setEnabled(false);
                        btnDiv.setEnabled(false);
                        btnDot.setEnabled(false);
                        btnRiPar.setEnabled(false);
                        btnLeftPar.setEnabled(false);
                        btn0.setEnabled(false);
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);
                        btnExpo.setEnabled(false);
                        btnLeCu.setEnabled(false);
                        btnRiCu.setEnabled(false);
                        btnLn.setEnabled(false);
                        btnCos.setEnabled(false);
                        btnSin.setEnabled(false);
                        btnLog.setEnabled(false);
                        btnCot.setEnabled(false);
                        btnTan.setEnabled(false);
                    } else {
                        txtAnswer.setText((ans));
                        //txtInput.setText(Arrays.toString(expre.toArray()));
                    }
                }

                String equ = txt + btnEqu.getText();
                txtEqu.setText(equ);
                txtRes.setText(expres);

                //double answer = cal(expre);

            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtEqu.setText("");
                txtInput.setText("");
                txtRes.setText("");
                txtAnswer.setText("");
                expre.clear();
                btnEqu.setEnabled(true);
                btnTimes.setEnabled(true);
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);
                btnDiv.setEnabled(true);
                btnDot.setEnabled(true);
                btnRiPar.setEnabled(true);
                btnLeftPar.setEnabled(true);
                btn0.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btnExpo.setEnabled(true);
                btnLeCu.setEnabled(true);
                btnRiCu.setEnabled(true);
                btnLn.setEnabled(true);
                btnCos.setEnabled(true);
                btnSin.setEnabled(true);
                btnLog.setEnabled(true);
                btnCot.setEnabled(true);
                btnTan.setEnabled(true);
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtInput.getText().equals("")) {
                    txtInput.setText("0.");
                    String equ = txtEqu.getText() + "0.";
                    txtEqu.setText(equ);
                } else if (txtInput.getText().contains(".")) {
                    btnDot.setEnabled(false);
                } else {
                    String btnD = txtInput.getText() + btnDot.getText();
                    txtInput.setText(btnD);
                    String equ = txtEqu.getText() + ".";
                    txtEqu.setText(equ);
                }
                btnDot.setEnabled(true);
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add("/ ");
                txtInput.setText("");
                String equ = txtEqu.getText() + btnDiv.getText()  + " ";
                txtEqu.setText(equ);
            }
        });

        btnExpo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(("^ "));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnExpo.getText()  + " ";
                txtEqu.setText(equ);
            }
        });

        btnLeftPar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                expre.add(txtInput.getText());
                expre.add(("( "));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnLeftPar.getText() + " ";
                txtEqu.setText(equ);
            }
        });

        btnRiPar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add((") "));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnRiPar.getText()  + " ";
                txtEqu.setText(equ);
            }
        });

        btnLeCu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(("{ "));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnLeCu.getText() + " ";
                txtEqu.setText(equ);
            }
        });

        btnRiCu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(("} "));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnRiCu.getText() + " ";
                txtEqu.setText(equ);
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add("sin ");
                expre.add("( ");
                txtInput.setText("");
                String equ = txtEqu.getText() + "sin ( ";
                txtEqu.setText(equ);
            }
        });

        btnCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add("cos ");
                expre.add("( ");
                txtInput.setText("");
                String equ = txtEqu.getText() + "cos ( ";
                txtEqu.setText(equ);
            }
        });

        btnTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add("tan ");
                expre.add("( ");
                txtInput.setText("");
                String equ = txtEqu.getText() + "tan ( ";
                txtEqu.setText(equ);
            }
        });

        btnLn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add("ln ");
                expre.add("( ");
                txtInput.setText("");
                String equ = txtEqu.getText() + "ln ( ";
                txtEqu.setText(equ);
            }
        });

        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add("log ");
                expre.add("( ");
                txtInput.setText("");
                String equ = txtEqu.getText() + "log ( ";
                txtEqu.setText(equ);
            }
        });

        btnCot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add("cot ");
                expre.add("( ");
                txtInput.setText("");
                String equ = txtEqu.getText() + "cot ( ";
                txtEqu.setText(equ);
            }
        });
    }

    private static String infixToPostfix(String infix, JLabel msg) {
        /* To find out the precedence, we take the index of the
           token in the ops string and divide by 2 (rounding down).
           This will give us: 0, 0, 1, 1, 2 */
        //final String ops = "-+/*^";
        final ArrayList<String> op = new ArrayList<String>();
        op.add("-");
        op.add("+");
        op.add("/");
        op.add("*");
        op.add("^");
        op.add("^");
        op.add("sin");
        op.add("cos");
        op.add("tan");
        op.add("cot");
        op.add("ln");
        op.add("log");

        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        try {
            for (String token : infix.split("\\s")) {
                if (token.isEmpty())
                    continue;
                //String c = String.valueOf(token.charAt(0));
                int idx = op.indexOf(token);

                // check for operator
                if (idx != -1) {
                    if (s.isEmpty())
                        s.push(idx);

                    else {
                        while (!s.isEmpty()) {
                            int prec2 = s.peek() / 2;
                            int prec1 = idx / 2;
                            if (prec2 >= 3 && prec1 >= 3){
                                sb.append(op.get(s.pop())).append(' ');
                            } else if (prec2 > prec1 || prec2 == prec1) {
                                sb.append(op.get(s.pop())).append(' ');
                            } else {
                                break;
                            }
                        }
                        s.push(idx);
                    }
                } else if (token.equals("(")) {
                    s.push(-2); // -2 stands for '('
                } else if (token.equals(")")) {
                    // until '(' on stack, pop operators.
                    while (s.peek() != -2) {
                        sb.append(op.get(s.pop())).append(' ');
                    }
                    s.pop();
                } else if (token.equals("{")) {
                    s.push(-3); // -3 stands for '{'
                } else if (token.equals("}")) {
                    // until '{' on stack, pop operators.
                    while (s.peek() != -3) {
                        sb.append(op.get(s.pop())).append(' ');
                    }
                    s.pop();
                } else {
                    sb.append(token).append(' ');
                }
            }


            while (!s.isEmpty()) {
                sb.append(op.get(s.pop())).append(' ');
            }
            return sb.toString();
        } catch (Exception e) {
            System.out.println("Incorrect input");
            msg.setText("Your input is incorrect! ");
            //System.exit(0);
            return "N/A";
        }
    }

    private static String evalRPN(String expr){
        LinkedList<Double> stack = new LinkedList<Double>();
        //System.out.println("Input\tOperation\tStack after");
        try {
            for (String token : expr.split("\\s")) {
                //System.out.print(token + "\t");
                if (token.equals("*")) {
                    //System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(firstOperand * secondOperand);
                } else if (token.equals("/")) {
                    //System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    //check if it is divide by 0
                    if (secondOperand == 0.0) {
                        return "N/A";
                    }
                    double firstOperand = stack.pop();
                    stack.push(firstOperand / secondOperand);
                } else if (token.equals("-")) {
                    //System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(firstOperand - secondOperand);
                } else if (token.equals("+")) {
                    //System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(firstOperand + secondOperand);
                } else if (token.equals("^")) {
                    //System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(Math.pow(firstOperand, secondOperand));
                } else if (token.equals("sin")) {
                    //System.out.print("Operate\t\t");
                    double Operand = stack.pop();
                    stack.push(Math.sin(Operand));
                } else if (token.equals("cos")) {
                    //System.out.print("Operate\t\t");
                    double Operand = stack.pop();
                    stack.push(Math.cos(Operand));
                } else if (token.equals("tan")) {
                    //System.out.print("Operate\t\t");
                    double Operand = stack.pop();
                    stack.push(Math.tan(Operand));
                } else if (token.equals("cot")) {
                    //System.out.print("Operate\t\t");
                    double Operand = stack.pop();
                    if (Operand == 0) {
                        System.out.println("Inside cot is 0");
                        return "N/A";
                    }
                    double temp = 1 / Math.tan(Operand);
                    stack.push(temp);
                } else if (token.equals("ln")) {
                    //System.out.print("Operate\t\t");
                    double Operand = stack.pop();
                    if (Operand <= 0) {
                        System.out.println("Inside ln function <= 0");
                        return "N/A";
                    }
                    stack.push(Math.log(Operand));
                } else if (token.equals("log")) {
                    //System.out.print("Operate\t\t");
                    double Operand = stack.pop();
                    if (Operand <= 0) {
                        System.out.println("Inside log function <= 0");
                        return "N/A";
                    }
                    stack.push(Math.log10(Operand));
                } else {
                    //System.out.print("Push\t\t");
                    try {
                        stack.push(Double.parseDouble(token + ""));
                    } catch (NumberFormatException e) {
                        System.out.println("\nError: invalid token " + token);
                        //System.exit(0);
                        return "N/A";
                    }
                }
                //System.out.println(stack);

            }
            if (stack.size() > 1) {
                System.out.println("Error, too many operands: " + stack);

                //System.exit(0);
                return "N/A";
            }
            //System.out.println("Final answer: " + stack.pop());
            return stack.pop().toString();
        } catch (Exception e) {
            System.out.println("Incorrect input! ");
            //System.exit(0);
            return "N/A";
        }
    }

    public static void main(String[] args) {
        TestCal ca = new TestCal();
        ca.setContentPane(ca.panelMain);
        ca.setTitle("Calculator");
        ca.setSize(500, 700);
        ca.setVisible(true);
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
