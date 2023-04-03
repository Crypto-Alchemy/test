package p000;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt___StringsKt;
import org.web3j.abi.datatypes.Utf8String;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0015"}, mo44877d2 = {"Lr16;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "[B", "c", "()[B", "v", "b", "r", "s", "<init>", "([B[B[B)V", "d", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: r16 */
/* compiled from: Signature.kt */
public final class r16 {

    /* renamed from: d */
    public static final C6429a f33305d = new C6429a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final byte[] f33306a;

    /* renamed from: b */
    public final byte[] f33307b;

    /* renamed from: c */
    public final byte[] f33308c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lr16$a;", "", "", "string", "Lr16;", "a", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: r16$a */
    /* compiled from: Signature.kt */
    public static final class C6429a {
        public C6429a() {
        }

        public /* synthetic */ C6429a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final r16 mo47322a(String str) {
            boolean z;
            vx2.m53591g(str, Utf8String.TYPE_NAME);
            String a = vx2.m53591g(str, "<this>");
            if (StringsKt___StringsKt.m63122X0(a, 64).size() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List<String> X0 = StringsKt___StringsKt.m63122X0(a, 64);
                String str2 = X0.get(0);
                String str3 = X0.get(1);
                int a2 = q16.m50218a(X0.get(2), 16);
                if (a2 < 27) {
                    a2 += 27;
                }
                String hexString = Integer.toHexString(a2);
                vx2.m53590f(hexString, "v");
                return new r16(x67.m54247c(hexString), x67.m54247c(str2), x67.m54247c(str3));
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public r16(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        vx2.m53591g(bArr, "v");
        vx2.m53591g(bArr2, "r");
        vx2.m53591g(bArr3, "s");
        this.f33306a = bArr;
        this.f33307b = bArr2;
        this.f33308c = bArr3;
    }

    /* renamed from: a */
    public final byte[] mo47316a() {
        return this.f33307b;
    }

    /* renamed from: b */
    public final byte[] mo47317b() {
        return this.f33308c;
    }

    /* renamed from: c */
    public final byte[] mo47318c() {
        return this.f33306a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (vx2.m53586b(r16.class, obj.getClass()) && (obj instanceof r16)) {
                    r16 r16 = (r16) obj;
                    if (!Arrays.equals(this.f33306a, r16.f33306a) || !Arrays.equals(this.f33307b, r16.f33307b) || Arrays.equals(this.f33308c, r16.f33308c)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f33306a) * 31) + Arrays.hashCode(this.f33307b)) * 31) + Arrays.hashCode(this.f33308c);
    }

    public String toString() {
        String arrays = Arrays.toString(this.f33306a);
        String arrays2 = Arrays.toString(this.f33307b);
        String arrays3 = Arrays.toString(this.f33308c);
        return "Signature(v=" + arrays + ", r=" + arrays2 + ", s=" + arrays3 + ")";
    }
}
