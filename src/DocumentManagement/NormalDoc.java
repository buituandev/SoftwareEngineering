package DocumentManagement;

public class NormalDoc implements DocumentBuilder {
    private String extension;
    private String encryption;

    @Override
    public DocumentBuilder SetExtension(String extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public DocumentBuilder SetEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    @Override
    public Document BuildDocument() {
        return new Document(this.extension, this.encryption);
    }
}
