import java.util.HashMap;

public class Library {
    private final HashMap<String, Document> documents = new HashMap<>();

    public void addUnprotectedDocument(String id, String content) {
        documents.put(id, new UnprotectedDocument(id, content));
    }

    public void addProtectedDocument(String id, String content, String username) {
        DocumentProxy proxy = new DocumentProxy(id, content);
        documents.put(id, proxy);
        AccessControlService.getInstance().grantAccess(id, username);
    }

    public Document getDocument(String id) {
        return documents.get(id);
    }
}
