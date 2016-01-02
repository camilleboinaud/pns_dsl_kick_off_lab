<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:4603dbce-ee2a-4c5b-9972-dae064a45b3b(ArduinoML.generator.template.main@generator)">
  <persistence version="9" />
  <languages>
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="-1" />
    <use id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext" version="-1" />
    <use id="eb79d3f6-2f50-4710-8bed-7c8821e78d91" name="ArduinoML" version="-1" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="fxg7" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="c2t8" ref="r:7e023c22-bfbe-4aa5-a291-6d3c66906987(ArduinoML.structure)" implicit="true" />
    <import index="e2lb" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025416" name="jetbrains.mps.baseLanguage.structure.MethodDeclaration" flags="ng" index="1rXfSm">
        <property id="8355037393041754995" name="isNative" index="2aFKle" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1114706874351" name="jetbrains.mps.lang.generator.structure.CopySrcNodeMacro" flags="ln" index="29HgVG">
        <child id="1168024447342" name="sourceNodeQuery" index="3NFExx" />
      </concept>
      <concept id="1114729360583" name="jetbrains.mps.lang.generator.structure.CopySrcListMacro" flags="ln" index="2b32R4">
        <child id="1168278589236" name="sourceNodesQuery" index="2P8S$" />
      </concept>
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1167328349397" name="reductionMappingRule" index="3acgRq" />
        <child id="1167514678247" name="rootMappingRule" index="3lj3bC" />
      </concept>
      <concept id="1168559333462" name="jetbrains.mps.lang.generator.structure.TemplateDeclarationReference" flags="ln" index="j$656" />
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1095672379244" name="jetbrains.mps.lang.generator.structure.TemplateFragment" flags="ng" index="raruj" />
      <concept id="1722980698497626400" name="jetbrains.mps.lang.generator.structure.ITemplateCall" flags="ng" index="v9R3L">
        <reference id="1722980698497626483" name="template" index="v9R2y" />
      </concept>
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
      </concept>
      <concept id="1092059087312" name="jetbrains.mps.lang.generator.structure.TemplateDeclaration" flags="ig" index="13MO4I">
        <reference id="1168285871518" name="applicableConcept" index="3gUMe" />
        <child id="1092060348987" name="contentNode" index="13RCb5" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167327847730" name="jetbrains.mps.lang.generator.structure.Reduction_MappingRule" flags="lg" index="3aamgX">
        <child id="1169672767469" name="ruleConsequence" index="1lVwrX" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167951910403" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery" flags="in" index="3JmXsc" />
      <concept id="1168024337012" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery" flags="in" index="3NFfHV" />
    </language>
    <language id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext">
      <concept id="1217889725928" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_SessionObjectAccess" flags="nn" index="2fSANN" />
      <concept id="1217889960776" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_UserObjectAccessBase" flags="nn" index="2fTw9j">
        <child id="1217890689512" name="userKey" index="2fWi3N" />
      </concept>
      <concept id="1216860049635" name="jetbrains.mps.lang.generator.generationContext.structure.TemplateFunctionParameter_generationContext" flags="nn" index="1iwH7S" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="propertyName" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="4222318806802425298" name="jetbrains.mps.lang.core.structure.SuppressErrorsAnnotation" flags="ng" index="15s5l7" />
    </language>
  </registry>
  <node concept="bUwia" id="6qiZoTiPBS$">
    <property role="TrG5h" value="main" />
    <node concept="3lhOvk" id="6qiZoTiR3iN" role="3lj3bC">
      <ref role="30HIoZ" to="c2t8:6qiZoTiPXsD" resolve="App" />
      <ref role="3lhOvi" node="6qiZoTiR3j7" resolve="map_App" />
    </node>
    <node concept="3aamgX" id="6qiZoTiR_iV" role="3acgRq">
      <ref role="30HIoZ" to="c2t8:6qiZoTiPXsn" resolve="Sensor" />
      <node concept="j$656" id="6qiZoTiR_WW" role="1lVwrX">
        <ref role="v9R2y" node="6qiZoTiR_WU" resolve="reduce_Sensor" />
      </node>
    </node>
    <node concept="3aamgX" id="6qiZoTiRCQy" role="3acgRq">
      <ref role="30HIoZ" to="c2t8:6qiZoTiPXsv" resolve="Actuator" />
      <node concept="j$656" id="6qiZoTiRCQE" role="1lVwrX">
        <ref role="v9R2y" node="6qiZoTiRCQC" resolve="reduce_Actuator" />
      </node>
    </node>
    <node concept="3aamgX" id="6qiZoTiSlMC" role="3acgRq">
      <ref role="30HIoZ" to="c2t8:6qiZoTiRM5K" resolve="Action" />
      <node concept="j$656" id="6qiZoTiSlMQ" role="1lVwrX">
        <ref role="v9R2y" node="6qiZoTiSlMO" resolve="reduce_Action" />
      </node>
    </node>
    <node concept="3aamgX" id="6qiZoTiSlNJ" role="3acgRq">
      <ref role="30HIoZ" to="c2t8:6qiZoTiRM7S" resolve="Transition" />
      <node concept="j$656" id="6qiZoTiSlNV" role="1lVwrX">
        <ref role="v9R2y" node="6qiZoTiSlNT" resolve="reduce_Transition" />
      </node>
    </node>
    <node concept="3aamgX" id="6qiZoTiSlOO" role="3acgRq">
      <ref role="30HIoZ" to="c2t8:6qiZoTiRM37" resolve="State" />
      <node concept="j$656" id="6qiZoTiSlP2" role="1lVwrX">
        <ref role="v9R2y" node="6qiZoTiSlP0" resolve="reduce_State" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="6qiZoTiR3j7">
    <property role="TrG5h" value="map_App" />
    <node concept="2YIFZL" id="6qiZoTiR76d" role="jymVt">
      <property role="TrG5h" value="main" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="6qiZoTiR76g" role="3clF47">
        <node concept="3clFbF" id="6qiZoTiU4th" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiU4te" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiU4tf" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiU4tg" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="6qiZoTiU4Mt" role="37wK5m">
                <property role="Xl_RC" value="// Wiring code generated from an ArduinoML model" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6qiZoTiU7tf" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiU7tc" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiU7td" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiU7te" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="6qiZoTiU7MY" role="37wK5m">
                <property role="Xl_RC" value="// Application name: Switch!\n" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="6qiZoTiU780" role="3cqZAp" />
        <node concept="3clFbF" id="6qiZoTiRz3y" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiRz3v" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiRz3w" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiRz3x" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="6qiZoTiRz5C" role="37wK5m">
                <property role="Xl_RC" value="void setup() {" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6qiZoTiRzqs" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiRzqp" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiRzqq" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiRzqr" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="6qiZoTiRzvy" role="37wK5m">
                <property role="Xl_RC" value="\t// Here comes brick declaration" />
              </node>
            </node>
          </node>
          <node concept="2b32R4" id="6qiZoTiRFsd" role="lGtFl">
            <node concept="3JmXsc" id="6qiZoTiRFsg" role="2P8S$">
              <node concept="3clFbS" id="6qiZoTiRFsh" role="2VODD2">
                <node concept="3clFbF" id="6qiZoTiRFsn" role="3cqZAp">
                  <node concept="2OqwBi" id="6qiZoTiRFsi" role="3clFbG">
                    <node concept="3Tsc0h" id="6qiZoTiRFsl" role="2OqNvi">
                      <ref role="3TtcxE" to="c2t8:6qiZoTiPXt5" />
                    </node>
                    <node concept="30H73N" id="6qiZoTiRFsm" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6qiZoTiR$71" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiR$6Y" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiR$6Z" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiR$70" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="6qiZoTiR$9w" role="37wK5m">
                <property role="Xl_RC" value="}\n" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="6qiZoTiSc_u" role="3cqZAp" />
        <node concept="3clFbF" id="6qiZoTiSdKv" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiSdKs" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiSdKt" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiSdKu" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="6qiZoTiSdWd" role="37wK5m">
                <property role="Xl_RC" value="long time = 0; long debounce = 200;\n" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="6qiZoTiSfre" role="3cqZAp" />
        <node concept="3clFbF" id="6qiZoTiSfG2" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiSfFZ" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiSfG0" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiSfG1" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="6qiZoTiSfSp" role="37wK5m">
                <property role="Xl_RC" value="\t// Here comes states declarations" />
              </node>
            </node>
          </node>
          <node concept="2b32R4" id="6qiZoTiTRhU" role="lGtFl">
            <node concept="3JmXsc" id="6qiZoTiTRhX" role="2P8S$">
              <node concept="3clFbS" id="6qiZoTiTRhY" role="2VODD2">
                <node concept="3clFbF" id="6qiZoTiTRi4" role="3cqZAp">
                  <node concept="2OqwBi" id="6qiZoTiTRhZ" role="3clFbG">
                    <node concept="3Tsc0h" id="6qiZoTiTRi2" role="2OqNvi">
                      <ref role="3TtcxE" to="c2t8:6qiZoTiRMa2" />
                    </node>
                    <node concept="30H73N" id="6qiZoTiTRi3" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="6qiZoTiSgP2" role="3cqZAp" />
        <node concept="3clFbF" id="6qiZoTiShbS" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiShbP" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiShbQ" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiShbR" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="3cpWs3" id="6qiZoTiSjB3" role="37wK5m">
                <node concept="Xl_RD" id="6qiZoTiSjR2" role="3uHU7w">
                  <property role="Xl_RC" value="(); } // Entering init state\n" />
                </node>
                <node concept="3cpWs3" id="6qiZoTiSiZR" role="3uHU7B">
                  <node concept="Xl_RD" id="6qiZoTiShrN" role="3uHU7B">
                    <property role="Xl_RC" value="\nvoid loop() { state_" />
                  </node>
                  <node concept="Xl_RD" id="6qiZoTiSj5s" role="3uHU7w">
                    <property role="Xl_RC" value="init_state" />
                    <node concept="17Uvod" id="6qiZoTiTEfN" role="lGtFl">
                      <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                      <property role="2qtEX9" value="value" />
                      <node concept="3zFVjK" id="6qiZoTiTEfO" role="3zH0cK">
                        <node concept="3clFbS" id="6qiZoTiTEfP" role="2VODD2">
                          <node concept="3clFbF" id="6qiZoTiTEGD" role="3cqZAp">
                            <node concept="2OqwBi" id="6qiZoTiTFoy" role="3clFbG">
                              <node concept="2OqwBi" id="6qiZoTiTELv" role="2Oq$k0">
                                <node concept="30H73N" id="6qiZoTiTEGC" role="2Oq$k0" />
                                <node concept="3TrEf2" id="6qiZoTiTF1o" role="2OqNvi">
                                  <ref role="3Tt5mk" to="c2t8:6qiZoTiRMa5" />
                                </node>
                              </node>
                              <node concept="3TrcHB" id="6qiZoTiTFzU" role="2OqNvi">
                                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6qiZoTiR75N" role="1B3o_S" />
      <node concept="3cqZAl" id="6qiZoTiR75Y" role="3clF45" />
      <node concept="37vLTG" id="6qiZoTiR8sZ" role="3clF46">
        <property role="TrG5h" value="args" />
        <node concept="10Q1$e" id="6qiZoTiRb93" role="1tU5fm">
          <node concept="3uibUv" id="6qiZoTiR8sY" role="10Q1$1">
            <ref role="3uigEE" to="e2lb:~String" resolve="String" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="6qiZoTiR3j8" role="1B3o_S" />
    <node concept="n94m4" id="6qiZoTiR3j9" role="lGtFl">
      <ref role="n9lRv" to="c2t8:6qiZoTiPXsD" resolve="App" />
    </node>
  </node>
  <node concept="13MO4I" id="6qiZoTiR_WU">
    <property role="TrG5h" value="reduce_Sensor" />
    <ref role="3gUMe" to="c2t8:6qiZoTiPXsn" resolve="Sensor" />
    <node concept="9aQIb" id="6qiZoTiRA1O" role="13RCb5">
      <node concept="3clFbS" id="6qiZoTiRA1P" role="9aQI4">
        <node concept="raruj" id="6qiZoTiRA2x" role="lGtFl" />
        <node concept="3clFbF" id="6qiZoTiRA3g" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiRA3d" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiRA3e" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiRA3f" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="3cpWs3" id="6qiZoTiUjjh" role="37wK5m">
                <node concept="Xl_RD" id="6qiZoTiUjL0" role="3uHU7w">
                  <property role="Xl_RC" value=" [Sensor]" />
                </node>
                <node concept="3cpWs3" id="6qiZoTiUhyp" role="3uHU7B">
                  <node concept="3cpWs3" id="6qiZoTiRBSB" role="3uHU7B">
                    <node concept="3cpWs3" id="6qiZoTiRBuW" role="3uHU7B">
                      <node concept="Xl_RD" id="6qiZoTiRA3V" role="3uHU7B">
                        <property role="Xl_RC" value="    pinMode(" />
                      </node>
                      <node concept="3cmrfG" id="6qiZoTiRBuZ" role="3uHU7w">
                        <property role="3cmrfH" value="0" />
                        <node concept="17Uvod" id="6qiZoTiRCzD" role="lGtFl">
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
                          <property role="2qtEX9" value="value" />
                          <node concept="3zFVjK" id="6qiZoTiRCzG" role="3zH0cK">
                            <node concept="3clFbS" id="6qiZoTiRCzH" role="2VODD2">
                              <node concept="3clFbF" id="6qiZoTiRCzN" role="3cqZAp">
                                <node concept="2OqwBi" id="6qiZoTiRCzI" role="3clFbG">
                                  <node concept="3TrcHB" id="6qiZoTiRCzL" role="2OqNvi">
                                    <ref role="3TsBF5" to="c2t8:6qiZoTiPXsf" resolve="pin" />
                                  </node>
                                  <node concept="30H73N" id="6qiZoTiRCzM" role="2Oq$k0" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Xl_RD" id="6qiZoTiRC4k" role="3uHU7w">
                      <property role="Xl_RC" value=", INPUT); // " />
                    </node>
                  </node>
                  <node concept="Xl_RD" id="6qiZoTiUhTX" role="3uHU7w">
                    <property role="Xl_RC" value="SENSOR" />
                    <node concept="17Uvod" id="6qiZoTiUiJv" role="lGtFl">
                      <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                      <property role="2qtEX9" value="value" />
                      <node concept="3zFVjK" id="6qiZoTiUiJy" role="3zH0cK">
                        <node concept="3clFbS" id="6qiZoTiUiJz" role="2VODD2">
                          <node concept="3clFbF" id="6qiZoTiUiJD" role="3cqZAp">
                            <node concept="2OqwBi" id="6qiZoTiUiJ$" role="3clFbG">
                              <node concept="3TrcHB" id="6qiZoTiUiJB" role="2OqNvi">
                                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                              </node>
                              <node concept="30H73N" id="6qiZoTiUiJC" role="2Oq$k0" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="15s5l7" id="6qiZoTiRB5_" role="lGtFl" />
        </node>
      </node>
    </node>
  </node>
  <node concept="13MO4I" id="6qiZoTiRCQC">
    <property role="TrG5h" value="reduce_Actuator" />
    <ref role="3gUMe" to="c2t8:6qiZoTiPXsv" resolve="Actuator" />
    <node concept="9aQIb" id="6qiZoTiRCRz" role="13RCb5">
      <node concept="3clFbS" id="6qiZoTiRCR$" role="9aQI4">
        <node concept="raruj" id="6qiZoTiRCRB" role="lGtFl" />
        <node concept="3clFbF" id="6qiZoTiRCRG" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiRCRD" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiRCRE" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiRCRF" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="3cpWs3" id="6qiZoTiUoKr" role="37wK5m">
                <node concept="Xl_RD" id="6qiZoTiUpea" role="3uHU7w">
                  <property role="Xl_RC" value=" [Actuator]" />
                </node>
                <node concept="3cpWs3" id="6qiZoTiUmr6" role="3uHU7B">
                  <node concept="3cpWs3" id="6qiZoTiRDGW" role="3uHU7B">
                    <node concept="3cpWs3" id="6qiZoTiRDaz" role="3uHU7B">
                      <node concept="Xl_RD" id="6qiZoTiRCSn" role="3uHU7B">
                        <property role="Xl_RC" value="    pinMode(" />
                      </node>
                      <node concept="3cmrfG" id="6qiZoTiRDbS" role="3uHU7w">
                        <property role="3cmrfH" value="0" />
                        <node concept="17Uvod" id="6qiZoTiREWp" role="lGtFl">
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
                          <property role="2qtEX9" value="value" />
                          <node concept="3zFVjK" id="6qiZoTiREWs" role="3zH0cK">
                            <node concept="3clFbS" id="6qiZoTiREWt" role="2VODD2">
                              <node concept="3clFbF" id="6qiZoTiREWz" role="3cqZAp">
                                <node concept="2OqwBi" id="6qiZoTiREWu" role="3clFbG">
                                  <node concept="3TrcHB" id="6qiZoTiREWx" role="2OqNvi">
                                    <ref role="3TsBF5" to="c2t8:6qiZoTiPXsf" resolve="pin" />
                                  </node>
                                  <node concept="30H73N" id="6qiZoTiREWy" role="2Oq$k0" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Xl_RD" id="6qiZoTiRDSD" role="3uHU7w">
                      <property role="Xl_RC" value=", OUTPUT); // " />
                    </node>
                  </node>
                  <node concept="Xl_RD" id="6qiZoTiUmME" role="3uHU7w">
                    <property role="Xl_RC" value="ACTUATOR" />
                    <node concept="17Uvod" id="6qiZoTiUohK" role="lGtFl">
                      <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                      <property role="2qtEX9" value="value" />
                      <node concept="3zFVjK" id="6qiZoTiUohN" role="3zH0cK">
                        <node concept="3clFbS" id="6qiZoTiUohO" role="2VODD2">
                          <node concept="3clFbF" id="6qiZoTiUohU" role="3cqZAp">
                            <node concept="2OqwBi" id="6qiZoTiUohP" role="3clFbG">
                              <node concept="3TrcHB" id="6qiZoTiUohS" role="2OqNvi">
                                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                              </node>
                              <node concept="30H73N" id="6qiZoTiUohT" role="2Oq$k0" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="13MO4I" id="6qiZoTiSlMO">
    <property role="TrG5h" value="reduce_Action" />
    <ref role="3gUMe" to="c2t8:6qiZoTiRM5K" resolve="Action" />
    <node concept="9aQIb" id="6qiZoTiSlRU" role="13RCb5">
      <node concept="3clFbS" id="6qiZoTiSlRV" role="9aQI4">
        <node concept="raruj" id="6qiZoTiSlUT" role="lGtFl" />
        <node concept="3clFbF" id="6qiZoTiSlUY" role="3cqZAp">
          <node concept="2OqwBi" id="6qiZoTiSlUV" role="3clFbG">
            <node concept="10M0yZ" id="6qiZoTiSlUW" role="2Oq$k0">
              <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
              <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="6qiZoTiSlUX" role="2OqNvi">
              <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="3cpWs3" id="6qiZoTiSr4v" role="37wK5m">
                <node concept="Xl_RD" id="6qiZoTiSrjA" role="3uHU7w">
                  <property role="Xl_RC" value=");" />
                </node>
                <node concept="3cpWs3" id="6qiZoTiSnGE" role="3uHU7B">
                  <node concept="3cpWs3" id="6qiZoTiSn14" role="3uHU7B">
                    <node concept="3cpWs3" id="6qiZoTiSxho" role="3uHU7B">
                      <node concept="3cmrfG" id="6qiZoTiSxlD" role="3uHU7w">
                        <property role="3cmrfH" value="0" />
                        <node concept="17Uvod" id="6qiZoTiSxvW" role="lGtFl">
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
                          <property role="2qtEX9" value="value" />
                          <node concept="3zFVjK" id="6qiZoTiSxvX" role="3zH0cK">
                            <node concept="3clFbS" id="6qiZoTiSxvY" role="2VODD2">
                              <node concept="3clFbF" id="6qiZoTiSxXl" role="3cqZAp">
                                <node concept="2OqwBi" id="6qiZoTiSyGk" role="3clFbG">
                                  <node concept="2OqwBi" id="6qiZoTiSy3V" role="2Oq$k0">
                                    <node concept="30H73N" id="6qiZoTiSxXk" role="2Oq$k0" />
                                    <node concept="3TrEf2" id="6qiZoTiSynR" role="2OqNvi">
                                      <ref role="3Tt5mk" to="c2t8:6qiZoTiRM7e" />
                                    </node>
                                  </node>
                                  <node concept="3TrcHB" id="6qiZoTiSz2l" role="2OqNvi">
                                    <ref role="3TsBF5" to="c2t8:6qiZoTiPXsf" resolve="pin" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Xl_RD" id="6qiZoTiSlYp" role="3uHU7B">
                        <property role="Xl_RC" value="    digitalWrite(" />
                      </node>
                    </node>
                    <node concept="Xl_RD" id="6qiZoTiSnrv" role="3uHU7w">
                      <property role="Xl_RC" value=", " />
                    </node>
                  </node>
                  <node concept="Xl_RD" id="6qiZoTiSCN_" role="3uHU7w">
                    <property role="Xl_RC" value="SIGNAL" />
                    <node concept="17Uvod" id="6qiZoTiSD$M" role="lGtFl">
                      <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                      <property role="2qtEX9" value="value" />
                      <node concept="3zFVjK" id="6qiZoTiSD$N" role="3zH0cK">
                        <node concept="3clFbS" id="6qiZoTiSD$O" role="2VODD2">
                          <node concept="3clFbF" id="6qiZoTiSEet" role="3cqZAp">
                            <node concept="3K4zz7" id="6qiZoTiSEKA" role="3clFbG">
                              <node concept="Xl_RD" id="6qiZoTiSEQy" role="3K4E3e">
                                <property role="Xl_RC" value="HIGH" />
                              </node>
                              <node concept="Xl_RD" id="6qiZoTiSFcy" role="3K4GZi">
                                <property role="Xl_RC" value="LOW" />
                              </node>
                              <node concept="2OqwBi" id="6qiZoTiSEit" role="3K4Cdx">
                                <node concept="30H73N" id="6qiZoTiSEes" role="2Oq$k0" />
                                <node concept="3TrcHB" id="6qiZoTiSEuS" role="2OqNvi">
                                  <ref role="3TsBF5" to="c2t8:6qiZoTiRM6T" resolve="status" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="13MO4I" id="6qiZoTiSlNT">
    <property role="TrG5h" value="reduce_Transition" />
    <ref role="3gUMe" to="c2t8:6qiZoTiRM7S" resolve="Transition" />
    <node concept="9aQIb" id="6qiZoTiSFtW" role="13RCb5">
      <node concept="3clFbS" id="6qiZoTiSFtY" role="9aQI4">
        <node concept="raruj" id="6qiZoTiSFuZ" role="lGtFl" />
        <node concept="9aQIb" id="6qiZoTiSFyq" role="3cqZAp">
          <node concept="3clFbS" id="6qiZoTiSFyr" role="9aQI4">
            <node concept="3clFbF" id="6qiZoTiSF_6" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiSF_3" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiSF_4" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiSF_5" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="3cpWs3" id="6qiZoTiSLL3" role="37wK5m">
                    <node concept="Xl_RD" id="6qiZoTiSMcF" role="3uHU7w">
                      <property role="Xl_RC" value=" &amp;&amp; guard ) {" />
                    </node>
                    <node concept="3cpWs3" id="6qiZoTiSKnr" role="3uHU7B">
                      <node concept="3cpWs3" id="6qiZoTiSIyR" role="3uHU7B">
                        <node concept="3cpWs3" id="6qiZoTiSGar" role="3uHU7B">
                          <node concept="Xl_RD" id="6qiZoTiSFCq" role="3uHU7B">
                            <property role="Xl_RC" value="    if(digitalRead(" />
                          </node>
                          <node concept="3cmrfG" id="6qiZoTiSGes" role="3uHU7w">
                            <property role="3cmrfH" value="0" />
                            <node concept="17Uvod" id="6qiZoTiSGhC" role="lGtFl">
                              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
                              <property role="2qtEX9" value="value" />
                              <node concept="3zFVjK" id="6qiZoTiSGhD" role="3zH0cK">
                                <node concept="3clFbS" id="6qiZoTiSGhE" role="2VODD2">
                                  <node concept="3clFbF" id="6qiZoTiSGIz" role="3cqZAp">
                                    <node concept="2OqwBi" id="6qiZoTiSHru" role="3clFbG">
                                      <node concept="2OqwBi" id="6qiZoTiSGPq" role="2Oq$k0">
                                        <node concept="30H73N" id="6qiZoTiSGIy" role="2Oq$k0" />
                                        <node concept="3TrEf2" id="6qiZoTiSH71" role="2OqNvi">
                                          <ref role="3Tt5mk" to="c2t8:6qiZoTiRM97" />
                                        </node>
                                      </node>
                                      <node concept="3TrcHB" id="6qiZoTiSHG2" role="2OqNvi">
                                        <ref role="3TsBF5" to="c2t8:6qiZoTiPXsf" resolve="pin" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="Xl_RD" id="6qiZoTiSIXx" role="3uHU7w">
                          <property role="Xl_RC" value=") ==  " />
                        </node>
                      </node>
                      <node concept="Xl_RD" id="6qiZoTiSKJy" role="3uHU7w">
                        <property role="Xl_RC" value="SIGNAL" />
                        <node concept="17Uvod" id="6qiZoTiSOG3" role="lGtFl">
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                          <property role="2qtEX9" value="value" />
                          <node concept="3zFVjK" id="6qiZoTiSOG4" role="3zH0cK">
                            <node concept="3clFbS" id="6qiZoTiSOG5" role="2VODD2">
                              <node concept="3clFbF" id="6qiZoTiSRze" role="3cqZAp">
                                <node concept="3K4zz7" id="6qiZoTiSS9S" role="3clFbG">
                                  <node concept="Xl_RD" id="6qiZoTiSSfO" role="3K4E3e">
                                    <property role="Xl_RC" value="HIGH" />
                                  </node>
                                  <node concept="Xl_RD" id="6qiZoTiSSzj" role="3K4GZi">
                                    <property role="Xl_RC" value="LOW" />
                                  </node>
                                  <node concept="2OqwBi" id="6qiZoTiSRBe" role="3K4Cdx">
                                    <node concept="30H73N" id="6qiZoTiSRzd" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="6qiZoTiSRND" role="2OqNvi">
                                      <ref role="3TsBF5" to="c2t8:6qiZoTiRM8J" resolve="status" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6qiZoTiSTaa" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiSTa7" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiSTa8" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiSTa9" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="3cpWs3" id="6qiZoTiT01w" role="37wK5m">
                    <node concept="Xl_RD" id="6qiZoTiT0y5" role="3uHU7w">
                      <property role="Xl_RC" value="();" />
                    </node>
                    <node concept="3cpWs3" id="6qiZoTiSYwh" role="3uHU7B">
                      <node concept="Xl_RD" id="6qiZoTiSTIK" role="3uHU7B">
                        <property role="Xl_RC" value="        time = millis();   state_" />
                      </node>
                      <node concept="Xl_RD" id="6qiZoTiT3rJ" role="3uHU7w">
                        <property role="Xl_RC" value="STATE" />
                        <node concept="17Uvod" id="6qiZoTiT4wC" role="lGtFl">
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                          <property role="2qtEX9" value="value" />
                          <node concept="3zFVjK" id="6qiZoTiT4wD" role="3zH0cK">
                            <node concept="3clFbS" id="6qiZoTiT4wE" role="2VODD2">
                              <node concept="3clFbF" id="6qiZoTiT54s" role="3cqZAp">
                                <node concept="2OqwBi" id="6qiZoTiT5wW" role="3clFbG">
                                  <node concept="2OqwBi" id="6qiZoTiT58s" role="2Oq$k0">
                                    <node concept="30H73N" id="6qiZoTiT54r" role="2Oq$k0" />
                                    <node concept="3TrEf2" id="6qiZoTiT5iq" role="2OqNvi">
                                      <ref role="3Tt5mk" to="c2t8:6qiZoTiRM9w" />
                                    </node>
                                  </node>
                                  <node concept="3TrcHB" id="6qiZoTiT5J3" role="2OqNvi">
                                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6qiZoTiT6f2" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiT6eZ" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiT6f0" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiT6f1" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="3cpWs3" id="6qiZoTiTfz6" role="37wK5m">
                    <node concept="Xl_RD" id="6qiZoTiTg1P" role="3uHU7w">
                      <property role="Xl_RC" value="(); }" />
                    </node>
                    <node concept="3cpWs3" id="6qiZoTiTd4T" role="3uHU7B">
                      <node concept="Xl_RD" id="6qiZoTiT6Qd" role="3uHU7B">
                        <property role="Xl_RC" value="    } else { state_" />
                      </node>
                      <node concept="Xl_RD" id="6qiZoTiTdv5" role="3uHU7w">
                        <property role="Xl_RC" value="STATE_NAME" />
                        <node concept="17Uvod" id="6qiZoTiThMD" role="lGtFl">
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                          <property role="2qtEX9" value="value" />
                          <node concept="3zFVjK" id="6qiZoTiThME" role="3zH0cK">
                            <node concept="3clFbS" id="6qiZoTiThMF" role="2VODD2">
                              <node concept="3clFbF" id="6qiZoTiTivJ" role="3cqZAp">
                                <node concept="3cpWs3" id="6qiZoTiTiOV" role="3clFbG">
                                  <node concept="2OqwBi" id="6qiZoTiTj9i" role="3uHU7w">
                                    <node concept="1iwH7S" id="6qiZoTiTiXI" role="2Oq$k0" />
                                    <node concept="2fSANN" id="6qiZoTiTjlF" role="2OqNvi">
                                      <node concept="Xl_RD" id="6qiZoTiTjx4" role="2fWi3N">
                                        <property role="Xl_RC" value="current_state_name" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="Xl_RD" id="6qiZoTiTivI" role="3uHU7B" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="13MO4I" id="6qiZoTiSlP0">
    <property role="TrG5h" value="reduce_State" />
    <ref role="3gUMe" to="c2t8:6qiZoTiRM37" resolve="State" />
    <node concept="9aQIb" id="6qiZoTiTklg" role="13RCb5">
      <node concept="3clFbS" id="6qiZoTiTkli" role="9aQI4">
        <node concept="raruj" id="6qiZoTiTklm" role="lGtFl" />
        <node concept="9aQIb" id="6qiZoTiTkme" role="3cqZAp">
          <node concept="3clFbS" id="6qiZoTiTkmf" role="9aQI4">
            <node concept="3clFbF" id="6qiZoTiTkq3" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiTkq0" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiTkq1" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiTkq2" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="3cpWs3" id="6qiZoTiTlrU" role="37wK5m">
                    <node concept="Xl_RD" id="6qiZoTiTlFu" role="3uHU7w">
                      <property role="Xl_RC" value="() {" />
                    </node>
                    <node concept="3cpWs3" id="6qiZoTiTkQw" role="3uHU7B">
                      <node concept="Xl_RD" id="6qiZoTiTkvb" role="3uHU7B">
                        <property role="Xl_RC" value="void state_" />
                      </node>
                      <node concept="Xl_RD" id="6qiZoTiTkVE" role="3uHU7w">
                        <property role="Xl_RC" value="STATE_NAME" />
                        <node concept="17Uvod" id="6qiZoTiTsuu" role="lGtFl">
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                          <property role="2qtEX9" value="value" />
                          <node concept="3zFVjK" id="6qiZoTiTsuv" role="3zH0cK">
                            <node concept="3clFbS" id="6qiZoTiTsuw" role="2VODD2">
                              <node concept="3clFbF" id="6qiZoTiTsWx" role="3cqZAp">
                                <node concept="2OqwBi" id="6qiZoTiTt0Q" role="3clFbG">
                                  <node concept="30H73N" id="6qiZoTiTsWw" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="6qiZoTiTtc8" role="2OqNvi">
                                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6qiZoTiTlYo" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiTlYl" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiTlYm" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiTlYn" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="Xl_RD" id="6qiZoTiTm9W" role="37wK5m">
                    <property role="Xl_RC" value="    // Here comes the actions" />
                  </node>
                </node>
              </node>
              <node concept="2b32R4" id="6qiZoTiT$ZG" role="lGtFl">
                <node concept="3JmXsc" id="6qiZoTiT$ZJ" role="2P8S$">
                  <node concept="3clFbS" id="6qiZoTiT$ZK" role="2VODD2">
                    <node concept="3clFbF" id="6qiZoTiT$ZQ" role="3cqZAp">
                      <node concept="2OqwBi" id="6qiZoTiT$ZL" role="3clFbG">
                        <node concept="3Tsc0h" id="6qiZoTiT$ZO" role="2OqNvi">
                          <ref role="3TtcxE" to="c2t8:6qiZoTiRM4T" />
                        </node>
                        <node concept="30H73N" id="6qiZoTiT$ZP" role="2Oq$k0" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6qiZoTiTnrW" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiTnrT" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiTnrU" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiTnrV" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="Xl_RD" id="6qiZoTiTn$r" role="37wK5m">
                    <property role="Xl_RC" value="    boolean guard = millis() - time &gt; debounce;" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6qiZoTiTpZZ" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiTpZW" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiTpZX" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiTpZY" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="Xl_RD" id="6qiZoTiTq9l" role="37wK5m">
                    <property role="Xl_RC" value="    // Here comes the transition" />
                  </node>
                </node>
              </node>
              <node concept="29HgVG" id="6qiZoTiTtx$" role="lGtFl">
                <node concept="3NFfHV" id="6qiZoTiTtx_" role="3NFExx">
                  <node concept="3clFbS" id="6qiZoTiTtxA" role="2VODD2">
                    <node concept="3clFbF" id="6qiZoTiTu33" role="3cqZAp">
                      <node concept="37vLTI" id="6qiZoTiTuzT" role="3clFbG">
                        <node concept="2OqwBi" id="6qiZoTiTuH1" role="37vLTx">
                          <node concept="30H73N" id="6qiZoTiTuEt" role="2Oq$k0" />
                          <node concept="3TrcHB" id="6qiZoTiTuRl" role="2OqNvi">
                            <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                          </node>
                        </node>
                        <node concept="2OqwBi" id="6qiZoTiTu52" role="37vLTJ">
                          <node concept="1iwH7S" id="6qiZoTiTu31" role="2Oq$k0" />
                          <node concept="2fSANN" id="6qiZoTiTueK" role="2OqNvi">
                            <node concept="Xl_RD" id="6qiZoTiTukX" role="2fWi3N">
                              <property role="Xl_RC" value="current_state_name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="6qiZoTiTtxG" role="3cqZAp">
                      <node concept="2OqwBi" id="6qiZoTiTtxB" role="3clFbG">
                        <node concept="3TrEf2" id="6qiZoTiTtxE" role="2OqNvi">
                          <ref role="3Tt5mk" to="c2t8:6qiZoTiRM5b" />
                        </node>
                        <node concept="30H73N" id="6qiZoTiTtxF" role="2Oq$k0" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6qiZoTiTrwJ" role="3cqZAp">
              <node concept="2OqwBi" id="6qiZoTiTrwG" role="3clFbG">
                <node concept="10M0yZ" id="6qiZoTiTrwH" role="2Oq$k0">
                  <ref role="1PxDUh" to="e2lb:~System" resolve="System" />
                  <ref role="3cqZAo" to="e2lb:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="6qiZoTiTrwI" role="2OqNvi">
                  <ref role="37wK5l" to="fxg7:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="Xl_RD" id="6qiZoTiTrEw" role="37wK5m">
                    <property role="Xl_RC" value="}\n" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

