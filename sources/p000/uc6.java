package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.helpers.NOPLogger;

/* renamed from: uc6 */
/* compiled from: SubstituteLogger */
public class uc6 implements uk3 {

    /* renamed from: a */
    public final String f44947a;

    /* renamed from: d */
    public volatile uk3 f44948d;

    /* renamed from: e */
    public Boolean f44949e;

    /* renamed from: g */
    public Method f44950g;

    /* renamed from: k */
    public bu1 f44951k;

    /* renamed from: r */
    public Queue<wc6> f44952r;

    /* renamed from: s */
    public final boolean f44953s;

    public uc6(String str, Queue<wc6> queue, boolean z) {
        this.f44947a = str;
        this.f44952r = queue;
        this.f44953s = z;
    }

    /* renamed from: a */
    public uk3 mo66227a() {
        if (this.f44948d != null) {
            return this.f44948d;
        }
        if (this.f44953s) {
            return NOPLogger.NOP_LOGGER;
        }
        return mo66228b();
    }

    /* renamed from: b */
    public final uk3 mo66228b() {
        if (this.f44951k == null) {
            this.f44951k = new bu1(this, this.f44952r);
        }
        return this.f44951k;
    }

    /* renamed from: c */
    public boolean mo66229c() {
        Boolean bool = this.f44949e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f44950g = this.f44948d.getClass().getMethod("log", new Class[]{zk3.class});
            this.f44949e = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f44949e = Boolean.FALSE;
        }
        return this.f44949e.booleanValue();
    }

    /* renamed from: d */
    public boolean mo66230d() {
        return this.f44948d instanceof NOPLogger;
    }

    public void debug(String str) {
        mo66227a().debug(str);
    }

    /* renamed from: e */
    public boolean mo66231e() {
        if (this.f44948d == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !this.f44947a.equals(((uc6) obj).f44947a)) {
            return false;
        }
        return true;
    }

    public void error(String str) {
        mo66227a().error(str);
    }

    /* renamed from: f */
    public void mo66233f(zk3 zk3) {
        if (mo66229c()) {
            try {
                this.f44950g.invoke(this.f44948d, new Object[]{zk3});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: g */
    public void mo66234g(uk3 uk3) {
        this.f44948d = uk3;
    }

    public String getName() {
        return this.f44947a;
    }

    public int hashCode() {
        return this.f44947a.hashCode();
    }

    public void info(String str) {
        mo66227a().info(str);
    }

    public boolean isDebugEnabled() {
        return mo66227a().isDebugEnabled();
    }

    public void warn(String str) {
        mo66227a().warn(str);
    }

    public void error(String str, Throwable th) {
        mo66227a().error(str, th);
    }

    public void info(String str, Object obj) {
        mo66227a().info(str, obj);
    }
}
