import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class BookRepositoryDatabase implements BookRepository {
    private DataSource dataSource;

    public BookRepositoryDatabase(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int addBookToInventory(Book book) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.update(
                "INSERT INTO BOOKS (author, title, isbn) VALUES(?,?,?)",
                book.getAuthor(), book.getTitle(), book.getIsbn()
        );
    }

    @Override
    public List<Book> getBooksFromInventory() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.query(
                "SELECT author, title, isbn FROM BOOKS",
                new BookRowMapper()
        );
    }
}
