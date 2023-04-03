package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: com.fasterxml.jackson.databind.b */
/* compiled from: SequenceWriter */
public class C1990b implements Closeable, Flushable {

    /* renamed from: A */
    public boolean f9887A;

    /* renamed from: B */
    public boolean f9888B;

    /* renamed from: a */
    public final DefaultSerializerProvider f9889a;

    /* renamed from: d */
    public final SerializationConfig f9890d;

    /* renamed from: e */
    public final JsonGenerator f9891e;

    /* renamed from: g */
    public final y63<Object> f9892g;

    /* renamed from: k */
    public final m17 f9893k;

    /* renamed from: r */
    public final boolean f9894r;

    /* renamed from: s */
    public final boolean f9895s;

    /* renamed from: x */
    public final boolean f9896x;

    /* renamed from: y */
    public C2040a f9897y = C2040a.m14287d();

    public C1990b(DefaultSerializerProvider defaultSerializerProvider, JsonGenerator jsonGenerator, boolean z, ObjectWriter.Prefetch prefetch) throws IOException {
        this.f9889a = defaultSerializerProvider;
        this.f9891e = jsonGenerator;
        this.f9894r = z;
        this.f9892g = prefetch.getValueSerializer();
        this.f9893k = prefetch.getTypeSerializer();
        SerializationConfig config = defaultSerializerProvider.getConfig();
        this.f9890d = config;
        this.f9895s = config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
        this.f9896x = config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
    }

    /* renamed from: a */
    public C1990b mo15049a(boolean z) throws IOException {
        if (z) {
            this.f9891e.mo13840G0();
            this.f9887A = true;
        }
        return this;
    }

    public void close() throws IOException {
        if (!this.f9888B) {
            this.f9888B = true;
            if (this.f9887A) {
                this.f9887A = false;
                this.f9891e.mo13853S();
            }
            if (this.f9894r) {
                this.f9891e.close();
            }
        }
    }

    public void flush() throws IOException {
        if (!this.f9888B) {
            this.f9891e.flush();
        }
    }
}
