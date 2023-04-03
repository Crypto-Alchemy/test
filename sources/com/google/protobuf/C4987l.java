package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.l */
/* compiled from: ExtensionRegistryLite */
public class C4987l {

    /* renamed from: b */
    public static boolean f25700b = true;

    /* renamed from: c */
    public static volatile C4987l f25701c;

    /* renamed from: d */
    public static final C4987l f25702d = new C4987l(true);

    /* renamed from: a */
    public final Map<C4988a, GeneratedMessageLite.C4934e<?, ?>> f25703a;

    /* renamed from: com.google.protobuf.l$a */
    /* compiled from: ExtensionRegistryLite */
    public static final class C4988a {

        /* renamed from: a */
        public final Object f25704a;

        /* renamed from: b */
        public final int f25705b;

        public C4988a(Object obj, int i) {
            this.f25704a = obj;
            this.f25705b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4988a)) {
                return false;
            }
            C4988a aVar = (C4988a) obj;
            if (this.f25704a == aVar.f25704a && this.f25705b == aVar.f25705b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f25704a) * 65535) + this.f25705b;
        }
    }

    public C4987l() {
        this.f25703a = new HashMap();
    }

    /* renamed from: b */
    public static C4987l m39771b() {
        C4987l lVar = f25701c;
        if (lVar == null) {
            synchronized (C4987l.class) {
                lVar = f25701c;
                if (lVar == null) {
                    if (f25700b) {
                        lVar = wx1.m54098a();
                    } else {
                        lVar = f25702d;
                    }
                    f25701c = lVar;
                }
            }
        }
        return lVar;
    }

    /* renamed from: a */
    public <ContainingType extends C4956c0> GeneratedMessageLite.C4934e<ContainingType, ?> mo37366a(ContainingType containingtype, int i) {
        return this.f25703a.get(new C4988a(containingtype, i));
    }

    public C4987l(boolean z) {
        this.f25703a = Collections.emptyMap();
    }
}
