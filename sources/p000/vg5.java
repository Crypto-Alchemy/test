package p000;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0005\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u000b"}, mo44877d2 = {"Lvg5;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "a", "b", "", "reversed", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vg5 */
/* compiled from: Comparisons.kt */
public final class vg5 implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final vg5 f34947a = new vg5();

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        vx2.m53591g(comparable, "a");
        vx2.m53591g(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return b44.f21130a;
    }
}
