package p000;

import androidx.lifecycle.C0729l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lhu2;", "", "Lad7;", "T", "Lq83;", "clazz", "Lkotlin/Function1;", "Lzv0;", "initializer", "Lr37;", "a", "Landroidx/lifecycle/l$b;", "b", "", "Lbd7;", "Ljava/util/List;", "initializers", "<init>", "()V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: hu2 */
/* compiled from: InitializerViewModelFactory.kt */
public final class hu2 {

    /* renamed from: a */
    public final List<bd7<?>> f13067a = new ArrayList();

    /* renamed from: a */
    public final <T extends ad7> void mo21388a(q83<T> q83, rc2<? super zv0, ? extends T> rc2) {
        vx2.m53591g(q83, "clazz");
        vx2.m53591g(rc2, "initializer");
        this.f13067a.add(new bd7(x73.m54253b(q83), rc2));
    }

    /* renamed from: b */
    public final C0729l.C0733b mo21389b() {
        Object[] array = this.f13067a.toArray(new bd7[0]);
        if (array != null) {
            bd7[] bd7Arr = (bd7[]) array;
            return new gu2((bd7[]) Arrays.copyOf(bd7Arr, bd7Arr.length));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
