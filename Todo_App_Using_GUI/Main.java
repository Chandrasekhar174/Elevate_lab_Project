import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
class Main{
    public static void main(String[] args) {
        JFrame jf=new JFrame("ToDo App");
        jf.setSize(800, 800);
        jf.setLayout(null);
       
        JTextField tf=new JTextField();
        tf.setBounds(100,60,200,30);
        jf.add(tf);


        JButton addBtn=new JButton("ADD");
        addBtn.setBounds(320, 60, 120, 30);
        jf.add(addBtn);
        addBtn.setBackground(Color.WHITE);
        addBtn.setFont(new Font("Arial",Font.BOLD,15));
        addBtn.setForeground(Color.BLACK);
        addBtn.setMargin(null);
        addBtn.setFocusable(false);
       

        JButton removeBtn=new JButton("Remove");
        removeBtn.setBounds(445, 60, 120, 30);
        jf.add(removeBtn);
        removeBtn.setBackground(Color.WHITE);
        removeBtn.setFont(new Font("Arial",Font.BOLD,15));
        removeBtn.setForeground(Color.BLACK);
        removeBtn.setMargin(null);
        removeBtn.setFocusable(false);
        

        DefaultListModel<String> model=new DefaultListModel<>();
        JList<String> taskList=new JList<>(model);
        taskList.setFont(new Font("Arial",Font.BOLD,15));

        JScrollPane scroll=new JScrollPane(taskList);
        scroll.setBounds(100, 100, 400, 400);
        jf.add(scroll);

        addBtn.addActionListener(action->{
            String work=tf.getText().trim();
            if(!work.isEmpty()){
                model.addElement(work);
                tf.setText("");
            }
            else{
                JOptionPane.showMessageDialog(jf,"Please Enter task");
            }
        });

        removeBtn.addActionListener(action->{
            int index=taskList.getSelectedIndex();
            if(index!=-1){
                model.remove(index);

            }
            else{
                JOptionPane.showMessageDialog(jf, "Please select any task");
            }

        });

        jf.setVisible(true);
    }
}