package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KCallableImpl;
import p000.f93;
import p000.i93;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\",\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lo83;", "", "value", "isAccessible", "(Lo83;)Z", "a", "(Lo83;Z)V", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: p83 */
/* compiled from: KCallablesJvm.kt */
public final class p83 {
    /* renamed from: a */
    public static final void m24751a(o83<?> o83, boolean z) {
        Object obj;
        u90<?> w;
        vx2.m53591g(o83, "<this>");
        if (o83 instanceof f93) {
            i93 i93 = (i93) o83;
            Field b = oa5.m23728b(i93);
            if (b != null) {
                b.setAccessible(z);
            }
            Method c = oa5.m23729c(i93);
            if (c != null) {
                c.setAccessible(z);
            }
            Method e = oa5.m23731e((f93) o83);
            if (e != null) {
                e.setAccessible(z);
            }
        } else if (o83 instanceof i93) {
            i93 i932 = (i93) o83;
            Field b2 = oa5.m23728b(i932);
            if (b2 != null) {
                b2.setAccessible(z);
            }
            Method c2 = oa5.m23729c(i932);
            if (c2 != null) {
                c2.setAccessible(z);
            }
        } else if (o83 instanceof i93.C5953b) {
            Field b3 = oa5.m23728b(((i93.C5953b) o83).mo43526j());
            if (b3 != null) {
                b3.setAccessible(z);
            }
            Method d = oa5.m23730d((z83) o83);
            if (d != null) {
                d.setAccessible(z);
            }
        } else if (o83 instanceof f93.C5836a) {
            Field b4 = oa5.m23728b(((f93.C5836a) o83).mo43526j());
            if (b4 != null) {
                b4.setAccessible(z);
            }
            Method d2 = oa5.m23730d((z83) o83);
            if (d2 != null) {
                d2.setAccessible(z);
            }
        } else if (o83 instanceof z83) {
            z83 z83 = (z83) o83;
            Method d3 = oa5.m23730d(z83);
            if (d3 != null) {
                d3.setAccessible(z);
            }
            KCallableImpl<?> b5 = y67.m74272b(o83);
            AccessibleObject accessibleObject = null;
            if (b5 == null || (w = b5.mo52983w()) == null) {
                obj = null;
            } else {
                obj = w.getMember();
            }
            if (obj instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) obj;
            }
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            Constructor a = oa5.m23727a(z83);
            if (a != null) {
                a.setAccessible(z);
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + o83 + " (" + o83.getClass() + ')');
        }
    }
}
