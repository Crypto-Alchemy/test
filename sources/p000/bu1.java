package p000;

import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.event.Level;

/* renamed from: bu1 */
/* compiled from: EventRecodingLogger */
public class bu1 implements uk3 {

    /* renamed from: a */
    public String f36953a;

    /* renamed from: d */
    public uc6 f36954d;

    /* renamed from: e */
    public Queue<wc6> f36955e;

    public bu1(uc6 uc6, Queue<wc6> queue) {
        this.f36954d = uc6;
        this.f36953a = uc6.getName();
        this.f36955e = queue;
    }

    /* renamed from: a */
    public final void mo50718a(Level level, Marker marker, String str, Object[] objArr, Throwable th) {
        wc6 wc6 = new wc6();
        wc6.mo66688j(System.currentTimeMillis());
        wc6.mo66681c(level);
        wc6.mo66682d(this.f36954d);
        wc6.mo66683e(this.f36953a);
        wc6.mo66684f(marker);
        wc6.mo66685g(str);
        wc6.mo66686h(Thread.currentThread().getName());
        wc6.mo66680b(objArr);
        wc6.mo66687i(th);
        this.f36955e.add(wc6);
    }

    /* renamed from: b */
    public final void mo50719b(Level level, Marker marker, String str, Throwable th) {
        mo50718a(level, marker, str, (Object[]) null, th);
    }

    /* renamed from: c */
    public final void mo50720c(Level level, Marker marker, String str, Object obj) {
        mo50718a(level, marker, str, new Object[]{obj}, (Throwable) null);
    }

    public void debug(String str) {
        mo50719b(Level.DEBUG, (Marker) null, str, (Throwable) null);
    }

    public void error(String str) {
        mo50719b(Level.ERROR, (Marker) null, str, (Throwable) null);
    }

    public String getName() {
        return this.f36953a;
    }

    public void info(String str) {
        mo50719b(Level.INFO, (Marker) null, str, (Throwable) null);
    }

    public boolean isDebugEnabled() {
        return true;
    }

    public void warn(String str) {
        mo50719b(Level.WARN, (Marker) null, str, (Throwable) null);
    }

    public void error(String str, Throwable th) {
        mo50719b(Level.ERROR, (Marker) null, str, th);
    }

    public void info(String str, Object obj) {
        mo50720c(Level.INFO, (Marker) null, str, obj);
    }
}
