public class App implements ActionListener{
    JFrame frame;
    JButton button;
    public App(){
        frame = new JFRame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("insert");
        button.addActionListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true)
    }
    public static void main(String args[]) throws SQLException{
        JButtonTest test = new JButtonTest();

        HttpServlet NextFlix = new HttpServlet(){

        }
    }
}