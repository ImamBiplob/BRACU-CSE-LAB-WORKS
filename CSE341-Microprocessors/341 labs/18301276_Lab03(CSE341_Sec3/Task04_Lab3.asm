.MODEL SMALL
 
.STACK 100H

.DATA


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here


mov ah, 1
int 21h
mov bl, al

add bl, 32

mov dl,0ah
mov ah, 2
int 21h

mov dl, bl
mov ah, 2
int 21h



;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN