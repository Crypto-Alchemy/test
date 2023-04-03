package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.UnsupportedTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.k53;

public class BeanDeserializerFactory extends BasicDeserializerFactory {
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());

    /* renamed from: s */
    public static final Class<?>[] f9932s = {Throwable.class};
    private static final long serialVersionUID = 1;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    public o43<Object> _findUnsupportedTypeDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        String a = t00.m27230a(javaType);
        if (a == null || deserializationContext.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new UnsupportedTypeDeserializer(javaType, a);
    }

    public void _validateSubType(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        hc6.m18781a().mo21088b(deserializationContext, javaType, n00);
    }

    public void addBackReferenceProperties(DeserializationContext deserializationContext, n00 n00, o00 o00) throws JsonMappingException {
        List<q00> c = n00.mo23445c();
        if (c != null) {
            for (q00 next : c) {
                o00.mo23853e(next.mo24881g(), constructSettableProperty(deserializationContext, n00, next, next.mo24895w()));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addBeanProps(com.fasterxml.jackson.databind.DeserializationContext r18, p000.n00 r19, p000.o00 r20) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            com.fasterxml.jackson.databind.JavaType r0 = r19.mo23439A()
            boolean r0 = r0.isAbstract()
            r11 = 1
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x0022
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r20.mo23869u()
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r18.getConfig()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r0 = r0.getFromObjectArguments(r1)
            r13 = r0
            goto L_0x0023
        L_0x0022:
            r13 = 0
        L_0x0023:
            r14 = 0
            if (r13 == 0) goto L_0x0028
            r15 = r11
            goto L_0x0029
        L_0x0028:
            r15 = r14
        L_0x0029:
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r18.getConfig()
            java.lang.Class r1 = r19.mo23460r()
            com.fasterxml.jackson.databind.introspect.a r2 = r19.mo23462t()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r0 = r0.getDefaultPropertyIgnorals(r1, r2)
            if (r0 == 0) goto L_0x005a
            boolean r1 = r0.getIgnoreUnknown()
            r10.mo23872x(r1)
            java.util.Set r0 = r0.findIgnoredForDeserialization()
            java.util.Iterator r1 = r0.iterator()
        L_0x004a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r10.mo23855g(r2)
            goto L_0x004a
        L_0x005a:
            java.util.Set r0 = java.util.Collections.emptySet()
        L_0x005e:
            r5 = r0
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r18.getConfig()
            java.lang.Class r1 = r19.mo23460r()
            com.fasterxml.jackson.databind.introspect.a r2 = r19.mo23462t()
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r0 = r0.getDefaultPropertyInclusions(r1, r2)
            if (r0 == 0) goto L_0x008d
            java.util.Set r0 = r0.getIncluded()
            if (r0 == 0) goto L_0x008b
            java.util.Iterator r1 = r0.iterator()
        L_0x007b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r10.mo23856h(r2)
            goto L_0x007b
        L_0x008b:
            r6 = r0
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r19.mo23444b()
            if (r0 == 0) goto L_0x009c
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r0 = r7.constructAnySetter(r8, r9, r0)
            r10.mo23871w(r0)
            goto L_0x00b6
        L_0x009c:
            java.util.Set r0 = r19.mo23467y()
            if (r0 == 0) goto L_0x00b6
            java.util.Iterator r0 = r0.iterator()
        L_0x00a6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r10.mo23855g(r1)
            goto L_0x00a6
        L_0x00b6:
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS
            boolean r0 = r8.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r0)
            if (r0 == 0) goto L_0x00c9
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_GETTERS
            boolean r0 = r8.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r0)
            if (r0 == 0) goto L_0x00c9
            r16 = r11
            goto L_0x00cb
        L_0x00c9:
            r16 = r14
        L_0x00cb:
            java.util.List r4 = r19.mo23457o()
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.util.List r0 = r0.filterBeanProps(r1, r2, r3, r4, r5, r6)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r7._factoryConfig
            boolean r1 = r1.hasDeserializerModifiers()
            if (r1 == 0) goto L_0x0102
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r7._factoryConfig
            java.lang.Iterable r1 = r1.deserializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ed:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0102
            java.lang.Object r2 = r1.next()
            p00 r2 = (p000.p00) r2
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r18.getConfig()
            java.util.List r0 = r2.updateProperties(r3, r9, r0)
            goto L_0x00ed
        L_0x0102:
            java.util.Iterator r0 = r0.iterator()
        L_0x0106:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01eb
            java.lang.Object r1 = r0.next()
            q00 r1 = (p000.q00) r1
            boolean r2 = r1.mo24873D()
            if (r2 == 0) goto L_0x0125
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = r1.mo24897y()
            com.fasterxml.jackson.databind.JavaType r2 = r2.getParameterType(r14)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r7.constructSettableProperty(r8, r9, r1, r2)
            goto L_0x0170
        L_0x0125:
            boolean r2 = r1.mo24871B()
            if (r2 == 0) goto L_0x0138
            com.fasterxml.jackson.databind.introspect.AnnotatedField r2 = r1.mo24890p()
            com.fasterxml.jackson.databind.JavaType r2 = r2.getType()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r7.constructSettableProperty(r8, r9, r1, r2)
            goto L_0x0170
        L_0x0138:
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = r1.mo24891r()
            if (r2 == 0) goto L_0x016f
            if (r16 == 0) goto L_0x015a
            java.lang.Class r2 = r2.getRawType()
            boolean r2 = r7.mo15412f(r2)
            if (r2 == 0) goto L_0x015a
            java.lang.String r2 = r1.getName()
            boolean r2 = r10.mo23870v(r2)
            if (r2 == 0) goto L_0x0155
            goto L_0x016f
        L_0x0155:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r7.constructSetterlessProperty(r8, r9, r1)
            goto L_0x0170
        L_0x015a:
            boolean r2 = r1.mo24898z()
            if (r2 != 0) goto L_0x016f
            com.fasterxml.jackson.databind.PropertyMetadata r2 = r1.getMetadata()
            com.fasterxml.jackson.databind.PropertyMetadata$a r2 = r2.getMergeInfo()
            if (r2 == 0) goto L_0x016f
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r7.constructSetterlessProperty(r8, r9, r1)
            goto L_0x0170
        L_0x016f:
            r2 = 0
        L_0x0170:
            if (r15 == 0) goto L_0x01d7
            boolean r3 = r1.mo24898z()
            if (r3 == 0) goto L_0x01d7
            java.lang.String r3 = r1.getName()
            int r4 = r13.length
            r5 = r14
        L_0x017e:
            if (r5 >= r4) goto L_0x0196
            r6 = r13[r5]
            java.lang.String r12 = r6.getName()
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0193
            boolean r12 = r6 instanceof com.fasterxml.jackson.databind.deser.CreatorProperty
            if (r12 == 0) goto L_0x0193
            com.fasterxml.jackson.databind.deser.CreatorProperty r6 = (com.fasterxml.jackson.databind.deser.CreatorProperty) r6
            goto L_0x0197
        L_0x0193:
            int r5 = r5 + 1
            goto L_0x017e
        L_0x0196:
            r6 = 0
        L_0x0197:
            if (r6 != 0) goto L_0x01c0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r13.length
            r5 = r14
        L_0x01a0:
            if (r5 >= r4) goto L_0x01ae
            r6 = r13[r5]
            java.lang.String r6 = r6.getName()
            r2.add(r6)
            int r5 = r5 + 1
            goto L_0x01a0
        L_0x01ae:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r3 = p000.wf0.m29495V(r3)
            r4[r14] = r3
            r4[r11] = r2
            java.lang.String r2 = "Could not find creator property with name %s (known Creator properties: %s)"
            r8.reportBadPropertyDefinition(r9, r1, r2, r4)
            goto L_0x0106
        L_0x01c0:
            if (r2 == 0) goto L_0x01c5
            r6.setFallbackSetter(r2)
        L_0x01c5:
            java.lang.Class[] r1 = r1.mo24886i()
            if (r1 != 0) goto L_0x01cf
            java.lang.Class[] r1 = r19.mo23447e()
        L_0x01cf:
            r6.setViews(r1)
            r10.mo23854f(r6)
            goto L_0x0106
        L_0x01d7:
            if (r2 == 0) goto L_0x0106
            java.lang.Class[] r1 = r1.mo24886i()
            if (r1 != 0) goto L_0x01e3
            java.lang.Class[] r1 = r19.mo23447e()
        L_0x01e3:
            r2.setViews(r1)
            r10.mo23859k(r2)
            goto L_0x0106
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, n00, o00):void");
    }

    public void addInjectables(DeserializationContext deserializationContext, n00 n00, o00 o00) throws JsonMappingException {
        Map<Object, AnnotatedMember> h = n00.mo23450h();
        if (h != null) {
            for (Map.Entry next : h.entrySet()) {
                AnnotatedMember annotatedMember = (AnnotatedMember) next.getValue();
                o00.mo23857i(PropertyName.construct(annotatedMember.getName()), annotatedMember.getType(), n00.mo23461s(), annotatedMember, next.getKey());
            }
        }
    }

    public void addObjectIdReader(DeserializationContext deserializationContext, n00 n00, o00 o00) throws JsonMappingException {
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator;
        JavaType javaType;
        SettableBeanProperty settableBeanProperty;
        bf4 z = n00.mo23468z();
        if (z != null) {
            Class<? extends ObjectIdGenerator<?>> c = z.mo11628c();
            C1974a objectIdResolverInstance = deserializationContext.objectIdResolverInstance(n00.mo23462t(), z);
            if (c == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName d = z.mo11629d();
                settableBeanProperty = o00.mo23864p(d);
                if (settableBeanProperty != null) {
                    JavaType type = settableBeanProperty.getType();
                    javaType = type;
                    propertyBasedObjectIdGenerator = new PropertyBasedObjectIdGenerator(z.mo11631f());
                } else {
                    throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{wf0.m29480G(n00.mo23439A()), wf0.m29494U(d)}));
                }
            } else {
                JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(c), (Class<?>) ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                propertyBasedObjectIdGenerator = deserializationContext.objectIdGeneratorInstance(n00.mo23462t(), z);
                javaType = javaType2;
            }
            o43<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
            o00.mo23873y(ObjectIdReader.construct(javaType, z.mo11629d(), propertyBasedObjectIdGenerator, findRootValueDeserializer, settableBeanProperty, objectIdResolverInstance));
        }
    }

    @Deprecated
    public void addReferenceProperties(DeserializationContext deserializationContext, n00 n00, o00 o00) throws JsonMappingException {
        addBackReferenceProperties(deserializationContext, n00, o00);
    }

    public o43<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        o43<?> o43;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, n00);
            o00 constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, n00);
            constructBeanDeserializerBuilder.mo23848A(findValueInstantiator);
            addBeanProps(deserializationContext, n00, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, n00, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, n00, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, n00, constructBeanDeserializerBuilder);
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (p00 updateBuilder : this._factoryConfig.deserializerModifiers()) {
                    constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, n00, constructBeanDeserializerBuilder);
                }
            }
            if (!javaType.isAbstract() || findValueInstantiator.canInstantiate()) {
                o43 = constructBeanDeserializerBuilder.mo23860l();
            } else {
                o43 = constructBeanDeserializerBuilder.mo23861m();
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (p00 modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    o43 = modifyDeserializer.modifyDeserializer(config, n00, o43);
                }
            }
            return o43;
        } catch (NoClassDefFoundError e) {
            return new kr1(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), wf0.m29528o(e2), n00, (q00) null).withCause(e2);
        }
    }

    public o43<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        String str;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, n00);
            DeserializationConfig config = deserializationContext.getConfig();
            o00 constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, n00);
            constructBeanDeserializerBuilder.mo23848A(findValueInstantiator);
            addBeanProps(deserializationContext, n00, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, n00, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, n00, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, n00, constructBeanDeserializerBuilder);
            k53.C2643a n = n00.mo23456n();
            if (n == null) {
                str = "build";
            } else {
                str = n.f13977a;
            }
            AnnotatedMethod l = n00.mo23454l(str, (Class<?>[]) null);
            if (l != null && config.canOverrideAccessModifiers()) {
                wf0.m29512g(l.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            constructBeanDeserializerBuilder.mo23874z(l, n);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (p00 updateBuilder : this._factoryConfig.deserializerModifiers()) {
                    constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, n00, constructBeanDeserializerBuilder);
                }
            }
            o43<?> n2 = constructBeanDeserializerBuilder.mo23862n(javaType, str);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (p00 modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    n2 = modifyDeserializer.modifyDeserializer(config, n00, n2);
                }
            }
            return n2;
        } catch (NoClassDefFoundError e) {
            return new kr1(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), wf0.m29528o(e2), n00, (q00) null);
        }
    }

    public o43<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        SettableBeanProperty constructSettableProperty;
        DeserializationConfig config = deserializationContext.getConfig();
        o00 constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, n00);
        constructBeanDeserializerBuilder.mo23848A(findValueInstantiator(deserializationContext, n00));
        addBeanProps(deserializationContext, n00, constructBeanDeserializerBuilder);
        AnnotatedMethod l = n00.mo23454l("initCause", f9932s);
        if (!(l == null || (constructSettableProperty = constructSettableProperty(deserializationContext, n00, z16.m30927H(deserializationContext.getConfig(), l, new PropertyName("cause")), l.getParameterType(0))) == null)) {
            constructBeanDeserializerBuilder.mo23858j(constructSettableProperty, true);
        }
        constructBeanDeserializerBuilder.mo23855g("localizedMessage");
        constructBeanDeserializerBuilder.mo23855g(ThrowableDeserializer.PROP_NAME_SUPPRESSED);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, n00, constructBeanDeserializerBuilder);
            }
        }
        o43<?> l2 = constructBeanDeserializerBuilder.mo23860l();
        if (l2 instanceof BeanDeserializer) {
            l2 = new ThrowableDeserializer((BeanDeserializer) l2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                l2 = modifyDeserializer.modifyDeserializer(config, n00, l2);
            }
        }
        return l2;
    }

    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, n00 n00, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType javaType;
        JavaType javaType2;
        BeanProperty.Std std;
        o43<?> o43;
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            javaType = annotatedMethod.getParameterType(0);
            javaType2 = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, annotatedMethod.getParameterType(1));
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), javaType2, (PropertyName) null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
        } else if (annotatedMember instanceof AnnotatedField) {
            JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, ((AnnotatedField) annotatedMember).getType());
            javaType = resolveMemberAndTypeAnnotations.getKeyType();
            JavaType contentType = resolveMemberAndTypeAnnotations.getContentType();
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), resolveMemberAndTypeAnnotations, (PropertyName) null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
            javaType2 = contentType;
        } else {
            return (SettableAnyProperty) deserializationContext.reportBadDefinition(n00.mo23439A(), String.format("Unrecognized mutator type for any setter: %s", new Object[]{annotatedMember.getClass()}));
        }
        ha3 findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (findKeyDeserializerFromAnnotation == null) {
            findKeyDeserializerFromAnnotation = (ha3) javaType.getValueHandler();
        }
        if (findKeyDeserializerFromAnnotation == null) {
            findKeyDeserializerFromAnnotation = deserializationContext.findKeyDeserializer(javaType, std);
        } else if (findKeyDeserializerFromAnnotation instanceof ks0) {
            findKeyDeserializerFromAnnotation = ((ks0) findKeyDeserializerFromAnnotation).createContextual(deserializationContext, std);
        }
        ha3 ha3 = findKeyDeserializerFromAnnotation;
        o43<Object> findContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (findContentDeserializerFromAnnotation == null) {
            findContentDeserializerFromAnnotation = (o43) javaType2.getValueHandler();
        }
        if (findContentDeserializerFromAnnotation != null) {
            o43 = deserializationContext.handlePrimaryContextualization(findContentDeserializerFromAnnotation, std, javaType2);
        } else {
            o43 = findContentDeserializerFromAnnotation;
        }
        return new SettableAnyProperty(std, annotatedMember, javaType2, ha3, o43, (j07) javaType2.getTypeHandler());
    }

    public o00 constructBeanDeserializerBuilder(DeserializationContext deserializationContext, n00 n00) {
        return new o00(n00, deserializationContext);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.fasterxml.jackson.databind.deser.SettableBeanProperty} */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r3v2, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.fasterxml.jackson.databind.deser.impl.MethodProperty] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty constructSettableProperty(com.fasterxml.jackson.databind.DeserializationContext r10, p000.n00 r11, p000.q00 r12, com.fasterxml.jackson.databind.JavaType r13) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r12.mo24893u()
            if (r0 != 0) goto L_0x000e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No non-constructor mutator available"
            r10.reportBadPropertyDefinition(r11, r12, r2, r1)
        L_0x000e:
            com.fasterxml.jackson.databind.JavaType r13 = r9.resolveMemberAndTypeAnnotations(r10, r0, r13)
            java.lang.Object r1 = r13.getTypeHandler()
            r6 = r1
            j07 r6 = (p000.j07) r6
            boolean r1 = r0 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            if (r1 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.deser.impl.MethodProperty r1 = new com.fasterxml.jackson.databind.deser.impl.MethodProperty
            em r7 = r11.mo23461s()
            r8 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x003c
        L_0x002d:
            com.fasterxml.jackson.databind.deser.impl.FieldProperty r1 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty
            em r7 = r11.mo23461s()
            r8 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedField r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x003c:
            o43 r11 = r9.findDeserializerFromAnnotation(r10, r0)
            if (r11 != 0) goto L_0x0048
            java.lang.Object r11 = r13.getValueHandler()
            o43 r11 = (p000.o43) r11
        L_0x0048:
            if (r11 == 0) goto L_0x0052
            o43 r10 = r10.handlePrimaryContextualization(r11, r1, r13)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r1 = r1.withValueDeserializer(r10)
        L_0x0052:
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty r10 = r12.mo24885h()
            if (r10 == 0) goto L_0x0065
            boolean r11 = r10.mo14223d()
            if (r11 == 0) goto L_0x0065
            java.lang.String r10 = r10.mo14221b()
            r1.setManagedReferenceName(r10)
        L_0x0065:
            bf4 r10 = r12.mo24880f()
            if (r10 == 0) goto L_0x006e
            r1.setObjectIdInfo(r10)
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructSettableProperty(com.fasterxml.jackson.databind.DeserializationContext, n00, q00, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, n00 n00, q00 q00) throws JsonMappingException {
        AnnotatedMethod r = q00.mo24891r();
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, r, r.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(q00, resolveMemberAndTypeAnnotations, (j07) resolveMemberAndTypeAnnotations.getTypeHandler(), n00.mo23461s(), r);
        o43<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, r);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (o43) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (findDeserializerFromAnnotation != null) {
            return setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, setterlessProperty, resolveMemberAndTypeAnnotations));
        }
        return setterlessProperty;
    }

    public o43<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        JavaType materializeAbstractType;
        DeserializationConfig config = deserializationContext.getConfig();
        o43 _findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, n00);
        if (_findCustomBeanDeserializer != null) {
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (p00 modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    _findCustomBeanDeserializer = modifyDeserializer.modifyDeserializer(deserializationContext.getConfig(), n00, _findCustomBeanDeserializer);
                }
            }
            return _findCustomBeanDeserializer;
        } else if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, n00);
        } else {
            if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (materializeAbstractType = materializeAbstractType(deserializationContext, javaType, n00)) != null) {
                return buildBeanDeserializer(deserializationContext, materializeAbstractType, config.introspect(materializeAbstractType));
            }
            o43<?> findStdDeserializer = findStdDeserializer(deserializationContext, javaType, n00);
            if (findStdDeserializer != null) {
                return findStdDeserializer;
            }
            if (!isPotentialBeanType(javaType.getRawClass())) {
                return null;
            }
            _validateSubType(deserializationContext, javaType, n00);
            o43<Object> _findUnsupportedTypeDeserializer = _findUnsupportedTypeDeserializer(deserializationContext, javaType, n00);
            if (_findUnsupportedTypeDeserializer != null) {
                return _findUnsupportedTypeDeserializer;
            }
            return buildBeanDeserializer(deserializationContext, javaType, n00);
        }
    }

    public o43<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00, Class<?> cls) throws JsonMappingException {
        JavaType javaType2;
        if (deserializationContext.isEnabled(MapperFeature.INFER_BUILDER_TYPE_BINDINGS)) {
            javaType2 = deserializationContext.getTypeFactory().constructParametricType(cls, javaType.getBindings());
        } else {
            javaType2 = deserializationContext.constructType(cls);
        }
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(javaType2, n00));
    }

    /* renamed from: f */
    public final boolean mo15412f(Class<?> cls) {
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    @Deprecated
    public List<q00> filterBeanProps(DeserializationContext deserializationContext, n00 n00, o00 o00, List<q00> list, Set<String> set) throws JsonMappingException {
        return filterBeanProps(deserializationContext, n00, o00, list, set, (Set<String>) null);
    }

    public o43<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        o43<?> findDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, n00);
        if (findDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                findDefaultDeserializer = modifyDeserializer.modifyDeserializer(deserializationContext.getConfig(), n00, findDefaultDeserializer);
            }
        }
        return findDefaultDeserializer;
    }

    public boolean isIgnorableType(DeserializationConfig deserializationConfig, q00 q00, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean bool;
        Boolean bool2 = map.get(cls);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            bool = Boolean.FALSE;
        } else {
            bool = deserializationConfig.getConfigOverride(cls).getIsIgnoredType();
            if (bool == null) {
                bool = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).mo23462t());
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
            }
        }
        map.put(cls, bool);
        return bool.booleanValue();
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        String f = wf0.m29510f(cls);
        if (f != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + f + ") as a Bean");
        } else if (!wf0.m29492S(cls)) {
            String P = wf0.m29489P(cls, true);
            if (P == null) {
                return true;
            }
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + P + ") as a Bean");
        } else {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
    }

    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        for (C2805m7 resolveAbstractType : this._factoryConfig.abstractTypeResolvers()) {
            JavaType resolveAbstractType2 = resolveAbstractType.resolveAbstractType(deserializationContext.getConfig(), n00);
            if (resolveAbstractType2 != null) {
                return resolveAbstractType2;
            }
        }
        return null;
    }

    public C1999a withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        wf0.m29527n0(BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }

    public List<q00> filterBeanProps(DeserializationContext deserializationContext, n00 n00, o00 o00, List<q00> list, Set<String> set, Set<String> set2) {
        Class<?> x;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        for (q00 next : list) {
            String name = next.getName();
            if (!IgnorePropertiesUtil.m14343c(name, set, set2)) {
                if (next.mo24898z() || (x = next.mo24896x()) == null || !isIgnorableType(deserializationContext.getConfig(), next, x, hashMap)) {
                    arrayList.add(next);
                } else {
                    o00.mo23855g(name);
                }
            }
        }
        return arrayList;
    }
}
