package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.C1978b;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p009io.InputDecorator;
import com.fasterxml.jackson.core.p009io.OutputDecorator;

/* renamed from: com.fasterxml.jackson.core.b */
/* compiled from: TSFBuilder */
public abstract class C1978b<F extends JsonFactory, B extends C1978b<F, B>> {

    /* renamed from: f */
    public static final int f9836f = JsonFactory.Feature.collectDefaults();

    /* renamed from: g */
    public static final int f9837g = JsonParser.Feature.collectDefaults();

    /* renamed from: h */
    public static final int f9838h = JsonGenerator.Feature.collectDefaults();

    /* renamed from: a */
    public int f9839a;

    /* renamed from: b */
    public int f9840b;

    /* renamed from: c */
    public int f9841c;

    /* renamed from: d */
    public InputDecorator f9842d;

    /* renamed from: e */
    public OutputDecorator f9843e;

    public C1978b() {
        this.f9839a = f9836f;
        this.f9840b = f9837g;
        this.f9841c = f9838h;
        this.f9842d = null;
        this.f9843e = null;
    }

    public C1978b(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    public C1978b(int i, int i2, int i3) {
        this.f9839a = i;
        this.f9840b = i2;
        this.f9841c = i3;
    }
}
