package DocumentManagement;

public interface DocumentBuilder {

    public DocumentBuilder SetExtension(String extension);

    public DocumentBuilder SetEncryption(String encryption);

    public Document BuildDocument();
}
