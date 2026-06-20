public class DocumentTest {
    public static void main(String[] args) {
        System.out.println("Testing Factory Method Pattern...\n");

        // Create Word Document using its factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        System.out.println("--- Word Document ---");
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();
        System.out.println();

        // Create PDF Document using its factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        System.out.println("--- PDF Document ---");
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();
        System.out.println();

        // Create Excel Document using its factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        System.out.println("--- Excel Document ---");
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}
