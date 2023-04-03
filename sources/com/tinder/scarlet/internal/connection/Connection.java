package com.tinder.scarlet.internal.connection;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.tinder.StateMachine;
import java.util.concurrent.TimeUnit;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.et1;
import p000.kg3;
import p000.q86;
import p000.yj7;
import p018io.reactivex.processors.PublishProcessor;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, mo44877d2 = {"Lcom/tinder/scarlet/internal/connection/Connection;", "", "Lr37;", "c", "Lg52;", "Let1;", "a", "Liu3;", "message", "", "b", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "getStateManager", "()Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "stateManager", "<init>", "(Lcom/tinder/scarlet/internal/connection/Connection$StateManager;)V", "Factory", "StateManager", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: Connection.kt */
public final class Connection {

    /* renamed from: a */
    public final StateManager f26986a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lcom/tinder/scarlet/internal/connection/Connection$Factory;", "", "Lcom/tinder/scarlet/internal/connection/Connection;", "b", "Lyg3;", "c", "Lkg3;", "a", "Lkg3;", "lifecycle", "Lyj7$b;", "Lyj7$b;", "webSocketFactory", "Lzw;", "Lzw;", "backoffStrategy", "Lnm5;", "d", "Lnm5;", "scheduler", "e", "Lef3;", "()Lkg3;", "sharedLifecycle", "<init>", "(Lkg3;Lyj7$b;Lzw;Lnm5;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* compiled from: Connection.kt */
    public static final class Factory {

        /* renamed from: a */
        public final kg3 f26987a;

        /* renamed from: b */
        public final yj7.C6745b f26988b;

        /* renamed from: c */
        public final C6779zw f26989c;

        /* renamed from: d */
        public final nm5 f26990d;

        /* renamed from: e */
        public final ef3 f26991e = C6169a.m47232a(new Connection$Factory$sharedLifecycle$2(this));

        public Factory(kg3 kg3, yj7.C6745b bVar, C6779zw zwVar, nm5 nm5) {
            vx2.m53591g(kg3, "lifecycle");
            vx2.m53591g(bVar, "webSocketFactory");
            vx2.m53591g(zwVar, "backoffStrategy");
            vx2.m53591g(nm5, "scheduler");
            this.f26987a = kg3;
            this.f26988b = bVar;
            this.f26989c = zwVar;
            this.f26990d = nm5;
        }

        /* renamed from: b */
        public final Connection mo39681b() {
            return new Connection(new StateManager(mo39683d(), this.f26988b, this.f26989c, this.f26990d));
        }

        /* renamed from: c */
        public final yg3 mo39682c() {
            yg3 yg3 = new yg3(0, 1, (DefaultConstructorMarker) null);
            this.f26987a.mo40232a(yg3);
            return yg3;
        }

        /* renamed from: d */
        public final kg3 mo39683d() {
            return (kg3) this.f26991e.getValue();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b>\u0010?J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0014\u0010\u0013\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\f\u0010\u0015\u001a\u00020\u0005*\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0016H\u0002J\u0018\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0016H\u0002J\u0018\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0016H\u0002R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00030\u0003028\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R&\u0010;\u001a\u0014\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001078\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0011\u0010\u0012\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, mo44877d2 = {"Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "", "Lg52;", "Let1;", "r", "Lr37;", "v", "event", "n", "Lox5;", "s", "", "duration", "Lth1;", "u", "t", "Lq86$a;", "Lkg3$a;", "state", "o", "Lq86$f;", "l", "Lcom/tinder/StateMachine$Matcher;", "Let1$a$a;", "p", "q", "Let1$d$a;", "w", "Lkg3;", "a", "Lkg3;", "getLifecycle", "()Lkg3;", "lifecycle", "Lyj7$b;", "b", "Lyj7$b;", "webSocketFactory", "Lzw;", "c", "Lzw;", "backoffStrategy", "Lnm5;", "d", "Lnm5;", "scheduler", "Lah3;", "e", "Lah3;", "lifecycleStateSubscriber", "Lio/reactivex/processors/PublishProcessor;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/processors/PublishProcessor;", "eventProcessor", "Lcom/tinder/StateMachine;", "Lq86;", "g", "Lcom/tinder/StateMachine;", "stateMachine", "m", "()Lq86;", "<init>", "(Lkg3;Lyj7$b;Lzw;Lnm5;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* compiled from: Connection.kt */
    public static final class StateManager {

        /* renamed from: a */
        public final kg3 f26992a;

        /* renamed from: b */
        public final yj7.C6745b f26993b;

        /* renamed from: c */
        public final C6779zw f26994c;

        /* renamed from: d */
        public final nm5 f26995d;

        /* renamed from: e */
        public final ah3 f26996e = new ah3(this);

        /* renamed from: f */
        public final PublishProcessor<et1> f26997f;

        /* renamed from: g */
        public final StateMachine<q86, et1, Object> f26998g;

        public StateManager(kg3 kg3, yj7.C6745b bVar, C6779zw zwVar, nm5 nm5) {
            vx2.m53591g(kg3, "lifecycle");
            vx2.m53591g(bVar, "webSocketFactory");
            vx2.m53591g(zwVar, "backoffStrategy");
            vx2.m53591g(nm5, "scheduler");
            this.f26992a = kg3;
            this.f26993b = bVar;
            this.f26994c = zwVar;
            this.f26995d = nm5;
            PublishProcessor<et1> T = PublishProcessor.m45884T();
            vx2.m53590f(T, "create<Event>()");
            this.f26997f = T;
            this.f26998g = StateMachine.f26961c.mo39652a(new Connection$StateManager$stateMachine$1(this));
        }

        /* renamed from: l */
        public final void mo39684l(q86.C6394f fVar) {
            fVar.mo47014b().dispose();
        }

        /* renamed from: m */
        public final q86 mo39685m() {
            return this.f26998g.mo39634b();
        }

        /* renamed from: n */
        public final void mo39686n(et1 et1) {
            vx2.m53591g(et1, "event");
            this.f26997f.onNext(et1);
            this.f26998g.mo39639g(et1);
        }

        /* renamed from: o */
        public final void mo39687o(q86.C6389a aVar, kg3.C6147a aVar2) {
            if (aVar2 instanceof kg3.C6147a.C6150c.C6152b) {
                aVar.mo47004a().mo46557a().mo46726b(((kg3.C6147a.C6150c.C6152b) aVar2).mo44792a());
            } else if (vx2.m53586b(aVar2, kg3.C6147a.C6150c.C6151a.f30872a)) {
                aVar.mo47004a().mo46557a().cancel();
            }
        }

        /* renamed from: p */
        public final StateMachine.Matcher<et1, et1.C5810a.C5811a<?>> mo39688p() {
            return StateMachine.Matcher.f26969c.mo39651a(et1.C5810a.C5811a.class).mo39650c(Connection$StateManager$lifecycleStart$1.INSTANCE);
        }

        /* renamed from: q */
        public final StateMachine.Matcher<et1, et1.C5810a.C5811a<?>> mo39689q() {
            return StateMachine.Matcher.f26969c.mo39651a(et1.C5810a.C5811a.class).mo39650c(Connection$StateManager$lifecycleStop$1.INSTANCE);
        }

        /* renamed from: r */
        public final g52<et1> mo39690r() {
            g52<et1> G = this.f26997f.mo42756G();
            vx2.m53590f(G, "eventProcessor.onBackpressureBuffer()");
            return G;
        }

        /* renamed from: s */
        public final ox5 mo39691s() {
            yj7 a = this.f26993b.mo46731a();
            bk7 bk7 = new bk7(this);
            g52.m44525C(a.mo46725a()).mo42754E(this.f26995d).mo42766d(yj7.C6739a.class).mo42759J(bk7);
            return new ox5(a, bk7);
        }

        /* renamed from: t */
        public final void mo39692t() {
            this.f26996e.mo28974f();
        }

        /* renamed from: u */
        public final th1 mo39693u(long j) {
            tg5 tg5 = new tg5(this);
            g52.m44526O(j, TimeUnit.MILLISECONDS, this.f26995d).mo42756G().mo42759J(tg5);
            return tg5;
        }

        /* renamed from: v */
        public final void mo39694v() {
            this.f26992a.mo40232a(this.f26996e);
        }

        /* renamed from: w */
        public final StateMachine.Matcher<et1, et1.C5815d.C5816a<?>> mo39695w() {
            return StateMachine.Matcher.f26969c.mo39651a(et1.C5815d.C5816a.class).mo39650c(Connection$StateManager$webSocketOpen$1.INSTANCE);
        }
    }

    public Connection(StateManager stateManager) {
        vx2.m53591g(stateManager, "stateManager");
        this.f26986a = stateManager;
    }

    /* renamed from: a */
    public final g52<et1> mo39678a() {
        return this.f26986a.mo39690r();
    }

    /* renamed from: b */
    public final boolean mo39679b(iu3 iu3) {
        vx2.m53591g(iu3, ThrowableDeserializer.PROP_NAME_MESSAGE);
        q86 m = this.f26986a.mo39685m();
        if (m instanceof q86.C6389a) {
            return ((q86.C6389a) m).mo47004a().mo46557a().mo46727c(iu3);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo39680c() {
        this.f26986a.mo39694v();
    }
}
