public class Messages {

    private int messageId;
    private String message;
    private String messageAutor;
    private String messageDate;

    public Messages() {
    }

    public Messages(int messageId, String message, String messageAutor, String messageDate) {
        this.messageId = messageId;
        this.message = message;
        this.messageAutor = messageAutor;
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

    public String getMessageAutor() {
        return messageAutor;
    }

    public void setMessageAutor(String messageAutor) {
        this.messageAutor = messageAutor;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }
}
