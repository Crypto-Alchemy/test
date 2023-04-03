package p000;

import java.io.File;
import java.util.List;

/* renamed from: gs7 */
public final class gs7 implements fs7 {

    /* renamed from: a */
    public final /* synthetic */ int f29344a = 0;

    public gs7() {
    }

    public gs7(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object[] mo42657a(Object obj, List list, List list2) {
        Object a;
        if (this.f29344a != 0) {
            a = ns7.m48995b(obj, "makePathElements", Object[].class, List.class, list, File.class, null, List.class, list2);
        } else {
            a = ns7.m48994a(obj, "makePathElements", Object[].class, List.class, list);
        }
        return (Object[]) a;
    }
}
