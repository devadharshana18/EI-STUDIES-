// Legacy system interface
interface LegacyReportGenerator {
    String generateReport();
}

// Concrete implementation of the legacy system
class OldReportGenerator implements LegacyReportGenerator {
    @Override
    public String generateReport() {
        return "Report from Old System";
    }
}

// New system interface
interface NewReportGenerator {
    String generate();
}

// Adapter class that allows the new system to work with the old system
class ReportAdapter implements NewReportGenerator {
    private LegacyReportGenerator legacyReportGenerator;

    public ReportAdapter(LegacyReportGenerator legacyReportGenerator) {
        this.legacyReportGenerator = legacyReportGenerator;
    }

    @Override
    public String generate() {
        return legacyReportGenerator.generateReport();
    }
}

// Main
public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacyReportGenerator oldGenerator = new OldReportGenerator();
        NewReportGenerator newGenerator = new ReportAdapter(oldGenerator);

        System.out.println(newGenerator.generate());
    }
}
