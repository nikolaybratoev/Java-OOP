package facade2;

public class Main {
    public static void main(String[] args) {

        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

        reportGeneratorFacade.generateReport(ReportType.HTML, null, null);

        reportGeneratorFacade.generateReport(ReportType.CSS, null, null);
    }
}
