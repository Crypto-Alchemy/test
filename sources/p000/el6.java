package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, mo44877d2 = {"", "propertyName", "b", "", "a", "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: el6 */
/* compiled from: SystemProps.kt */
public final /* synthetic */ class el6 {

    /* renamed from: a */
    public static final int f37575a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m57404a() {
        return f37575a;
    }

    /* renamed from: b */
    public static final String m57405b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
