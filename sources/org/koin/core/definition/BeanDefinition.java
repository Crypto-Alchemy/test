package org.koin.core.definition;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001aj\b\u0012\u0004\u0012\u00028\u0000`\u001d\u0012\u0006\u0010%\u001a\u00020!\u0012\u0012\b\u0002\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100&¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0018R3\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001aj\b\u0012\u0004\u0012\u00028\u0000`\u001d8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R,\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R(\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010.\u001a\u0004\b\u000b\u0010/\"\u0004\b0\u00101¨\u00065"}, mo44877d2 = {"Lorg/koin/core/definition/BeanDefinition;", "T", "", "", "toString", "other", "", "equals", "", "hashCode", "Loz4;", "a", "Loz4;", "e", "()Loz4;", "scopeQualifier", "Lq83;", "b", "Lq83;", "c", "()Lq83;", "primaryType", "d", "setQualifier", "(Loz4;)V", "qualifier", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lul4;", "Lorg/koin/core/definition/Definition;", "Lfd2;", "()Lfd2;", "definition", "Lorg/koin/core/definition/Kind;", "Lorg/koin/core/definition/Kind;", "getKind", "()Lorg/koin/core/definition/Kind;", "kind", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "(Ljava/util/List;)V", "secondaryTypes", "Ls90;", "Ls90;", "()Ls90;", "setCallbacks", "(Ls90;)V", "callbacks", "<init>", "(Loz4;Lq83;Loz4;Lfd2;Lorg/koin/core/definition/Kind;Ljava/util/List;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BeanDefinition.kt */
public final class BeanDefinition<T> {

    /* renamed from: a */
    public final oz4 f43931a;

    /* renamed from: b */
    public final q83<?> f43932b;

    /* renamed from: c */
    public oz4 f43933c;

    /* renamed from: d */
    public final fd2<Scope, ul4, T> f43934d;

    /* renamed from: e */
    public final Kind f43935e;

    /* renamed from: f */
    public List<? extends q83<?>> f43936f;

    /* renamed from: g */
    public s90<T> f43937g = new s90<>((rc2) null, 1, (DefaultConstructorMarker) null);

    public BeanDefinition(oz4 oz4, q83<?> q83, oz4 oz42, fd2<? super Scope, ? super ul4, ? extends T> fd2, Kind kind, List<? extends q83<?>> list) {
        vx2.m53591g(oz4, "scopeQualifier");
        vx2.m53591g(q83, "primaryType");
        vx2.m53591g(fd2, "definition");
        vx2.m53591g(kind, "kind");
        vx2.m53591g(list, "secondaryTypes");
        this.f43931a = oz4;
        this.f43932b = q83;
        this.f43933c = oz42;
        this.f43934d = fd2;
        this.f43935e = kind;
        this.f43936f = list;
    }

    /* renamed from: a */
    public final s90<T> mo64967a() {
        return this.f43937g;
    }

    /* renamed from: b */
    public final fd2<Scope, ul4, T> mo64968b() {
        return this.f43934d;
    }

    /* renamed from: c */
    public final q83<?> mo64969c() {
        return this.f43932b;
    }

    /* renamed from: d */
    public final oz4 mo64970d() {
        return this.f43933c;
    }

    /* renamed from: e */
    public final oz4 mo64971e() {
        return this.f43931a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        vx2.m53589e(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        if (vx2.m53586b(this.f43932b, beanDefinition.f43932b) && vx2.m53586b(this.f43933c, beanDefinition.f43933c) && vx2.m53586b(this.f43931a, beanDefinition.f43931a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final List<q83<?>> mo64973f() {
        return this.f43936f;
    }

    /* renamed from: g */
    public final void mo64974g(List<? extends q83<?>> list) {
        vx2.m53591g(list, "<set-?>");
        this.f43936f = list;
    }

    public int hashCode() {
        int i;
        oz4 oz4 = this.f43933c;
        if (oz4 != null) {
            i = oz4.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.f43932b.hashCode()) * 31) + this.f43931a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r2 == null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r15 = this;
            org.koin.core.definition.Kind r0 = r15.f43935e
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 39
            r1.append(r2)
            q83<?> r3 = r15.f43932b
            java.lang.String r3 = p000.s83.m71896a(r3)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            oz4 r2 = r15.f43933c
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = ",qualifier:"
            r2.append(r4)
            oz4 r4 = r15.f43933c
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x003c
        L_0x003b:
            r2 = r3
        L_0x003c:
            oz4 r4 = r15.f43931a
            mn5$a r5 = p000.mn5.f40974e
            gb6 r5 = r5.mo56288a()
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x004c
            r4 = r3
            goto L_0x005f
        L_0x004c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ",scope:"
            r4.append(r5)
            oz4 r5 = r15.f43931a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x005f:
            java.util.List<? extends q83<?>> r5 = r15.f43936f
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x008b
            java.util.List<? extends q83<?>> r6 = r15.f43936f
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1 r12 = org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1.INSTANCE
            r13 = 30
            r14 = 0
            java.lang.String r7 = ","
            java.lang.String r3 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ",binds:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x008b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 91
            r5.append(r6)
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition.toString():java.lang.String");
    }
}
