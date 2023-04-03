package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo44877d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "fillInStackTrace", "createCopy", "", "toString", "other", "", "equals", "", "hashCode", "Ly23;", "job", "Ly23;", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ly23;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Exceptions.kt */
public final class JobCancellationException extends CancellationException {
    public final transient y23 job;

    public JobCancellationException(String str, Throwable th, y23 y23) {
        super(str);
        this.job = y23;
        if (th != null) {
            initCause(th);
        }
    }

    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!vx2.m53586b(jobCancellationException.getMessage(), getMessage()) || !vx2.m53586b(jobCancellationException.job, this.job) || !vx2.m53586b(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i;
        String message = getMessage();
        vx2.m53588d(message);
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
