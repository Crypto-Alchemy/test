package p000;

import androidx.paging.DiffingChangePayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, mo44877d2 = {"Lij4;", "", "T", "Lvb4;", "oldList", "newList", "Ldi3;", "callback", "Lub4;", "diffResult", "Lr37;", "a", "<init>", "()V", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: ij4 */
/* compiled from: NullPaddedListDiffHelper.kt */
public final class ij4 {

    /* renamed from: a */
    public static final ij4 f13284a = new ij4();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000 **\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B+\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, mo44877d2 = {"Lij4$a;", "T", "Ldi3;", "Lr37;", "g", "", "position", "count", "onInserted", "onRemoved", "fromPosition", "toPosition", "onMoved", "", "payload", "onChanged", "h", "f", "", "c", "b", "e", "d", "a", "I", "placeholdersBefore", "placeholdersAfter", "storageCount", "placeholdersBeforeState", "k", "placeholdersAfterState", "Lvb4;", "r", "Lvb4;", "oldList", "s", "newList", "x", "Ldi3;", "callback", "<init>", "(Lvb4;Lvb4;Ldi3;)V", "y", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: ij4$a */
    /* compiled from: NullPaddedListDiffHelper.kt */
    public static final class C2549a<T> implements di3 {

        /* renamed from: y */
        public static final C2550a f13285y = new C2550a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public int f13286a;

        /* renamed from: d */
        public int f13287d;

        /* renamed from: e */
        public int f13288e;

        /* renamed from: g */
        public int f13289g = 1;

        /* renamed from: k */
        public int f13290k = 1;

        /* renamed from: r */
        public final vb4<T> f13291r;

        /* renamed from: s */
        public final vb4<T> f13292s;

        /* renamed from: x */
        public final di3 f13293x;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, mo44877d2 = {"Lij4$a$a;", "", "", "UNUSED", "I", "USED_FOR_ADDITION", "USED_FOR_REMOVAL", "<init>", "()V", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: ij4$a$a */
        /* compiled from: NullPaddedListDiffHelper.kt */
        public static final class C2550a {
            public C2550a() {
            }

            public /* synthetic */ C2550a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C2549a(vb4<T> vb4, vb4<T> vb42, di3 di3) {
            vx2.m53591g(vb4, "oldList");
            vx2.m53591g(vb42, "newList");
            vx2.m53591g(di3, "callback");
            this.f13291r = vb4;
            this.f13292s = vb42;
            this.f13293x = di3;
            this.f13286a = vb4.mo8712b();
            this.f13287d = vb4.mo8713c();
            this.f13288e = vb4.mo8711a();
        }

        /* renamed from: b */
        public final boolean mo21551b(int i, int i2) {
            if (i < this.f13288e || this.f13290k == 2) {
                return false;
            }
            int min = Math.min(i2, this.f13287d);
            if (min > 0) {
                this.f13290k = 3;
                this.f13293x.onChanged(this.f13286a + i, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.f13287d -= min;
            }
            int i3 = i2 - min;
            if (i3 <= 0) {
                return true;
            }
            this.f13293x.onInserted(i + min + this.f13286a, i3);
            return true;
        }

        /* renamed from: c */
        public final boolean mo21552c(int i, int i2) {
            if (i > 0 || this.f13289g == 2) {
                return false;
            }
            int min = Math.min(i2, this.f13286a);
            if (min > 0) {
                this.f13289g = 3;
                this.f13293x.onChanged((0 - min) + this.f13286a, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.f13286a -= min;
            }
            int i3 = i2 - min;
            if (i3 <= 0) {
                return true;
            }
            this.f13293x.onInserted(this.f13286a + 0, i3);
            return true;
        }

        /* renamed from: d */
        public final boolean mo21553d(int i, int i2) {
            if (i + i2 < this.f13288e || this.f13290k == 3) {
                return false;
            }
            int d = d75.m43382d(Math.min(this.f13292s.mo8713c() - this.f13287d, i2), 0);
            int i3 = i2 - d;
            if (d > 0) {
                this.f13290k = 2;
                this.f13293x.onChanged(this.f13286a + i, d, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.f13287d += d;
            }
            if (i3 <= 0) {
                return true;
            }
            this.f13293x.onRemoved(i + d + this.f13286a, i3);
            return true;
        }

        /* renamed from: e */
        public final boolean mo21554e(int i, int i2) {
            if (i > 0 || this.f13289g == 3) {
                return false;
            }
            int d = d75.m43382d(Math.min(this.f13292s.mo8712b() - this.f13286a, i2), 0);
            int i3 = i2 - d;
            if (i3 > 0) {
                this.f13293x.onRemoved(this.f13286a + 0, i3);
            }
            if (d <= 0) {
                return true;
            }
            this.f13289g = 2;
            this.f13293x.onChanged(this.f13286a + 0, d, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
            this.f13286a += d;
            return true;
        }

        /* renamed from: f */
        public final void mo21555f() {
            int min = Math.min(this.f13291r.mo8712b(), this.f13286a);
            int b = this.f13292s.mo8712b() - this.f13286a;
            if (b > 0) {
                if (min > 0) {
                    this.f13293x.onChanged(0, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                this.f13293x.onInserted(0, b);
            } else if (b < 0) {
                this.f13293x.onRemoved(0, -b);
                int i = min + b;
                if (i > 0) {
                    this.f13293x.onChanged(0, i, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.f13286a = this.f13292s.mo8712b();
        }

        /* renamed from: g */
        public final void mo21556g() {
            mo21555f();
            mo21557h();
        }

        /* renamed from: h */
        public final void mo21557h() {
            boolean z;
            int min = Math.min(this.f13291r.mo8713c(), this.f13287d);
            int c = this.f13292s.mo8713c();
            int i = this.f13287d;
            int i2 = c - i;
            int i3 = this.f13286a + this.f13288e + i;
            int i4 = i3 - min;
            if (i4 != this.f13291r.getSize() - min) {
                z = true;
            } else {
                z = false;
            }
            if (i2 > 0) {
                this.f13293x.onInserted(i3, i2);
            } else if (i2 < 0) {
                this.f13293x.onRemoved(i3 + i2, -i2);
                min += i2;
            }
            if (min > 0 && z) {
                this.f13293x.onChanged(i4, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            this.f13287d = this.f13292s.mo8713c();
        }

        public void onChanged(int i, int i2, Object obj) {
            this.f13293x.onChanged(i + this.f13286a, i2, obj);
        }

        public void onInserted(int i, int i2) {
            if (!mo21551b(i, i2) && !mo21552c(i, i2)) {
                this.f13293x.onInserted(i + this.f13286a, i2);
            }
            this.f13288e += i2;
        }

        public void onMoved(int i, int i2) {
            this.f13293x.onMoved(i + this.f13286a, i2 + this.f13286a);
        }

        public void onRemoved(int i, int i2) {
            if (!mo21553d(i, i2) && !mo21554e(i, i2)) {
                this.f13293x.onRemoved(i + this.f13286a, i2);
            }
            this.f13288e -= i2;
        }
    }

    /* renamed from: a */
    public final <T> void mo21550a(vb4<T> vb4, vb4<T> vb42, di3 di3, ub4 ub4) {
        vx2.m53591g(vb4, "oldList");
        vx2.m53591g(vb42, "newList");
        vx2.m53591g(di3, "callback");
        vx2.m53591g(ub4, "diffResult");
        C2549a aVar = new C2549a(vb4, vb42, di3);
        ub4.mo26729a().mo9773c(aVar);
        aVar.mo21556g();
    }
}
