package facade2;

import javax.sql.DataSource;

public class ReportGeneratorFacade {

    public void generateReport(ReportType type, DataSource dataSource, String location) {
        if (type == null || dataSource == null) {
            try {
                throw new Exception("Some value is null.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        Report report = new Report();
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());
        report.setData(new ReportData());

        ReportWriter writer = new ReportWriter();

        if (type != null) {
            switch (type) {
                case CSS:
                    writer.writeCSSReport(report, location);
                    break;
                case PDF:
                    writer.writePDFReport(report, location);
                    break;
                case HTML:
                    writer.writeHTMLReport(report, location);
            }
        }
    }
}
