<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:245c6bb0-45f6-4e1d-bde2-bbd4748fc599(ArduinoML.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="c2t8" ref="r:7e023c22-bfbe-4aa5-a291-6d3c66906987(ArduinoML.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186414928363" name="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem" flags="ln" index="VPM3Z" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1198256887712" name="jetbrains.mps.lang.editor.structure.CellModel_Indent" flags="ng" index="3XFhqQ" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="6qiZoTiQVb5">
    <ref role="1XX52x" to="c2t8:6qiZoTiPXsv" resolve="Actuator" />
    <node concept="3EZMnI" id="6qiZoTiQXvZ" role="2wV5jI">
      <node concept="3F0ifn" id="6qiZoTiQXxp" role="3EZMnx">
        <property role="3F0ifm" value="actuator" />
      </node>
      <node concept="3F0A7n" id="6qiZoTiQXxf" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="2iRfu4" id="6qiZoTiQXw2" role="2iSdaV" />
      <node concept="3F0ifn" id="6qiZoTiQXxx" role="3EZMnx">
        <property role="3F0ifm" value=": " />
      </node>
      <node concept="3F0A7n" id="6qiZoTiQXxL" role="3EZMnx">
        <ref role="1NtTu8" to="c2t8:6qiZoTiPXsf" resolve="pin" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6qiZoTiQXyF">
    <ref role="1XX52x" to="c2t8:6qiZoTiPXsn" resolve="Sensor" />
    <node concept="3EZMnI" id="6qiZoTiQXyH" role="2wV5jI">
      <node concept="3F0ifn" id="6qiZoTiQXyU" role="3EZMnx">
        <property role="3F0ifm" value="sensor " />
      </node>
      <node concept="3F0A7n" id="6qiZoTiQXz4" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6qiZoTiQXzc" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F0A7n" id="6qiZoTiQXzs" role="3EZMnx">
        <ref role="1NtTu8" to="c2t8:6qiZoTiPXsf" resolve="pin" />
      </node>
      <node concept="2iRfu4" id="6qiZoTiQXyK" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6qiZoTiRW$x">
    <ref role="1XX52x" to="c2t8:6qiZoTiRM5K" resolve="Action" />
    <node concept="3EZMnI" id="6qiZoTiRWCg" role="2wV5jI">
      <node concept="1iCGBv" id="6qiZoTiS7bb" role="3EZMnx">
        <ref role="1NtTu8" to="c2t8:6qiZoTiRM7e" />
        <node concept="1sVBvm" id="6qiZoTiS7bd" role="1sWHZn">
          <node concept="3F0A7n" id="6qiZoTiS7bn" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6qiZoTiS7bv" role="3EZMnx">
        <property role="3F0ifm" value="&lt;=" />
      </node>
      <node concept="3F0A7n" id="6qiZoTiS7bF" role="3EZMnx">
        <ref role="1NtTu8" to="c2t8:6qiZoTiRM6T" resolve="status" />
      </node>
      <node concept="l2Vlx" id="6qiZoTiRWCj" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6qiZoTiS7cv">
    <ref role="1XX52x" to="c2t8:6qiZoTiRM7S" resolve="Transition" />
    <node concept="3EZMnI" id="6qiZoTiS7dn" role="2wV5jI">
      <node concept="1iCGBv" id="6qiZoTiS7dS" role="3EZMnx">
        <ref role="1NtTu8" to="c2t8:6qiZoTiRM97" />
        <node concept="1sVBvm" id="6qiZoTiS7dU" role="1sWHZn">
          <node concept="3F0A7n" id="6qiZoTiS7e4" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6qiZoTiS7eJ" role="3EZMnx">
        <property role="3F0ifm" value="is" />
      </node>
      <node concept="3F0A7n" id="6qiZoTiS7fp" role="3EZMnx">
        <ref role="1NtTu8" to="c2t8:6qiZoTiRM8J" resolve="status" />
      </node>
      <node concept="3F0ifn" id="6qiZoTiS7gp" role="3EZMnx">
        <property role="3F0ifm" value="=&gt;" />
      </node>
      <node concept="1iCGBv" id="6qiZoTiS7h9" role="3EZMnx">
        <ref role="1NtTu8" to="c2t8:6qiZoTiRM9w" />
        <node concept="1sVBvm" id="6qiZoTiS7hb" role="1sWHZn">
          <node concept="3F0A7n" id="6qiZoTiS7hX" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="6qiZoTiS7dq" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6qiZoTiS7jk">
    <ref role="1XX52x" to="c2t8:6qiZoTiRM37" resolve="State" />
    <node concept="3EZMnI" id="6qiZoTiS7kK" role="2wV5jI">
      <node concept="3EZMnI" id="6qiZoTiS7lt" role="3EZMnx">
        <node concept="VPM3Z" id="6qiZoTiS7lv" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
        <node concept="3F0A7n" id="6qiZoTiS7mi" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
        <node concept="3F0ifn" id="6qiZoTiS7n3" role="3EZMnx">
          <property role="3F0ifm" value="{" />
        </node>
        <node concept="l2Vlx" id="6qiZoTiS7ly" role="2iSdaV" />
      </node>
      <node concept="2iRkQZ" id="6qiZoTiS7kN" role="2iSdaV" />
      <node concept="3EZMnI" id="6qiZoTiS7nU" role="3EZMnx">
        <node concept="VPM3Z" id="6qiZoTiS7nW" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
        <node concept="3XFhqQ" id="6qiZoTiS7oT" role="3EZMnx" />
        <node concept="3F2HdR" id="6qiZoTiS7pK" role="3EZMnx">
          <ref role="1NtTu8" to="c2t8:6qiZoTiRM4T" />
          <node concept="2iRkQZ" id="6qiZoTiS7pN" role="2czzBx" />
          <node concept="VPM3Z" id="6qiZoTiS7pO" role="3F10Kt">
            <property role="VOm3f" value="false" />
          </node>
        </node>
        <node concept="l2Vlx" id="6qiZoTiS7nZ" role="2iSdaV" />
      </node>
      <node concept="3EZMnI" id="6qiZoTiS7rG" role="3EZMnx">
        <node concept="VPM3Z" id="6qiZoTiS7rI" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
        <node concept="3XFhqQ" id="6qiZoTiS7t1" role="3EZMnx" />
        <node concept="3F1sOY" id="6qiZoTiS7s4" role="3EZMnx">
          <ref role="1NtTu8" to="c2t8:6qiZoTiRM5b" />
        </node>
        <node concept="l2Vlx" id="6qiZoTiS7rL" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="6qiZoTiS7tW" role="3EZMnx">
        <property role="3F0ifm" value="}" />
      </node>
    </node>
  </node>
</model>

