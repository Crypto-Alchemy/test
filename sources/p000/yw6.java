package p000;

import p000.yw6;

/* renamed from: yw6 */
/* compiled from: TransitionOptions */
public abstract class yw6<CHILD extends yw6<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    public xw6<? super TranscodeType> f20399a = x74.m29918b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (yw6) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final xw6<? super TranscodeType> mo28267b() {
        return this.f20399a;
    }
}
