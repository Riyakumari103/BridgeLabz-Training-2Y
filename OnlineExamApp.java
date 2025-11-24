import java.time.LocalDateTime;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String msg) { super(msg); }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String msg) { super(msg); }
}
class OnlineExam {
   
    private LocalDateTime deadline = LocalDateTime.of(2025, 11, 30, 23, 59);

    public void submitExam(String fileName, LocalDateTime submissionTime) 
            throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.toLowerCase().endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format");
        }
        if (submissionTime.isAfter(deadline)) {
            throw new LateSubmissionException("Submission failed: late submission");
        }

        System.out.println("Exam submitted successfully: " + fileName);
    }
}
public class OnlineExamApp {
    public static void main(String[] args) {
        OnlineExam exam = new OnlineExam();

        try {
            exam.submitExam("answers.docx", LocalDateTime.of(2025, 11, 30, 20, 0));
        } catch (LateSubmissionException | InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            exam.submitExam("answers.pdf", LocalDateTime.of(2025, 12, 1, 10, 0));
        } catch (LateSubmissionException | InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            exam.submitExam("final_exam.pdf", LocalDateTime.of(2025, 11, 30, 22, 30));
        } catch (LateSubmissionException | InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
