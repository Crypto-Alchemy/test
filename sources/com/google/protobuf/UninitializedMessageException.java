package com.google.protobuf;

import java.util.Collections;
import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(C4956c0 c0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    /* renamed from: a */
    public static String m38978a(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        return sb.toString();
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public UninitializedMessageException(List<String> list) {
        super(m38978a(list));
        this.missingFields = list;
    }
}
