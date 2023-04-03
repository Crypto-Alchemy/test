package androidx.paging;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.dl4;
import p000.gf7;
import p000.vk4;
import p000.xi3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001%B\u0011\b\u0002\u0012\u0006\u0010H\u001a\u00020F¢\u0006\u0004\bS\u0010TJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0007J\u0014\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018J\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ%\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b\"\u0010#R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110(8\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010+R$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0000@BX\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010/R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0006088\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006088\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00109R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0<8\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?R$\u0010E\u001a\u00020A2\u0006\u0010-\u001a\u00020A8\u0000@BX\u000e¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010GR\u0014\u0010J\u001a\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\bI\u00101R$\u0010O\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068@@@X\u000e¢\u0006\f\u001a\u0004\bL\u00101\"\u0004\bM\u0010NR$\u0010R\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068@@@X\u000e¢\u0006\f\u001a\u0004\bP\u00101\"\u0004\bQ\u0010N¨\u0006U"}, mo44877d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "", "j", "(Landroidx/paging/LoadType;)I", "Lz42;", "f", "e", "type", "Lxi3;", "newState", "", "u", "Ldl4$b$b;", "Lvk4;", "v", "(Ldl4$b$b;Landroidx/paging/LoadType;)Lvk4;", "loadId", "page", "r", "Lvk4$a;", "event", "Lr37;", "h", "Lgf7;", "hint", "i", "Lgf7$a;", "viewportHint", "Lfl4;", "g", "(Lgf7$a;)Lfl4;", "", "a", "Ljava/util/List;", "_pages", "", "b", "m", "()Ljava/util/List;", "pages", "<set-?>", "c", "I", "l", "()I", "initialPageIndex", "d", "_placeholdersBefore", "_placeholdersAfter", "prependGenerationId", "appendGenerationId", "Lfd0;", "Lfd0;", "prependGenerationIdCh", "appendGenerationIdCh", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "failedHintsByLoadType", "Lyi3;", "Lyi3;", "p", "()Lyi3;", "sourceLoadStates", "Lbl4;", "Lbl4;", "config", "q", "storageCount", "value", "o", "t", "(I)V", "placeholdersBefore", "n", "s", "placeholdersAfter", "<init>", "(Lbl4;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: PageFetcherSnapshotState.kt */
public final class PageFetcherSnapshotState<Key, Value> {

    /* renamed from: a */
    public final List<dl4.C2176b.C2178b<Key, Value>> f6192a;

    /* renamed from: b */
    public final List<dl4.C2176b.C2178b<Key, Value>> f6193b;

    /* renamed from: c */
    public int f6194c;

    /* renamed from: d */
    public int f6195d;

    /* renamed from: e */
    public int f6196e;

    /* renamed from: f */
    public int f6197f;

    /* renamed from: g */
    public int f6198g;

    /* renamed from: h */
    public final fd0<Integer> f6199h;

    /* renamed from: i */
    public final fd0<Integer> f6200i;

    /* renamed from: j */
    public final Map<LoadType, gf7> f6201j;

    /* renamed from: k */
    public yi3 f6202k;

    /* renamed from: l */
    public final bl4 f6203l;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Landroidx/paging/PageFetcherSnapshotState$a;", "", "Key", "Value", "Ly04;", "a", "Ly04;", "lock", "Landroidx/paging/PageFetcherSnapshotState;", "b", "Landroidx/paging/PageFetcherSnapshotState;", "state", "Lbl4;", "c", "Lbl4;", "config", "<init>", "(Lbl4;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.PageFetcherSnapshotState$a */
    /* compiled from: PageFetcherSnapshotState.kt */
    public static final class C1180a<Key, Value> {

        /* renamed from: a */
        public final y04 f6204a = z04.m74724b(false, 1, (Object) null);

        /* renamed from: b */
        public final PageFetcherSnapshotState<Key, Value> f6205b;

        /* renamed from: c */
        public final bl4 f6206c;

        public C1180a(bl4 bl4) {
            vx2.m53591g(bl4, "config");
            this.f6206c = bl4;
            this.f6205b = new PageFetcherSnapshotState<>(bl4, (DefaultConstructorMarker) null);
        }
    }

    public PageFetcherSnapshotState(bl4 bl4) {
        this.f6203l = bl4;
        ArrayList arrayList = new ArrayList();
        this.f6192a = arrayList;
        this.f6193b = arrayList;
        this.f6199h = od0.m70236b(-1, (BufferOverflow) null, (rc2) null, 6, (Object) null);
        this.f6200i = od0.m70236b(-1, (BufferOverflow) null, (rc2) null, 6, (Object) null);
        this.f6201j = new LinkedHashMap();
        this.f6202k = yi3.f20229e.mo28088a();
    }

    /* renamed from: e */
    public final z42<Integer> mo8693e() {
        return e52.m57203D(e52.m57220l(this.f6200i), new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this, (ns0) null));
    }

