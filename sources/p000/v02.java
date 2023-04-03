package p000;

import java.io.File;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lv02;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/io/File;", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "segments", "c", "()I", "size", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: v02 */
/* compiled from: FilePathComponents.kt */
public final class v02 {

    /* renamed from: a */
    public final File f34805a;

    /* renamed from: b */
    public final List<File> f34806b;

    public v02(File file, List<? extends File> list) {
        vx2.m53591g(file, "root");
        vx2.m53591g(list, "segments");
        this.f34805a = file;
        this.f34806b = list;
    }

    /* renamed from: a */
    public final File mo48622a() {
        return this.f34805a;
    }

    /* renamed from: b */
    public final List<File> mo48623b() {
        return this.f34806b;
    }

    /* renamed from: c */
    public final int mo48624c() {
        return this.f34806b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v02)) {
            return false;
        }
        v02 v02 = (v02) obj;
        return vx2.m53586b(this.f34805a, v02.f34805a) && vx2.m53586b(this.f34806b, v02.f34806b);
    }

    public int hashCode() {
        return (this.f34805a.hashCode() * 31) + this.f34806b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f34805a + ", segments=" + this.f34806b + ')';
    }
}
