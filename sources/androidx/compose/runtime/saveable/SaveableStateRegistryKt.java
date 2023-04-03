package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\"\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, mo44877d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Lal5;", "a", "Lhy4;", "Lhy4;", "b", "()Lhy4;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: SaveableStateRegistry.kt */
public final class SaveableStateRegistryKt {

    /* renamed from: a */
    public static final hy4<al5> f1570a = CompositionLocalKt.m2038d(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.INSTANCE);

    /* renamed from: a */
    public static final al5 m2178a(Map<String, ? extends List<? extends Object>> map, rc2<Object, Boolean> rc2) {
        vx2.m53591g(rc2, "canBeSaved");
        return new bl5(map, rc2);
    }

    /* renamed from: b */
    public static final hy4<al5> m2179b() {
        return f1570a;
    }
}
