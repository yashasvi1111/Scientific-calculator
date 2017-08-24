import java.awt.event.KeyEvent;
import java.util.Stack;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class calc extends javax.swing.JFrame {

    /**
     * Creates new form calc
     */
    public calc() {
        initComponents();
    }String s[]=new String[500];
int l;
public static double evaluate(String expression)
    {
        char[] tokens=expression.toCharArray();
        Stack<Double> values=new Stack<Double>();
        Stack<Character> ops=new Stack<Character>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i]==' ')
            continue;
            if(tokens[i]>='0'&&tokens[i]<='9')
            {
                StringBuffer sbf=new StringBuffer();
                while(i<tokens.length&&tokens[i]>='0'&&tokens[i]<='9')
                sbf.append(tokens[i++]);
                values.push(Double.parseDouble(sbf.toString()));
                i--;
            }
            else if(Character.isLetter(tokens[i]))
            {
                if(tokens[i]=='l')
                {
                    if(tokens[i+1]=='o')
                    {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                    j++;     
                   int endindex=j;
                while(startindex<endindex)
                {
                    
                    s.append(tokens[startindex++]);
                }
               double num=Double.parseDouble(s.toString());
               values.push(Math.log10(num));
               i=endindex;
                }
              else
                {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                    j++;     
                   int endindex=j;
                while(startindex<endindex)
                {
                    
                    s.append(tokens[startindex++]);
                }
               double num=Double.parseDouble(s.toString());
               values.push(Math.log(num));
               i=endindex;
                }  
                }
                else if(tokens[i]=='c')
                {
                    if(tokens[i+1]=='o')
                    {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                    j++;     
                   int endindex=j;
                while(startindex<endindex)
                {
                    
                    s.append(tokens[startindex++]);
                }
               double num=Double.parseDouble(s.toString());
               values.push(Math.cos(num*2.0*Math.PI/360.0));
               i=endindex;
                }
              else
                {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                    j++;     
                   int endindex=j;
                while(startindex<endindex)
                {
                    
                    s.append(tokens[startindex++]);
                }
               double num=Double.parseDouble(s.toString());
               values.push(Math.cbrt(num));
               i=endindex;
                }  
                }
                else if(tokens[i]=='s')
                {
                    if(tokens[i+1]=='i')
                    {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                    j++;     
                   int endindex=j;
                while(startindex<endindex)
                {
                    
                    s.append(tokens[startindex++]);
                }
               double num=Double.parseDouble(s.toString());
               values.push(Math.sin(num*2.0*Math.PI/360.0));
               i=endindex;
                }
              else
                {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                    j++;     
                   int endindex=j;
                while(startindex<endindex)
                {
                    
                    s.append(tokens[startindex++]);
                }
               double num=Double.parseDouble(s.toString());
               values.push(Math.sqrt(num));
               i=endindex;
                }  
                }
                else if(tokens[i]=='t')
                {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                        j++;
                    int endindex=j;
                    while(startindex<endindex)
                    {
                        s.append(tokens[startindex++]);
                        
                    }
                    double num=Double.parseDouble(s.toString());
                    values.push(Math.tan(num*2.0*Math.PI/360.0));
                 i=endindex;   
                }
                else if(tokens[i]=='e')
                {StringBuffer s=new StringBuffer();
                    int j=i;
                    while(tokens[j]!='(')
                        j++;
                    int startindex=j+1;
                    while(tokens[j]!=')')
                        j++;
                    int endindex=j;
                    while(startindex<endindex)
                    {
                        s.append(tokens[startindex++]);
                        
                    }
                    double num=Double.parseDouble(s.toString());
                    values.push(Math.exp(num));
                 i=endindex;   
                }}
                else if(tokens[i]=='^')
                {
                    double num=values.pop();
                    values.push(Math.pow(num,2));
                    i=i+1;
                }
                
            
             else if(tokens[i]=='(')
            ops.push(tokens[i]);
            else if(tokens[i]==')')
            {while(ops.peek()!='(')
                values.push(applyOP(ops.pop(),values.pop(),values.pop()));
                ops.pop();
            }
            else if(tokens[i]=='+'||tokens[i]=='-'||tokens[i]=='*'||tokens[i]=='/')
            {
                while(!ops.empty()&&hasPrecedence(tokens[i],ops.peek()))
                values.push(applyOP(ops.pop(),values.pop(),values.pop()));
                ops.push(tokens[i]);
            }
        }
        while(!ops.empty())
        values.push(applyOP(ops.pop(),values.pop(),values.pop()));
        return values.pop();
    }
    public static boolean hasPrecedence(char op1,char op2)
    {
        if(op2=='('||op2==')')
        return false;
        if((op1=='*'||op1=='/')&&(op2=='+'||op2=='-'))
        return false;
        else
        return true;}
        public static double applyOP(char op,double b,double a)
        {
            switch(op)
            {
                case '+':
                return a+b;
                
                case '-':
                return a-b;
                
                case '*':
                return a*b;
                
                case'/':
               if(b==0)
               throw new
               UnsupportedOperationException("cannot divide by zero");
               
               return a/b;
               
            }
            return 0;
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        del = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        PI = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        log = new javax.swing.JButton();
        div = new javax.swing.JButton();
        o5 = new javax.swing.JButton();
        o0 = new javax.swing.JButton();
        o6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        o7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        o8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        o9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        m = new javax.swing.JTextField();
        plus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        CLR = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        eq = new javax.swing.JButton();
        o1 = new javax.swing.JButton();
        o2 = new javax.swing.JButton();
        o3 = new javax.swing.JButton();
        o4 = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        del.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        del.setText("DEL");
        del.setToolTipText("DEL");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        ln.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ln.setText("ln");
        ln.setToolTipText("ln");
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        PI.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        PI.setText("PI");
        PI.setToolTipText("3.14159265");
        PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton20.setText("sqrt");
        jButton20.setToolTipText("sqrt");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton21.setText("exp");
        jButton21.setToolTipText("exp");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton22.setText("cbrt");
        jButton22.setToolTipText("cbrt");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        log.setText("log");
        log.setToolTipText("log10");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        div.setText("/");
        div.setToolTipText("division");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        o5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o5.setText("5");
        o5.setToolTipText("5");
        o5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o5ActionPerformed(evt);
            }
        });

        o0.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o0.setText("0");
        o0.setToolTipText("0");
        o0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o0ActionPerformed(evt);
            }
        });

        o6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o6.setText("6");
        o6.setToolTipText("6");
        o6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setText("^2");
        jButton1.setToolTipText("square");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        o7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o7.setText("7");
        o7.setToolTipText("7");
        o7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o7ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("(");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        o8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o8.setText("8");
        o8.setToolTipText("8");
        o8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o8ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setText(")");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        o9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o9.setText("9");
        o9.setToolTipText("9");
        o9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o9ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("M+");
        jButton4.setToolTipText("memory add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        dot.setText(".");
        dot.setToolTipText("\".\"");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        plus.setText("+");
        plus.setToolTipText("addition");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setText("HIST");
        jButton5.setToolTipText("previous");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        sub.setText("-");
        sub.setToolTipText("subtraction");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setText("CM");
        jButton6.setToolTipText("clear memory");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        mul.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        mul.setText("*");
        mul.setToolTipText("multiply");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        CLR.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        CLR.setText("CLR");
        CLR.setToolTipText("CLR");
        CLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLRActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sin.setText("sin");
        sin.setToolTipText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        eq.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        eq.setText("=");
        eq.setToolTipText("answer");
        eq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqActionPerformed(evt);
            }
        });
        eq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eqKeyTyped(evt);
            }
        });

        o1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o1.setText("1");
        o1.setToolTipText("1");
        o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1ActionPerformed(evt);
            }
        });
        o1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                o1KeyPressed(evt);
            }
        });

        o2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o2.setText("2");
        o2.setToolTipText("2");
        o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2ActionPerformed(evt);
            }
        });

        o3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o3.setText("3");
        o3.setToolTipText("3");
        o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3ActionPerformed(evt);
            }
        });

        o4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o4.setText("4");
        o4.setToolTipText("4");
        o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o4ActionPerformed(evt);
            }
        });
        o4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                o4KeyPressed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cos.setText("cos");
        cos.setToolTipText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        tan.setText("tan");
        tan.setToolTipText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(o1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(o6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(o0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CLR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(o1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(o6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        String bs=null;
        if(b.getText().length()>0)
        {StringBuilder n=new StringBuilder(b.getText());
            n.deleteCharAt(b.getText().length()-1);
            bs=n.toString();
            b.setText(bs);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        b.append("ln(");        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIActionPerformed
        b.append("3.14159265");        // TODO add your handling code here:
    }//GEN-LAST:event_PIActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        b.append("sqrt(");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        b.append("exp(");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        b.append("cbrt(");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        b.append("log(");        // TODO add your handling code here:
    }//GEN-LAST:event_logActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        b.append("/");        // TODO add your handling code here:
    }//GEN-LAST:event_divActionPerformed

    private void o5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o5ActionPerformed
        b.append("5");        // TODO add your handling code here:
    }//GEN-LAST:event_o5ActionPerformed

    private void o0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o0ActionPerformed
        b.append("0");        // TODO add your handling code here:
    }//GEN-LAST:event_o0ActionPerformed

    private void o6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o6ActionPerformed
        b.append("6");        // TODO add your handling code here:
    }//GEN-LAST:event_o6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        b.append("^2");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void o7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o7ActionPerformed
        b.append("7");        // TODO add your handling code here:
    }//GEN-LAST:event_o7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        b.append("(");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void o8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o8ActionPerformed
        b.append("8");        // TODO add your handling code here:
    }//GEN-LAST:event_o8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        b.append(")");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void o9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o9ActionPerformed
        b.append("9");        // TODO add your handling code here:
    }//GEN-LAST:event_o9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        for (int i=0;i<=500;i++)
        {
            s[i]=b.getText();
            l=i;
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        b.append(".");        // TODO add your handling code here:
    }//GEN-LAST:event_dotActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        b.append("+");
        // TODO add your handling code here:
    }//GEN-LAST:event_plusActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        m.setText(s[l--]);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        b.append("-");        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        m.setText(null);
        s=null;// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        b.append("*");        // TODO add your handling code here:
    }//GEN-LAST:event_mulActionPerformed

    private void CLRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLRActionPerformed
        b.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_CLRActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        b.append("sin(");       // TODO add your handling code here:
    }//GEN-LAST:event_sinActionPerformed

    private void eqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqActionPerformed
        String a=b.getText();
        double num=calc.evaluate(a);
        b.setText(String.format("%f", num));

        // TODO add your handling code here:
    }//GEN-LAST:event_eqActionPerformed

    private void eqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eqKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_eqKeyTyped

    private void o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1ActionPerformed
        b.append("1");        // TODO add your handling code here:
    }//GEN-LAST:event_o1ActionPerformed

    private void o1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_o1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_NUMPAD1)
        {b.append("1");
        }// TODO add your handling code here:
    }//GEN-LAST:event_o1KeyPressed

    private void o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2ActionPerformed
        b.append("2");        // TODO add your handling code here:
    }//GEN-LAST:event_o2ActionPerformed

    private void o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3ActionPerformed
        b.append("3");        // TODO add your handling code here:
    }//GEN-LAST:event_o3ActionPerformed

    private void o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o4ActionPerformed
        b.append("4");        // TODO add your handling code here:
    }//GEN-LAST:event_o4ActionPerformed

    private void o4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_o4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_o4KeyPressed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        b.append("cos(");        // TODO add your handling code here:
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        b.append("tan(");        // TODO add your handling code here:
    }//GEN-LAST:event_tanActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
      MATH f=new MATH();
      calc.this.setVisible(false);
f.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLR;
    private javax.swing.JButton PI;
    private javax.swing.JTextArea b;
    private javax.swing.JButton cos;
    private javax.swing.JButton del;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton eq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JTextField m;
    private javax.swing.JButton mul;
    private javax.swing.JButton o0;
    private javax.swing.JButton o1;
    private javax.swing.JButton o2;
    private javax.swing.JButton o3;
    private javax.swing.JButton o4;
    private javax.swing.JButton o5;
    private javax.swing.JButton o6;
    private javax.swing.JButton o7;
    private javax.swing.JButton o8;
    private javax.swing.JButton o9;
    private javax.swing.JButton plus;
    private javax.swing.JButton sin;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables
}
