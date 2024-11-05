import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private final HashMap<String, Set<String>> accessMap = new HashMap<>();

    private AccessControlService() {}

    public static synchronized AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess(String documentId, String username) {
        accessMap.computeIfAbsent(documentId, k -> new HashSet<>()).add(username); // add user access
    }

    public boolean isAllowed(String documentId, String username) {
        return accessMap.getOrDefault(documentId, new HashSet<>()).contains(username); // return true if user added to have access
    }
}
