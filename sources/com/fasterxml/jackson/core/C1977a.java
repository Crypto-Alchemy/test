package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p009io.CharacterEscapes;

/* renamed from: com.fasterxml.jackson.core.a */
/* compiled from: JsonFactoryBuilder */
public class C1977a extends C1978b<JsonFactory, C1977a> {

    /* renamed from: i */
    public CharacterEscapes f9832i;

    /* renamed from: j */
    public qw5 f9833j;

    /* renamed from: k */
    public int f9834k;

    /* renamed from: l */
    public char f9835l;

    public C1977a() {
        this.f9835l = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.f9833j = JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.f9834k = 0;
    }

    public C1977a(JsonFactory jsonFactory) {
        super(jsonFactory);
        this.f9835l = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.f9832i = jsonFactory.getCharacterEscapes();
        this.f9833j = jsonFactory._rootValueSeparator;
        this.f9834k = jsonFactory._maximumNonEscapedChar;
    }
}
