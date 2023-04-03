package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: m02 */
/* compiled from: FileBinaryResource */
public class m02 implements l10 {

    /* renamed from: a */
    public final File f14765a;

    public m02(File file) {
        this.f14765a = (File) au4.m10792g(file);
    }

    /* renamed from: b */
    public static m02 m21926b(File file) {
        return new m02(file);
    }

    /* renamed from: c */
    public static m02 m21927c(File file) {
        if (file != null) {
            return new m02(file);
        }
        return null;
    }

    /* renamed from: a */
    public InputStream mo22620a() throws IOException {
        return new FileInputStream(this.f14765a);
    }

    /* renamed from: d */
    public File mo22993d() {
        return this.f14765a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof m02)) {
            return false;
        }
        return this.f14765a.equals(((m02) obj).f14765a);
    }

    public int hashCode() {
        return this.f14765a.hashCode();
    }

    public long size() {
        return this.f14765a.length();
    }
}
