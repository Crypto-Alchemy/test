package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Luv;", "", "", "id", "", "value", "Lr37;", "b", "(ILjava/lang/String;)Lr37;", "", "Ltv;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: uv */
/* compiled from: AutofillTree.kt */
public final class C3436uv {

    /* renamed from: a */
    public final Map<Integer, C3385tv> f18582a = new LinkedHashMap();

    /* renamed from: a */
    public final Map<Integer, C3385tv> mo26873a() {
        return this.f18582a;
    }

    /* renamed from: b */
    public final r37 mo26874b(int i, String str) {
        rc2<String, r37> c;
        vx2.m53591g(str, "value");
        C3385tv tvVar = this.f18582a.get(Integer.valueOf(i));
        if (tvVar == null || (c = tvVar.mo26571c()) == null) {
            return null;
        }
        c.invoke(str);
        return r37.f33317a;
    }
}
