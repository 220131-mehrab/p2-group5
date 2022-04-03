public class App implements ActionListener{
    JFrame frame;
    JButton button;
    public App(){
        frame = new JFRame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button2 = new JButton("insert");
        button1.addActionListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(button2);
        frame.setVisible(true)
    }
    public static void main(String args[]) {

        @Override
        public String toString() {
            return "movies [movie_title=" + movie_title + ", movie_id=" + movie_id + "movie_time" + movie_time + "movie_ratings" + movie_ratings + "movie_year" + movie_year + "]";

            Conncection conncection = DriverManager.getConnection("jdbc:h2:mem:test;MODE=PostgreSQL;DATABASE_TO_LOWER=TRUE;INIT=runscript from 'classpath:app.component.sql'", "sa", "")

            try {
                PreparedStatement stmt = connection.prepareStatement("insert into movies values(?, ?, ?, ?, ?)");
                stmt.setInt(1, movies.getmovie_id());
                stmt.setString(2, movies.getmovie_title());
                stmt.setInt(3, movies.getmovie_time());
                stmt.setString(4, movies.getmovie_ratings());
                stmt.setInt(5, movies.getmovie_year());
            } catch (SQLException e) {
                System.err.println("Failed to insert: " + e.getMessage());
            }
        }
    }
}