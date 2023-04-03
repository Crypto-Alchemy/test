package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* renamed from: com.fasterxml.jackson.databind.deser.a */
/* compiled from: DeserializerFactory */
public abstract class C1999a {
    public static final be1[] NO_DESERIALIZERS = new be1[0];

    public abstract o43<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, n00 n00) throws JsonMappingException;

    public abstract o43<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException;

    public abstract o43<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00, Class<?> cls) throws JsonMappingException;

    public abstract o43<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, n00 n00) throws JsonMappingException;

    public abstract o43<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, n00 n00) throws JsonMappingException;

    public abstract o43<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException;

    public abstract ha3 createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException;

    public abstract o43<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, n00 n00) throws JsonMappingException;

    public abstract o43<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, n00 n00) throws JsonMappingException;

    public abstract o43<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, n00 n00) throws JsonMappingException;

    public abstract o43<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, n00 n00) throws JsonMappingException;

    public abstract j07 findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, n00 n00) throws JsonMappingException;

    public abstract boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls);

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract C1999a withAbstractTypeResolver(C2805m7 m7Var);

    public abstract C1999a withAdditionalDeserializers(be1 be1);

    public abstract C1999a withAdditionalKeyDeserializers(ia3 ia3);

    public abstract C1999a withDeserializerModifier(p00 p00);

    public abstract C1999a withValueInstantiators(l87 l87);
}
