DSCH 2.6i
VERSION 4/25/2003 8:46:51 AM
BB(246,5,324,65)
SYM  #light2
BB(318,40,324,54)
TITLE 320 55  #light
MODEL 49
PROP                                                                                                                                                                                                            
REC(319,42,4,5,r)
VIS 1
PIN(320,55,0.000,0.000)nQ
LIG(323,47,323,42)
LIG(323,42,322,41)
LIG(319,42,319,47)
LIG(322,52,322,49)
LIG(321,52,324,52)
LIG(321,54,323,52)
LIG(322,54,324,52)
LIG(318,49,324,49)
LIG(320,49,320,55)
LIG(318,47,318,49)
LIG(324,47,318,47)
LIG(324,49,324,47)
LIG(320,41,319,42)
LIG(322,41,320,41)
FSYM
SYM  #nand2
BB(270,45,305,65)
TITLE 282 56  #&
MODEL 202
PROP                                                                                                                                                                                                            
REC(-85,60,0,0,)
VIS 0
PIN(270,60,0.000,0.000)b
PIN(270,50,0.000,0.000)a
PIN(305,55,0.090,0.140)s
LIG(270,60,278,60)
LIG(278,45,278,65)
LIG(297,57,294,61)
LIG(298,55,297,57)
LIG(297,53,298,55)
LIG(294,49,297,53)
LIG(289,46,294,49)
LIG(294,61,289,64)
LIG(289,64,278,65)
LIG(278,45,289,46)
LIG(270,50,278,50)
LIG(302,55,305,55)
LIG(300,55,300,55)
VLG   nand nand2(out,a,b);
FSYM
SYM  #nand2
BB(270,10,305,30)
TITLE 282 21  #&
MODEL 202
PROP                                                                                                                                                                                                            
REC(-80,120,0,0,)
VIS 0
PIN(270,25,0.000,0.000)b
PIN(270,15,0.000,0.000)a
PIN(305,20,0.090,0.140)s
LIG(270,25,278,25)
LIG(278,10,278,30)
LIG(297,22,294,26)
LIG(298,20,297,22)
LIG(297,18,298,20)
LIG(294,14,297,18)
LIG(289,11,294,14)
LIG(294,26,289,29)
LIG(289,29,278,30)
LIG(278,10,289,11)
LIG(270,15,278,15)
LIG(302,20,305,20)
LIG(300,20,300,20)
VLG   nand nand2(out,a,b);
FSYM
SYM  #light1
BB(318,5,324,19)
TITLE 320 20  #light
MODEL 49
PROP                                                                                                                                                                                                            
REC(319,7,4,5,r)
VIS 1
PIN(320,20,0.000,0.000)Q
LIG(323,12,323,7)
LIG(323,7,322,6)
LIG(319,7,319,12)
LIG(322,17,322,14)
LIG(321,17,324,17)
LIG(321,19,323,17)
LIG(322,19,324,17)
LIG(318,14,324,14)
LIG(320,14,320,20)
LIG(318,12,318,14)
LIG(324,12,318,12)
LIG(324,14,324,12)
LIG(320,6,319,7)
LIG(322,6,320,6)
FSYM
SYM  #button1
BB(246,11,255,19)
TITLE 250 15  #button
MODEL 59
PROP                                                                                                                                                                                                            
REC(247,12,6,6,r)
VIS 1
PIN(255,15,0.000,0.000)Set
LIG(254,15,255,15)
LIG(246,11,246,19)
LIG(254,11,246,11)
LIG(254,19,254,11)
LIG(246,19,254,19)
LIG(247,12,247,18)
LIG(253,12,247,12)
LIG(253,18,253,12)
LIG(247,18,253,18)
FSYM
CNC(260 15)
LIG(260,60,270,60)
LIG(255,15,260,15)
LIG(270,25,270,35)
LIG(305,55,320,55)
LIG(305,35,305,20)
LIG(275,40,305,40)
LIG(275,35,305,35)
LIG(270,40,275,35)
LIG(305,20,320,20)
LIG(270,35,275,40)
LIG(270,50,270,40)
LIG(305,40,305,55)
LIG(260,15,260,60)
LIG(260,15,270,15)
FFIG C:\Documents and Settings\Administrator\My Documents\Dsch2\Book on CMOS\LatchMetaStable.sch
