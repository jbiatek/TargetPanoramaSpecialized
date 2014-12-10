<?xml version="1.0" encoding="UTF-8"?>
<PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:tr="extended-plexil-translator">
   <GlobalDeclarations LineNo="3" ColNo="0">
      <CommandDeclaration LineNo="3" ColNo="0">
         <Name>rover_drive</Name>
         <Parameter>
            <Type>Integer</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="4" ColNo="0">
         <Name>rover_stop</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="5" ColNo="0">
         <Name>take_navcam</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="6" ColNo="0">
         <Name>take_pancam</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="7" ColNo="0">
         <Name>self_destruct</Name>
      </CommandDeclaration>
      <StateDeclaration LineNo="9" ColNo="5">
         <Name>time</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="10" ColNo="5">
         <Name>temperature</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="11" ColNo="8">
         <Name>target_in_view</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
      </StateDeclaration>
   </GlobalDeclarations>
   <Node NodeType="NodeList" epx="Concurrence" LineNo="15" ColNo="0">
      <NodeId>DriveToTarget</NodeId>
      <VariableDeclarations>
         <DeclareVariable LineNo="16" ColNo="2">
            <Name>drive_done</Name>
            <Type>Boolean</Type>
            <InitialValue>
               <BooleanValue>false</BooleanValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="16" ColNo="2">
            <Name>timeout</Name>
            <Type>Boolean</Type>
            <InitialValue>
               <BooleanValue>false</BooleanValue>
            </InitialValue>
         </DeclareVariable>
      </VariableDeclarations>
      <NodeBody>
         <NodeList>
            <Node NodeType="Command" LineNo="18" ColNo="9">
               <NodeId>Drive</NodeId>
               <NodeBody>
                  <Command>
                     <Name>
                        <StringValue>rover_drive</StringValue>
                     </Name>
                     <Arguments LineNo="18" ColNo="21">
                        <IntegerValue>10</IntegerValue>
                     </Arguments>
                  </Command>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Concurrence" LineNo="21" ColNo="2">
               <NodeId>StopForTimeout</NodeId>
               <StartCondition>
                  <GE>
                     <LookupOnChange>
                        <Name>
                           <StringValue>time</StringValue>
                        </Name>
                        <Tolerance>
                           <RealValue>0.1</RealValue>
                        </Tolerance>
                     </LookupOnChange>
                     <IntegerValue>10</IntegerValue>
                  </GE>
               </StartCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Command" LineNo="23" ColNo="10">
                        <NodeId>Stop</NodeId>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>rover_stop</StringValue>
                              </Name>
                           </Command>
                        </NodeBody>
                     </Node>
                     <Node NodeType="Assignment" LineNo="25" ColNo="20">
                        <NodeId>SetTimeoutFlag</NodeId>
                        <NodeBody>
                           <Assignment>
                              <BooleanVariable>timeout</BooleanVariable>
                              <BooleanRHS>
                                 <BooleanValue>true</BooleanValue>
                              </BooleanRHS>
                           </Assignment>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Concurrence" LineNo="29" ColNo="2">
               <NodeId>StopForTarget</NodeId>
               <StartCondition>
                  <LookupOnChange>
                     <Name>
                        <StringValue>target_in_view</StringValue>
                     </Name>
                  </LookupOnChange>
               </StartCondition>
               <SkipCondition>
                  <BooleanVariable>timeout</BooleanVariable>
               </SkipCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Command" LineNo="33" ColNo="10">
                        <NodeId>Stop</NodeId>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>rover_stop</StringValue>
                              </Name>
                           </Command>
                        </NodeBody>
                     </Node>
                     <Node NodeType="Assignment" LineNo="34" ColNo="18">
                        <NodeId>SetDriveFlag</NodeId>
                        <NodeBody>
                           <Assignment>
                              <BooleanVariable>drive_done</BooleanVariable>
                              <BooleanRHS>
                                 <BooleanValue>true</BooleanValue>
                              </BooleanRHS>
                           </Assignment>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="Command" LineNo="41" ColNo="4">
               <NodeId>TakeNavcam</NodeId>
               <StartCondition>
                  <BooleanVariable>timeout</BooleanVariable>
               </StartCondition>
               <NodeBody>
                  <Command>
                     <Name>
                        <StringValue>take_navcam</StringValue>
                     </Name>
                  </Command>
               </NodeBody>
               <SkipCondition>
                  <BooleanVariable>drive_done</BooleanVariable>
               </SkipCondition>
            </Node>
            <Node NodeType="Command" LineNo="48" ColNo="4">
               <NodeId>TakePancam</NodeId>
               <StartCondition>
                  <BooleanVariable>drive_done</BooleanVariable>
               </StartCondition>
               <NodeBody>
                  <Command>
                     <Name>
                        <StringValue>take_pancam</StringValue>
                     </Name>
                  </Command>
               </NodeBody>
               <SkipCondition>
                  <BooleanVariable>timeout</BooleanVariable>
               </SkipCondition>
            </Node>
            <Node NodeType="Command" LineNo="56" ColNo="4">
               <NodeId>HighlySpecificNode</NodeId>
               <StartCondition>
                  <AND>
                     <AND>
                        <BooleanVariable>drive_done</BooleanVariable>
                        <BooleanVariable>timeout</BooleanVariable>
                     </AND>
                     <EQNumeric>
                        <LookupOnChange>
                           <Name>
                              <StringValue>time</StringValue>
                           </Name>
                        </LookupOnChange>
                        <IntegerValue>42</IntegerValue>
                     </EQNumeric>
                  </AND>
               </StartCondition>
               <NodeBody>
                  <Command>
                     <Name>
                        <StringValue>self_destruct</StringValue>
                     </Name>
                  </Command>
               </NodeBody>
               <SkipCondition>
                  <AND>
                     <EQInternal>
                        <NodeStateVariable>
                           <NodeId>TakeNavcam</NodeId>
                        </NodeStateVariable>
                        <NodeStateValue>FINISHED</NodeStateValue>
                     </EQInternal>
                     <EQInternal>
                        <NodeStateVariable>
                           <NodeId>TakePancam</NodeId>
                        </NodeStateVariable>
                        <NodeStateValue>FINISHED</NodeStateValue>
                     </EQInternal>
                  </AND>
               </SkipCondition>
            </Node>
         </NodeList>
      </NodeBody>
   </Node>
</PlexilPlan>