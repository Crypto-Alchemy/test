package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0002R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lf05;", "Lje6;", "", "index", "Lr37;", "bindNull", "", "value", "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "close", "bindIndex", "", "b", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "bindArgsCache", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f05 */
/* compiled from: QueryInterceptorProgram.kt */
public final class f05 implements je6 {

    /* renamed from: a */
    public final List<Object> f11471a = new ArrayList();

    /* renamed from: a */
    public final List<Object> mo19564a() {
        return this.f11471a;
    }

    /* renamed from: b */
    public final void mo19565b(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.f11471a.size() && (size = this.f11471a.size()) <= i2) {
            while (true) {
                this.f11471a.add((Object) null);
                if (size == i2) {
                    break;
                }
                size++;
            }
        }
        this.f11471a.set(i2, obj);
    }

    public void bindBlob(int i, byte[] bArr) {
        vx2.m53591g(bArr, "value");
        mo19565b(i, bArr);
    }

    public void bindDouble(int i, double d) {
        mo19565b(i, Double.valueOf(d));
    }

    public void bindLong(int i, long j) {
        mo19565b(i, Long.valueOf(j));
    }

    public void bindNull(int i) {
        mo19565b(i, (Object) null);
    }

    public void bindString(int i, String str) {
        vx2.m53591g(str, "value");
        mo19565b(i, str);
    }

    public void close() {
    }
}
