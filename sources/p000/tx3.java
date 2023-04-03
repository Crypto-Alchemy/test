package p000;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Immutable
/* renamed from: tx3 */
/* compiled from: MonitoringKeysetInfo */
public final class tx3 {

    /* renamed from: a */
    public final rx3 f34400a;

    /* renamed from: b */
    public final List<C6556c> f34401b;

    /* renamed from: c */
    public final Integer f34402c;

    /* renamed from: tx3$b */
    /* compiled from: MonitoringKeysetInfo */
    public static final class C6555b {

        /* renamed from: a */
        public ArrayList<C6556c> f34403a = new ArrayList<>();

        /* renamed from: b */
        public rx3 f34404b = rx3.f33629b;

        /* renamed from: c */
        public Integer f34405c = null;

        /* renamed from: a */
        public C6555b mo48249a(ab3 ab3, int i, tl4 tl4) {
            ArrayList<C6556c> arrayList = this.f34403a;
            if (arrayList != null) {
                arrayList.add(new C6556c(ab3, i, tl4));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        /* renamed from: b */
        public tx3 mo48250b() throws GeneralSecurityException {
            if (this.f34403a != null) {
                Integer num = this.f34405c;
                if (num == null || mo48251c(num.intValue())) {
                    tx3 tx3 = new tx3(this.f34404b, Collections.unmodifiableList(this.f34403a), this.f34405c);
                    this.f34403a = null;
                    return tx3;
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            throw new IllegalStateException("cannot call build() twice");
        }

        /* renamed from: c */
        public final boolean mo48251c(int i) {
            Iterator<C6556c> it = this.f34403a.iterator();
            while (it.hasNext()) {
                if (it.next().mo48254a() == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public C6555b mo48252d(rx3 rx3) {
            if (this.f34403a != null) {
                this.f34404b = rx3;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        /* renamed from: e */
        public C6555b mo48253e(int i) {
            if (this.f34403a != null) {
                this.f34405c = Integer.valueOf(i);
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    @Immutable
    /* renamed from: tx3$c */
    /* compiled from: MonitoringKeysetInfo */
    public static final class C6556c {

        /* renamed from: a */
        public final ab3 f34406a;

        /* renamed from: b */
        public final int f34407b;

        /* renamed from: c */
        public final tl4 f34408c;

        /* renamed from: a */
        public int mo48254a() {
            return this.f34407b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6556c)) {
                return false;
            }
            C6556c cVar = (C6556c) obj;
            if (this.f34406a == cVar.f34406a && this.f34407b == cVar.f34407b && this.f34408c.equals(cVar.f34408c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f34406a, Integer.valueOf(this.f34407b), Integer.valueOf(this.f34408c.hashCode())});
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f34406a, Integer.valueOf(this.f34407b), this.f34408c});
        }

        public C6556c(ab3 ab3, int i, tl4 tl4) {
            this.f34406a = ab3;
            this.f34407b = i;
            this.f34408c = tl4;
        }
    }

    /* renamed from: a */
    public static C6555b m52539a() {
        return new C6555b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tx3)) {
            return false;
        }
        tx3 tx3 = (tx3) obj;
        if (!this.f34400a.equals(tx3.f34400a) || !this.f34401b.equals(tx3.f34401b) || !Objects.equals(this.f34402c, tx3.f34402c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f34400a, this.f34401b});
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f34400a, this.f34401b, this.f34402c});
    }

    public tx3(rx3 rx3, List<C6556c> list, Integer num) {
        this.f34400a = rx3;
        this.f34401b = list;
        this.f34402c = num;
    }
}
