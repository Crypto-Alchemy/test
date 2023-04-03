package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Ln37;", "Lar1;", "<init>", "()V", "a", "b", "Ln37$a;", "Ln37$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: n37 */
/* compiled from: PeerError.kt */
public abstract class n37 implements ar1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Ln37$a;", "Ln37;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "error", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: n37$a */
    /* compiled from: PeerError.kt */
    public static final class C6273a extends n37 {

        /* renamed from: a */
        public final String f31957a;

        /* renamed from: b */
        public final String f31958b;

        /* renamed from: c */
        public final int f31959c = 1302;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6273a(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "error");
            this.f31957a = str;
            this.f31958b = "Generic error: " + str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6273a) && vx2.m53586b(this.f31957a, ((C6273a) obj).f31957a);
        }

        public int getCode() {
            return this.f31959c;
        }

        public String getMessage() {
            return this.f31958b;
        }

        public int hashCode() {
            return this.f31957a.hashCode();
        }

        public String toString() {
            String str = this.f31957a;
            return "GenericError(error=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0019\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Ln37$b;", "Ln37;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getSequence", "()Ljava/lang/String;", "sequence", "b", "getTopic", "topic", "c", "getMessage", "message", "d", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: n37$b */
    /* compiled from: PeerError.kt */
    public static final class C6274b extends n37 {

        /* renamed from: a */
        public final String f31960a;

        /* renamed from: b */
        public final String f31961b;

        /* renamed from: c */
        public final String f31962c;

        /* renamed from: d */
        public final int f31963d = 1301;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6274b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "sequence");
            vx2.m53591g(str2, "topic");
            this.f31960a = str;
            this.f31961b = str2;
            this.f31962c = "No matching " + str + " with topic: " + str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6274b)) {
                return false;
            }
            C6274b bVar = (C6274b) obj;
            return vx2.m53586b(this.f31960a, bVar.f31960a) && vx2.m53586b(this.f31961b, bVar.f31961b);
        }

        public int getCode() {
            return this.f31963d;
        }

        public String getMessage() {
            return this.f31962c;
        }

        public int hashCode() {
            return (this.f31960a.hashCode() * 31) + this.f31961b.hashCode();
        }

        public String toString() {
            String str = this.f31960a;
            String str2 = this.f31961b;
            return "NoMatchingTopic(sequence=" + str + ", topic=" + str2 + ")";
        }
    }

    public n37() {
    }

    public /* synthetic */ n37(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
