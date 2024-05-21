package DocumentManagement;

public class Client {
    public static void main(String[] args) {
        NewDocument();
    }

    public static void NewDocument() {
        Document normalDocument = new NormalDoc().SetExtension("txt").SetEncryption("none").BuildDocument();
        Document confidentialDocument = new ConfidentialDoc().SetExtension("zip").SetEncryption("aes").BuildDocument();
    }
}
