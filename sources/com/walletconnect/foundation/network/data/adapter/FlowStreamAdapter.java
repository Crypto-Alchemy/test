package com.walletconnect.foundation.network.data.adapter;

import java.lang.reflect.Type;
import kotlin.Metadata;
import p000.ja6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¨\u0006\n"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/data/adapter/FlowStreamAdapter;", "T", "Lja6;", "Lz42;", "Lia6;", "stream", "b", "<init>", "()V", "a", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: FlowStreamAdapter.kt */
public final class FlowStreamAdapter<T> implements ja6<T, z42<? extends T>> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/data/adapter/FlowStreamAdapter$a;", "Lja6$a;", "Ljava/lang/reflect/Type;", "type", "Lja6;", "", "a", "<init>", "()V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.foundation.network.data.adapter.FlowStreamAdapter$a */
    /* compiled from: FlowStreamAdapter.kt */
    public static final class C5615a implements ja6.C6024a {
        /* renamed from: a */
        public ja6<Object, Object> mo40756a(Type type) {
            vx2.m53591g(type, "type");
            if (vx2.m53586b(y17.m54604b(type), z42.class)) {
                return new FlowStreamAdapter();
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public z42<T> mo40754a(ia6<T> ia6) {
        vx2.m53591g(ia6, "stream");
        return e52.m57228t(new FlowStreamAdapter$adapt$1(ia6, (ns0<? super FlowStreamAdapter$adapt$1>) null));
    }
}
