package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l */
/* compiled from: ExtensionRegistryLite */
public class C4734l {

    /* renamed from: b */
    public static boolean f25244b = true;

    /* renamed from: c */
    public static volatile C4734l f25245c;

    /* renamed from: d */
    public static final C4734l f25246d = new C4734l(true);

    /* renamed from: a */
    public final Map<C4735a, GeneratedMessageLite.C4684e<?, ?>> f25247a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    /* compiled from: ExtensionRegistryLite */
    public static final class C4735a {

        /* renamed from: a */
        public final Object f25248a;

        /* renamed from: b */
        public final int f25249b;

        public C4735a(Object obj, int i) {
            this.f25248a = obj;
            this.f25249b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4735a)) {
                return false;
            }
            C4735a aVar = (C4735a) obj;
            if (this.f25248a == aVar.f25248a && this.f25249b == aVar.f25249b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f25248a) * 65535) + this.f25249b;
        }
    }

    public C4734l() {
        this.f25247a = new HashMap();
    }

    /* renamed from: b */
    public static C4734l m38174b() {
        C4734l lVar = f25245c;
        if (lVar == null) {
            synchronized (C4734l.class) {
                lVar = f25245c;
                if (lVar == null) {
                    if (f25244b) {
                        lVar = xx1.m54584a();
                    } else {
                        lVar = f25246d;
                    }
                    f25245c = lVar;
                }
            }
        }
        return lVar;
    }

    /* renamed from: a */
    public <ContainingType extends C4705c0> GeneratedMessageLite.C4684e<ContainingType, ?> mo35903a(ContainingType containingtype, int i) {
        return this.f25247a.get(new C4735a(containingtype, i));
    }

    public C4734l(boolean z) {
        this.f25247a = Collections.emptyMap();
    }
}