    /* renamed from: f */
    public final z42<Integer> mo8694f() {
        return e52.m57203D(e52.m57220l(this.f6199h), new PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(this, (ns0) null));
    }

    /* renamed from: g */
    public final fl4<Key, Value> mo8695g(gf7.C2383a aVar) {
        Integer num;
        int i;
        List<T> K0 = CollectionsKt___CollectionsKt.m47311K0(this.f6193b);
        if (aVar != null) {
            int o = mo8703o();
            int i2 = -this.f6194c;
            int l = ck0.m33064l(this.f6193b) - this.f6194c;
            int f = aVar.mo20571f();
            for (int i3 = i2; i3 < f; i3++) {
                if (i3 > l) {
                    i = this.f6203l.f8178a;
                } else {
                    i = this.f6193b.get(this.f6194c + i3).mo18822a().size();
                }
                o += i;
            }
            int e = o + aVar.mo20570e();
            if (aVar.mo20571f() < i2) {
                e -= this.f6203l.f8178a;
            }
            num = Integer.valueOf(e);
        } else {
            num = null;
        }
        return new fl4<>(K0, num, this.f6203l, mo8703o());
    }

    /* renamed from: h */
    public final void mo8696h(vk4.C3492a<Value> aVar) {
        boolean z;
        vx2.m53591g(aVar, "event");
        if (aVar.mo27180d() <= this.f6193b.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6201j.remove(aVar.mo27177a());
            this.f6202k = this.f6202k.mo28085h(aVar.mo27177a(), xi3.C3605c.f19851d.mo27759b());
            int i = yk4.f20263e[aVar.mo27177a().ordinal()];
            if (i == 1) {
                int d = aVar.mo27180d();
                for (int i2 = 0; i2 < d; i2++) {
                    this.f6192a.remove(0);
                }
                this.f6194c -= aVar.mo27180d();
                mo8708t(aVar.mo27181e());
                int i3 = this.f6197f + 1;
                this.f6197f = i3;
                this.f6199h.offer(Integer.valueOf(i3));
            } else if (i == 2) {
                int d2 = aVar.mo27180d();
                for (int i4 = 0; i4 < d2; i4++) {
                    this.f6192a.remove(this.f6193b.size() - 1);
                }
                mo8707s(aVar.mo27181e());
                int i5 = this.f6198g + 1;
                this.f6198g = i5;
                this.f6200i.offer(Integer.valueOf(i5));
            } else {
                throw new IllegalArgumentException("cannot drop " + aVar.mo27177a());
            }
        } else {
            throw new IllegalStateException(("invalid drop count. have " + this.f6193b.size() + " but wanted to drop " + aVar.mo27180d()).toString());
        }
    }

