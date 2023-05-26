.MODEL SMALL
 
.STACK 100H

.DATA


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov al,80h
mov bl,80h

add al,bl 


;Status of status flags: CF=1, ZF=1, SF=0, OF=1, PF=1, AF=0
        

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN