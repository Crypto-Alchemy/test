package p000;

/* renamed from: uk3 */
/* compiled from: Logger */
public interface uk3 {
    void debug(String str);

    void error(String str);

    void error(String str, Throwable th);

    String getName();

    void info(String str);

    void info(String str, Object obj);

    boolean isDebugEnabled();

    void warn(String str);
}
