package solid;

class ReportGenerator {
    public String generateReport() {
        // Logic to generate report
        return "Report content";
    }
}

class FileSaver {
    public void saveToFile(String content, String fileName) {
        // Logic to save content to a file
        System.out.println("Saved to file: " + fileName);
    }
}


/*
Definition: A class should have one, and only one, reason to change. This means a class should have only one responsibility.
*/
public class SingleResponsibility {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        String report = reportGenerator.generateReport();

        FileSaver fileSaver = new FileSaver();
        fileSaver.saveToFile(report, "report.txt");
    }
}
