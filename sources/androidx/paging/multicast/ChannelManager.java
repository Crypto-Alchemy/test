package androidx.paging.multicast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.iu5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003(\r\u0011B`\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c\u0012\b\b\u0002\u0010\"\u001a\u00020\u0018\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000¢\u0006\u0004\b&\u0010'J'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\f0\fR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR3\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager;", "T", "", "Liu5;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "channel", "Lr37;", "g", "(Liu5;Lns0;)Ljava/lang/Object;", "i", "h", "(Lns0;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager$Actor;", "a", "Landroidx/paging/multicast/ChannelManager$Actor;", "actor", "Lhu0;", "b", "Lhu0;", "scope", "", "c", "I", "bufferSize", "", "d", "Z", "piggybackingDownstream", "Lkotlin/Function2;", "Lns0;", "e", "Lfd2;", "onEach", "f", "keepUpstreamAlive", "Lz42;", "Lz42;", "upstream", "<init>", "(Lhu0;IZLfd2;ZLz42;)V", "Actor", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: ChannelManager.kt */
public final class ChannelManager<T> {

    /* renamed from: a */
    public final ChannelManager<T>.Actor f6246a = new Actor();

    /* renamed from: b */
    public final hu0 f6247b;

    /* renamed from: c */
    public final int f6248c;

    /* renamed from: d */
    public final boolean f6249d;

    /* renamed from: e */
    public final fd2<T, ns0<? super r37>, Object> f6250e;

    /* renamed from: f */
    public final boolean f6251f;

    /* renamed from: g */
    public final z42<T> f6252g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J!\u0010\t\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\bH@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0002J\u0016\u0010\u001b\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$Actor;", "Landroidx/paging/multicast/StoreRealActor;", "Landroidx/paging/multicast/ChannelManager$b;", "msg", "Lr37;", "o", "(Landroidx/paging/multicast/ChannelManager$b;Lns0;)Ljava/lang/Object;", "f", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "l", "(Landroidx/paging/multicast/ChannelManager$b$b$c;Lns0;)Ljava/lang/Object;", "Liu5;", "channel", "n", "(Liu5;Lns0;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager$b$a;", "j", "(Landroidx/paging/multicast/ChannelManager$b$a;Lns0;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager$a;", "entry", "i", "(Landroidx/paging/multicast/ChannelManager$a;Lns0;)Ljava/lang/Object;", "Landroidx/paging/multicast/SharedFlowProducer;", "p", "producer", "m", "Landroidx/paging/multicast/ChannelManager$b$b$a;", "k", "h", "Ln40;", "Ln40;", "buffer", "g", "Landroidx/paging/multicast/SharedFlowProducer;", "", "Z", "dispatchedValue", "Lcm0;", "Lcm0;", "lastDeliveryAck", "", "Ljava/util/List;", "channels", "<init>", "(Landroidx/paging/multicast/ChannelManager;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* compiled from: ChannelManager.kt */
    public final class Actor extends StoreRealActor<C1194b<T>> {

        /* renamed from: f */
        public final n40<T> f6253f;

        /* renamed from: g */
        public SharedFlowProducer<T> f6254g;

        /* renamed from: h */
        public boolean f6255h;

        /* renamed from: i */
        public cm0<r37> f6256i;

        /* renamed from: j */
        public final List<C1193a<T>> f6257j = new ArrayList();

        public Actor() {
            super(ChannelManager.this.f6247b);
            this.f6253f = pd0.m24817a(ChannelManager.this.f6248c);
        }

        /* renamed from: f */
        public void mo8767f() {
            for (C1193a a : this.f6257j) {
                a.mo8777a();
            }
            this.f6257j.clear();
            SharedFlowProducer<T> sharedFlowProducer = this.f6254g;
            if (sharedFlowProducer != null) {
                sharedFlowProducer.mo8797d();
            }
        }

        /* renamed from: h */
        public final void mo8768h() {
            if (this.f6254g == null) {
                SharedFlowProducer<T> p = mo8776p();
                this.f6254g = p;
                this.f6255h = false;
                vx2.m53588d(p);
                p.mo8799f();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo8769i(androidx.paging.multicast.ChannelManager.C1193a<T> r6, p000.ns0<? super p000.r37> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.multicast.ChannelManager$Actor$addEntry$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.multicast.ChannelManager$Actor$addEntry$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$addEntry$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$addEntry$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$addEntry$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                androidx.paging.multicast.ChannelManager$a r2 = (androidx.paging.multicast.ChannelManager.C1193a) r2
                p000.hg5.m45199b(r7)
                r7 = r2
                goto L_0x0092
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003a:
                p000.hg5.m45199b(r7)
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r7 = r5.f6257j
                boolean r2 = r7 instanceof java.util.Collection
                if (r2 == 0) goto L_0x004b
                boolean r2 = r7.isEmpty()
                if (r2 == 0) goto L_0x004b
            L_0x0049:
                r7 = r3
                goto L_0x006a
            L_0x004b:
                java.util.Iterator r7 = r7.iterator()
            L_0x004f:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L_0x0049
                java.lang.Object r2 = r7.next()
                androidx.paging.multicast.ChannelManager$a r2 = (androidx.paging.multicast.ChannelManager.C1193a) r2
                boolean r2 = r2.mo8783f(r6)
                java.lang.Boolean r2 = p000.a40.m31670a(r2)
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x004f
                r7 = 0
            L_0x006a:
                if (r7 == 0) goto L_0x00d6
                boolean r7 = r6.mo8780d()
                r7 = r7 ^ r3
                if (r7 == 0) goto L_0x00bb
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r7 = r5.f6257j
                r7.add(r6)
                n40<T> r7 = r5.f6253f
                java.util.Collection r7 = r7.mo22206b()
                boolean r7 = r7.isEmpty()
                r7 = r7 ^ r3
                if (r7 == 0) goto L_0x00ab
                n40<T> r7 = r5.f6253f
                java.util.Collection r7 = r7.mo22206b()
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L_0x0092:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x00b8
                java.lang.Object r2 = r6.next()
                androidx.paging.multicast.ChannelManager$b$b$c r2 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c) r2
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.mo8779c(r2, r0)
                if (r2 != r1) goto L_0x0092
                return r1
            L_0x00ab:
                cm0<r37> r6 = r5.f6256i
                if (r6 == 0) goto L_0x00b8
                r37 r7 = p000.r37.f33317a
                boolean r6 = r6.mo50920l(r7)
                p000.a40.m31670a(r6)
            L_0x00b8:
                r37 r6 = p000.r37.f33317a
                return r6
            L_0x00bb:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                java.lang.String r6 = " already received a value"
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            L_0x00d6:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                java.lang.String r6 = " is already in the list."
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.mo8769i(androidx.paging.multicast.ChannelManager$a, ns0):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo8770j(androidx.paging.multicast.ChannelManager.C1194b.C1195a<T> r7, p000.ns0<? super p000.r37> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.multicast.ChannelManager$Actor$doAdd$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.paging.multicast.ChannelManager$Actor$doAdd$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$doAdd$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$doAdd$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$doAdd$1
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r7 = r0.L$0
                androidx.paging.multicast.ChannelManager$Actor r7 = (androidx.paging.multicast.ChannelManager.Actor) r7
                p000.hg5.m45199b(r8)
                goto L_0x0050
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                p000.hg5.m45199b(r8)
                androidx.paging.multicast.ChannelManager$a r8 = new androidx.paging.multicast.ChannelManager$a
                iu5 r7 = r7.mo8786a()
                r2 = 0
                r4 = 2
                r5 = 0
                r8.<init>(r7, r2, r4, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r6.mo8769i(r8, r0)
                if (r7 != r1) goto L_0x004f
                return r1
            L_0x004f:
                r7 = r6
            L_0x0050:
                r7.mo8768h()
                r37 r7 = p000.r37.f33317a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.mo8770j(androidx.paging.multicast.ChannelManager$b$a, ns0):java.lang.Object");
        }

        /* renamed from: k */
        public final void mo8771k(C1194b.C1196b.C1197a<T> aVar) {
            this.f6255h = true;
            for (C1193a b : this.f6257j) {
                b.mo8778b(aVar.mo8787a());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo8772l(androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c<T> r6, p000.ns0<? super p000.r37> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0048
                if (r2 == r4) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                androidx.paging.multicast.ChannelManager$b$b$c r2 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c) r2
                p000.hg5.m45199b(r7)
                goto L_0x0080
            L_0x0034:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003c:
                java.lang.Object r6 = r0.L$1
                androidx.paging.multicast.ChannelManager$b$b$c r6 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c) r6
                java.lang.Object r2 = r0.L$0
                androidx.paging.multicast.ChannelManager$Actor r2 = (androidx.paging.multicast.ChannelManager.Actor) r2
                p000.hg5.m45199b(r7)
                goto L_0x0063
            L_0x0048:
                p000.hg5.m45199b(r7)
                androidx.paging.multicast.ChannelManager r7 = androidx.paging.multicast.ChannelManager.this
                fd2 r7 = r7.f6250e
                java.lang.Object r2 = r6.mo8790b()
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = r7.invoke(r2, r0)
                if (r7 != r1) goto L_0x0062
                return r1
            L_0x0062:
                r2 = r5
            L_0x0063:
                n40<T> r7 = r2.f6253f
                r7.mo22205a(r6)
                r2.f6255h = r4
                n40<T> r7 = r2.f6253f
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0078
                cm0 r7 = r6.mo8789a()
                r2.f6256i = r7
            L_0x0078:
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r7 = r2.f6257j
                java.util.Iterator r7 = r7.iterator()
                r2 = r6
                r6 = r7
            L_0x0080:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x0099
                java.lang.Object r7 = r6.next()
                androidx.paging.multicast.ChannelManager$a r7 = (androidx.paging.multicast.ChannelManager.C1193a) r7
                r0.L$0 = r2
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r7 = r7.mo8779c(r2, r0)
                if (r7 != r1) goto L_0x0080
                return r1
            L_0x0099:
                r37 r6 = p000.r37.f33317a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.mo8772l(androidx.paging.multicast.ChannelManager$b$b$c, ns0):java.lang.Object");
        }

        /* renamed from: m */
        public final void mo8773m(SharedFlowProducer<T> sharedFlowProducer) {
            if (this.f6254g == sharedFlowProducer) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C1193a aVar : this.f6257j) {
                    if (aVar.mo8780d()) {
                        if (!ChannelManager.this.f6249d) {
                            aVar.mo8777a();
                        } else {
                            arrayList.add(aVar);
                        }
                    } else if (this.f6255h) {
                        arrayList2.add(aVar);
                    } else if (!ChannelManager.this.f6249d) {
                        aVar.mo8777a();
                    } else {
                        arrayList.add(aVar);
                    }
                }
                this.f6257j.clear();
                this.f6257j.addAll(arrayList2);
                this.f6257j.addAll(arrayList);
                this.f6254g = null;
                if (!arrayList2.isEmpty()) {
                    mo8768h();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo8774n(p000.iu5<? super androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c<T>> r6, p000.ns0<? super p000.r37> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.multicast.ChannelManager$Actor$doRemove$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.multicast.ChannelManager$Actor$doRemove$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$doRemove$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$doRemove$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$doRemove$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                p000.hg5.m45199b(r7)
                goto L_0x007e
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                p000.hg5.m45199b(r7)
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r7 = r5.f6257j
                r2 = 0
                java.util.Iterator r7 = r7.iterator()
            L_0x003b:
                boolean r4 = r7.hasNext()
                if (r4 == 0) goto L_0x0059
                java.lang.Object r4 = r7.next()
                androidx.paging.multicast.ChannelManager$a r4 = (androidx.paging.multicast.ChannelManager.C1193a) r4
                boolean r4 = r4.mo8781e(r6)
                java.lang.Boolean r4 = p000.a40.m31670a(r4)
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x0056
                goto L_0x005a
            L_0x0056:
                int r2 = r2 + 1
                goto L_0x003b
            L_0x0059:
                r2 = -1
            L_0x005a:
                if (r2 < 0) goto L_0x007e
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r6 = r5.f6257j
                r6.remove(r2)
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r6 = r5.f6257j
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L_0x007e
                androidx.paging.multicast.ChannelManager r6 = androidx.paging.multicast.ChannelManager.this
                boolean r6 = r6.f6251f
                if (r6 != 0) goto L_0x007e
                androidx.paging.multicast.SharedFlowProducer<T> r6 = r5.f6254g
                if (r6 == 0) goto L_0x007e
                r0.label = r3
                java.lang.Object r6 = r6.mo8798e(r0)
                if (r6 != r1) goto L_0x007e
                return r1
            L_0x007e:
                r37 r6 = p000.r37.f33317a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.mo8774n(iu5, ns0):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo8766e(androidx.paging.multicast.ChannelManager.C1194b<T> r7, p000.ns0<? super p000.r37> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.multicast.ChannelManager$Actor$handle$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.paging.multicast.ChannelManager$Actor$handle$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$handle$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$handle$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$handle$1
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 == r5) goto L_0x0034
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                goto L_0x0034
            L_0x002c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0034:
                p000.hg5.m45199b(r8)
                goto L_0x0083
            L_0x0038:
                p000.hg5.m45199b(r8)
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.C1194b.C1195a
                if (r8 == 0) goto L_0x004a
                androidx.paging.multicast.ChannelManager$b$a r7 = (androidx.paging.multicast.ChannelManager.C1194b.C1195a) r7
                r0.label = r5
                java.lang.Object r7 = r6.mo8770j(r7, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x004a:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.C1194b.C1200c
                if (r8 == 0) goto L_0x005d
                androidx.paging.multicast.ChannelManager$b$c r7 = (androidx.paging.multicast.ChannelManager.C1194b.C1200c) r7
                iu5 r7 = r7.mo8791a()
                r0.label = r4
                java.lang.Object r7 = r6.mo8774n(r7, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x005d:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c
                if (r8 == 0) goto L_0x006c
                androidx.paging.multicast.ChannelManager$b$b$c r7 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c) r7
                r0.label = r3
                java.lang.Object r7 = r6.mo8772l(r7, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x006c:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1197a
                if (r8 == 0) goto L_0x0076
                androidx.paging.multicast.ChannelManager$b$b$a r7 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1197a) r7
                r6.mo8771k(r7)
                goto L_0x0083
            L_0x0076:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1198b
                if (r8 == 0) goto L_0x0083
                androidx.paging.multicast.ChannelManager$b$b$b r7 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1198b) r7
                androidx.paging.multicast.SharedFlowProducer r7 = r7.mo8788a()
                r6.mo8773m(r7)
            L_0x0083:
                r37 r7 = p000.r37.f33317a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.mo8766e(androidx.paging.multicast.ChannelManager$b, ns0):java.lang.Object");
        }

        /* renamed from: p */
        public final SharedFlowProducer<T> mo8776p() {
            return new SharedFlowProducer<>(ChannelManager.this.f6247b, ChannelManager.this.f6252g, new ChannelManager$Actor$newProducer$1(this));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\fJ\u0014\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$a;", "T", "", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "value", "Lr37;", "c", "(Landroidx/paging/multicast/ChannelManager$b$b$c;Lns0;)Ljava/lang/Object;", "", "error", "b", "a", "Liu5;", "channel", "", "e", "entry", "f", "", "toString", "", "hashCode", "other", "equals", "Liu5;", "Z", "_receivedValue", "d", "()Z", "receivedValue", "<init>", "(Liu5;Z)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.multicast.ChannelManager$a */
    /* compiled from: ChannelManager.kt */
    public static final class C1193a<T> {

        /* renamed from: a */
        public final iu5<C1194b.C1196b.C1199c<T>> f6259a;

        /* renamed from: b */
        public boolean f6260b;

        public C1193a(iu5<? super C1194b.C1196b.C1199c<T>> iu5, boolean z) {
            vx2.m53591g(iu5, "channel");
            this.f6259a = iu5;
            this.f6260b = z;
        }

        /* renamed from: a */
        public final void mo8777a() {
            iu5.C7226a.m59120a(this.f6259a, (Throwable) null, 1, (Object) null);
        }

        /* renamed from: b */
        public final void mo8778b(Throwable th) {
            vx2.m53591g(th, "error");
            this.f6260b = true;
            this.f6259a.mo26028z(th);
        }

        /* renamed from: c */
        public final Object mo8779c(C1194b.C1196b.C1199c<T> cVar, ns0<? super r37> ns0) {
            this.f6260b = true;
            Object u = this.f6259a.mo26027u(cVar, ns0);
            if (u == wx2.m54101d()) {
                return u;
            }
            return r37.f33317a;
        }

        /* renamed from: d */
        public final boolean mo8780d() {
            return this.f6260b;
        }

        /* renamed from: e */
        public final boolean mo8781e(iu5<? super C1194b.C1196b.C1199c<T>> iu5) {
            vx2.m53591g(iu5, "channel");
            if (this.f6259a == iu5) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1193a)) {
                return false;
            }
            C1193a aVar = (C1193a) obj;
            return vx2.m53586b(this.f6259a, aVar.f6259a) && this.f6260b == aVar.f6260b;
        }

        /* renamed from: f */
        public final boolean mo8783f(C1193a<T> aVar) {
            vx2.m53591g(aVar, "entry");
            if (this.f6259a == aVar.f6259a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            iu5<C1194b.C1196b.C1199c<T>> iu5 = this.f6259a;
            int hashCode = (iu5 != null ? iu5.hashCode() : 0) * 31;
            boolean z = this.f6260b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "ChannelEntry(channel=" + this.f6259a + ", _receivedValue=" + this.f6260b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1193a(iu5 iu5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(iu5, (i & 2) != 0 ? false : z);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0003\b\t\n¨\u0006\u000b"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$b;", "T", "", "<init>", "()V", "a", "b", "c", "Landroidx/paging/multicast/ChannelManager$b$a;", "Landroidx/paging/multicast/ChannelManager$b$c;", "Landroidx/paging/multicast/ChannelManager$b$b;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.multicast.ChannelManager$b */
    /* compiled from: ChannelManager.kt */
    public static abstract class C1194b<T> {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$b$a;", "T", "Landroidx/paging/multicast/ChannelManager$b;", "Liu5;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "a", "Liu5;", "()Liu5;", "channel", "<init>", "(Liu5;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: androidx.paging.multicast.ChannelManager$b$a */
        /* compiled from: ChannelManager.kt */
        public static final class C1195a<T> extends C1194b<T> {

            /* renamed from: a */
            public final iu5<C1196b.C1199c<T>> f6261a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1195a(iu5<? super C1196b.C1199c<T>> iu5) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(iu5, "channel");
                this.f6261a = iu5;
            }

            /* renamed from: a */
            public final iu5<C1196b.C1199c<T>> mo8786a() {
                return this.f6261a;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0003\b\t\n¨\u0006\u000b"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$b$b;", "T", "Landroidx/paging/multicast/ChannelManager$b;", "<init>", "()V", "a", "b", "c", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "Landroidx/paging/multicast/ChannelManager$b$b$a;", "Landroidx/paging/multicast/ChannelManager$b$b$b;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: androidx.paging.multicast.ChannelManager$b$b */
        /* compiled from: ChannelManager.kt */
        public static abstract class C1196b<T> extends C1194b<T> {

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$b$b$a;", "T", "Landroidx/paging/multicast/ChannelManager$b$b;", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
            /* renamed from: androidx.paging.multicast.ChannelManager$b$b$a */
            /* compiled from: ChannelManager.kt */
            public static final class C1197a<T> extends C1196b<T> {

                /* renamed from: a */
                public final Throwable f6262a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1197a(Throwable th) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(th, "error");
                    this.f6262a = th;
                }

                /* renamed from: a */
                public final Throwable mo8787a() {
                    return this.f6262a;
                }
            }

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$b$b$b;", "T", "Landroidx/paging/multicast/ChannelManager$b$b;", "Landroidx/paging/multicast/SharedFlowProducer;", "a", "Landroidx/paging/multicast/SharedFlowProducer;", "()Landroidx/paging/multicast/SharedFlowProducer;", "producer", "<init>", "(Landroidx/paging/multicast/SharedFlowProducer;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
            /* renamed from: androidx.paging.multicast.ChannelManager$b$b$b */
            /* compiled from: ChannelManager.kt */
            public static final class C1198b<T> extends C1196b<T> {

                /* renamed from: a */
                public final SharedFlowProducer<T> f6263a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1198b(SharedFlowProducer<T> sharedFlowProducer) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(sharedFlowProducer, "producer");
                    this.f6263a = sharedFlowProducer;
                }

                /* renamed from: a */
                public final SharedFlowProducer<T> mo8788a() {
                    return this.f6263a;
                }
            }

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u001d\u0012\u0006\u0010\u0007\u001a\u00028\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$b$b$c;", "T", "Landroidx/paging/multicast/ChannelManager$b$b;", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "value", "Lcm0;", "Lr37;", "Lcm0;", "()Lcm0;", "delivered", "<init>", "(Ljava/lang/Object;Lcm0;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
            /* renamed from: androidx.paging.multicast.ChannelManager$b$b$c */
            /* compiled from: ChannelManager.kt */
            public static final class C1199c<T> extends C1196b<T> {

                /* renamed from: a */
                public final T f6264a;

                /* renamed from: b */
                public final cm0<r37> f6265b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1199c(T t, cm0<r37> cm0) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(cm0, "delivered");
                    this.f6264a = t;
                    this.f6265b = cm0;
                }

                /* renamed from: a */
                public final cm0<r37> mo8789a() {
                    return this.f6265b;
                }

                /* renamed from: b */
                public final T mo8790b() {
                    return this.f6264a;
                }
            }

            public C1196b() {
                super((DefaultConstructorMarker) null);
            }

            public /* synthetic */ C1196b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Landroidx/paging/multicast/ChannelManager$b$c;", "T", "Landroidx/paging/multicast/ChannelManager$b;", "Liu5;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "a", "Liu5;", "()Liu5;", "channel", "<init>", "(Liu5;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: androidx.paging.multicast.ChannelManager$b$c */
        /* compiled from: ChannelManager.kt */
        public static final class C1200c<T> extends C1194b<T> {

            /* renamed from: a */
            public final iu5<C1196b.C1199c<T>> f6266a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1200c(iu5<? super C1196b.C1199c<T>> iu5) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(iu5, "channel");
                this.f6266a = iu5;
            }

            /* renamed from: a */
            public final iu5<C1196b.C1199c<T>> mo8791a() {
                return this.f6266a;
            }
        }

        public C1194b() {
        }

        public /* synthetic */ C1194b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ChannelManager(hu0 hu0, int i, boolean z, fd2<? super T, ? super ns0<? super r37>, ? extends Object> fd2, boolean z2, z42<? extends T> z42) {
        vx2.m53591g(hu0, "scope");
        vx2.m53591g(fd2, "onEach");
        vx2.m53591g(z42, "upstream");
        this.f6247b = hu0;
        this.f6248c = i;
        this.f6249d = z;
        this.f6250e = fd2;
        this.f6251f = z2;
        this.f6252g = z42;
    }

    /* renamed from: g */
    public final Object mo8763g(iu5<? super C1194b.C1196b.C1199c<T>> iu5, ns0<? super r37> ns0) {
        Object g = this.f6246a.mo8803g(new C1194b.C1195a(iu5), ns0);
        if (g == wx2.m54101d()) {
            return g;
        }
        return r37.f33317a;
    }

    /* renamed from: h */
    public final Object mo8764h(ns0<? super r37> ns0) {
        Object c = this.f6246a.mo8801c(ns0);
        if (c == wx2.m54101d()) {
            return c;
        }
        return r37.f33317a;
    }

    /* renamed from: i */
    public final Object mo8765i(iu5<? super C1194b.C1196b.C1199c<T>> iu5, ns0<? super r37> ns0) {
        Object g = this.f6246a.mo8803g(new C1194b.C1200c(iu5), ns0);
        if (g == wx2.m54101d()) {
            return g;
        }
        return r37.f33317a;
    }
}
