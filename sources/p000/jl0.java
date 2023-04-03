package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u001a"}, mo44877d2 = {"Ljl0;", "Lnn1;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lrl;", "a", "Lrl;", "getAnnotatedString", "()Lrl;", "annotatedString", "b", "I", "getNewCursorPosition", "()I", "newCursorPosition", "()Ljava/lang/String;", "text", "<init>", "(Lrl;I)V", "(Ljava/lang/String;I)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jl0 */
/* compiled from: EditCommand.kt */
public final class jl0 implements nn1 {

    /* renamed from: a */
    public final C3205rl f13686a;

    /* renamed from: b */
    public final int f13687b;

    public jl0(C3205rl rlVar, int i) {
        vx2.m53591g(rlVar, "annotatedString");
        this.f13686a = rlVar;
        this.f13687b = i;
    }

    /* renamed from: a */
    public final String mo21952a() {
        return this.f13686a.mo25431f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl0)) {
            return false;
        }
        jl0 jl0 = (jl0) obj;
        if (vx2.m53586b(mo21952a(), jl0.mo21952a()) && this.f13687b == jl0.f13687b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (mo21952a().hashCode() * 31) + this.f13687b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + mo21952a() + "', newCursorPosition=" + this.f13687b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public jl0(String str, int i) {
        this(new C3205rl(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), i);
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
    }
}
