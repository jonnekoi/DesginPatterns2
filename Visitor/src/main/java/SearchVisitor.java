import java.util.ArrayList;
import java.util.List;

class SearchVisitor implements FileSystemVisitor {
    private String searchCriteria;
    private List<File> matchingFiles = new ArrayList<>();

    public SearchVisitor(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchCriteria)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {}

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}
