import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class TreeExample {  
JFrame f;  
TreeExample(){  
    f=new JFrame();   
    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
    DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
    style.add(color);  
    style.add(font);  
    DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
    DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
    DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
    color.add(red); color.add(blue); color.add(black); color.add(green);      
    JTree jt=new JTree(style);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TreeExample();  
}}  






import javax.swing.*;  
public class TabbedPaneExample {  
JFrame f;  
TabbedPaneExample(){  
    f=new JFrame();  
    JTextArea ta=new JTextArea(200,200);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
    JPanel p2=new JPanel();  
    JPanel p3=new JPanel();  
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("main",p1);  
    tp.add("visit",p2);  
    tp.add("help",p3);    
    f.add(tp);  
    f.setSize(300,400);
    f.setVisible(true);
}
public static void main(String args[])
{
	new TabbedPaneExample();
}
}















