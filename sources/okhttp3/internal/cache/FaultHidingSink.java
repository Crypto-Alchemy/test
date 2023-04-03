package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo44877d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lp82;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lrc2;", "getOnException", "()Lrc2;", "", "hasErrors", "Z", "Ls36;", "delegate", "<init>", "(Ls36;Lrc2;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: FaultHidingSink.kt */
public class FaultHidingSink extends p82 {
    private boolean hasErrors;
    private final rc2<IOException, r37> onException;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(s36 s36, rc2<? super IOException, r37> rc2) {
        super(s36);
        vx2.m53591g(s36, "delegate");
        vx2.m53591g(rc2, "onException");
        this.onException = rc2;
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public final rc2<IOException, r37> getOnException() {
        return this.onException;
    }

    public void write(m40 m40, long j) {
        vx2.m53591g(m40, "source");
        if (this.hasErrors) {
            m40.skip(j);
            return;
        }
        try {
            super.write(m40, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
