package com.squareup.sqldelight;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.nt6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lcom/squareup/sqldelight/b;", "R", "Lcu6;", "", "", "c", "Lkotlin/Function0;", "Lr37;", "function", "a", "b", "Lnt6$b;", "Lnt6$b;", "getTransaction", "()Lnt6$b;", "transaction", "<init>", "(Lnt6$b;)V", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: com.squareup.sqldelight.b */
/* compiled from: Transacter.kt */
public final class C5467b<R> implements cu6, tt6 {

    /* renamed from: a */
    public final nt6.C6292b f26960a;

    public C5467b(nt6.C6292b bVar) {
        vx2.m53591g(bVar, "transaction");
        this.f26960a = bVar;
    }

    /* renamed from: a */
    public void mo39630a(pc2<r37> pc2) {
        vx2.m53591g(pc2, "function");
        this.f26960a.mo39630a(pc2);
    }

    /* renamed from: b */
    public void mo39631b(pc2<r37> pc2) {
        vx2.m53591g(pc2, "function");
        this.f26960a.mo39631b(pc2);
    }

    /* renamed from: c */
    public Void mo39632c() {
        this.f26960a.mo46208d();
        throw new RollbackException((Object) null, 1, (DefaultConstructorMarker) null);
    }
}
