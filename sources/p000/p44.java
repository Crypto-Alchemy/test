package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import org.web3j.abi.datatypes.Utf8String;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u001d\u001e\u001f !\"B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006#"}, mo44877d2 = {"Lp44;", "T", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "f", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "d", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "toString", "", "Z", "c", "()Z", "isNullableAllowed", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Z)V", "l", "m", "n", "o", "p", "q", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: p44 */
/* compiled from: NavType.kt */
public abstract class p44<T> {

    /* renamed from: c */
    public static final C3031l f16281c = new C3031l((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final p44<Integer> f16282d = new C3025f();

    /* renamed from: e */
    public static final p44<Integer> f16283e = new C3028i();

    /* renamed from: f */
    public static final p44<int[]> f16284f = new C3024e();

    /* renamed from: g */
    public static final p44<Long> f16285g = new C3027h();

    /* renamed from: h */
    public static final p44<long[]> f16286h = new C3026g();

    /* renamed from: i */
    public static final p44<Float> f16287i = new C3023d();

    /* renamed from: j */
    public static final p44<float[]> f16288j = new C3022c();

    /* renamed from: k */
    public static final p44<Boolean> f16289k = new C3021b();

    /* renamed from: l */
    public static final p44<boolean[]> f16290l = new C3020a();

    /* renamed from: m */
    public static final p44<String> f16291m = new C3030k();

    /* renamed from: n */
    public static final p44<String[]> f16292n = new C3029j();

    /* renamed from: a */
    public final boolean f16293a;

    /* renamed from: b */
    public final String f16294b = "nav_type";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, mo44877d2 = {"p44$a", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$a */
    /* compiled from: NavType.kt */
    public static final class C3020a extends p44<boolean[]> {
        public C3020a() {
            super(true);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "boolean[]";
        }

        /* renamed from: g */
        public boolean[] mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: h */
        public boolean[] mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, boolean[] zArr) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putBooleanArray(str, zArr);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo44877d2 = {"p44$b", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "h", "(Ljava/lang/String;)Ljava/lang/Boolean;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$b */
    /* compiled from: NavType.kt */
    public static final class C3021b extends p44<Boolean> {
        public C3021b() {
            super(false);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "boolean";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo24337f(Bundle bundle, String str, Object obj) {
            mo24344i(bundle, str, ((Boolean) obj).booleanValue());
        }

        /* renamed from: g */
        public Boolean mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (Boolean) bundle.get(str);
        }

        /* renamed from: h */
        public Boolean mo24336e(String str) {
            boolean z;
            vx2.m53591g(str, "value");
            if (vx2.m53586b(str, "true")) {
                z = true;
            } else if (vx2.m53586b(str, "false")) {
                z = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: i */
        public void mo24344i(Bundle bundle, String str, boolean z) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putBoolean(str, z);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, mo44877d2 = {"p44$c", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$c */
    /* compiled from: NavType.kt */
    public static final class C3022c extends p44<float[]> {
        public C3022c() {
            super(true);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "float[]";
        }

        /* renamed from: g */
        public float[] mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (float[]) bundle.get(str);
        }

        /* renamed from: h */
        public float[] mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, float[] fArr) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putFloatArray(str, fArr);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo44877d2 = {"p44$d", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "h", "(Ljava/lang/String;)Ljava/lang/Float;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$d */
    /* compiled from: NavType.kt */
    public static final class C3023d extends p44<Float> {
        public C3023d() {
            super(false);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "float";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo24337f(Bundle bundle, String str, Object obj) {
            mo24350i(bundle, str, ((Number) obj).floatValue());
        }

        /* renamed from: g */
        public Float mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        /* renamed from: h */
        public Float mo24336e(String str) {
            vx2.m53591g(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: i */
        public void mo24350i(Bundle bundle, String str, float f) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putFloat(str, f);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, mo44877d2 = {"p44$e", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$e */
    /* compiled from: NavType.kt */
    public static final class C3024e extends p44<int[]> {
        public C3024e() {
            super(true);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "integer[]";
        }

        /* renamed from: g */
        public int[] mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (int[]) bundle.get(str);
        }

        /* renamed from: h */
        public int[] mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, int[] iArr) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putIntArray(str, iArr);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo44877d2 = {"p44$f", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "h", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$f */
    /* compiled from: NavType.kt */
    public static final class C3025f extends p44<Integer> {
        public C3025f() {
            super(false);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "integer";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo24337f(Bundle bundle, String str, Object obj) {
            mo24356i(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: g */
        public Integer mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* renamed from: h */
        public Integer mo24336e(String str) {
            int i;
            vx2.m53591g(str, "value");
            if (yb6.m74336M(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(substring, wd0.m73569a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: i */
        public void mo24356i(Bundle bundle, String str, int i) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putInt(str, i);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, mo44877d2 = {"p44$g", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$g */
    /* compiled from: NavType.kt */
    public static final class C3026g extends p44<long[]> {
        public C3026g() {
            super(true);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "long[]";
        }

        /* renamed from: g */
        public long[] mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (long[]) bundle.get(str);
        }

        /* renamed from: h */
        public long[] mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, long[] jArr) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putLongArray(str, jArr);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo44877d2 = {"p44$h", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "h", "(Ljava/lang/String;)Ljava/lang/Long;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$h */
    /* compiled from: NavType.kt */
    public static final class C3027h extends p44<Long> {
        public C3027h() {
            super(false);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "long";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo24337f(Bundle bundle, String str, Object obj) {
            mo24362i(bundle, str, ((Number) obj).longValue());
        }

        /* renamed from: g */
        public Long mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        /* renamed from: h */
        public Long mo24336e(String str) {
            String str2;
            long j;
            vx2.m53591g(str, "value");
            if (yb6.m74343x(str, "L", false, 2, (Object) null)) {
                str2 = str.substring(0, str.length() - 1);
                vx2.m53590f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (yb6.m74336M(str, "0x", false, 2, (Object) null)) {
                String substring = str2.substring(2);
                vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
                j = Long.parseLong(substring, wd0.m73569a(16));
            } else {
                j = Long.parseLong(str2);
            }
            return Long.valueOf(j);
        }

        /* renamed from: i */
        public void mo24362i(Bundle bundle, String str, long j) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putLong(str, j);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo44877d2 = {"p44$i", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "h", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$i */
    /* compiled from: NavType.kt */
    public static final class C3028i extends p44<Integer> {
        public C3028i() {
            super(false);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "reference";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo24337f(Bundle bundle, String str, Object obj) {
            mo24365i(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: g */
        public Integer mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* renamed from: h */
        public Integer mo24336e(String str) {
            int i;
            vx2.m53591g(str, "value");
            if (yb6.m74336M(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(substring, wd0.m73569a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: i */
        public void mo24365i(Bundle bundle, String str, int i) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putInt(str, i);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, mo44877d2 = {"p44$j", "Lp44;", "", "", "Landroid/os/Bundle;", "bundle", "key", "value", "Lr37;", "i", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "h", "(Ljava/lang/String;)[Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$j */
    /* compiled from: NavType.kt */
    public static final class C3029j extends p44<String[]> {
        public C3029j() {
            super(true);
        }

        /* renamed from: b */
        public String mo24333b() {
            return "string[]";
        }

        /* renamed from: g */
        public String[] mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (String[]) bundle.get(str);
        }

        /* renamed from: h */
        public String[] mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, String[] strArr) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putStringArray(str, strArr);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo44877d2 = {"p44$k", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "key", "value", "Lr37;", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$k */
    /* compiled from: NavType.kt */
    public static final class C3030k extends p44<String> {
        public C3030k() {
            super(true);
        }

        /* renamed from: b */
        public String mo24333b() {
            return Utf8String.TYPE_NAME;
        }

        /* renamed from: g */
        public String mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (String) bundle.get(str);
        }

        /* renamed from: h */
        public String mo24336e(String str) {
            vx2.m53591g(str, "value");
            return str;
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, String str2) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            bundle.putString(str, str2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0017J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c0\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\f¨\u0006!"}, mo44877d2 = {"Lp44$l;", "", "", "type", "packageName", "Lp44;", "a", "value", "b", "c", "", "BoolArrayType", "Lp44;", "", "BoolType", "", "FloatArrayType", "", "FloatType", "", "IntArrayType", "", "IntType", "", "LongArrayType", "", "LongType", "ReferenceType", "", "StringArrayType", "StringType", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$l */
    /* compiled from: NavType.kt */
    public static final class C3031l {
        public C3031l() {
        }

        public /* synthetic */ C3031l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public p44<?> mo24372a(String str, String str2) {
            boolean z;
            String str3;
            p44<Integer> p44 = p44.f16282d;
            if (vx2.m53586b(p44.mo24333b(), str)) {
                return p44;
            }
            p44<int[]> p442 = p44.f16284f;
            if (vx2.m53586b(p442.mo24333b(), str)) {
                return p442;
            }
            p44<Long> p443 = p44.f16285g;
            if (vx2.m53586b(p443.mo24333b(), str)) {
                return p443;
            }
            p44<long[]> p444 = p44.f16286h;
            if (vx2.m53586b(p444.mo24333b(), str)) {
                return p444;
            }
            p44<Boolean> p445 = p44.f16289k;
            if (vx2.m53586b(p445.mo24333b(), str)) {
                return p445;
            }
            p44<boolean[]> p446 = p44.f16290l;
            if (vx2.m53586b(p446.mo24333b(), str)) {
                return p446;
            }
            p44<String> p447 = p44.f16291m;
            if (vx2.m53586b(p447.mo24333b(), str)) {
                return p447;
            }
            p44<String[]> p448 = p44.f16292n;
            if (vx2.m53586b(p448.mo24333b(), str)) {
                return p448;
            }
            p44<Float> p449 = p44.f16287i;
            if (vx2.m53586b(p449.mo24333b(), str)) {
                return p449;
            }
            p44<float[]> p4410 = p44.f16288j;
            if (vx2.m53586b(p4410.mo24333b(), str)) {
                return p4410;
            }
            p44<Integer> p4411 = p44.f16283e;
            if (vx2.m53586b(p4411.mo24333b(), str)) {
                return p4411;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return p447;
            }
            try {
                if (!yb6.m74336M(str, ".", false, 2, (Object) null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                if (yb6.m74343x(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, (Object) null)) {
                    str3 = str3.substring(0, str3.length() - 2);
                    vx2.m53590f(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls = Class.forName(str3);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        return new C3033n(cls);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        return new C3035p(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(str3);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        return new C3034o(cls2);
                    }
                    if (Enum.class.isAssignableFrom(cls2)) {
                        return new C3032m(cls2);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        return new C3036q(cls2);
                    }
                }
                throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = p000.p44.f16289k;
            r0.mo24336e(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            return p000.p44.f16291m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0 = p000.p44.f16285g;
            r0.mo24336e(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r0 = p000.p44.f16287i;
            r0.mo24336e(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            return r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p000.p44<java.lang.Object> mo24373b(java.lang.String r2) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                p000.vx2.m53591g(r2, r0)
                p44<java.lang.Integer> r0 = p000.p44.f16282d     // Catch:{ IllegalArgumentException -> 0x000b }
                r0.mo24336e(r2)     // Catch:{ IllegalArgumentException -> 0x000b }
                return r0
            L_0x000b:
                p44<java.lang.Long> r0 = p000.p44.f16285g     // Catch:{ IllegalArgumentException -> 0x0011 }
                r0.mo24336e(r2)     // Catch:{ IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                p44<java.lang.Float> r0 = p000.p44.f16287i     // Catch:{ IllegalArgumentException -> 0x0017 }
                r0.mo24336e(r2)     // Catch:{ IllegalArgumentException -> 0x0017 }
                return r0
            L_0x0017:
                p44<java.lang.Boolean> r0 = p000.p44.f16289k     // Catch:{ IllegalArgumentException -> 0x001d }
                r0.mo24336e(r2)     // Catch:{ IllegalArgumentException -> 0x001d }
                return r0
            L_0x001d:
                p44<java.lang.String> r2 = p000.p44.f16291m
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p44.C3031l.mo24373b(java.lang.String):p44");
        }

        /* renamed from: c */
        public final p44<Object> mo24374c(Object obj) {
            p44<Object> p44;
            if (obj instanceof Integer) {
                return p44.f16282d;
            }
            if (obj instanceof int[]) {
                return p44.f16284f;
            }
            if (obj instanceof Long) {
                return p44.f16285g;
            }
            if (obj instanceof long[]) {
                return p44.f16286h;
            }
            if (obj instanceof Float) {
                return p44.f16287i;
            }
            if (obj instanceof float[]) {
                return p44.f16288j;
            }
            if (obj instanceof Boolean) {
                return p44.f16289k;
            }
            if (obj instanceof boolean[]) {
                return p44.f16290l;
            }
            if ((obj instanceof String) || obj == null) {
                return p44.f16291m;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                return p44.f16292n;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                vx2.m53588d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    if (componentType2 != null) {
                        p44 = new C3033n<>(componentType2);
                        return p44;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                vx2.m53588d(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    if (componentType4 != null) {
                        p44 = new C3035p<>(componentType4);
                        return p44;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                }
            }
            if (obj instanceof Parcelable) {
                p44 = new C3034o<>(obj.getClass());
            } else if (obj instanceof Enum) {
                p44 = new C3032m<>(obj.getClass());
            } else if (obj instanceof Serializable) {
                p44 = new C3036q<>(obj.getClass());
            } else {
                throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
            }
            return p44;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lp44$m;", "", "D", "Lp44$q;", "", "value", "j", "(Ljava/lang/String;)Ljava/lang/Enum;", "Ljava/lang/Class;", "p", "Ljava/lang/Class;", "type", "b", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$m */
    /* compiled from: NavType.kt */
    public static final class C3032m<D extends Enum<?>> extends C3036q<D> {

        /* renamed from: p */
        public final Class<D> f16295p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3032m(Class<D> cls) {
            super(false, cls);
            vx2.m53591g(cls, "type");
            if (cls.isEnum()) {
                this.f16295p = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        /* renamed from: b */
        public String mo24333b() {
            String name = this.f16295p.getName();
            vx2.m53590f(name, "type.name");
            return name;
        }

        /* renamed from: j */
        public D mo24375h(String str) {
            D d;
            vx2.m53591g(str, "value");
            D[] enumConstants = this.f16295p.getEnumConstants();
            vx2.m53590f(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (yb6.m74344y(((Enum) d).name(), str, true)) {
                    break;
                }
                i++;
            }
            D d2 = (Enum) d;
            if (d2 != null) {
                return d2;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f16295p.getName() + '.');
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001f\u0010 J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, mo44877d2 = {"Lp44$n;", "Landroid/os/Parcelable;", "D", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "h", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$n */
    /* compiled from: NavType.kt */
    public static final class C3033n<D extends Parcelable> extends p44<D[]> {

        /* renamed from: o */
        public final Class<D[]> f16296o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3033n(Class<D> cls) {
            super(true);
            vx2.m53591g(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f16296o = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        /* renamed from: b */
        public String mo24333b() {
            String name = this.f16296o.getName();
            vx2.m53590f(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !vx2.m53586b(C3033n.class, obj.getClass())) {
                return false;
            }
            return vx2.m53586b(this.f16296o, ((C3033n) obj).f16296o);
        }

        /* renamed from: g */
        public D[] mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: h */
        public D[] mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f16296o.hashCode();
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, D[] dArr) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            this.f16296o.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lp44$o;", "D", "Lp44;", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "f", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "type", "b", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$o */
    /* compiled from: NavType.kt */
    public static final class C3034o<D> extends p44<D> {

        /* renamed from: o */
        public final Class<D> f16297o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3034o(Class<D> cls) {
            super(true);
            vx2.m53591g(cls, "type");
            boolean z = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z = false;
            }
            if (z) {
                this.f16297o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        /* renamed from: a */
        public D mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return bundle.get(str);
        }

        /* renamed from: b */
        public String mo24333b() {
            String name = this.f16297o.getName();
            vx2.m53590f(name, "type.name");
            return name;
        }

        /* renamed from: e */
        public D mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !vx2.m53586b(C3034o.class, obj.getClass())) {
                return false;
            }
            return vx2.m53586b(this.f16297o, ((C3034o) obj).f16297o);
        }

        /* renamed from: f */
        public void mo24337f(Bundle bundle, String str, D d) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            this.f16297o.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public int hashCode() {
            return this.f16297o.hashCode();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001f\u0010 J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, mo44877d2 = {"Lp44$p;", "Ljava/io/Serializable;", "D", "Lp44;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "h", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$p */
    /* compiled from: NavType.kt */
    public static final class C3035p<D extends Serializable> extends p44<D[]> {

        /* renamed from: o */
        public final Class<D[]> f16298o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3035p(Class<D> cls) {
            super(true);
            vx2.m53591g(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f16298o = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        /* renamed from: b */
        public String mo24333b() {
            String name = this.f16298o.getName();
            vx2.m53590f(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !vx2.m53586b(C3035p.class, obj.getClass())) {
                return false;
            }
            return vx2.m53586b(this.f16298o, ((C3035p) obj).f16298o);
        }

        /* renamed from: g */
        public D[] mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: h */
        public D[] mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f16298o.hashCode();
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24337f(android.os.Bundle r2, java.lang.String r3, D[] r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundle"
                p000.vx2.m53591g(r2, r0)
                java.lang.String r0 = "key"
                p000.vx2.m53591g(r3, r0)
                java.lang.Class<D[]> r0 = r1.f16298o
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p44.C3035p.mo24337f(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }
    }

    public p44(boolean z) {
        this.f16293a = z;
    }

    /* renamed from: a */
    public abstract T mo24332a(Bundle bundle, String str);

    /* renamed from: b */
    public abstract String mo24333b();

    /* renamed from: c */
    public boolean mo24334c() {
        return this.f16293a;
    }

    /* renamed from: d */
    public final T mo24335d(Bundle bundle, String str, String str2) {
        vx2.m53591g(bundle, "bundle");
        vx2.m53591g(str, "key");
        vx2.m53591g(str2, "value");
        T e = mo24336e(str2);
        mo24337f(bundle, str, e);
        return e;
    }

    /* renamed from: e */
    public abstract T mo24336e(String str);

    /* renamed from: f */
    public abstract void mo24337f(Bundle bundle, String str, T t);

    public String toString() {
        return mo24333b();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u001eB\u001f\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001d\u0010 J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, mo44877d2 = {"Lp44$q;", "Ljava/io/Serializable;", "D", "Lp44;", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lr37;", "i", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "h", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "type", "b", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "nullableAllowed", "(ZLjava/lang/Class;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: p44$q */
    /* compiled from: NavType.kt */
    public static class C3036q<D extends Serializable> extends p44<D> {

        /* renamed from: o */
        public final Class<D> f16299o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3036q(Class<D> cls) {
            super(true);
            vx2.m53591g(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (true ^ cls.isEnum()) {
                this.f16299o = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        /* renamed from: b */
        public String mo24333b() {
            String name = this.f16299o.getName();
            vx2.m53590f(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3036q)) {
                return false;
            }
            return vx2.m53586b(this.f16299o, ((C3036q) obj).f16299o);
        }

        /* renamed from: g */
        public D mo24332a(Bundle bundle, String str) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            return (Serializable) bundle.get(str);
        }

        /* renamed from: h */
        public D mo24336e(String str) {
            vx2.m53591g(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public int hashCode() {
            return this.f16299o.hashCode();
        }

        /* renamed from: i */
        public void mo24337f(Bundle bundle, String str, D d) {
            vx2.m53591g(bundle, "bundle");
            vx2.m53591g(str, "key");
            vx2.m53591g(d, "value");
            this.f16299o.cast(d);
            bundle.putSerializable(str, d);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3036q(boolean z, Class<D> cls) {
            super(z);
            vx2.m53591g(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f16299o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
