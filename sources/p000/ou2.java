package p000;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0006\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, mo44877d2 = {"Lou2;", "E", "", "element", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "holder", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ou2 */
/* compiled from: InlineList.kt */
public final class ou2<E> {
    /* renamed from: a */
    public static <E> Object m70788a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m70789b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m70788a(obj);
    }

    /* renamed from: c */
    public static final Object m70790c(Object obj, E e) {
        if (obj == null) {
            return m70788a(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m70788a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m70788a(arrayList);
    }
}
