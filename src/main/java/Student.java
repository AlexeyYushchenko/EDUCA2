import java.util.Objects;

public class Student {
    int value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return value == student.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
