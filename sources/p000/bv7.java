package p000;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: bv7 */
public final class bv7 implements jv7 {

    /* renamed from: a */
    public final /* synthetic */ Set f21503a;

    /* renamed from: b */
    public final /* synthetic */ qw7 f21504b;

    /* renamed from: c */
    public final /* synthetic */ tv7 f21505c;

    public bv7(tv7 tv7, Set set, qw7 qw7) {
        this.f21505c = tv7;
        this.f21503a = set;
        this.f21504b = qw7;
    }

    /* renamed from: a */
    public final void mo29793a(ZipFile zipFile, Set<qv7> set) throws IOException {
        this.f21503a.addAll(tv7.m52524d(this.f21505c, set, this.f21504b, zipFile));
    }
}
