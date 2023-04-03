package p000;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

/* renamed from: nx4 */
/* compiled from: PropertyValue */
public abstract class nx4 {

    /* renamed from: a */
    public final nx4 f15713a;

    /* renamed from: b */
    public final Object f15714b;

    /* renamed from: nx4$a */
    /* compiled from: PropertyValue */
    public static final class C2928a extends nx4 {

        /* renamed from: c */
        public final SettableAnyProperty f15715c;

        /* renamed from: d */
        public final String f15716d;

        public C2928a(nx4 nx4, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(nx4, obj);
            this.f15715c = settableAnyProperty;
            this.f15716d = str;
        }

        /* renamed from: a */
        public void mo23825a(Object obj) throws IOException {
            this.f15715c.set(obj, this.f15716d, this.f15714b);
        }
    }

    /* renamed from: nx4$b */
    /* compiled from: PropertyValue */
    public static final class C2929b extends nx4 {

        /* renamed from: c */
        public final Object f15717c;

        public C2929b(nx4 nx4, Object obj, Object obj2) {
            super(nx4, obj);
            this.f15717c = obj2;
        }

        /* renamed from: a */
        public void mo23825a(Object obj) throws IOException {
            ((Map) obj).put(this.f15717c, this.f15714b);
        }
    }

    /* renamed from: nx4$c */
    /* compiled from: PropertyValue */
    public static final class C2930c extends nx4 {

        /* renamed from: c */
        public final SettableBeanProperty f15718c;

        public C2930c(nx4 nx4, Object obj, SettableBeanProperty settableBeanProperty) {
            super(nx4, obj);
            this.f15718c = settableBeanProperty;
        }

        /* renamed from: a */
        public void mo23825a(Object obj) throws IOException {
            this.f15718c.set(obj, this.f15714b);
        }
    }

    public nx4(nx4 nx4, Object obj) {
        this.f15713a = nx4;
        this.f15714b = obj;
    }

    /* renamed from: a */
    public abstract void mo23825a(Object obj) throws IOException;
}
