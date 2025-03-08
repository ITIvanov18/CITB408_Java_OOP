package Repo;

public class Repository {

    private double maxSize;
    private int uploadedFiles;
    private double currentSize;

    public Repository(double maxSize) {
        this.maxSize = maxSize;
    }

    public Repository(double maxSize, int uploadedFiles, double currentSize) {
        this.maxSize = maxSize;
        this.uploadedFiles = uploadedFiles;
        this.currentSize = currentSize;
    }

    public double getMaxSize() {
        return maxSize;
    }

    public int getUploadedFiles() {
        return uploadedFiles;
    }

    public double getCurrentSize() {
        return currentSize;
    }

    public void setMaxSize(double maxSize) {
        this.maxSize = maxSize;
    }

    public void setUploadedFiles(int uploadedFiles) {
        this.uploadedFiles = uploadedFiles;
    }

    public void setCurrentSize(double currentSize) {
        this.currentSize = currentSize;
    }

    public boolean uploadDocument(Document document) {
        if(availableSpace() >= document.getDocSize()) {
            this.uploadedFiles++;
            this.currentSize += document.getDocSize();
            return true;
        }
        return false;
    }

    public double availableSpace() {
        return this.getMaxSize() - this.getCurrentSize();
    }

    @Override
    public String toString() {
        return "Repository{" +
                "maxSize=" + maxSize +
                ", uploadedFiles=" + uploadedFiles +
                ", currentSize=" + currentSize +
                '}';
    }
}
