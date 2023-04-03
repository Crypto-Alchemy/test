package androidx.compose.p004ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R0\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "parentValue", "childValue", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Leu5;", "thisRef", "Li93;", "property", "value", "Lr37;", "c", "(Leu5;Li93;Ljava/lang/Object;)V", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Lkotlin/Function2;", "Lfd2;", "getMergePolicy$ui_release", "()Lfd2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lfd2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsPropertyKey<T> {

    /* renamed from: a */
    public final String f2153a;

    /* renamed from: b */
    public final fd2<T, T, T> f2154b;

    public SemanticsPropertyKey(String str, fd2<? super T, ? super T, ? extends T> fd2) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(fd2, "mergePolicy");
        this.f2153a = str;
        this.f2154b = fd2;
    }

    /* renamed from: a */
    public final String mo4057a() {
        return this.f2153a;
    }

    /* renamed from: b */
    public final T mo4058b(T t, T t2) {
        return this.f2154b.invoke(t, t2);
    }

    /* renamed from: c */
    public final void mo4059c(eu5 eu5, i93<?> i93, T t) {
        vx2.m53591g(eu5, "thisRef");
        vx2.m53591g(i93, "property");
        eu5.mo19491e(this, t);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f2153a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsPropertyKey(String str, fd2 fd2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C04541.INSTANCE : fd2);
    }
}
