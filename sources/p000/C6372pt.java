package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.walletconnect.android.internal.common.cacao.Cacao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lpt;", "", "<init>", "()V", "a", "b", "Lpt$a;", "Lpt$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pt */
/* compiled from: AuthResponse.kt */
public abstract class C6372pt {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lpt$a;", "Lpt;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "getCode", "()I", "code", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(ILjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: pt$a */
    /* compiled from: AuthResponse.kt */
    public static final class C6373a extends C6372pt {

        /* renamed from: a */
        public final int f32809a;

        /* renamed from: b */
        public final String f32810b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6373a(int i, String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f32809a = i;
            this.f32810b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6373a)) {
                return false;
            }
            C6373a aVar = (C6373a) obj;
            return this.f32809a == aVar.f32809a && vx2.m53586b(this.f32810b, aVar.f32810b);
        }

        public int hashCode() {
            return (this.f32809a * 31) + this.f32810b.hashCode();
        }

        public String toString() {
            int i = this.f32809a;
            String str = this.f32810b;
            return "Error(code=" + i + ", message=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lpt$b;", "Lpt;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/walletconnect/android/internal/common/cacao/Cacao;", "a", "Lcom/walletconnect/android/internal/common/cacao/Cacao;", "getCacao", "()Lcom/walletconnect/android/internal/common/cacao/Cacao;", "cacao", "<init>", "(Lcom/walletconnect/android/internal/common/cacao/Cacao;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: pt$b */
    /* compiled from: AuthResponse.kt */
    public static final class C6374b extends C6372pt {

        /* renamed from: a */
        public final Cacao f32811a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6374b(Cacao cacao) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(cacao, "cacao");
            this.f32811a = cacao;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6374b) && vx2.m53586b(this.f32811a, ((C6374b) obj).f32811a);
        }

        public int hashCode() {
            return this.f32811a.hashCode();
        }

        public String toString() {
            Cacao cacao = this.f32811a;
            return "Result(cacao=" + cacao + ")";
        }
    }

    public C6372pt() {
    }

    public /* synthetic */ C6372pt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
