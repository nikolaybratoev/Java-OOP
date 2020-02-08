package facade2;

public class ReportWriter {

    public void writeHTMLReport(Report report, String location) {
        System.out.println("HTML report written.");
    }

    public void writePDFReport(Report report, String location) {
        System.out.println("PDF report written.");
    }

    public void writeCSSReport(Report report, String location) {
        System.out.println("CSS report written.");
    }
}
