package p000;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo44877d2 = {"Ldq6;", "", "a", "b", "timber_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: dq6 */
/* compiled from: Timber.kt */
public final class dq6 {

    /* renamed from: a */
    public static final C6998a f37375a = new C6998a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final ArrayList<C6999b> f37376b = new ArrayList<>();

    /* renamed from: c */
    public static volatile C6999b[] f37377c = new C6999b[0];

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ3\u0010\n\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0002H\u0007R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Ldq6$a;", "Ldq6$b;", "", "message", "", "", "args", "Lr37;", "a", "(Ljava/lang/String;[Ljava/lang/Object;)V", "b", "", "t", "c", "tag", "e", "treeArray", "[Ldq6$b;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "<init>", "()V", "timber_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: dq6$a */
    /* compiled from: Timber.kt */
    public static final class C6998a extends C6999b {
        public C6998a() {
        }

        public /* synthetic */ C6998a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public void mo51264a(String str, Object... objArr) {
            vx2.m53591g(objArr, "args");
            for (C6999b a : dq6.f37377c) {
                a.mo51264a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        /* renamed from: b */
        public void mo51265b(String str, Object... objArr) {
            vx2.m53591g(objArr, "args");
            for (C6999b b : dq6.f37377c) {
                b.mo51265b(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        /* renamed from: c */
        public void mo51266c(Throwable th) {
            for (C6999b c : dq6.f37377c) {
                c.mo51266c(th);
            }
        }

        /* renamed from: e */
        public final C6999b mo51267e(String str) {
            vx2.m53591g(str, "tag");
            C6999b[] a = dq6.f37377c;
            int length = a.length;
            int i = 0;
            while (i < length) {
                C6999b bVar = a[i];
                i++;
                bVar.mo51268d().set(str);
            }
            return this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8@X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Ldq6$b;", "", "", "message", "", "args", "Lr37;", "a", "(Ljava/lang/String;[Ljava/lang/Object;)V", "b", "", "t", "c", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "d", "()Ljava/lang/ThreadLocal;", "explicitTag", "<init>", "()V", "timber_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: dq6$b */
    /* compiled from: Timber.kt */
    public static abstract class C6999b {

        /* renamed from: a */
        public final ThreadLocal<String> f37378a = new ThreadLocal<>();

        /* renamed from: a */
        public abstract void mo51264a(String str, Object... objArr);

        /* renamed from: b */
        public abstract void mo51265b(String str, Object... objArr);

        /* renamed from: c */
        public abstract void mo51266c(Throwable th);

        /* renamed from: d */
        public final /* synthetic */ ThreadLocal mo51268d() {
            return this.f37378a;
        }
    }

    /* renamed from: b */
    public static final C6999b m57042b(String str) {
        return f37375a.mo51267e(str);
    }
}
