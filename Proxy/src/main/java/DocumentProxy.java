import java.util.Date;

public class DocumentProxy implements Document {
    private final ProtectedDocument protectedDocument;
    private final AccessControlService accessControlService = AccessControlService.getInstance();

    public DocumentProxy(String id, String content) {
        this.protectedDocument = new ProtectedDocument(id, content);
    }

    @Override
    public String getId() {
        return protectedDocument.getId();
    }

    @Override
    public Date getCreationDate() {
        return protectedDocument.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (accessControlService.isAllowed(protectedDocument.getId(), user.getUsername())) {
            return protectedDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }
}
