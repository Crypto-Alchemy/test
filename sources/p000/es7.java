package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: es7 */
public final class es7 implements vr7 {

    /* renamed from: a */
    public final /* synthetic */ int f28650a = 0;

    public es7() {
    }

    public es7(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object[] mo42399a(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        Object b;
        if (this.f28650a != 0) {
            b = ns7.m48995b(obj, "makeDexElements", Object[].class, ArrayList.class, arrayList, File.class, file, ArrayList.class, arrayList2);
        } else {
            b = ns7.m48995b(obj, "makePathElements", Object[].class, List.class, arrayList, File.class, file, List.class, arrayList2);
        }
        return (Object[]) b;
    }
}
