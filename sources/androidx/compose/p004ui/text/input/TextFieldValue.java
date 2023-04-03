package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\nB(\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bB,\b\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u0012\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0018\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, mo44877d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lrl;", "a", "Lrl;", "()Lrl;", "annotatedString", "Lao6;", "b", "J", "()J", "selection", "c", "Lao6;", "getComposition-MzsxiRA", "()Lao6;", "composition", "()Ljava/lang/String;", "text", "<init>", "(Lrl;JLao6;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLao6;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.input.TextFieldValue */
/* compiled from: TextFieldValue.kt */
public final class TextFieldValue {

    /* renamed from: d */
    public static final C0461a f2209d = new C0461a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final kl5<TextFieldValue, Object> f2210e = SaverKt.m2180a(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final C3205rl f2211a;

    /* renamed from: b */
    public final long f2212b;

    /* renamed from: c */
    public final ao6 f2213c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.text.input.TextFieldValue$a */
    /* compiled from: TextFieldValue.kt */
    public static final class C0461a {
        public C0461a() {
        }

        public /* synthetic */ C0461a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TextFieldValue(String str, long j, ao6 ao6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, ao6);
    }

    public TextFieldValue(C3205rl rlVar, long j, ao6 ao6) {
        this.f2211a = rlVar;
        this.f2212b = bo6.m11529c(j, 0, mo4124c().length());
        this.f2213c = ao6 != null ? ao6.m10675b(bo6.m11529c(ao6.mo11071m(), 0, mo4124c().length())) : null;
    }

    public /* synthetic */ TextFieldValue(C3205rl rlVar, long j, ao6 ao6, DefaultConstructorMarker defaultConstructorMarker) {
        this(rlVar, j, ao6);
    }

    /* renamed from: a */
    public final C3205rl mo4122a() {
        return this.f2211a;
    }

    /* renamed from: b */
    public final long mo4123b() {
        return this.f2212b;
    }

    /* renamed from: c */
    public final String mo4124c() {
        return this.f2211a.mo25431f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (!ao6.m10678e(this.f2212b, textFieldValue.f2212b) || !vx2.m53586b(this.f2213c, textFieldValue.f2213c) || !vx2.m53586b(this.f2211a, textFieldValue.f2211a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f2211a.hashCode() * 31) + ao6.m10684k(this.f2212b)) * 31;
        ao6 ao6 = this.f2213c;
        if (ao6 != null) {
            i = ao6.m10684k(ao6.mo11071m());
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "TextFieldValue(text='" + this.f2211a + "', selection=" + ao6.m10685l(this.f2212b) + ", composition=" + this.f2213c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(C3205rl rlVar, long j, ao6 ao6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rlVar, (i & 2) != 0 ? ao6.f7681b.mo11073a() : j, (i & 4) != 0 ? null : ao6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(String str, long j, ao6 ao6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ao6.f7681b.mo11073a() : j, (i & 4) != 0 ? null : ao6, (DefaultConstructorMarker) null);
    }

    public TextFieldValue(String str, long j, ao6 ao6) {
        this(new C3205rl(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j, ao6, (DefaultConstructorMarker) null);
    }
}
