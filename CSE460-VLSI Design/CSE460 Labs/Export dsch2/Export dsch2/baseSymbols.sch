DSCH 2.5f
VERSION 07/07/02 11:10:46
BB(-10,-55,96,103)
SYM  #inv
BB(-10,-55,25,-35)
TITLE 5 -45  #~
MODEL 101
PROP                                                                                                                                                                                                           
REC(0,0,0,0,)
VIS 5
PIN(-10,-45,0.000,0.000)in
PIN(25,-45,0.030,0.000)out
LIG(-10,-45,0,-45)
LIG(0,-55,0,-35)
LIG(0,-55,15,-45)
LIG(0,-35,15,-45)
LIG(17,-45,17,-45)
LIG(19,-45,25,-45)
VLG  not not1(out,in);
FSYM
SYM  #and2
BB(-10,-15,25,5)
TITLE 2 -4  #&
MODEL 402
PROP                                                                                                                                                                                                           
REC(-55,40,0,0,)
VIS 5
PIN(-10,0,0.000,0.000)b
PIN(-10,-10,0.000,0.000)a
PIN(25,-5,0.090,0.000)s
LIG(-10,0,-2,0)
LIG(-2,-15,-2,5)
LIG(18,-5,25,-5)
LIG(17,-3,14,1)
LIG(18,-5,17,-3)
LIG(17,-7,18,-5)
LIG(14,-11,17,-7)
LIG(9,-14,14,-11)
LIG(14,1,9,4)
LIG(9,4,-2,5)
LIG(-2,-15,9,-14)
LIG(-10,-10,-2,-10)
VLG  and and2(out,a,b);
FSYM
SYM  #nand2
BB(50,-15,85,5)
TITLE 62 -4  #&
MODEL 202
PROP                                                                                                                                                                                                           
REC(-60,40,0,0,)
VIS 5
PIN(50,0,0.000,0.000)b
PIN(50,-10,0.000,0.000)a
PIN(85,-5,0.090,0.000)s
LIG(50,0,58,0)
LIG(58,-15,58,5)
LIG(77,-3,74,1)
LIG(78,-5,77,-3)
LIG(77,-7,78,-5)
LIG(74,-11,77,-7)
LIG(69,-14,74,-11)
LIG(74,1,69,4)
LIG(69,4,58,5)
LIG(58,-15,69,-14)
LIG(50,-10,58,-10)
LIG(82,-5,85,-5)
LIG(80,-5,80,-5)
VLG  nand nand2(out,a,b);
FSYM
SYM  #nor2
BB(50,25,85,45)
TITLE 70 35  #|
MODEL 302
PROP                                                                                                                                                                                                           
REC(-65,25,0,0,)
VIS 5
PIN(50,30,0.000,0.000)a
PIN(50,40,0.000,0.000)b
PIN(85,35,0.090,0.000)s
LIG(50,40,63,40)
LIG(62,42,58,45)
LIG(77,37,74,41)
LIG(78,35,77,37)
LIG(77,33,78,35)
LIG(74,29,77,33)
LIG(69,26,74,29)
LIG(74,41,69,44)
LIG(69,44,58,45)
LIG(58,25,69,26)
LIG(64,38,62,42)
LIG(58,25,62,28)
LIG(62,28,64,32)
LIG(64,32,65,35)
LIG(65,35,64,38)
LIG(50,30,63,30)
LIG(82,35,85,35)
LIG(80,35,80,35)
VLG  nor nor2(s,a,b);
FSYM
SYM  #xor2
BB(-10,65,25,85)
TITLE 7 75  #^
MODEL 602
PROP                                                                                                                                                                                                           
REC(-5,30,0,0,)
VIS 5
PIN(-10,70,0.000,0.000)a
PIN(-10,80,0.000,0.000)b
PIN(25,75,0.090,0.000)out
LIG(-2,82,-6,85)
LIG(2,82,-2,85)
LIG(18,75,25,75)
LIG(17,77,14,81)
LIG(18,75,17,77)
LIG(17,73,18,75)
LIG(14,69,17,73)
LIG(9,66,14,69)
LIG(14,81,9,84)
LIG(9,84,-2,85)
LIG(-2,65,9,66)
LIG(4,78,2,82)
LIG(-2,65,2,68)
LIG(2,68,4,72)
LIG(4,72,5,75)
LIG(5,75,4,78)
LIG(-6,65,-2,68)
LIG(-2,68,0,72)
LIG(0,72,1,75)
LIG(1,75,0,78)
LIG(0,78,-2,82)
LIG(-10,70,-1,70)
LIG(-10,80,-1,80)
VLG  xor xor2(out,a,b);
FSYM
SYM  #xnor2
BB(50,65,85,85)
TITLE 67 75  #^
MODEL 612
PROP                                                                                                                                                                                                           
REC(-5,30,0,0,)
VIS 5
PIN(50,70,0.000,0.000)a
PIN(50,80,0.000,0.000)b
PIN(85,75,0.090,0.000)out
LIG(58,82,54,85)
LIG(62,82,58,85)
LIG(77,77,74,81)
LIG(78,75,77,77)
LIG(77,73,78,75)
LIG(74,69,77,73)
LIG(69,66,74,69)
LIG(74,81,69,84)
LIG(69,84,58,85)
LIG(58,65,69,66)
LIG(64,78,62,82)
LIG(58,65,62,68)
LIG(62,68,64,72)
LIG(64,72,65,75)
LIG(65,75,64,78)
LIG(54,65,58,68)
LIG(58,68,60,72)
LIG(60,72,61,75)
LIG(61,75,60,78)
LIG(60,78,58,82)
LIG(50,70,59,70)
LIG(50,80,59,80)
LIG(82,75,85,75)
LIG(80,75,80,75)
VLG  xnor xnor2(out,a,b);
FSYM
SYM  #notif1
BB(50,-55,85,-35)
TITLE 65 -45  #~
MODEL 121
PROP                                                                                                                                                                                                           
REC(35,-30,0,0,)
VIS 5
PIN(50,-45,0.000,0.000)in
PIN(65,-60,0.000,0.000)en
PIN(85,-45,0.030,0.000)out
LIG(50,-45,60,-45)
LIG(60,-55,60,-35)
LIG(60,-55,75,-45)
LIG(60,-35,75,-45)
LIG(79,-45,85,-45)
LIG(77,-45,77,-45)
LIG(65,-60,65,-51)
VLG  notif1 not3st(out,in,en);
FSYM
SYM  #or2
BB(-10,25,25,45)
TITLE 10 35  #|
MODEL 502
PROP                                                                                                                                                                                                           
REC(20,20,0,0,)
VIS 5
PIN(-10,30,0.000,0.000)a
PIN(-10,40,0.000,0.000)b
PIN(25,35,0.090,0.000)s
LIG(-10,40,3,40)
LIG(2,42,-2,45)
LIG(18,35,25,35)
LIG(17,37,14,41)
LIG(18,35,17,37)
LIG(17,33,18,35)
LIG(14,29,17,33)
LIG(9,26,14,29)
LIG(14,41,9,44)
LIG(9,44,-2,45)
LIG(-2,25,9,26)
LIG(4,38,2,42)
LIG(-2,25,2,28)
LIG(2,28,4,32)
LIG(4,32,5,35)
LIG(5,35,4,38)
LIG(-10,30,3,30)
VLG  or or2(s,a,b);
FSYM
TEXT -5 13  #And
TEXT 55 -27  #NotIf1
TEXT -5 -27  #Not
TEXT 52 11  #Nand
TEXT -4 51  #Or
TEXT 56 51  #Nor
TEXT -3 92  #Xor
TEXT 54 93  #Xnor
FFIG C:\Dsch2\Book on CMOS\baseSymbols.sch
