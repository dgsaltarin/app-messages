import java.sql.Date;

public class Messages {

    private int messageId;
    private String message;
    private String messageAuthor;
    private Date messageDate;

    public Messages() {
    }

    public Messages(int messageId, String message, String messageAuthor, Date messageDate) {
        this.messageId = messageId;
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }
}
