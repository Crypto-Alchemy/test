package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Liu3;", "", "<init>", "()V", "a", "b", "Liu3$b;", "Liu3$a;", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: iu3 */
/* compiled from: Message.kt */
public abstract class iu3 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Liu3$a;", "Liu3;", "", "a", "[B", "()[B", "value", "<init>", "([B)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: iu3$a */
    /* compiled from: Message.kt */
    public static final class C6006a extends iu3 {

        /* renamed from: a */
        public final byte[] f30129a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6006a(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(bArr, "value");
            this.f30129a = bArr;
        }

        /* renamed from: a */
        public final byte[] mo43936a() {
            return this.f30129a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Liu3$b;", "Liu3;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: iu3$b */
    /* compiled from: Message.kt */
    public static final class C6007b extends iu3 {

        /* renamed from: a */
        public final String f30130a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6007b(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "value");
            this.f30130a = str;
        }

        /* renamed from: a */
        public final String mo43937a() {
            return this.f30130a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6007b) && vx2.m53586b(this.f30130a, ((C6007b) obj).f30130a);
        }

        public int hashCode() {
            return this.f30130a.hashCode();
        }

        public String toString() {
            return "Text(value=" + this.f30130a + ')';
        }
    }

    public iu3() {
    }

    public /* synthetic */ iu3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
