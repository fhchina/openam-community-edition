//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.idpp.jaxb.impl;

public class DSTStringImpl implements com.sun.identity.liberty.ws.idpp.jaxb.DSTString, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected java.lang.String _ACC;
    protected java.lang.String _Value;
    protected java.util.Calendar _ModificationTime;
    protected java.lang.String _Modifier;
    protected java.util.Calendar _ACCTime;
    protected java.lang.String _Id;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.idpp.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.idpp.jaxb.DSTString.class);
    }

    public java.lang.String getACC() {
        return _ACC;
    }

    public void setACC(java.lang.String value) {
        _ACC = value;
    }

    public java.lang.String getValue() {
        return _Value;
    }

    public void setValue(java.lang.String value) {
        _Value = value;
    }

    public java.util.Calendar getModificationTime() {
        return _ModificationTime;
    }

    public void setModificationTime(java.util.Calendar value) {
        _ModificationTime = value;
    }

    public java.lang.String getModifier() {
        return _Modifier;
    }

    public void setModifier(java.lang.String value) {
        _Modifier = value;
    }

    public java.util.Calendar getACCTime() {
        return _ACCTime;
    }

    public void setACCTime(java.util.Calendar value) {
        _ACCTime = value;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTStringImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        try {
            context.text(((java.lang.String) _Value), "Value");
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Id!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "id");
            try {
                context.text(((java.lang.String) _Id), "Id");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_ModificationTime!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
            try {
                context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _ModificationTime), null), "ModificationTime");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_ACC!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
            try {
                context.text(((java.lang.String) _ACC), "ACC");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_ACCTime!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
            try {
                context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _ACCTime), null), "ACCTime");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Modifier!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
            try {
                context.text(((java.lang.String) _Modifier), "Modifier");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Id!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        if (_ModificationTime!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        if (_ACC!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        if (_ACCTime!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        if (_Modifier!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.idpp.jaxb.DSTString.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001bcom."
+"sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datat"
+"ype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Strin"
+"gPair;xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000#"
+"com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysVal"
+"idxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.s"
+"un.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUri"
+"t\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0014L\u0000\nwhiteSpacet\u0000.Lcom/su"
+"n/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.or"
+"g/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteS"
+"paceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xs"
+"d.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.E"
+"xpression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000\u001bcom.su"
+"n.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0014L\u0000\fnamespac"
+"eURIq\u0000~\u0000\u0014xpq\u0000~\u0000\u0018q\u0000~\u0000\u0017sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002"
+"L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xq\u0000"
+"~\u0000\u0003q\u0000~\u0000\u000fpsq\u0000~\u0000\nq\u0000~\u0000\u000fpsr\u0000#com.sun.msv.datatype.xsd.AnyURIType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0011q\u0000~\u0000\u0017t\u0000\u0006anyURIsr\u00005com.sun.msv.datatype.xsd."
+"WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001aq\u0000~\u0000\u001dsq\u0000~\u0000\u001eq\u0000~\u0000"
+"(q\u0000~\u0000\u0017sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tl"
+"ocalNameq\u0000~\u0000\u0014L\u0000\fnamespaceURIq\u0000~\u0000\u0014xr\u0000\u001dcom.sun.msv.grammar.Nam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0003ACCt\u0000\u001durn:liberty:id-sis-pp:2003-08sr\u0000"
+"0com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0003sq\u0000~\u0000\u000e\u0001q\u0000~\u00002sq\u0000~\u0000 ppsq\u0000~\u0000\"q\u0000~\u0000\u000fpsq\u0000~\u0000\nppsr\u0000%com.sun.ms"
+"v.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.dataty"
+"pe.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000\u0011q\u0000~\u0000\u0017t\u0000\bdateTimeq\u0000~\u0000"
+"*q\u0000~\u0000\u001dsq\u0000~\u0000\u001eq\u0000~\u0000:q\u0000~\u0000\u0017sq\u0000~\u0000,t\u0000\u0007ACCTimeq\u0000~\u00000q\u0000~\u00002sq\u0000~\u0000 ppsq\u0000~"
+"\u0000\"q\u0000~\u0000\u000fpsq\u0000~\u0000\nppsr\u0000\'com.sun.msv.datatype.xsd.MaxLengthFacet\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\tmaxLengthxr\u00009com.sun.msv.datatype.xsd.DataTypeW"
+"ithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.x"
+"sd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCh"
+"eckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImp"
+"l;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L"
+"\u0000\tfacetNameq\u0000~\u0000\u0014xq\u0000~\u0000\u0013t\u0000\u001curn:liberty:metadata:2003-08t\u0000\fenti"
+"tyIDTypeq\u0000~\u0000*\u0000\u0000q\u0000~\u0000\'q\u0000~\u0000\'t\u0000\tmaxLength\u0000\u0000\u0004\u0000q\u0000~\u0000\u001dsq\u0000~\u0000\u001eq\u0000~\u0000Hq\u0000~"
+"\u0000Gsq\u0000~\u0000,t\u0000\bmodifierq\u0000~\u00000q\u0000~\u00002sq\u0000~\u0000 ppsq\u0000~\u0000\"q\u0000~\u0000\u000fpsq\u0000~\u0000\nppsr\u0000"
+"\'com.sun.msv.datatype.xsd.FinalComponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\nfinalV"
+"aluexr\u0000\u001ecom.sun.msv.datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bbaseType"
+"q\u0000~\u0000Dxq\u0000~\u0000\u0013q\u0000~\u00000t\u0000\u0006IDTypeq\u0000~\u0000\u001bq\u0000~\u0000\u0016\u0000\u0000\u0000\u0000q\u0000~\u0000\u001dsq\u0000~\u0000\u001eq\u0000~\u0000\u0018q\u0000~\u00000"
+"sq\u0000~\u0000,t\u0000\u0002idq\u0000~\u00000q\u0000~\u00002sq\u0000~\u0000 ppsq\u0000~\u0000\"q\u0000~\u0000\u000fpq\u0000~\u00006sq\u0000~\u0000,t\u0000\u0010modif"
+"icationTimeq\u0000~\u00000q\u0000~\u00002sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$"
+"ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHa"
+"sh\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/ms"
+"v/grammar/ExpressionPool;xp\u0000\u0000\u0000\n\u0001pq\u0000~\u0000\u0007q\u0000~\u0000>q\u0000~\u0000Wq\u0000~\u00004q\u0000~\u0000Mq\u0000"
+"~\u0000\tq\u0000~\u0000\u0005q\u0000~\u0000!q\u0000~\u0000\u0006q\u0000~\u0000\bx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTStringImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText2(v);
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 15;
                            eatText4(v);
                            continue outer;
                        }
                        state = 15;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText5(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  16 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ACCTime = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ACC = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Modifier = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ModificationTime = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText2(v);
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 15;
                            eatText4(v);
                            continue outer;
                        }
                        state = 15;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText5(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  16 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("id" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        if (("ACCTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  6 :
                        if (("ACC" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        if (("modifier" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 13;
                            return ;
                        }
                        state = 15;
                        continue outer;
                    case  3 :
                        if (("modificationTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  16 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("id" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  14 :
                        if (("modifier" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 15;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("ACC" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText2(v);
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  5 :
                        if (("modificationTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 15;
                            eatText4(v);
                            continue outer;
                        }
                        state = 15;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText5(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  16 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        if (("ACCTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 12;
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  10 :
                            state = 11;
                            eatText2(value);
                            return ;
                        case  15 :
                            state = 16;
                            eatText6(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  4 :
                            state = 5;
                            eatText5(value);
                            return ;
                        case  7 :
                            state = 8;
                            eatText3(value);
                            return ;
                        case  13 :
                            state = 14;
                            eatText4(value);
                            return ;
                        case  9 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 12;
                                eatText2(v);
                                continue outer;
                            }
                            state = 12;
                            continue outer;
                        case  6 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 9;
                                eatText3(v);
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  12 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 15;
                                eatText4(v);
                                continue outer;
                            }
                            state = 15;
                            continue outer;
                        case  3 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText5(v);
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  16 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Value = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
