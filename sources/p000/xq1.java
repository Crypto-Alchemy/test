package p000;

import java.lang.Enum;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\b\u0001\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lxq1;", "", "T", "Lhl0;", "", "databaseValue", "c", "(Ljava/lang/String;)Ljava/lang/Enum;", "value", "d", "(Ljava/lang/Enum;)Ljava/lang/String;", "", "a", "[Ljava/lang/Enum;", "enumValues", "<init>", "([Ljava/lang/Enum;)V", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: xq1 */
/* compiled from: EnumColumnAdapter.kt */
public final class xq1<T extends Enum<T>> implements hl0<T, String> {

    /* renamed from: a */
    public final T[] f35674a;

    public xq1(T[] tArr) {
        vx2.m53591g(tArr, "enumValues");
        this.f35674a = tArr;
    }

    /* renamed from: c */
    public T mo40237b(String str) {
        vx2.m53591g(str, "databaseValue");
        for (T t : this.f35674a) {
            if (vx2.m53586b(t.name(), str)) {
                return t;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: d */
    public String mo40236a(T t) {
        vx2.m53591g(t, "value");
        return t.name();
    }
}
