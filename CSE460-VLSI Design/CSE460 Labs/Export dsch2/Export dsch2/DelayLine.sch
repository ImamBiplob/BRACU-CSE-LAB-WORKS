DSCH 2.6i
VERSION 4/27/2003 6:30:56 PM
BB(-450,-190,-136,-61)
SYM  #button13
BB(-449,-134,-440,-126)
TITLE -445 -130  #button
MODEL 59
PROP                                                                                                                                                                                                            
REC(-448,-133,6,6,r)
VIS 1
PIN(-440,-130,0.000,0.000)Reset
LIG(-441,-130,-440,-130)
LIG(-449,-126,-449,-134)
LIG(-441,-126,-449,-126)
LIG(-441,-134,-441,-126)
LIG(-449,-134,-441,-134)
LIG(-448,-127,-448,-133)
LIG(-442,-127,-448,-127)
LIG(-442,-133,-442,-127)
LIG(-448,-133,-442,-133)
FSYM
SYM  #button4c
BB(-429,-69,-420,-61)
TITLE -425 -65  #button
MODEL 59
PROP                                                                                                                                                                                                           
REC(-428,-68,6,6,r)
VIS 1
PIN(-420,-65,0.000,0.000)AddDt
LIG(-421,-65,-420,-65)
LIG(-429,-61,-429,-69)
LIG(-421,-61,-429,-61)
LIG(-421,-69,-421,-61)
LIG(-429,-69,-421,-69)
LIG(-428,-62,-428,-68)
LIG(-422,-62,-428,-62)
LIG(-422,-68,-422,-62)
LIG(-428,-68,-422,-68)
FSYM
SYM  #button12c
BB(-444,-184,-435,-176)
TITLE -440 -180  #button
MODEL 59
PROP                                                                                                                                                                                                            
REC(-443,-183,6,6,r)
VIS 1
PIN(-435,-180,0.000,0.000)DataIn
LIG(-436,-180,-435,-180)
LIG(-444,-176,-444,-184)
LIG(-436,-176,-444,-176)
LIG(-436,-184,-436,-176)
LIG(-444,-184,-436,-184)
LIG(-443,-177,-443,-183)
LIG(-437,-177,-443,-177)
LIG(-437,-183,-437,-177)
LIG(-443,-183,-437,-183)
FSYM
SYM  #mux
BB(-170,-185,-150,-160)
TITLE -163 -178  #mux
MODEL 143
PROP                                                                                                                                                                                                            
REC(205,0,0,0,)
VIS 3
PIN(-170,-180,0.000,0.000)i0
PIN(-170,-170,0.000,0.000)i1
PIN(-160,-160,0.000,0.000)sel
PIN(-150,-175,0.030,0.070)f
LIG(-170,-180,-165,-180)
LIG(-165,-185,-165,-180)
LIG(-165,-180,-165,-170)
LIG(-170,-170,-165,-170)
LIG(-165,-170,-165,-165)
LIG(-155,-180,-155,-175)
LIG(-155,-175,-150,-175)
LIG(-155,-175,-155,-170)
LIG(-165,-185,-155,-180)
LIG(-165,-165,-155,-170)
LIG(-160,-160,-160,-168)
VLG    mux mux1(f,i0,i1,sel);
FSYM
SYM  #dreg1
BB(-210,-185,-180,-160)
TITLE -198 -177  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(-235,-195,0,0,r)
VIS 5
PIN(-210,-180,0.000,0.000)D
PIN(-210,-170,0.000,0.000)RST
PIN(-195,-160,0.000,0.000)H
PIN(-180,-170,0.120,0.070)Q
PIN(-180,-180,0.120,0.000)nQ
LIG(-210,-170,-205,-170)
LIG(-210,-180,-205,-180)
LIG(-195,-160,-195,-161)
LIG(-195,-163,-195,-163)
LIG(-185,-170,-180,-170)
LIG(-185,-180,-180,-180)
LIG(-185,-165,-205,-165)
LIG(-185,-185,-185,-165)
LIG(-205,-185,-185,-185)
LIG(-205,-165,-205,-185)
LIG(-196,-165,-195,-167)
LIG(-195,-167,-194,-165)
VLG       module dreg(D,RST,H,Q,nQ);
VLG        input D,RST,H;
VLG        output Q,nQ;
VLG       endmodule
FSYM
SYM  #mux
BB(-380,-185,-360,-160)
TITLE -373 -178  #mux
MODEL 143
PROP                                                                                                                                                                                                            
REC(-5,0,0,0,)
VIS 3
PIN(-380,-180,0.000,0.000)i0
PIN(-380,-170,0.000,0.000)i1
PIN(-370,-160,0.000,0.000)sel
PIN(-360,-175,0.030,0.140)f
LIG(-380,-180,-375,-180)
LIG(-375,-185,-375,-180)
LIG(-375,-180,-375,-170)
LIG(-380,-170,-375,-170)
LIG(-375,-170,-375,-165)
LIG(-365,-180,-365,-175)
LIG(-365,-175,-360,-175)
LIG(-365,-175,-365,-170)
LIG(-375,-185,-365,-180)
LIG(-375,-165,-365,-170)
LIG(-370,-160,-370,-168)
VLG    mux mux1(f,i0,i1,sel);
FSYM
SYM  #dreg2
BB(-420,-185,-390,-160)
TITLE -408 -177  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(-445,-195,0,0,r)
VIS 5
PIN(-420,-180,0.000,0.000)D
PIN(-420,-170,0.000,0.000)RST
PIN(-405,-160,0.000,0.000)H
PIN(-390,-170,0.120,0.070)Q
PIN(-390,-180,0.120,0.000)nQ
LIG(-420,-170,-415,-170)
LIG(-420,-180,-415,-180)
LIG(-405,-160,-405,-161)
LIG(-405,-163,-405,-163)
LIG(-395,-170,-390,-170)
LIG(-395,-180,-390,-180)
LIG(-395,-165,-415,-165)
LIG(-395,-185,-395,-165)
LIG(-415,-185,-395,-185)
LIG(-415,-165,-415,-185)
LIG(-406,-165,-405,-167)
LIG(-405,-167,-404,-165)
VLG       module dreg(D,RST,H,Q,nQ);
VLG        input D,RST,H;
VLG        output Q,nQ;
VLG       endmodule
FSYM
SYM  #dreg3
BB(-280,-185,-250,-160)
TITLE -268 -177  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(-305,-195,0,0,r)
VIS 5
PIN(-280,-180,0.000,0.000)D
PIN(-280,-170,0.000,0.000)RST
PIN(-265,-160,0.000,0.000)H
PIN(-250,-170,0.120,0.070)Q
PIN(-250,-180,0.120,0.000)nQ
LIG(-280,-170,-275,-170)
LIG(-280,-180,-275,-180)
LIG(-265,-160,-265,-161)
LIG(-265,-163,-265,-163)
LIG(-255,-170,-250,-170)
LIG(-255,-180,-250,-180)
LIG(-255,-165,-275,-165)
LIG(-255,-185,-255,-165)
LIG(-275,-185,-255,-185)
LIG(-275,-165,-275,-185)
LIG(-266,-165,-265,-167)
LIG(-265,-167,-264,-165)
VLG       module dreg(D,RST,H,Q,nQ);
VLG        input D,RST,H;
VLG        output Q,nQ;
VLG       endmodule
FSYM
SYM  #clock1
BB(-450,-118,-435,-112)
TITLE -445 -115  #clock
MODEL 69
PROP   10.000 10.000                                                                                                                                                                                                        
REC(-448,-117,6,4,r)
VIS 1
PIN(-435,-115,1.500,0.280)Clock
LIG(-440,-115,-435,-115)
LIG(-445,-117,-447,-117)
LIG(-441,-117,-443,-117)
LIG(-440,-118,-440,-112)
LIG(-450,-112,-450,-118)
LIG(-445,-113,-445,-117)
LIG(-443,-117,-443,-113)
LIG(-443,-113,-445,-113)
LIG(-447,-113,-449,-113)
LIG(-447,-117,-447,-113)
LIG(-440,-112,-450,-112)
LIG(-440,-118,-450,-118)
FSYM
SYM  #light5
BB(-142,-190,-136,-176)
TITLE -140 -176  #light
MODEL 49
PROP                                                                                                                                                                                                            
REC(-141,-189,4,4,r)
VIS 641
PIN(-140,-175,0.000,0.000)DataDelayed
LIG(-137,-184,-137,-189)
LIG(-137,-189,-138,-190)
LIG(-141,-189,-141,-184)
LIG(-138,-179,-138,-182)
LIG(-139,-179,-136,-179)
LIG(-139,-177,-137,-179)
LIG(-138,-177,-136,-179)
LIG(-142,-182,-136,-182)
LIG(-140,-182,-140,-175)
LIG(-142,-184,-142,-182)
LIG(-136,-184,-142,-184)
LIG(-136,-182,-136,-184)
LIG(-140,-190,-141,-189)
LIG(-138,-190,-140,-190)
FSYM
SYM  #mux
BB(-240,-185,-220,-160)
TITLE -233 -178  #mux
MODEL 143
PROP                                                                                                                                                                                                            
REC(135,0,0,0,)
VIS 3
PIN(-240,-180,0.000,0.000)i0
PIN(-240,-170,0.000,0.000)i1
PIN(-230,-160,0.000,0.000)sel
PIN(-220,-175,0.030,0.140)f
LIG(-240,-180,-235,-180)
LIG(-235,-185,-235,-180)
LIG(-235,-180,-235,-170)
LIG(-240,-170,-235,-170)
LIG(-235,-170,-235,-165)
LIG(-225,-180,-225,-175)
LIG(-225,-175,-220,-175)
LIG(-225,-175,-225,-170)
LIG(-235,-185,-225,-180)
LIG(-235,-165,-225,-170)
LIG(-230,-160,-230,-168)
VLG    mux mux1(f,i0,i1,sel);
FSYM
SYM  #dreg4
BB(-350,-185,-320,-160)
TITLE -338 -177  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(-375,-195,0,0,r)
VIS 5
PIN(-350,-180,0.000,0.000)D
PIN(-350,-170,0.000,0.000)RST
PIN(-335,-160,0.000,0.000)H
PIN(-320,-170,0.120,0.070)Q
PIN(-320,-180,0.120,0.000)nQ
LIG(-350,-170,-345,-170)
LIG(-350,-180,-345,-180)
LIG(-335,-160,-335,-161)
LIG(-335,-163,-335,-163)
LIG(-325,-170,-320,-170)
LIG(-325,-180,-320,-180)
LIG(-325,-165,-345,-165)
LIG(-325,-185,-325,-165)
LIG(-345,-185,-325,-185)
LIG(-345,-165,-345,-185)
LIG(-336,-165,-335,-167)
LIG(-335,-167,-334,-165)
VLG       module dreg(D,RST,H,Q,nQ);
VLG        input D,RST,H;
VLG        output Q,nQ;
VLG       endmodule
FSYM
SYM  #mux
BB(-310,-185,-290,-160)
TITLE -303 -178  #mux
MODEL 143
PROP                                                                                                                                                                                                            
REC(65,0,0,0,)
VIS 3
PIN(-310,-180,0.000,0.000)i0
PIN(-310,-170,0.000,0.000)i1
PIN(-300,-160,0.000,0.000)sel
PIN(-290,-175,0.030,0.140)f
LIG(-310,-180,-305,-180)
LIG(-305,-185,-305,-180)
LIG(-305,-180,-305,-170)
LIG(-310,-170,-305,-170)
LIG(-305,-170,-305,-165)
LIG(-295,-180,-295,-175)
LIG(-295,-175,-290,-175)
LIG(-295,-175,-295,-170)
LIG(-305,-185,-295,-180)
LIG(-305,-165,-295,-170)
LIG(-300,-160,-300,-168)
VLG    mux mux1(f,i0,i1,sel);
FSYM
SYM  #button3c
BB(-429,-79,-420,-71)
TITLE -425 -75  #button
MODEL 59
PROP                                                                                                                                                                                                           
REC(-428,-78,6,6,r)
VIS 1
PIN(-420,-75,0.000,0.000)AddDt
LIG(-421,-75,-420,-75)
LIG(-429,-71,-429,-79)
LIG(-421,-71,-429,-71)
LIG(-421,-79,-421,-71)
LIG(-429,-79,-421,-79)
LIG(-428,-72,-428,-78)
LIG(-422,-72,-428,-72)
LIG(-422,-78,-422,-72)
LIG(-428,-78,-422,-78)
FSYM
SYM  #button4
BB(-429,-89,-420,-81)
TITLE -425 -85  #button
MODEL 59
PROP                                                                                                                                                                                                           
REC(-428,-88,6,6,r)
VIS 1
PIN(-420,-85,0.000,0.000)AddDt
LIG(-421,-85,-420,-85)
LIG(-429,-81,-429,-89)
LIG(-421,-81,-429,-81)
LIG(-421,-89,-421,-81)
LIG(-429,-89,-421,-89)
LIG(-428,-82,-428,-88)
LIG(-422,-82,-428,-82)
LIG(-422,-88,-422,-82)
LIG(-428,-88,-422,-88)
FSYM
SYM  #button3
BB(-429,-99,-420,-91)
TITLE -425 -95  #button
MODEL 59
PROP                                                                                                                                                                                                           
REC(-428,-98,6,6,r)
VIS 1
PIN(-420,-95,0.000,0.000)AddDt
LIG(-421,-95,-420,-95)
LIG(-429,-91,-429,-99)
LIG(-421,-91,-429,-91)
LIG(-421,-99,-421,-91)
LIG(-429,-99,-421,-99)
LIG(-428,-92,-428,-98)
LIG(-422,-92,-428,-92)
LIG(-422,-98,-422,-92)
LIG(-428,-98,-422,-98)
FSYM
CNC(-215 -180)
CNC(-420 -130)
CNC(-425 -180)
CNC(-405 -115)
CNC(-335 -115)
CNC(-405 -115)
CNC(-355 -180)
CNC(-285 -180)
CNC(-265 -115)
CNC(-265 -115)
CNC(-350 -130)
CNC(-280 -130)
LIG(-150,-175,-140,-175)
LIG(-265,-115,-195,-115)
LIG(-170,-190,-170,-180)
LIG(-215,-190,-170,-190)
LIG(-215,-180,-210,-180)
LIG(-420,-170,-420,-130)
LIG(-215,-180,-215,-190)
LIG(-435,-180,-425,-180)
LIG(-440,-130,-420,-130)
LIG(-420,-130,-350,-130)
LIG(-380,-190,-380,-180)
LIG(-405,-160,-405,-115)
LIG(-425,-190,-380,-190)
LIG(-425,-180,-420,-180)
LIG(-425,-180,-425,-190)
LIG(-390,-170,-380,-170)
LIG(-180,-170,-170,-170)
LIG(-335,-160,-335,-115)
LIG(-215,-180,-215,-175)
LIG(-420,-85,-300,-85)
LIG(-220,-175,-215,-175)
LIG(-435,-115,-405,-115)
LIG(-405,-115,-405,-115)
LIG(-405,-115,-335,-115)
LIG(-290,-175,-285,-175)
LIG(-350,-170,-350,-130)
LIG(-355,-180,-355,-175)
LIG(-360,-175,-355,-175)
LIG(-320,-170,-310,-170)
LIG(-355,-180,-355,-190)
LIG(-355,-180,-350,-180)
LIG(-355,-190,-310,-190)
LIG(-310,-190,-310,-180)
LIG(-285,-180,-285,-175)
LIG(-250,-170,-240,-170)
LIG(-285,-180,-285,-190)
LIG(-285,-180,-280,-180)
LIG(-285,-190,-240,-190)
LIG(-240,-190,-240,-180)
LIG(-370,-160,-370,-95)
LIG(-370,-95,-420,-95)
LIG(-265,-160,-265,-115)
LIG(-300,-160,-300,-85)
LIG(-160,-160,-160,-65)
LIG(-335,-115,-265,-115)
LIG(-230,-160,-230,-75)
LIG(-195,-115,-195,-160)
LIG(-350,-130,-280,-130)
LIG(-210,-130,-210,-170)
LIG(-280,-170,-280,-130)
LIG(-280,-130,-210,-130)
LIG(-420,-75,-230,-75)
LIG(-420,-65,-160,-65)
FFIG C:\Documents and Settings\Administrator\My Documents\Dsch2\Book on CMOS\DelayLine.sch
