package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4143y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.xv8;

/* renamed from: com.google.android.gms.internal.vision.y */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class C4143y<MessageType extends C4143y<MessageType, BuilderType>, BuilderType extends xv8<MessageType, BuilderType>> implements k59 {
    public int zza = 0;

    /* renamed from: b */
    public static <T> void m34318b(Iterable<T> iterable, List<? super T> list) {
        t19.m52047d(iterable);
        if (iterable instanceof k39) {
            List<?> b = ((k39) iterable).mo28810b();
            k39 k39 = (k39) list;
            int size = list.size();
            for (Object next : b) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(k39.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = k39.size() - 1; size2 >= size; size2--) {
                        k39.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzht) {
                    k39.mo28805Z0((zzht) next);
                } else {
                    k39.add((String) next);
                }
            }
        } else if (iterable instanceof j69) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    /* renamed from: f */
    public void mo31172f(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final byte[] mo31221g() {
        try {
            byte[] bArr = new byte[mo31175j()];
            zzii f = zzii.m34403f(bArr);
            mo31178m(f);
            f.mo31272N();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: h */
    public final zzht mo31222h() {
        try {
            C4092a0 zzc = zzht.zzc(mo31175j());
            mo31178m(zzc.mo31158b());
            return zzc.mo31157a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo31176k() {
        throw new UnsupportedOperationException();
    }
}
