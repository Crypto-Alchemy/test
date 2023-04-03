package retrofit2;

import java.util.Objects;

public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final transient bg5<?> f44356a;
    private final int code;
    private final String message;

    public HttpException(bg5<?> bg5) {
        super(m71518a(bg5));
        this.code = bg5.mo50579b();
        this.message = bg5.mo50582f();
        this.f44356a = bg5;
    }

    /* renamed from: a */
    public static String m71518a(bg5<?> bg5) {
        Objects.requireNonNull(bg5, "response == null");
        return "HTTP " + bg5.mo50579b() + " " + bg5.mo50582f();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public bg5<?> response() {
        return this.f44356a;
    }
}
