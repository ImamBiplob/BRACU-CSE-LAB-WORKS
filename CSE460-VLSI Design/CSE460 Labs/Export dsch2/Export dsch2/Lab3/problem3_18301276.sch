DSCH 2.7a
VERSION 12/13/2021 1:45:56 PM
BB(-135,-35,235,124)
SYM  #digit1
BB(210,-35,235,0)
TITLE 210 -14  #digit
MODEL 89
PROP                                                                                                                                                                                                           
REC(215,-30,15,21,r)
VIS 2
PIN(215,0,0.000,0.000)digit11
PIN(220,0,0.000,0.000)digit12
PIN(225,0,0.000,0.000)digit13
PIN(230,0,0.000,0.000)digit14
LIG(210,-35,210,-5)
LIG(235,-35,210,-35)
LIG(235,-5,235,-35)
LIG(210,-5,235,-5)
LIG(215,-5,215,0)
LIG(220,-5,220,0)
LIG(225,-5,225,0)
LIG(230,-5,230,0)
FSYM
SYM  #dreg1
BB(75,15,105,40)
TITLE 87 23  #dreg
MODEL 860
PROP                                                                                                                                                                                                           
REC(50,5,0,0,r)
VIS 5
PIN(75,20,0.000,0.000)D
PIN(75,30,0.000,0.000)RST
PIN(90,40,0.000,0.000)H
PIN(105,30,0.120,0.070)Q
PIN(105,20,0.120,0.070)nQ
LIG(75,30,80,30)
LIG(75,20,80,20)
LIG(90,40,90,39)
LIG(90,37,90,37)
LIG(100,30,105,30)
LIG(100,20,105,20)
LIG(100,35,80,35)
LIG(100,15,100,35)
LIG(80,15,100,15)
LIG(80,35,80,15)
LIG(89,35,90,33)
LIG(90,33,91,35)
VLG     module dreg(D,RST,H,Q,nQ);
VLG      input D,RST,H;
VLG      output Q,nQ;
VLG     endmodule
FSYM
SYM  #dreg2
BB(150,15,180,40)
TITLE 162 23  #dreg
MODEL 860
PROP                                                                                                                                                                                                           
REC(125,5,0,0,r)
VIS 5
PIN(150,20,0.000,0.000)D
PIN(150,30,0.000,0.000)RST
PIN(165,40,0.000,0.000)H
PIN(180,30,0.120,0.070)Q
PIN(180,20,0.120,0.070)nQ
LIG(150,30,155,30)
LIG(150,20,155,20)
LIG(165,40,165,39)
LIG(165,37,165,37)
LIG(175,30,180,30)
LIG(175,20,180,20)
LIG(175,35,155,35)
LIG(175,15,175,35)
LIG(155,15,175,15)
LIG(155,35,155,15)
LIG(164,35,165,33)
LIG(165,33,166,35)
VLG     module dreg(D,RST,H,Q,nQ);
VLG      input D,RST,H;
VLG      output Q,nQ;
VLG     endmodule
FSYM
SYM  #dreg3
BB(-15,15,15,40)
TITLE -3 23  #dreg
MODEL 860
PROP                                                                                                                                                                                                           
REC(-40,5,0,0,r)
VIS 5
PIN(-15,20,0.000,0.000)D
PIN(-15,30,0.000,0.000)RST
PIN(0,40,0.000,0.000)H
PIN(15,30,0.120,0.070)Q
PIN(15,20,0.120,0.070)nQ
LIG(-15,30,-10,30)
LIG(-15,20,-10,20)
LIG(0,40,0,39)
LIG(0,37,0,37)
LIG(10,30,15,30)
LIG(10,20,15,20)
LIG(10,35,-10,35)
LIG(10,15,10,35)
LIG(-10,15,10,15)
LIG(-10,35,-10,15)
LIG(-1,35,0,33)
LIG(0,33,1,35)
VLG     module dreg(D,RST,H,Q,nQ);
VLG      input D,RST,H;
VLG      output Q,nQ;
VLG     endmodule
FSYM
SYM  #dreg4
BB(-105,15,-75,40)
TITLE -93 23  #dreg
MODEL 860
PROP                                                                                                                                                                                                           
REC(-130,5,0,0,r)
VIS 5
PIN(-105,20,0.000,0.000)D
PIN(-105,30,0.000,0.000)RST
PIN(-90,40,0.000,0.000)H
PIN(-75,30,0.120,0.070)Q
PIN(-75,20,0.120,0.070)nQ
LIG(-105,30,-100,30)
LIG(-105,20,-100,20)
LIG(-90,40,-90,39)
LIG(-90,37,-90,37)
LIG(-80,30,-75,30)
LIG(-80,20,-75,20)
LIG(-80,35,-100,35)
LIG(-80,15,-80,35)
LIG(-100,15,-80,15)
LIG(-100,35,-100,15)
LIG(-91,35,-90,33)
LIG(-90,33,-89,35)
VLG     module dreg(D,RST,H,Q,nQ);
VLG      input D,RST,H;
VLG      output Q,nQ;
VLG     endmodule
FSYM
SYM  #clock1
BB(-135,67,-120,73)
TITLE -130 70  #clock
MODEL 69
PROP   10.00 10.00                                                                                                                                                                                                       
REC(-133,68,6,4,r)
VIS 1
PIN(-120,70,1.500,3.500)clk1
LIG(-125,70,-120,70)
LIG(-130,68,-132,68)
LIG(-126,68,-128,68)
LIG(-125,67,-125,73)
LIG(-135,73,-135,67)
LIG(-130,72,-130,68)
LIG(-128,68,-128,72)
LIG(-128,72,-130,72)
LIG(-132,72,-134,72)
LIG(-132,68,-132,72)
LIG(-125,73,-135,73)
LIG(-125,67,-135,67)
FSYM
SYM  #button1
BB(66,115,74,124)
TITLE 70 120  #button
MODEL 59
PROP                                                                                                                                                                                                           
REC(67,117,6,6,r)
VIS 1
PIN(70,115,0.000,0.000)in1
LIG(70,116,70,115)
LIG(74,124,66,124)
LIG(74,116,74,124)
LIG(66,116,74,116)
LIG(66,124,66,116)
LIG(73,123,67,123)
LIG(73,117,73,123)
LIG(67,117,73,117)
LIG(67,123,67,117)
FSYM
CNC(195 20)
CNC(110 20)
CNC(30 20)
CNC(-65 20)
CNC(-15 90)
CNC(70 90)
CNC(75 90)
LIG(-120,70,-90,70)
LIG(-90,70,-90,40)
LIG(-75,20,-65,20)
LIG(-60,20,-60,-5)
LIG(-60,-5,-110,-5)
LIG(-110,-5,-110,20)
LIG(-110,20,-105,20)
LIG(-75,30,-40,30)
LIG(-40,30,-40,60)
LIG(-40,60,0,60)
LIG(0,40,0,60)
LIG(15,30,50,30)
LIG(50,30,50,60)
LIG(50,60,90,60)
LIG(90,40,90,60)
LIG(105,30,130,30)
LIG(130,30,130,60)
LIG(130,60,165,60)
LIG(165,40,165,60)
LIG(150,20,130,20)
LIG(130,20,130,-15)
LIG(130,-15,195,-15)
LIG(195,-15,195,20)
LIG(180,20,195,20)
LIG(195,20,195,25)
LIG(195,25,215,25)
LIG(215,0,215,25)
LIG(15,20,30,20)
LIG(35,20,35,-15)
LIG(-15,20,-30,20)
LIG(-30,20,-30,-15)
LIG(-30,-15,35,-15)
LIG(105,20,110,20)
LIG(120,20,120,-5)
LIG(75,20,50,20)
LIG(120,-5,50,-5)
LIG(50,-5,50,20)
LIG(110,20,110,55)
LIG(110,20,120,20)
LIG(110,55,220,55)
LIG(220,0,220,55)
LIG(30,20,30,75)
LIG(30,20,35,20)
LIG(30,75,225,75)
LIG(225,0,225,75)
LIG(-65,20,-65,80)
LIG(-65,20,-60,20)
LIG(-65,80,230,80)
LIG(230,0,230,80)
LIG(-105,30,-110,30)
LIG(-110,30,-110,90)
LIG(-110,90,-15,90)
LIG(70,90,70,115)
LIG(-15,30,-15,90)
LIG(-15,90,70,90)
LIG(70,90,75,90)
LIG(150,30,150,90)
LIG(75,90,150,90)
LIG(75,30,75,90)
FFIG C:\Users\Imam Biplob\Downloads\Export dsch2\Export dsch2\Lab3\problem3_18301276.sch
