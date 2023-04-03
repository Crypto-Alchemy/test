package p000;

import androidx.compose.p004ui.autofill.AutofillType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\tJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001c"}, mo44877d2 = {"Ltv;", "", "other", "", "equals", "", "hashCode", "", "Landroidx/compose/ui/autofill/AutofillType;", "a", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "La95;", "b", "La95;", "()La95;", "setBoundingBox", "(La95;)V", "boundingBox", "Lkotlin/Function1;", "", "Lr37;", "c", "Lrc2;", "()Lrc2;", "onFill", "d", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tv */
/* compiled from: Autofill.kt */
public final class C3385tv {

    /* renamed from: d */
    public static final C3386a f18278d = new C3386a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f18279e = 8;

    /* renamed from: a */
    public final List<AutofillType> f18280a;

    /* renamed from: b */
    public a95 f18281b;

    /* renamed from: c */
    public final rc2<String, r37> f18282c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Ltv$a;", "", "", "previousId", "I", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tv$a */
    /* compiled from: Autofill.kt */
    public static final class C3386a {
        public C3386a() {
        }

        public /* synthetic */ C3386a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<AutofillType> mo26569a() {
        return this.f18280a;
    }

    /* renamed from: b */
    public final a95 mo26570b() {
        return this.f18281b;
    }

    /* renamed from: c */
    public final rc2<String, r37> mo26571c() {
        return this.f18282c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3385tv)) {
            return false;
        }
        C3385tv tvVar = (C3385tv) obj;
        if (vx2.m53586b(this.f18280a, tvVar.f18280a) && vx2.m53586b(this.f18281b, tvVar.f18281b) && vx2.m53586b(this.f18282c, tvVar.f18282c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f18280a.hashCode() * 31;
        a95 a95 = this.f18281b;
        int i2 = 0;
        if (a95 != null) {
            i = a95.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        rc2<String, r37> rc2 = this.f18282c;
        if (rc2 != null) {
            i2 = rc2.hashCode();
        }
        return i3 + i2;
    }
}
