package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¨\u0006\u0006"}, mo44877d2 = {"", "", "b", "exception", "Lr37;", "a", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/ExceptionsKt")
/* renamed from: ru1 */
/* compiled from: Exceptions.kt */
public class ru1 {
    /* renamed from: a */
    public static final void m51326a(Throwable th, Throwable th2) {
        vx2.m53591g(th, "<this>");
        vx2.m53591g(th2, "exception");
        if (th != th2) {
            ip4.f30095a.mo43339a(th, th2);
        }
    }

    /* renamed from: b */
    public static final String m51327b(Throwable th) {
        vx2.m53591g(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        vx2.m53590f(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