    /* renamed from: i */
    public final vk4.C3492a<Value> mo8697i(LoadType loadType, gf7 gf7) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        vx2.m53591g(loadType, "loadType");
        vx2.m53591g(gf7, "hint");
        vk4.C3492a<Value> aVar = null;
        if (this.f6203l.f8182e == Integer.MAX_VALUE || this.f6193b.size() <= 2 || mo8705q() <= this.f6203l.f8182e) {
            return null;
        }
        int i7 = 0;
        if (loadType != LoadType.REFRESH) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.f6193b.size() && mo8705q() - i9 > this.f6203l.f8182e) {
                if (yk4.f20264f[loadType.ordinal()] != 1) {
                    List<dl4.C2176b.C2178b<Key, Value>> list = this.f6193b;
                    i5 = list.get(ck0.m33064l(list) - i8).mo18822a().size();
                } else {
                    i5 = this.f6193b.get(i8).mo18822a().size();
                }
                if (yk4.f20265g[loadType.ordinal()] != 1) {
                    i6 = gf7.mo20566c();
                } else {
                    i6 = gf7.mo20567d();
                }
                if ((i6 - i9) - i5 < this.f6203l.f8179b) {
                    break;
                }
                i9 += i5;
                i8++;
            }
            if (i8 != 0) {
                if (yk4.f20266h[loadType.ordinal()] != 1) {
                    i = (ck0.m33064l(this.f6193b) - this.f6194c) - (i8 - 1);
                } else {
                    i = -this.f6194c;
                }
                if (yk4.f20267i[loadType.ordinal()] != 1) {
                    i3 = ck0.m33064l(this.f6193b);
                    i2 = this.f6194c;
                } else {
                    i3 = i8 - 1;
                    i2 = this.f6194c;
                }
                int i10 = i3 - i2;
                if (this.f6203l.f8180c) {
                    if (loadType == LoadType.PREPEND) {
                        i4 = mo8703o();
                    } else {
                        i4 = mo8702n();
                    }
                    i7 = i4 + i9;
                }
                aVar = new vk4.C3492a<>(loadType, i, i10, i7);
            }
            return aVar;
        }
        throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
    }

    /* renamed from: j */
    public final int mo8698j(LoadType loadType) {
        vx2.m53591g(loadType, "loadType");
        int i = yk4.f20259a[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        } else if (i == 2) {
            return this.f6197f;
        } else {
            if (i == 3) {
                return this.f6198g;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: k */
    public final Map<LoadType, gf7> mo8699k() {
        return this.f6201j;
    }

    /* renamed from: l */
    public final int mo8700l() {
        return this.f6194c;
    }

    /* renamed from: m */
    public final List<dl4.C2176b.C2178b<Key, Value>> mo8701m() {
        return this.f6193b;
    }

    /* renamed from: n */
    public final int mo8702n() {
        if (this.f6203l.f8180c) {
            return this.f6196e;
        }
        return 0;
    }

    /* renamed from: o */
    public final int mo8703o() {
        if (this.f6203l.f8180c) {
            return this.f6195d;
        }
        return 0;
    }

    /* renamed from: p */
    public final yi3 mo8704p() {
        return this.f6202k;
    }

    /* renamed from: q */
    public final int mo8705q() {
        int i = 0;
        for (dl4.C2176b.C2178b a : this.f6193b) {
            i += a.mo18822a().size();
        }
        return i;
    }

    /* renamed from: r */
    public final boolean mo8706r(int i, LoadType loadType, dl4.C2176b.C2178b<Key, Value> bVar) {
        boolean z;
        int i2;
        int i3;
        vx2.m53591g(loadType, "loadType");
        vx2.m53591g(bVar, "page");
        int i4 = yk4.f20262d[loadType.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    if (!(!this.f6193b.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    } else if (i != this.f6198g) {
                        return false;
                    } else {
                        this.f6192a.add(bVar);
                        if (bVar.mo18823b() == Integer.MIN_VALUE) {
                            i3 = d75.m43382d(mo8702n() - bVar.mo18822a().size(), 0);
                        } else {
                            i3 = bVar.mo18823b();
                        }
                        mo8707s(i3);
                        this.f6201j.remove(LoadType.APPEND);
                    }
                }
            } else if (!(!this.f6193b.isEmpty())) {
                throw new IllegalStateException("should've received an init before prepend".toString());
            } else if (i != this.f6197f) {
                return false;
            } else {
                this.f6192a.add(0, bVar);
                this.f6194c++;
                if (bVar.mo18824c() == Integer.MIN_VALUE) {
                    i2 = d75.m43382d(mo8703o() - bVar.mo18822a().size(), 0);
                } else {
                    i2 = bVar.mo18824c();
                }
                mo8708t(i2);
                this.f6201j.remove(LoadType.PREPEND);
            }
        } else if (this.f6193b.isEmpty()) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f6192a.add(bVar);
                this.f6194c = 0;
                mo8707s(bVar.mo18823b());
                mo8708t(bVar.mo18824c());
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    /* renamed from: s */
    public final void mo8707s(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f6196e = i;
    }

    /* renamed from: t */
    public final void mo8708t(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f6195d = i;
    }

    /* renamed from: u */
    public final boolean mo8709u(LoadType loadType, xi3 xi3) {
        vx2.m53591g(loadType, "type");
        vx2.m53591g(xi3, "newState");
        if (vx2.m53586b(this.f6202k.mo28080d(loadType), xi3)) {
            return false;
        }
        this.f6202k = this.f6202k.mo28085h(loadType, xi3);
        return true;
    }

    /* renamed from: v */
    public final vk4<Value> mo8710v(dl4.C2176b.C2178b<Key, Value> bVar, LoadType loadType) {
        vx2.m53591g(bVar, "$this$toPageEvent");
        vx2.m53591g(loadType, "loadType");
        int i = yk4.f20260b[loadType.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                i2 = 0 - this.f6194c;
            } else if (i == 3) {
                i2 = (this.f6193b.size() - this.f6194c) - 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        List e = bk0.m32598e(new kw6(i2, bVar.mo18822a()));
        int i3 = yk4.f20261c[loadType.ordinal()];
        if (i3 == 1) {
            return vk4.C3493b.f18820g.mo27196c(e, mo8703o(), mo8702n(), new il0(this.f6202k.mo28084g(), this.f6202k.mo28083f(), this.f6202k.mo28081e(), this.f6202k, (yi3) null));
        }
        if (i3 == 2) {
            return vk4.C3493b.f18820g.mo27195b(e, mo8703o(), new il0(this.f6202k.mo28084g(), this.f6202k.mo28083f(), this.f6202k.mo28081e(), this.f6202k, (yi3) null));
        }
        if (i3 == 3) {
            return vk4.C3493b.f18820g.mo27194a(e, mo8702n(), new il0(this.f6202k.mo28084g(), this.f6202k.mo28083f(), this.f6202k.mo28081e(), this.f6202k, (yi3) null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ PageFetcherSnapshotState(bl4 bl4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bl4);
    }
}
