package list_continued;

public class Student {
    private String fullName;
    private int batchId;

    public Student(String fullName, int batchId) {
        this.fullName = fullName;
        this.batchId = batchId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }
}
