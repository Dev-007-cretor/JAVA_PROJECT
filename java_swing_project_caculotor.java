import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 class java_swing_project_caculotor implements ActionListener {
      double a=0,c=0,result=0;
     char operator;
    JFrame f= new JFrame();
    JTextField t= new JTextField();
        JButton b = new JButton("0");
        JButton b1= new JButton("1");
        JButton b2= new JButton("2");
        JButton b3= new JButton("3");
        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");
        JButton b7= new JButton("7");
        JButton b8= new JButton("8");
       JButton b9= new JButton("9");
       JButton badd= new JButton("+");
       JButton bsub= new JButton("-");
       JButton bdiv= new JButton("/");
       JButton bmul= new JButton("*");
       JButton dec= new JButton(".");
       JButton eq= new JButton("=");
       JButton clr= new JButton("clear");
       JButton back= new JButton("back");

    java_swing_project_caculotor(){
        f.setVisible(true);
        f.setLayout(null);
        f.setBounds(100,30,200,350);
        t.setBackground(Color.YELLOW);
        t.setForeground(Color.GREEN);
        t.setBounds(500,40,200,50);
        b7.setBounds(500,90,50,50);
        b8.setBounds(550,90,50,50);
        b9.setBounds(600,90,50,50);
        bdiv.setBounds(650,90,50,50);
        b4.setBounds(500,140,50,50);
        b5.setBounds(550,140,50,50);
        b6.setBounds(600,140,50,50);
        bmul.setBounds(650,140,50,50);
        b3.setBounds(500,190,50,50);
        b2.setBounds(550,190,50,50);
        b1.setBounds(600,190,50,50);
        bsub.setBounds(650,190,50,50);
        dec.setBounds(500,240,50,50);
        b.setBounds(550,240,50,50);
        eq.setBounds(600,240,50,50);
        badd.setBounds(650,240,50,50);
        clr.setBounds(500,290,100,50);
        back.setBounds(600,290,100,50);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        eq.addActionListener(this);
        dec.addActionListener(this);
        clr.addActionListener(this);
        back.addActionListener(this);


        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b3);
        f.add(b2);
        f.add(b1);
        f.add(bsub);
        f.add(dec);
        f.add(b);
        f.add(eq);
        f.add(badd);
        f.add(clr);
        f.add(back);
        f.pack();

    }
    public static void main(String[] args){

        new java_swing_project_caculotor();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            t.setText(t.getText().concat(String.valueOf(0)));
        }
        if(e.getSource()==b1){
            t.setText(t.getText().concat(String.valueOf(1)));
        }
        if(e.getSource()==b2){
            t.setText(t.getText().concat(String.valueOf(2)));
        }
        if(e.getSource()==b3){
            t.setText(t.getText().concat(String.valueOf(3)));
        }
        if(e.getSource()==b4){
            t.setText(t.getText().concat(String.valueOf(4)));
        }
        if(e.getSource()==b5){
            t.setText(t.getText().concat(String.valueOf(5)));
        }
        if(e.getSource()==b6){
            t.setText(t.getText().concat(String.valueOf(6)));
        }
        if(e.getSource()==b7){
            t.setText(t.getText().concat(String.valueOf(7)));
        }
        if(e.getSource()==b8){
            t.setText(t.getText().concat(String.valueOf(8)));
        }
        if(e.getSource()==b9){
            t.setText(t.getText().concat(String.valueOf(9)));
        }
        if(e.getSource()==dec){
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==badd){
           a=Double.parseDouble(t.getText());
           operator='+';
           t.setText("");
        }
        if(e.getSource()==bsub){
            a=Double.parseDouble(t.getText());
            operator='-';
            t.setText("");
        }
        if(e.getSource()==bmul){
            a=Double.parseDouble(t.getText());
            operator='*';
            t.setText("");
        }
        if(e.getSource()==bdiv){
            a=Double.parseDouble(t.getText());
            operator='/';
            t.setText("");
        }
        if(e.getSource()==eq){
            c=Double.parseDouble(t.getText());
            switch(operator){
                case '+': result=a+c;
                break;
                case '-': result=a-c;
                break;
                case '*': result=a*c;
                break;
                case '/': result=a/c;
                break;
            }
            t.setText(String.valueOf(result));
            a=result;
        }
        if(e.getSource()==clr){
            t.setText("");
        }
        if(e.getSource()==back){
            String s= t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++){
                t.setText(t.getText()+s.charAt(i));
            }
        }
    }
}
