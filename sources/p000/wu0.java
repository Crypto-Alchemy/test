package p000;

import java.io.File;
import java.io.IOException;

/* renamed from: wu0 */
/* compiled from: CrashlyticsFileMarker */
public class wu0 {

    /* renamed from: a */
    public final String f35435a;

    /* renamed from: b */
    public final y02 f35436b;

    public wu0(String str, y02 y02) {
        this.f35435a = str;
        this.f35436b = y02;
    }

    /* renamed from: a */
    public boolean mo49275a() {
        try {
            return mo49276b().createNewFile();
        } catch (IOException e) {
            rk3 f = rk3.m51112f();
            f.mo47426e("Error creating marker: " + this.f35435a, e);
            return false;
        }
    }

    /* renamed from: b */
    public final File mo49276b() {
        return new File(this.f35436b.mo49576a(), this.f35435a);
    }

    /* renamed from: c */
    public boolean mo49277c() {
        return mo49276b().exists();
    }

    /* renamed from: d */
    public boolean mo49278d() {
        return mo49276b().delete();
    }
}
