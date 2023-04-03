package p000;

/* renamed from: by6 */
/* compiled from: TrimmedThrowableData */
public class by6 {

    /* renamed from: a */
    public final String f21513a;

    /* renamed from: b */
    public final String f21514b;

    /* renamed from: c */
    public final StackTraceElement[] f21515c;

    /* renamed from: d */
    public final by6 f21516d;

    public by6(Throwable th, w76 w76) {
        by6 by6;
        this.f21513a = th.getLocalizedMessage();
        this.f21514b = th.getClass().getName();
        this.f21515c = w76.mo47281a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            by6 = new by6(cause, w76);
        } else {
            by6 = null;
        }
        this.f21516d = by6;
    }
}
