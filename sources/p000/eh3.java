package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, mo44877d2 = {"", "Lr37;", "a", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: eh3 */
/* compiled from: LimitedDispatcher.kt */
public final class eh3 {
    /* renamed from: a */
    public static final void m57341a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
        }
    }
}
