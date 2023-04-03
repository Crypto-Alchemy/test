package p000;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t03 */
/* compiled from: JavaClassFinder.kt */
public interface t03 {

    /* renamed from: t03$a */
    /* compiled from: JavaClassFinder.kt */
    public static final class C9319a {
        /* renamed from: a */
        public static /* synthetic */ s13 m72140a(t03 t03, u82 u82, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return t03.mo65954b(u82, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
        }
    }

    /* renamed from: a */
    Set<String> mo65953a(u82 u82);

    /* renamed from: b */
    s13 mo65954b(u82 u82, boolean z);

    /* renamed from: c */
    p03 mo65955c(C9320b bVar);

    /* renamed from: t03$b */
    /* compiled from: JavaClassFinder.kt */
    public static final class C9320b {

        /* renamed from: a */
        public final nf0 f44625a;

        /* renamed from: b */
        public final byte[] f44626b;

        /* renamed from: c */
        public final p03 f44627c;

        public C9320b(nf0 nf0, byte[] bArr, p03 p03) {
            vx2.m53591g(nf0, "classId");
            this.f44625a = nf0;
            this.f44626b = bArr;
            this.f44627c = p03;
        }

        /* renamed from: a */
        public final nf0 mo65956a() {
            return this.f44625a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9320b)) {
                return false;
            }
            C9320b bVar = (C9320b) obj;
            return vx2.m53586b(this.f44625a, bVar.f44625a) && vx2.m53586b(this.f44626b, bVar.f44626b) && vx2.m53586b(this.f44627c, bVar.f44627c);
        }

        public int hashCode() {
            int hashCode = this.f44625a.hashCode() * 31;
            byte[] bArr = this.f44626b;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            p03 p03 = this.f44627c;
            if (p03 != null) {
                i = p03.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Request(classId=" + this.f44625a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f44626b) + ", outerClass=" + this.f44627c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C9320b(nf0 nf0, byte[] bArr, p03 p03, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nf0, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : p03);
        }
    }
}
