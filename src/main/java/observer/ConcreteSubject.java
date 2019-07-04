package observer;

public class ConcreteSubject extends Subject {
    private String subjectState;

    public ConcreteSubject(String subjectState) {
        this.subjectState = subjectState;
    }

    public String getSubjectState() {
        return subjectState;
    }

    public ConcreteSubject setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        return this;
    }
}
