import java.util.Date;

public class ProtectedDocument implements Document {
    private final String id;
    private final Date creationDate;
    private final String content;

    public ProtectedDocument(String id, String content) {
        this.id = id;
        this.creationDate = new Date();
        this.content = content;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}
