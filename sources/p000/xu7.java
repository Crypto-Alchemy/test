package p000;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: xu7 */
public final class xu7 implements jv7 {

    /* renamed from: a */
    public final /* synthetic */ qw7 f35702a;

    /* renamed from: b */
    public final /* synthetic */ Set f35703b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f35704c;

    /* renamed from: d */
    public final /* synthetic */ tv7 f35705d;

    public xu7(tv7 tv7, qw7 qw7, Set set, AtomicBoolean atomicBoolean) {
        this.f35705d = tv7;
        this.f35702a = qw7;
        this.f35703b = set;
        this.f35704c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo29793a(ZipFile zipFile, Set<qv7> set) throws IOException {
        this.f35705d.mo48237f(this.f35702a, set, new pu7(this));
    }
}
