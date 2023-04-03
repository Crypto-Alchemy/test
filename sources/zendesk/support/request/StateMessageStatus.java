package zendesk.support.request;

import java.io.Serializable;

class StateMessageStatus implements Serializable {
    public static final int DELIVERED = 2;
    public static final int ERROR = 1;
    public static final int PENDING = 3;
    private final String errorResponse;
    private final int status;

    private StateMessageStatus(int i, String str) {
        this.status = i;
        this.errorResponse = str;
    }

    public static StateMessageStatus delivered() {
        return new StateMessageStatus(2, (String) null);
    }

    public static StateMessageStatus error(String str) {
        return new StateMessageStatus(1, str);
    }

    public static StateMessageStatus pending() {
        return new StateMessageStatus(3, (String) null);
    }

    public String getErrorResponse() {
        return this.errorResponse;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        String str;
        int i = this.status;
        if (i == 1) {
            str = "Error";
        } else if (i == 2) {
            str = "Delivered";
        } else if (i != 3) {
            str = "Unknown";
        } else {
            str = "Pending";
        }
        return "MessageState{status=" + str + ", errorResponse=" + this.errorResponse + '}';
    }
}
