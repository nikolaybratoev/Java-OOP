package facade2;

public class Report {
    private ReportHeader header;
    private ReportData data;
    private ReportFooter footer;

    public ReportHeader getHeader() {
        return this.header;
    }

    public void setHeader(ReportHeader header) {
        System.out.println("Setting report header.");
        this.header = header;
    }

    public ReportData getData() {
        return this.data;
    }

    public void setData(ReportData data) {
        System.out.println("Setting report data.");
        this.data = data;
    }

    public ReportFooter getFooter() {
        return this.footer;
    }

    public void setFooter(ReportFooter footer) {
        System.out.println("Setting report footer.");
        this.footer = footer;
    }
}
