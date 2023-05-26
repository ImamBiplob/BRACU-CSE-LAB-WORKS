.MODEL SMALL
 
.STACK 100H

.DATA


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov ax,50
neg ax
mov bx,52
neg bx

add ax,bx

;CF=1, so there is a carry into the MSB


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN