package p000;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import java.util.Collections;
import java.util.List;

/* renamed from: r00 */
/* compiled from: BeanSerializerBuilder */
public class r00 {

    /* renamed from: i */
    public static final BeanPropertyWriter[] f17108i = new BeanPropertyWriter[0];

    /* renamed from: a */
    public final n00 f17109a;

    /* renamed from: b */
    public SerializationConfig f17110b;

    /* renamed from: c */
    public List<BeanPropertyWriter> f17111c = Collections.emptyList();

    /* renamed from: d */
    public BeanPropertyWriter[] f17112d;

    /* renamed from: e */
    public C2613jm f17113e;

    /* renamed from: f */
    public Object f17114f;

    /* renamed from: g */
    public AnnotatedMember f17115g;

    /* renamed from: h */
    public cf4 f17116h;

    public r00(n00 n00) {
        this.f17109a = n00;
    }

    /* renamed from: a */
    public y63<?> mo25297a() {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this.f17115g != null && this.f17110b.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f17115g.fixAccess(this.f17110b.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        C2613jm jmVar = this.f17113e;
        if (jmVar != null) {
            jmVar.mo21964a(this.f17110b);
        }
        List<BeanPropertyWriter> list = this.f17111c;
        if (list != null && !list.isEmpty()) {
            List<BeanPropertyWriter> list2 = this.f17111c;
            beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
            if (this.f17110b.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (BeanPropertyWriter fixAccess : beanPropertyWriterArr) {
                    fixAccess.fixAccess(this.f17110b);
                }
            }
        } else if (this.f17113e == null && this.f17116h == null) {
            return null;
        } else {
            beanPropertyWriterArr = f17108i;
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.f17112d;
        if (beanPropertyWriterArr2 == null || beanPropertyWriterArr2.length == this.f17111c.size()) {
            return new BeanSerializer(this.f17109a.mo23439A(), this, beanPropertyWriterArr, this.f17112d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", new Object[]{Integer.valueOf(this.f17111c.size()), Integer.valueOf(this.f17112d.length)}));
    }

    /* renamed from: b */
    public BeanSerializer mo25298b() {
        return BeanSerializer.createDummy(this.f17109a.mo23439A(), this);
    }

    /* renamed from: c */
    public C2613jm mo25299c() {
        return this.f17113e;
    }

    /* renamed from: d */
    public n00 mo25300d() {
        return this.f17109a;
    }

    /* renamed from: e */
    public Object mo25301e() {
        return this.f17114f;
    }

    /* renamed from: f */
    public cf4 mo25302f() {
        return this.f17116h;
    }

    /* renamed from: g */
    public List<BeanPropertyWriter> mo25303g() {
        return this.f17111c;
    }

    /* renamed from: h */
    public AnnotatedMember mo25304h() {
        return this.f17115g;
    }

    /* renamed from: i */
    public void mo25305i(C2613jm jmVar) {
        this.f17113e = jmVar;
    }

    /* renamed from: j */
    public void mo25306j(SerializationConfig serializationConfig) {
        this.f17110b = serializationConfig;
    }

    /* renamed from: k */
    public void mo25307k(Object obj) {
        this.f17114f = obj;
    }

    /* renamed from: l */
    public void mo25308l(BeanPropertyWriter[] beanPropertyWriterArr) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == this.f17111c.size()) {
            this.f17112d = beanPropertyWriterArr;
        } else {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", new Object[]{Integer.valueOf(beanPropertyWriterArr.length), Integer.valueOf(this.f17111c.size())}));
        }
    }

    /* renamed from: m */
    public void mo25309m(cf4 cf4) {
        this.f17116h = cf4;
    }

    /* renamed from: n */
    public void mo25310n(List<BeanPropertyWriter> list) {
        this.f17111c = list;
    }

    /* renamed from: o */
    public void mo25311o(AnnotatedMember annotatedMember) {
        if (this.f17115g == null) {
            this.f17115g = annotatedMember;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.f17115g + " and " + annotatedMember);
    }
}
