package p000;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: c83 */
/* compiled from: JvmMetadataVersion.kt */
public final class c83 extends o10 {

    /* renamed from: h */
    public static final C6929a f37085h = new C6929a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final c83 f37086i = new c83(1, 7, 1);

    /* renamed from: j */
    public static final c83 f37087j = new c83(new int[0]);

    /* renamed from: g */
    public final boolean f37088g;

    /* renamed from: c83$a */
    /* compiled from: JvmMetadataVersion.kt */
    public static final class C6929a {
        public C6929a() {
        }

        public /* synthetic */ C6929a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c83(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        vx2.m53591g(iArr, "versionArray");
        this.f37088g = z;
    }

    /* renamed from: h */
    public boolean mo50845h() {
        boolean z;
        if (mo62813a() == 1 && mo62814b() == 0) {
            return false;
        }
        if (this.f37088g) {
            z = mo62819f(f37086i);
        } else {
            int a = mo62813a();
            c83 c83 = f37086i;
            if (a != c83.mo62813a() || mo62814b() > c83.mo62814b() + 1) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c83(int... iArr) {
        this(iArr, false);
        vx2.m53591g(iArr, "numbers");
    }
}
