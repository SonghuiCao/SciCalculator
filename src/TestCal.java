import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

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

    public TestCal() {
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(0));
                String equ = txtEqu.getText() + btn0.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn0.getText();
                txtInput.setText(input);
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(1));
                String equ = txtEqu.getText() + btn1.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn1.getText();
                txtInput.setText(input);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(2));
                String equ = txtEqu.getText() + btn2.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn2.getText();
                txtInput.setText(input);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(3));
                String equ = txtEqu.getText() + btn3.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn3.getText();
                txtInput.setText(input);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(4));
                String equ = txtEqu.getText() + btn4.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn4.getText();
                txtInput.setText(input);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(5));
                String equ = txtEqu.getText() + btn5.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn5.getText();
                txtInput.setText(input);
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(6));
                String equ = txtEqu.getText() + btn6.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn6.getText();
                txtInput.setText(input);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(7));
                String equ = txtEqu.getText() + btn7.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn7.getText();
                txtInput.setText(input);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(8));
                String equ = txtEqu.getText() + btn8.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn8.getText();
                txtInput.setText(input);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expre.add(String.valueOf(9));
                String equ = txtEqu.getText() + btn9.getText();
                txtEqu.setText(equ);
                String input =  txtInput.getText() + btn9.getText();
                txtInput.setText(input);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(String.valueOf('+'));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnPlus.getText();
                txtEqu.setText(equ);
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(String.valueOf('-'));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnMinus.getText();
                txtEqu.setText(equ);
            }
        });

        btnTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(String.valueOf('*'));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnTimes.getText();
                txtEqu.setText(equ);
            }
        });

        btnEqu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expre.add(txtInput.getText());
                expre.add(String.valueOf('='));
                txtInput.setText("");
                String btnEq_txt = btnEqu.getText();
                String txt = txtEqu.getText();
                String equ = txt + btnEq_txt;
                txtEqu.setText(equ);
                txtRes.setText(Arrays.toString(expre.toArray()));
                double answer = cal(expre);
                txtAnswer.setText(String.valueOf(answer));
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
                expre.add(String.valueOf('/'));
                txtInput.setText("");
                String equ = txtEqu.getText() + btnDiv.getText();
                txtEqu.setText(equ);
            }
        });
    }

    private static double cal(ArrayList expr) {
        //double total = (double) expr.get(0);
        ArrayList<Double> num = new ArrayList<Double>();
        ArrayList<Character> op = new ArrayList<Character>();
        for (int i = 0; i < expr.size(); i++) {
            if (!expr.get(i).equals("+") && !expr.get(i).equals("-") && !expr.get(i).equals("*") && !expr.get(i).equals("=") && !expr.get(i).equals("/")) {
                num.add(Double. parseDouble((String) expr.get(i)));
            } else {
                String st = (String) expr.get(i);
                char ar = st.charAt(0);
                op.add(ar);
            }
        }
        System.out.println(Arrays.toString(num.toArray()));
        System.out.println(Arrays.toString(op.toArray()));

        double total = num.get(0);
        for (int i = 0; i < op.size(); i++) {
            if (op.get(i) == '+') {
                total = total + num.get(i + 1);
            } else if (op.get(i) == '-') {
                total = total - num.get(i + 1);
            } else if (op.get(i) == '*') {
                double temp = total * num.get(i + 1);
                total = temp;
            } else if (op.get(i) == '/') {
                double temp = total / num.get(i + 1);
                total = temp;
            } else if (op.get(i) == '=') {
                System.out.println("result: " + total);
                break;
            }
        }
        return total;
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
