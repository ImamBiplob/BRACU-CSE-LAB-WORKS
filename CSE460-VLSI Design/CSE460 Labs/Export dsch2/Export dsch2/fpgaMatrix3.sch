DSCH 2.6i
VERSION 4/28/2003 6:53:17 PM
BB(40,-127,335,114)
SYM  #IO2
BB(283,-62,287,-58)
TITLE 285 -65  #IO
MODEL 925
PROP                                                                                                                                                                                                            
REC(0,0,0,0,)
VIS 2
PIN(285,-60,0.000,0.000)p
LIG(283,-62,287,-62)
LIG(287,-62,287,-58)
LIG(287,-58,283,-58)
LIG(283,-58,283,-62)
FSYM
SYM  #nmos
BB(225,-90,245,-70)
TITLE 240 -85  #nmos
MODEL 901
PROP   1.0u 0.12u                                                                                                                                                                                                        
REC(230,-90,15,19,r)
VIS 0
PIN(245,-90,0.000,0.000)s
PIN(235,-70,0.000,0.000)g
PIN(225,-90,0.030,0.420)d
LIG(235,-80,235,-70)
LIG(241,-80,229,-80)
LIG(241,-82,229,-82)
LIG(229,-90,229,-82)
LIG(225,-90,229,-90)
LIG(241,-90,241,-82)
LIG(245,-90,241,-90)
VLG    nmos nmos(drain,source,gate);
FSYM
SYM  #pmos
BB(225,-110,245,-90)
TITLE 230 -95  #pmos
MODEL 902
PROP   2.0u 0.12u                                                                                                                                                                                                        
REC(225,-109,15,19,r)
VIS 0
PIN(245,-90,0.000,0.000)s
PIN(235,-110,0.000,0.000)g
PIN(225,-90,0.030,0.420)d
LIG(235,-110,235,-104)
LIG(235,-102,235,-102)
LIG(229,-100,241,-100)
LIG(229,-98,241,-98)
LIG(241,-90,241,-98)
LIG(245,-90,241,-90)
LIG(229,-90,229,-98)
LIG(225,-90,229,-90)
VLG    pmos pmos(drain,source,gate);
FSYM
SYM  #nmos
BB(225,-10,245,10)
TITLE 240 -5  #nmos
MODEL 901
PROP   1.0u 0.12u                                                                                                                                                                                                        
REC(230,-10,15,19,r)
VIS 0
PIN(245,-10,0.000,0.000)s
PIN(235,10,0.000,0.000)g
PIN(225,-10,0.030,0.420)d
LIG(235,0,235,10)
LIG(241,0,229,0)
LIG(241,-2,229,-2)
LIG(229,-10,229,-2)
LIG(225,-10,229,-10)
LIG(241,-10,241,-2)
LIG(245,-10,241,-10)
VLG    nmos nmos(drain,source,gate);
FSYM
SYM  #pmos
BB(225,-30,245,-10)
TITLE 230 -15  #pmos
MODEL 902
PROP   2.0u 0.12u                                                                                                                                                                                                        
REC(225,-29,15,19,r)
VIS 0
PIN(245,-10,0.000,0.000)s
PIN(235,-30,0.000,0.000)g
PIN(225,-10,0.030,0.420)d
LIG(235,-30,235,-24)
LIG(235,-22,235,-22)
LIG(229,-20,241,-20)
LIG(229,-18,241,-18)
LIG(241,-10,241,-18)
LIG(245,-10,241,-10)
LIG(229,-10,229,-18)
LIG(225,-10,229,-10)
VLG    pmos pmos(drain,source,gate);
FSYM
SYM  #pmos
BB(145,-30,165,-10)
TITLE 150 -15  #pmos
MODEL 902
PROP   2.0u 0.12u                                                                                                                                                                                                        
REC(145,-29,15,19,r)
VIS 0
PIN(165,-10,0.000,0.000)s
PIN(155,-30,0.000,0.000)g
PIN(145,-10,0.030,0.420)d
LIG(155,-30,155,-24)
LIG(155,-22,155,-22)
LIG(149,-20,161,-20)
LIG(149,-18,161,-18)
LIG(161,-10,161,-18)
LIG(165,-10,161,-10)
LIG(149,-10,149,-18)
LIG(145,-10,149,-10)
VLG    pmos pmos(drain,source,gate);
FSYM
SYM  #nmos
BB(145,-10,165,10)
TITLE 160 -5  #nmos
MODEL 901
PROP   1.0u 0.12u                                                                                                                                                                                                        
REC(150,-10,15,19,r)
VIS 0
PIN(165,-10,0.000,0.000)s
PIN(155,10,0.000,0.000)g
PIN(145,-10,0.030,0.420)d
LIG(155,0,155,10)
LIG(161,0,149,0)
LIG(161,-2,149,-2)
LIG(149,-10,149,-2)
LIG(145,-10,149,-10)
LIG(161,-10,161,-2)
LIG(165,-10,161,-10)
VLG    nmos nmos(drain,source,gate);
FSYM
SYM  #pmos
BB(145,-110,165,-90)
TITLE 150 -95  #pmos
MODEL 902
PROP   2.0u 0.12u                                                                                                                                                                                                        
REC(145,-109,15,19,r)
VIS 0
PIN(165,-90,0.000,0.000)s
PIN(155,-110,0.000,0.000)g
PIN(145,-90,0.030,0.420)d
LIG(155,-110,155,-104)
LIG(155,-102,155,-102)
LIG(149,-100,161,-100)
LIG(149,-98,161,-98)
LIG(161,-90,161,-98)
LIG(165,-90,161,-90)
LIG(149,-90,149,-98)
LIG(145,-90,149,-90)
VLG    pmos pmos(drain,source,gate);
FSYM
SYM  #nmos
BB(145,-90,165,-70)
TITLE 160 -85  #nmos
MODEL 901
PROP   1.0u 0.12u                                                                                                                                                                                                        
REC(150,-90,15,19,r)
VIS 0
PIN(165,-90,0.000,0.000)s
PIN(155,-70,0.000,0.000)g
PIN(145,-90,0.030,0.420)d
LIG(155,-80,155,-70)
LIG(161,-80,149,-80)
LIG(161,-82,149,-82)
LIG(149,-90,149,-82)
LIG(145,-90,149,-90)
LIG(161,-90,161,-82)
LIG(165,-90,161,-90)
VLG    nmos nmos(drain,source,gate);
FSYM
SYM  #pmos
BB(175,-80,195,-60)
TITLE 180 -65  #pmos
MODEL 902
PROP   2.0u 0.12u                                                                                                                                                                                                        
REC(175,-79,15,19,r)
VIS 0
PIN(195,-60,0.000,0.000)s
PIN(185,-80,0.000,0.000)g
PIN(175,-60,0.030,0.420)d
LIG(185,-80,185,-74)
LIG(185,-72,185,-72)
LIG(179,-70,191,-70)
LIG(179,-68,191,-68)
LIG(191,-60,191,-68)
LIG(195,-60,191,-60)
LIG(179,-60,179,-68)
LIG(175,-60,179,-60)
VLG    pmos pmos(drain,source,gate);
FSYM
SYM  #nmos
BB(175,-60,195,-40)
TITLE 190 -55  #nmos
MODEL 901
PROP   1.0u 0.12u                                                                                                                                                                                                        
REC(180,-60,15,19,r)
VIS 0
PIN(195,-60,0.000,0.000)s
PIN(185,-40,0.000,0.000)g
PIN(175,-60,0.030,0.420)d
LIG(185,-50,185,-40)
LIG(191,-50,179,-50)
LIG(191,-52,179,-52)
LIG(179,-60,179,-52)
LIG(175,-60,179,-60)
LIG(191,-60,191,-52)
LIG(195,-60,191,-60)
VLG    nmos nmos(drain,source,gate);
FSYM
SYM  #nmos
BB(200,-30,220,-10)
TITLE 205 -25  #nmos
MODEL 901
PROP   1.0u 0.12u                                                                                                                                                                                                        
REC(200,-30,19,15,r)
VIS 0
PIN(200,-30,0.000,0.000)s
PIN(220,-20,0.000,0.000)g
PIN(200,-10,0.030,0.420)d
LIG(210,-20,220,-20)
LIG(210,-26,210,-14)
LIG(208,-26,208,-14)
LIG(200,-14,208,-14)
LIG(200,-10,200,-14)
LIG(200,-26,208,-26)
LIG(200,-30,200,-26)
VLG    nmos nmos(drain,source,gate);
FSYM
SYM  #pmos
BB(180,-30,200,-10)
TITLE 195 -15  #pmos
MODEL 902
PROP   2.0u 0.12u                                                                                                                                                                                                        
REC(181,-25,19,15,r)
VIS 0
PIN(200,-30,0.000,0.000)s
PIN(180,-20,0.000,0.000)g
PIN(200,-10,0.030,0.420)d
LIG(180,-20,186,-20)
LIG(188,-20,188,-20)
LIG(190,-14,190,-26)
LIG(192,-14,192,-26)
LIG(200,-26,192,-26)
LIG(200,-30,200,-26)
LIG(200,-14,192,-14)
LIG(200,-10,200,-14)
VLG    pmos pmos(drain,source,gate);
FSYM
SYM  #dreg1
BB(210,55,240,80)
TITLE 222 63  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(185,45,0,0,r)
VIS 5
PIN(210,60,0.000,0.000)D
PIN(210,70,0.000,0.000)RST
PIN(225,80,0.000,0.000)H
PIN(240,70,0.120,0.140)Q
PIN(240,60,0.120,0.070)nQ
LIG(210,70,215,70)
LIG(210,60,215,60)
LIG(225,80,225,79)
LIG(225,77,225,77)
LIG(235,70,240,70)
LIG(235,60,240,60)
LIG(235,75,215,75)
LIG(235,55,235,75)
LIG(215,55,235,55)
LIG(215,75,215,55)
LIG(224,75,225,73)
LIG(225,73,226,75)
VLG      module dreg(D,RST,H,Q,nQ);
VLG       input D,RST,H;
VLG       output Q,nQ;
VLG      endmodule
FSYM
SYM  #dreg2
BB(120,55,150,80)
TITLE 132 63  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(95,45,0,0,r)
VIS 5
PIN(120,60,0.000,0.000)D
PIN(120,70,0.000,0.000)RST
PIN(135,80,0.000,0.000)H
PIN(150,70,0.120,0.140)Q
PIN(150,60,0.120,0.070)nQ
LIG(120,70,125,70)
LIG(120,60,125,60)
LIG(135,80,135,79)
LIG(135,77,135,77)
LIG(145,70,150,70)
LIG(145,60,150,60)
LIG(145,75,125,75)
LIG(145,55,145,75)
LIG(125,55,145,55)
LIG(125,75,125,55)
LIG(134,75,135,73)
LIG(135,73,136,75)
VLG      module dreg(D,RST,H,Q,nQ);
VLG       input D,RST,H;
VLG       output Q,nQ;
VLG      endmodule
FSYM
SYM  #dreg3
BB(300,55,330,80)
TITLE 312 63  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(275,45,0,0,r)
VIS 5
PIN(300,60,0.000,0.000)D
PIN(300,70,0.000,0.000)RST
PIN(315,80,0.000,0.000)H
PIN(330,70,0.120,0.070)Q
PIN(330,60,0.120,0.070)nQ
LIG(300,70,305,70)
LIG(300,60,305,60)
LIG(315,80,315,79)
LIG(315,77,315,77)
LIG(325,70,330,70)
LIG(325,60,330,60)
LIG(325,75,305,75)
LIG(325,55,325,75)
LIG(305,55,325,55)
LIG(305,75,305,55)
LIG(314,75,315,73)
LIG(315,73,316,75)
VLG      module dreg(D,RST,H,Q,nQ);
VLG       input D,RST,H;
VLG       output Q,nQ;
VLG      endmodule
FSYM
SYM  #IO1
BB(43,-62,47,-58)
TITLE 45 -65  #IO
MODEL 925
PROP                                                                                                                                                                                                            
REC(0,0,0,0,)
VIS 2
PIN(45,-60,0.000,0.000)p
LIG(43,-62,47,-62)
LIG(47,-62,47,-58)
LIG(47,-58,43,-58)
LIG(43,-58,43,-62)
FSYM
SYM  #button7
BB(41,106,50,114)
TITLE 45 110  #button
MODEL 59
PROP                                                                                                                                                                                                            
REC(42,107,6,6,r)
VIS 1
PIN(50,110,0.000,0.000)Reset
LIG(49,110,50,110)
LIG(41,114,41,106)
LIG(49,114,41,114)
LIG(49,106,49,114)
LIG(41,106,49,106)
LIG(42,113,42,107)
LIG(48,113,42,113)
LIG(48,107,48,113)
LIG(42,107,48,107)
FSYM
SYM  #IO4
BB(198,-127,202,-123)
TITLE 202 -130  #IO
MODEL 925
PROP                                                                                                                                                                                                            
REC(0,0,0,0,)
VIS 2
PIN(200,-125,0.000,0.000)p
LIG(198,-127,202,-127)
LIG(202,-127,202,-123)
LIG(202,-123,198,-123)
LIG(198,-123,198,-127)
FSYM
SYM  #dreg4
BB(165,55,195,80)
TITLE 177 63  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(140,45,0,0,r)
VIS 5
PIN(165,60,0.000,0.000)D
PIN(165,70,0.000,0.000)RST
PIN(180,80,0.000,0.000)H
PIN(195,70,0.120,0.140)Q
PIN(195,60,0.120,0.070)nQ
LIG(165,70,170,70)
LIG(165,60,170,60)
LIG(180,80,180,79)
LIG(180,77,180,77)
LIG(190,70,195,70)
LIG(190,60,195,60)
LIG(190,75,170,75)
LIG(190,55,190,75)
LIG(170,55,190,55)
LIG(170,75,170,55)
LIG(179,75,180,73)
LIG(180,73,181,75)
VLG      module dreg(D,RST,H,Q,nQ);
VLG       input D,RST,H;
VLG       output Q,nQ;
VLG      endmodule
FSYM
SYM  #dreg5
BB(70,55,100,80)
TITLE 82 63  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(45,45,0,0,r)
VIS 5
PIN(70,60,0.000,0.000)D
PIN(70,70,0.000,0.000)RST
PIN(85,80,0.000,0.000)H
PIN(100,70,0.120,0.140)Q
PIN(100,60,0.120,0.070)nQ
LIG(70,70,75,70)
LIG(70,60,75,60)
LIG(85,80,85,79)
LIG(85,77,85,77)
LIG(95,70,100,70)
LIG(95,60,100,60)
LIG(95,75,75,75)
LIG(95,55,95,75)
LIG(75,55,95,55)
LIG(75,75,75,55)
LIG(84,75,85,73)
LIG(85,73,86,75)
VLG      module dreg(D,RST,H,Q,nQ);
VLG       input D,RST,H;
VLG       output Q,nQ;
VLG      endmodule
FSYM
SYM  #dreg6
BB(255,55,285,80)
TITLE 267 63  #dreg
MODEL 860
PROP                                                                                                                                                                                                            
REC(230,45,0,0,r)
VIS 5
PIN(255,60,0.000,0.000)D
PIN(255,70,0.000,0.000)RST
PIN(270,80,0.000,0.000)H
PIN(285,70,0.120,0.140)Q
PIN(285,60,0.120,0.070)nQ
LIG(255,70,260,70)
LIG(255,60,260,60)
LIG(270,80,270,79)
LIG(270,77,270,77)
LIG(280,70,285,70)
LIG(280,60,285,60)
LIG(280,75,260,75)
LIG(280,55,280,75)
LIG(260,55,280,55)
LIG(260,75,260,55)
LIG(269,75,270,73)
LIG(270,73,271,75)
VLG      module dreg(D,RST,H,Q,nQ);
VLG       input D,RST,H;
VLG       output Q,nQ;
VLG      endmodule
FSYM
SYM  #IO3
BB(198,28,202,32)
TITLE 200 25  #IO
MODEL 925
PROP                                                                                                                                                                                                            
REC(0,5,0,0,)
VIS 2
PIN(200,30,0.000,0.000)p
LIG(198,28,202,28)
LIG(202,28,202,32)
LIG(202,32,198,32)
LIG(198,32,198,28)
FSYM
SYM  #pwl2
BB(40,57,55,63)
TITLE 45 60  #pwl
MODEL 68
PROP    0.00 0  1.00 0  2.00 0  3.00 1  4.00 1  5.00 1  6.00 1  7.00 0  8.00 0  9.00 0 10.00 0 11.00 0 12.00 0 13.00 0 14.00 0 15.00 0 16.00 0 17.00 0                                                                                                                                                                     
REC(42,58,6,4,r)
VIS 1
PIN(55,60,0.000,0.000)DataIn
LIG(50,60,55,60)
LIG(49,58,47,58)
LIG(50,57,50,63)
LIG(40,63,40,57)
LIG(50,63,40,63)
LIG(50,57,40,57)
LIG(41,58,43,62)
LIG(43,62,45,62)
LIG(45,62,47,58)
FSYM
SYM  #pwl3
BB(40,87,55,93)
TITLE 45 90  #pwl
MODEL 68
PROP   0.00 1 1.00 1 2.00 0 3.00 1 4.00 0 5.00 1 6.00 0 7.00 1 8.00 0 9.00 1                                                                                                                                                                                     
REC(42,88,6,4,r)
VIS 1
PIN(55,90,0.000,0.000)LoadClock
LIG(50,90,55,90)
LIG(49,88,47,88)
LIG(50,87,50,93)
LIG(40,93,40,87)
LIG(50,93,40,93)
LIG(50,87,40,87)
LIG(41,88,43,92)
LIG(43,92,45,92)
LIG(45,92,47,88)
FSYM
CNC(145 -60)
CNC(145 -60)
CNC(200 -10)
CNC(200 -10)
CNC(245 -60)
CNC(245 -60)
CNC(200 -90)
CNC(105 60)
CNC(155 60)
CNC(200 60)
CNC(245 60)
CNC(290 60)
CNC(85 90)
CNC(135 90)
CNC(180 90)
CNC(225 90)
CNC(270 90)
CNC(65 110)
CNC(255 110)
CNC(210 110)
CNC(165 110)
CNC(115 110)
CNC(115 110)
LIG(105,-70,155,-70)
LIG(105,70,105,60)
LIG(150,70,155,70)
LIG(100,-110,155,-110)
LIG(100,-110,100,60)
LIG(330,-110,330,60)
LIG(165,-10,200,-10)
LIG(200,-10,225,-10)
LIG(245,-60,245,-10)
LIG(245,-60,285,-60)
LIG(245,-90,245,-60)
LIG(165,-90,200,-90)
LIG(200,-90,200,-30)
LIG(200,-90,225,-90)
LIG(200,-125,200,-90)
LIG(200,-10,200,30)
LIG(145,-60,145,-10)
LIG(45,-60,145,-60)
LIG(195,-60,245,-60)
LIG(145,-90,145,-60)
LIG(145,-60,175,-60)
LIG(65,70,70,70)
LIG(100,70,105,70)
LIG(115,70,120,70)
LIG(150,60,150,20)
LIG(150,20,130,20)
LIG(130,20,130,-30)
LIG(130,-30,155,-30)
LIG(155,10,155,60)
LIG(105,60,120,60)
LIG(105,60,105,-70)
LIG(155,60,165,60)
LIG(155,60,155,70)
LIG(195,70,200,70)
LIG(200,70,200,60)
LIG(200,60,210,60)
LIG(240,70,245,70)
LIG(245,70,245,60)
LIG(245,60,255,60)
LIG(285,70,290,70)
LIG(290,70,290,60)
LIG(290,60,300,60)
LIG(195,60,195,50)
LIG(195,50,170,50)
LIG(170,50,170,-80)
LIG(170,-80,185,-80)
LIG(185,-40,175,-40)
LIG(175,-40,175,45)
LIG(175,45,200,45)
LIG(200,45,200,60)
LIG(180,-20,180,15)
LIG(180,15,215,15)
LIG(215,15,215,45)
LIG(215,45,240,45)
LIG(240,45,240,60)
LIG(220,-20,220,40)
LIG(220,40,245,40)
LIG(245,40,245,60)
LIG(235,-30,285,-30)
LIG(285,-30,285,60)
LIG(235,10,290,10)
LIG(290,10,290,60)
LIG(235,-70,335,-70)
LIG(335,-70,335,70)
LIG(335,70,330,70)
LIG(235,-110,330,-110)
LIG(85,80,85,90)
LIG(135,80,135,90)
LIG(180,80,180,90)
LIG(225,80,225,90)
LIG(270,80,270,90)
LIG(315,80,315,90)
LIG(315,90,270,90)
LIG(85,90,55,90)
LIG(135,90,85,90)
LIG(180,90,135,90)
LIG(225,90,180,90)
LIG(270,90,225,90)
LIG(50,110,65,110)
LIG(65,70,65,110)
LIG(65,110,115,110)
LIG(300,70,300,110)
LIG(255,70,255,110)
LIG(255,110,300,110)
LIG(210,70,210,110)
LIG(210,110,255,110)
LIG(165,70,165,110)
LIG(165,110,210,110)
LIG(115,70,115,110)
LIG(115,110,165,110)
LIG(70,60,55,60)
FFIG C:\Documents and Settings\Administrator\My Documents\Dsch2\Book on CMOS\fpgaMatrix3.sch