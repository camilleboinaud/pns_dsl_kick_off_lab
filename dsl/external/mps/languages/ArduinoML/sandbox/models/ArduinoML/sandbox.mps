<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:142136d1-6563-49cb-9d8f-afb895967c03(ArduinoML.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="eb79d3f6-2f50-4710-8bed-7c8821e78d91" name="ArduinoML" version="-1" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="-1" />
  </languages>
  <imports />
  <registry>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="eb79d3f6-2f50-4710-8bed-7c8821e78d91" name="ArduinoML">
      <concept id="7391248726185465631" name="ArduinoML.structure.Actuator" flags="ng" index="OhiEh" />
      <concept id="7391248726185465623" name="ArduinoML.structure.Sensor" flags="ng" index="OhiEp" />
      <concept id="7391248726185465641" name="ArduinoML.structure.App" flags="ng" index="OhiEB">
        <reference id="7391248726185943685" name="init_state" index="OjtWb" />
        <child id="7391248726185465669" name="bricks" index="OhiFb" />
        <child id="7391248726185943682" name="states" index="OjtWc" />
      </concept>
      <concept id="7391248726185415036" name="ArduinoML.structure.Brick" flags="ng" index="OhuNM">
        <property id="7391248726185465615" name="pin" index="OhiE1" />
      </concept>
      <concept id="7391248726185943544" name="ArduinoML.structure.Transition" flags="ng" index="OjtLQ">
        <property id="7391248726185943599" name="status" index="OjtYx" />
        <reference id="7391248726185943623" name="sensor" index="OjtZ9" />
        <reference id="7391248726185943648" name="target" index="OjtZI" />
      </concept>
      <concept id="7391248726185943408" name="ArduinoML.structure.Action" flags="ng" index="OjtNY">
        <property id="7391248726185943481" name="status" index="OjtKR" />
        <reference id="7391248726185943502" name="actuator" index="OjtL0" />
      </concept>
      <concept id="7391248726185943239" name="ArduinoML.structure.State" flags="ng" index="OjtP9">
        <child id="7391248726185943353" name="actions" index="OjtMR" />
        <child id="7391248726185943371" name="transition" index="OjtN5" />
      </concept>
    </language>
  </registry>
  <node concept="OhiEB" id="6qiZoTiQUK9">
    <property role="TrG5h" value="RedButton" />
    <ref role="OjtWb" node="6qiZoTiSckT" resolve="off" />
    <node concept="OjtP9" id="6qiZoTiSckT" role="OjtWc">
      <property role="TrG5h" value="off" />
      <node concept="OjtLQ" id="6qiZoTiSckU" role="OjtN5">
        <property role="OjtYx" value="true" />
        <ref role="OjtZ9" node="6qiZoTiR2uV" resolve="button" />
        <ref role="OjtZI" node="6qiZoTiSclg" resolve="on" />
      </node>
      <node concept="OjtNY" id="6qiZoTiScl2" role="OjtMR">
        <property role="OjtKR" value="false" />
        <ref role="OjtL0" node="6qiZoTiR2uQ" resolve="led" />
      </node>
    </node>
    <node concept="OjtP9" id="6qiZoTiSclg" role="OjtWc">
      <property role="TrG5h" value="on" />
      <node concept="OjtLQ" id="6qiZoTiSclh" role="OjtN5">
        <property role="OjtYx" value="true" />
        <ref role="OjtZ9" node="6qiZoTiR2uV" resolve="button" />
        <ref role="OjtZI" node="6qiZoTiSckT" resolve="off" />
      </node>
      <node concept="OjtNY" id="6qiZoTiScln" role="OjtMR">
        <property role="OjtKR" value="true" />
        <ref role="OjtL0" node="6qiZoTiR2uQ" resolve="led" />
      </node>
    </node>
    <node concept="OhiEh" id="6qiZoTiR2uQ" role="OhiFb">
      <property role="TrG5h" value="led" />
      <property role="OhiE1" value="12" />
    </node>
    <node concept="OhiEp" id="6qiZoTiR2uV" role="OhiFb">
      <property role="TrG5h" value="button" />
      <property role="OhiE1" value="9" />
    </node>
  </node>
</model>

