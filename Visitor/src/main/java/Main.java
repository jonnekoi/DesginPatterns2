public class Main {
    public static void main(String[] args) {

        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.doc", 20);
        File file3 = new File("image.jpg", 5);


        Directory rootDirectory = new Directory("root");
        rootDirectory.addElement(file1);
        rootDirectory.addElement(file2);

        Directory subDirectory = new Directory("subdir");
        subDirectory.addElement(file3);

        rootDirectory.addElement(subDirectory);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        rootDirectory.accept(sizeVisitor);
        System.out.println("Total size of files: " + sizeVisitor.getTotalSize() + " MB");

        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        rootDirectory.accept(searchVisitor);
        System.out.println("Files matching '.txt' search:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println("- " + file.getName());
        }
    }
}
